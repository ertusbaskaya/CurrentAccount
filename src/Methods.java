import javax.swing.DefaultComboBoxModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Methods {
    
    public void passwordEdit(JFrame frame, String oldPass, String newPass){
        DB db = new DB();
        DB db2 = new DB();
        String query = "Call prcSign()";
        PreparedStatement prs = db.preBaglan(query);
        try {
            ResultSet rs = prs.executeQuery();
            while(rs.next()){
                if(!oldPass.equals(rs.getString("upassword"))){
                    JOptionPane.showMessageDialog(frame, "Parolanızı yanlış girdiniz...");
                }else if(!oldPass.equals(newPass)){
                    String quer = "CALL prcPasswordEdit(?)";
                    PreparedStatement prst = db2.preBaglan(quer);
                    prst.setString(1, newPass);
                    int update = prst.executeUpdate();
                    if(update > 0){
                        JOptionPane.showMessageDialog(frame, "Parolanız başarıyla değiştirildi...");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Parola değiştirilemedi. Lütfen tekrar deneyiniz...");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "Eski bir parolanızı girdiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("passwordEdit " + e);
        }finally{
            db.kapat();
            db2.kapat();
        }
    }
    
    public ArrayList<String> comboCategoryFill(JComboBox combobox) {
        ArrayList<String> ccf = new ArrayList<>();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        DB db = new DB();
        String query = "CALL prcCategoryList()";

        try {
            PreparedStatement ps = db.preBaglan(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getString("cname"));
                ccf.add(rs.getString("cid"));
            }
            combobox.setModel(model);
        } catch (Exception e) {
            System.err.println("comboCategoryFill " + e);
        }
        return ccf;
    }
    
    public ArrayList<String> saleProductList(String id, JTable tableList){
        ArrayList<String> pl = new ArrayList<>();
        String query = "CALL prcSaleProductList(?)";
        DB db = new DB();
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        table.addColumn("Adı");
        table.addColumn("Satış Fiyatı(₺)");
        table.addColumn("Açıklama");
        try {
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                table.addRow(new String[]{rs.getString("pname"), rs.getString("psale"), rs.getString("pcommentary")});
                pl.add(rs.getString("pid"));
            }
            tableList.setModel(table);
        } catch (SQLException e) {
            System.err.println("saleProductList " + e);
        }
        return pl;
    }
    
    public ArrayList<String> comboSaleCostumersFill(JComboBox comboBox){
        ArrayList<String> sc = new ArrayList<>();
        String query = "CALL prcCostumersList()";
        DB db = new DB();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        
        try {
            PreparedStatement prs = db.preBaglan(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                combo.addElement(rs.getString("cosname") + " " + rs.getString("cossurname"));
                sc.add(rs.getString("cosid"));
            }
            comboBox.setModel(combo);
            
        } catch (Exception e) {
            System.err.println("comboSaleCostumersFill " + e);
        } finally{
            db.kapat();
        }
        return sc;
    }
    
    public void saleAction(JFrame Frame, String costumersID, String productID, String piece){
        String query = "CALL prcSaleAction(?,?,?)";
        String quer = "CALL prcProductGet(?)";
        DB db = new DB();
        DB db2 = new DB();
        try {
            PreparedStatement ps = db.preBaglan(query);
            PreparedStatement ps2 = db2.preBaglan(quer);
            ps.setString(1, costumersID);
            ps.setString(2, productID);
            ps.setString(3, piece);
           
            ps2.setString(1, productID);
            ResultSet rs = ps2.executeQuery();
            String productPiece = "";
            while (rs.next()) {
                productPiece = rs.getString("pstock");
            } if (Integer.valueOf(piece) > Integer.valueOf(productPiece)) {
                JOptionPane.showMessageDialog(Frame, "Stok yetersiz...");
            } else {
                 int add = ps.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Satış başarılı...");
                    int newStockInt = Integer.valueOf(productPiece) - Integer.valueOf(piece);
                    String newStock = String.valueOf(newStockInt);
                    String que = "UPDATE product SET pstock ='"+newStock+"' WHERE pid='"+productID+"'";
                    db.baglan().executeUpdate(que);
                } else {
                    JOptionPane.showMessageDialog(Frame, "Satış yapılamadı. Lütfen tekrar deneyin...");
                }
            }
        } catch (Exception e) {
            System.err.println("saleAction " + e);
        } finally{
            db.kapat();
            db2.kapat();
        }
    }
    
    public void costumersSearch(String start, String finish, String costumers, JTable tableReport){
         String[] cos = costumers.split(" ");
         String name =  cos[0];
         String surname = "";
         
         if (cos.length>1) {
            surname = cos[cos.length-1];
        }
         System.out.println(name + " " + surname);
         DB db = new DB();
         String query = "SELECT *, date(date) as d  FROM sale as s INNER JOIN  costumers as cos  ON s.scosid = cos.cosid and date(date) between '"+start+"' and  '"+finish+"' INNER JOIN product as p on s.spid = p.pid INNER JOIN category as c ON p.pcategoryname = c.cid and cos.cosname like '%"+name+"%' and cos.cossurname like '%"+surname+"%'";
         DefaultTableModel table = new DefaultTableModel();
         table.addColumn("Müşteri Adi");
         table.addColumn("Ürün Kategori");
         table.addColumn("Ürün Adı");
         table.addColumn("Adet");
         table.addColumn("Fiyat(₺)");
         table.addColumn("Eklenme Tarihi");
         
         try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cosname")+" "+rs.getString("cossurname"),rs.getString("cname"), rs.getString("pname"),rs.getString("piece"),rs.getString("psale"),rs.getString("d")});
            }
        } catch (Exception e) {
            System.err.println("costumersSearch  " + e);
        } finally{
             db.kapat();
        }
         tableReport.setModel(table);
    }
    
    public void productSearch(String start, String finish, String product, JTable tableReport){
        DB db = new DB();
        String query = "SELECT *, date(date) as d  FROM sale as s INNER JOIN  costumers as cos  ON s.scosid = cos.cosid and date(date) between '"+start+"' and  '"+finish+"' INNER JOIN product as p on s.spid = p.pid INNER JOIN category as c ON p.pcategoryname = c.cid and p.pname like '%"+product+"%'";
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Müşteri Adi");
        table.addColumn("Ürün Kategori");
        table.addColumn("Ürün Adı");
        table.addColumn("Adet");
        table.addColumn("Fiyat(₺)");
        table.addColumn("Eklenme Tarihi");
        try {
             ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cosname")+" "+rs.getString("cossurname"),rs.getString("cname"), rs.getString("pname"),rs.getString("piece"),rs.getString("psale"),rs.getString("d")});
            }
        } catch (Exception e) {
            System.err.println("productSearch " + e);
        } finally{
            db.kapat();
        }
        tableReport.setModel(table);
    }
    
    public void categorySearch(String start, String finish, String category, JTable tableReport){
        DB db = new DB();
        String query = "SELECT *, date(date) as d  FROM sale as s INNER JOIN  costumers as cos  ON s.scosid = cos.cosid and date(date) between '"+start+"' and  '"+finish+"' INNER JOIN product as p on s.spid = p.pid INNER JOIN category as c ON p.pcategoryname = c.cid and c.cname like '%"+category+"%'";
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Müşteri Adi");
        table.addColumn("Ürün Kategori");
        table.addColumn("Ürün Adı");
        table.addColumn("Adet");
        table.addColumn("Fiyat(₺)");
        table.addColumn("Eklenme Tarihi");
        
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cosname")+" "+rs.getString("cossurname"),rs.getString("cname"), rs.getString("pname"),rs.getString("piece"),rs.getString("psale"),rs.getString("d")});
            }
        } catch (Exception e) {
            System.err.println("categorySearch " + e);
        } finally{
            db.kapat();
        }
        tableReport.setModel(table);
    }
    
     public void categoryAdd(JFrame frame, String categoryName, String categoryComm){
        DB db = new DB();
        String query = "CALL prcCategoryAdd(?,?)";
        
        try {
            
            if (categoryName.equals("")) {
                JOptionPane.showMessageDialog(frame, "Kategori adını boş bırakmayınız...");
            }else{
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, categoryName);
                prs.setString(2, categoryComm);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(frame, "Kategori başarıyla eklendi...");
                }else {
                    JOptionPane.showMessageDialog(frame, "Kategori eklenmedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("categoryAdd " + e);
        } finally {
            db.kapat();
        }
    }
    
    public ArrayList<Category> categoryFill(){
        ArrayList<Category> cf = new ArrayList<>();
        DB db = new DB();
        String query = "CALL prcCategoryList()";
        PreparedStatement prs = db.preBaglan(query);
        
        try {
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Category cat = new Category();
                cat.setCategoryID(rs.getString("cid"));
                cat.setCategoryName(rs.getString("cname"));
                cat.setCategoryCommentary(rs.getString("ccommentary"));
                cf.add(cat);
            }
        } catch (Exception e) {
            System.err.println("categoryAdd " + e);
        } finally {
            db.kapat();
        }
        return cf;
    }
    
    public DefaultTableModel categoryTable() {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int coloum){
                return false;
            }
        };
        table.addColumn("Kategori Adı");
        table.addColumn("Kategori Açıklama");
        
        ArrayList<Category> cf = categoryFill();
        
        for (Category item : cf) {
            table.addRow(new String[]{item.getCategoryName(), item.getCategoryCommentary()});
        }
        return table;
    }
    
    public void categoryDelete(JFrame Frame, String categoryID){
        
        DB db = new DB();
        
        try {
            String query = "CALL prcCategoryDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, categoryID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Kategori başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Kategori silinemedi. Lütfen tekrar deneyiniz...");
            }
            
        } catch (Exception e) {
            System.err.println("categoryDelete " + e);
        }finally{
            db.kapat();
        }
    }
    
    public void categoryEdit(JFrame Frame, String categoryID, String categoryName, String categoryCommentary){
        DB db = new DB();
        
        try {
            String query = "CALL prcCategoryEdit(?,?,?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, categoryID);
            prs.setString(2, categoryName);
            prs.setString(3, categoryCommentary);
            int uptade = prs.executeUpdate();
            if (uptade > 0) {
                JOptionPane.showMessageDialog(Frame, "Düzenleme başarıyla gerçekleşti...");
            } else{
                JOptionPane.showMessageDialog(Frame, "Düzenleme gerçekleştirilmedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("categoryEdit " + e);
        }finally{
            db.kapat();
        }
    }
    
    public void costumersAdd(JFrame Frame, String costumersName, String costumersSurname, String costumersPhone, String costumersAdress){
        DB db = new DB();
        String query = "CALL prcCostumersAdd(?,?,?,?)";
        try {
            if (costumersName.equals("") || costumersSurname.equals("") || costumersPhone.equals("") || costumersAdress.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else if (!new Control().isAPhone(costumersPhone)) {
                JOptionPane.showMessageDialog(Frame, "Telefon numarası formata uygun değil.");
            }else {
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, costumersName);
                prs.setString(2, costumersSurname);
                prs.setString(3, costumersPhone);
                prs.setString(4, costumersAdress);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Müşteri başarıyla eklendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Müşteri eklenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("costumersAdd " + e);
        }finally{
            db.kapat();
        }
    }
    
    public ArrayList<Costumers> costumersFill(){
        ArrayList<Costumers> cf = new ArrayList<>();
        
        DB db = new DB();
        String query = "CALL prcCostumersList()";
        PreparedStatement prs = db.preBaglan(query);
        
        try {
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                Costumers cs = new Costumers();
                cs.setCostumersID(rs.getString("cosid"));
                cs.setCostumersName(rs.getString("cosname"));
                cs.setCostumersSurname(rs.getString("cossurname"));
                cs.setCostumersPhone(rs.getString("cosphone"));
                cs.setCostumersAdress(rs.getString("cosadress"));
                cf.add(cs);
            }
        } catch (Exception e) {
            System.err.println("costumersFill " + e);
        }finally{
            db.kapat();
        }
        return cf;
    }
    
    public DefaultTableModel costumersTable(){
        DefaultTableModel table = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
        table.addColumn("Adı");
        table.addColumn("Soyadı");
        table.addColumn("Telefon");
        table.addColumn("Adres");
        
        ArrayList<Costumers> cf = costumersFill();
        
        for (Costumers item : cf) {
            table.addRow(new String[]{item.getCostumersName(), item.getCostumersSurname(), item.getCostumersPhone(), item.getCostumersAdress()});
        }
       
        return table;
    }
    
    public void costumersDelete(JFrame Frame, String costumersID){
        DB db = new DB();
        
        try {
            String query = "CALL prcCostumersDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, costumersID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Müşteri başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Müşteri silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("costumersDelete " + e);
        } finally{
            db.kapat();
        }
        
    }
    
    public void costumersEdit(JFrame Frame, String costumersID, String costumersName, String costumersSurname, String costumersPhone, String costumersAdress){
        DB db = new DB();
        
        try {
            String query = "CALL prcCostumersEdit(?,?,?,?,?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, costumersID);
            prs.setString(2, costumersName);
            prs.setString(3, costumersSurname);
            prs.setString(4, costumersPhone);
            prs.setString(5, costumersAdress);
            int update = prs.executeUpdate();
            if (update > 0) {
                JOptionPane.showMessageDialog(Frame, "İşlem başarıyla gerçekleşti...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Müşteriler güncellenemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.out.println("costumersEdit " + e);
        } finally{
            db.kapat();
        }
    }
    
    public void productAdd(JFrame Frame, String productName, String categoryName, String productBuy, String productSale, String productStock, String productCommentary){
        DB db = new DB();
        String query = "CALL prcProductAdd(?,?,?,?,?,?)";
        try {
            if (productName.equals("") || categoryName.equals("") || productBuy.equals("") || productSale.equals("") || productStock.equals("") || productCommentary.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayın...");
            }else {
            
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, productName);
            prs.setString(2, categoryName);
            prs.setString(3, productBuy);
            prs.setString(4, productSale);
            prs.setString(5, productStock);
            prs.setString(6, productCommentary);
            int add = prs.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(Frame, "Ürünler başarıyla eklendi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Ürünler eklenemedi. Lütfen tekrar deneyiniz...");
                
            }
            }
        } catch (Exception e) {
            System.out.println("productAdd " + e);
        } finally{
            db.kapat();
        }
    }
    
    public ArrayList<Product> productFill(){
        ArrayList<Product> pf = new ArrayList<>();
        DB db = new DB();
        
        try {
            String query = "CALL prcProductList()";
            PreparedStatement prs = db.preBaglan(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                Product pr = new Product();
                pr.setProductID(rs.getString("pid"));
                pr.setProductName(rs.getString("pname"));
                pr.setProductCategoryName(rs.getString("cname"));
                pr.setProductBuy(rs.getString("pbuy"));
                pr.setProductSale(rs.getString("psale"));
                pr.setProductStock(rs.getString("pstock"));
                pr.setProductCommentary(rs.getString("pcommentary"));
                pf.add(pr);
            }
        } catch (Exception e) {
            System.err.println("productFill " + e);
        }
        
        return pf;
    }
    
    public DefaultTableModel productTable(){
        DefaultTableModel table = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }  
        };
        table.addColumn("Ürün Adı");
        table.addColumn("Kategori");
        table.addColumn("Alış Fiyatı(₺)");
        table.addColumn("Satış Fiyatı(₺)");
        table.addColumn("Stok");
        table.addColumn("Açıklama");
        
        ArrayList<Product> pf = productFill();
        
        for (Product item : pf) {
            table.addRow(new String[]{item.getProductName(), item.getProductCategoryName(), item.getProductBuy(), item.getProductSale(), item.getProductStock(), item.getProductCommentary()});
        }
        return table;
    }
    
    public void productDelete(JFrame Frame, String productID){
        DB db = new DB();
        try {
            String query = "CALL prcProductDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, productID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                 JOptionPane.showMessageDialog(Frame, "Ürün başarıyla silindi...");
            } else {
                JOptionPane.showMessageDialog(Frame, "Ürün silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("productDelete " + e);
        } finally{
            db.kapat();
        }
        
        
    }
    
    public void productEdit(JFrame Frame, String productID, String productName, String categoryName, String productBuy, String productSale, String productStock, String productCommentary ){
        DB db = new DB();
       
        
        try {
            
                String query = "CALL prcProductEdit(?,?,?,?,?,?,?)";
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, productID);
                prs.setString(2, productName);
                prs.setString(3, categoryName);
                prs.setString(4, productBuy);
                prs.setString(5, productSale);
                prs.setString(6, productStock);
                prs.setString(7, productCommentary);
                int update = prs.executeUpdate();
                if (update > 0) {
                    JOptionPane.showMessageDialog(Frame, "Ürünler başarıyla güncellendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Ürünler güncellenemedi. Lütfen tekrar deneyin...");
                }
        } catch (Exception e) {
            System.err.println("productEdit " + e);
        } finally{
            db.kapat();
        }
    }
    
    public void profit(JLabel label){
        
        String query = "SELECT * FROM sale inner join product where sale.spid = product.pid";
        DB db = new DB();
        int sum = 0;
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            
            while (rs.next()) {    
                
                sum = sum + (rs.getInt("piece")*(rs.getInt("psale")-rs.getInt("pbuy")));
                
            }
            
            
        } catch (Exception e) {
            System.err.println("profit " + e);
        }
        
        label.setText(String.valueOf(sum));
        
    }
}
