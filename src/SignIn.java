
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class SignIn {
 public boolean Sign(String uName, String uPassword){
           DB db = new DB();
        try {
            String q = "CALL prcSign()";
            PreparedStatement pr = db.preBaglan(q);
            ResultSet rs = pr.executeQuery();
            if (uName.equals("") || uPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "Kullanici Adi veya Parola boş bırakılamaz.");
            }else{
                while(rs.next()) {
                    System.out.println("-----------------");
                    System.out.println(rs.getString("uPassword"));
                    
                
                if (uName.equals(rs.getString("uName")) && uPassword.equals(rs.getString("uPassword"))) {
                        return true;
                    }
               
            }
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("Hata : " + e);
        }finally{
            db.kapat();
        }  
        return false;
    }
    }