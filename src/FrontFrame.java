
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FrontFrame extends javax.swing.JFrame {
    Methods method = new Methods();
    ArrayList<Category> catls = method.categoryFill();
    ArrayList<Costumers> cosls = method.costumersFill();
    ArrayList<Product> prols = method.productFill();
    ArrayList<String> catIDls;

    public FrontFrame() {
        initComponents();
        
        Methods m = new Methods();
        tableCategory.setModel(m.categoryTable());
        tableCostumers.setModel(m.costumersTable());
        tableProduct.setModel(m.productTable());

        setEnabled(false, panelCategoryTableButtons.getComponents());
        setEnabled(false, panelCategoryEdit.getComponents());
        setEnabled(false, panelCostumersTableButtons.getComponents());
        setEnabled(false, panelCostumersEdit.getComponents());
        setEnabled(false, panelProductTableButtons.getComponents());
        setEnabled(false, panelProductEdit.getComponents());

        
        panelSalesTable.setVisible(false);
        panelSalesAdd.setVisible(false);

        catIDls = m.comboCategoryFill(comboBoxProductCategorySave);
        m.comboCategoryFill(comboBoxProductCategoryEdit);
        m.comboCategoryFill(comboBoxSalesList);
        
        m.profit(textProfit);
        
        //Date
        Date date = new Date();

        dateChooserStart.setDateFormatString("yyyy-MM-dd");
        dateChooserStart.setDate(date);

        dateChooserFinish.setDateFormatString("yyyy-MM-dd");
        dateChooserFinish.setDate(date);
    }

    public void setEnabled(boolean enabled, Component[] comps) {
        for (Component comp : comps) {
            comp.setEnabled(enabled);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabbedCurrentAccount = new javax.swing.JTabbedPane();
        panelCostumers = new javax.swing.JPanel();
        panelCostumersTable = new javax.swing.JPanel();
        scrollPaneCostumers = new javax.swing.JScrollPane();
        tableCostumers = new javax.swing.JTable();
        panelCostumersTableButtons = new javax.swing.JPanel();
        buttonCostumersTableEdit = new javax.swing.JButton();
        buttonCostumersTableDelete = new javax.swing.JButton();
        panelCostumersSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCostumersPhoneSave = new javax.swing.JTextField();
        textCostumersAdressSave = new javax.swing.JTextField();
        textCostumersSurnameSave = new javax.swing.JTextField();
        textCostumersNameSave = new javax.swing.JTextField();
        buttonCostumersSave = new javax.swing.JButton();
        panelCostumersEdit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCostumersPhoneEdit = new javax.swing.JTextField();
        textCostumersSurnameEdit = new javax.swing.JTextField();
        textCostumersNameEdit = new javax.swing.JTextField();
        textCostumersAdressEdit = new javax.swing.JTextField();
        buttonCostumersEdit = new javax.swing.JButton();
        panelReports = new javax.swing.JPanel();
        panelReportsFilter = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        radioButtonCostumers = new javax.swing.JRadioButton();
        radioButtonProduct = new javax.swing.JRadioButton();
        radioButtonCategory = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        textReportsSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        panelReportsStartDate = new javax.swing.JPanel();
        dateChooserStart = new com.toedter.calendar.JDateChooser();
        panelReportsFinishDate = new javax.swing.JPanel();
        dateChooserFinish = new com.toedter.calendar.JDateChooser();
        labelDateWarning = new javax.swing.JLabel();
        panelReportsResult = new javax.swing.JPanel();
        scrollPaneReportsResult = new javax.swing.JScrollPane();
        tableReportsResult = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        textProfit = new javax.swing.JLabel();
        panelSales = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        comboBoxSalesList = new javax.swing.JComboBox();
        buttonSalesList = new javax.swing.JButton();
        panelSalesTable = new javax.swing.JPanel();
        scrollPaneSalesTable = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        panelSalesAdd = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textSaleCount = new javax.swing.JTextField();
        comboBoxSelectCostumers = new javax.swing.JComboBox();
        buttonSaleAdd = new javax.swing.JButton();
        textPickedProduct = new javax.swing.JLabel();
        panelProduct = new javax.swing.JPanel();
        panelProductTable = new javax.swing.JPanel();
        scrollPaneProductTable = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        panelProductTableButtons = new javax.swing.JPanel();
        buttonProductTableEdit = new javax.swing.JButton();
        buttonProductTableDelete = new javax.swing.JButton();
        panelProductSave = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textProductNameSave = new javax.swing.JTextField();
        comboBoxProductCategorySave = new javax.swing.JComboBox();
        textProductBuyPriceSave = new javax.swing.JTextField();
        textProductSalePriceSave = new javax.swing.JTextField();
        textProductStockSave = new javax.swing.JTextField();
        textProductCommentarySave = new javax.swing.JTextField();
        buttonProductSave = new javax.swing.JButton();
        panelProductEdit = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textProductNameEdit = new javax.swing.JTextField();
        comboBoxProductCategoryEdit = new javax.swing.JComboBox();
        textProductBuyPriceEdit = new javax.swing.JTextField();
        textProductSalePriceEdit = new javax.swing.JTextField();
        textProductStockEdit = new javax.swing.JTextField();
        textProductCommentaryEdit = new javax.swing.JTextField();
        buttonProductEdit = new javax.swing.JButton();
        panelCategory = new javax.swing.JPanel();
        panelCategoryTable = new javax.swing.JPanel();
        scrollPaneCategoryTable = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        panelCategoryTableButtons = new javax.swing.JPanel();
        buttonCategoryTableEdit = new javax.swing.JButton();
        buttonCategoryTableDelete = new javax.swing.JButton();
        panelCategorySave = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        textCategoryNameSave = new javax.swing.JTextField();
        textCategoryCommentarySave = new javax.swing.JTextField();
        buttonCategorySave = new javax.swing.JButton();
        panelCategoryEdit = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        textCategoryNameEdit = new javax.swing.JTextField();
        textCategotyCommentaryEdit = new javax.swing.JTextField();
        buttonCategoryEdit = new javax.swing.JButton();
        panelUserOptions = new javax.swing.JPanel();
        panelPassword = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        textOldPassword = new javax.swing.JPasswordField();
        textNewPassword = new javax.swing.JPasswordField();
        textNewPasswordRepeat = new javax.swing.JPasswordField();
        buttonPasswordEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCostumersTable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Listesi"), "Müşteri Listesi"));

        tableCostumers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCostumers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCostumersMouseClicked(evt);
            }
        });
        scrollPaneCostumers.setViewportView(tableCostumers);

        javax.swing.GroupLayout panelCostumersTableLayout = new javax.swing.GroupLayout(panelCostumersTable);
        panelCostumersTable.setLayout(panelCostumersTableLayout);
        panelCostumersTableLayout.setHorizontalGroup(
            panelCostumersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCostumers, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        panelCostumersTableLayout.setVerticalGroup(
            panelCostumersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCostumers, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelCostumersTableButtons.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonCostumersTableEdit.setText("Düzenle");
        buttonCostumersTableEdit.setPreferredSize(new java.awt.Dimension(100, 50));
        buttonCostumersTableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersTableEditActionPerformed(evt);
            }
        });

        buttonCostumersTableDelete.setText("Sil");
        buttonCostumersTableDelete.setPreferredSize(new java.awt.Dimension(100, 50));
        buttonCostumersTableDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersTableDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersTableButtonsLayout = new javax.swing.GroupLayout(panelCostumersTableButtons);
        panelCostumersTableButtons.setLayout(panelCostumersTableButtonsLayout);
        panelCostumersTableButtonsLayout.setHorizontalGroup(
            panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostumersTableButtonsLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCostumersTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCostumersTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        panelCostumersTableButtonsLayout.setVerticalGroup(
            panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersTableButtonsLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(buttonCostumersTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(buttonCostumersTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        panelCostumersSave.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Kaydet"));

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("Telefon:");

        jLabel4.setText("Adres:");

        buttonCostumersSave.setText("Kaydet");
        buttonCostumersSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersSaveLayout = new javax.swing.GroupLayout(panelCostumersSave);
        panelCostumersSave.setLayout(panelCostumersSaveLayout);
        panelCostumersSaveLayout.setHorizontalGroup(
            panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostumersSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                        .addGap(0, 334, Short.MAX_VALUE)
                        .addComponent(buttonCostumersSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersSaveLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(textCostumersPhoneSave))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersSaveLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(textCostumersAdressSave))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersSaveLayout.createSequentialGroup()
                        .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCostumersSurnameSave)
                            .addComponent(textCostumersNameSave))))
                .addContainerGap())
        );
        panelCostumersSaveLayout.setVerticalGroup(
            panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCostumersNameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textCostumersSurnameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textCostumersPhoneSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textCostumersAdressSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(buttonCostumersSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCostumersEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Düzenle"));

        jLabel5.setText("Ad:");

        jLabel6.setText("Soyad:");

        jLabel7.setText("Telefon");

        jLabel8.setText("Adres:");

        buttonCostumersEdit.setText("Düzenle");
        buttonCostumersEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersEditLayout = new javax.swing.GroupLayout(panelCostumersEdit);
        panelCostumersEdit.setLayout(panelCostumersEditLayout);
        panelCostumersEditLayout.setHorizontalGroup(
            panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostumersEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCostumersEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCostumersEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersEditLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textCostumersPhoneEdit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersEditLayout.createSequentialGroup()
                        .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCostumersAdressEdit)
                            .addComponent(textCostumersNameEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textCostumersSurnameEdit))))
                .addContainerGap())
        );
        panelCostumersEditLayout.setVerticalGroup(
            panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCostumersNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textCostumersSurnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textCostumersPhoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textCostumersAdressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(buttonCostumersEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCostumersLayout = new javax.swing.GroupLayout(panelCostumers);
        panelCostumers.setLayout(panelCostumersLayout);
        panelCostumersLayout.setHorizontalGroup(
            panelCostumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersLayout.createSequentialGroup()
                .addGroup(panelCostumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCostumersLayout.createSequentialGroup()
                        .addComponent(panelCostumersTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCostumersTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCostumersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCostumersSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCostumersEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        panelCostumersLayout.setVerticalGroup(
            panelCostumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersLayout.createSequentialGroup()
                .addGroup(panelCostumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCostumersTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCostumersTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCostumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCostumersSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCostumersEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedCurrentAccount.addTab("Müşteriler", panelCostumers);

        panelReportsFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtre"));

        jLabel9.setText("Kriter:");

        buttonGroup1.add(radioButtonCostumers);
        radioButtonCostumers.setText("Müşteri");

        buttonGroup1.add(radioButtonProduct);
        radioButtonProduct.setText("Ürün Adı");

        buttonGroup1.add(radioButtonCategory);
        radioButtonCategory.setText("Kategori");

        jLabel10.setText("Arama:");

        textReportsSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textReportsSearchKeyReleased(evt);
            }
        });

        jLabel11.setText("Tarih Aralığı:");

        panelReportsStartDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Başlangıç Tarihi"));

        dateChooserStart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserStartPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout panelReportsStartDateLayout = new javax.swing.GroupLayout(panelReportsStartDate);
        panelReportsStartDate.setLayout(panelReportsStartDateLayout);
        panelReportsStartDateLayout.setHorizontalGroup(
            panelReportsStartDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportsStartDateLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(dateChooserStart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panelReportsStartDateLayout.setVerticalGroup(
            panelReportsStartDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportsStartDateLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(dateChooserStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelReportsFinishDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Bitiş Tarihi"));

        dateChooserFinish.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserFinishPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout panelReportsFinishDateLayout = new javax.swing.GroupLayout(panelReportsFinishDate);
        panelReportsFinishDate.setLayout(panelReportsFinishDateLayout);
        panelReportsFinishDateLayout.setHorizontalGroup(
            panelReportsFinishDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportsFinishDateLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(dateChooserFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelReportsFinishDateLayout.setVerticalGroup(
            panelReportsFinishDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportsFinishDateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dateChooserFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelReportsFilterLayout = new javax.swing.GroupLayout(panelReportsFilter);
        panelReportsFilter.setLayout(panelReportsFilterLayout);
        panelReportsFilterLayout.setHorizontalGroup(
            panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportsFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReportsFilterLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonCostumers)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonProduct)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonCategory))
                    .addGroup(panelReportsFilterLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(textReportsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReportsFilterLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelReportsFilterLayout.createSequentialGroup()
                                .addComponent(panelReportsStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelReportsFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelDateWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        panelReportsFilterLayout.setVerticalGroup(
            panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportsFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(radioButtonCostumers)
                    .addComponent(radioButtonProduct)
                    .addComponent(radioButtonCategory))
                .addGap(18, 18, 18)
                .addGroup(panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textReportsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelReportsFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(panelReportsStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReportsFinishDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(labelDateWarning))
        );

        panelReportsResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Sonuç"));

        tableReportsResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneReportsResult.setViewportView(tableReportsResult);

        javax.swing.GroupLayout panelReportsResultLayout = new javax.swing.GroupLayout(panelReportsResult);
        panelReportsResult.setLayout(panelReportsResultLayout);
        panelReportsResultLayout.setHorizontalGroup(
            panelReportsResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneReportsResult)
        );
        panelReportsResultLayout.setVerticalGroup(
            panelReportsResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneReportsResult, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Genel Kar-Zarar"));

        jLabel12.setText("Kar-Zarar (₺) :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textProfit))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelReportsLayout = new javax.swing.GroupLayout(panelReports);
        panelReports.setLayout(panelReportsLayout);
        panelReportsLayout.setHorizontalGroup(
            panelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelReportsFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReportsResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelReportsLayout.setVerticalGroup(
            panelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelReportsFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelReportsResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedCurrentAccount.addTab("Raporlar", panelReports);

        jLabel14.setText("Lütfen listeleme için bir kategori seçiniz:");

        comboBoxSalesList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonSalesList.setText("Listele");
        buttonSalesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalesListActionPerformed(evt);
            }
        });

        tableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalesMouseClicked(evt);
            }
        });
        scrollPaneSalesTable.setViewportView(tableSales);

        javax.swing.GroupLayout panelSalesTableLayout = new javax.swing.GroupLayout(panelSalesTable);
        panelSalesTable.setLayout(panelSalesTableLayout);
        panelSalesTableLayout.setHorizontalGroup(
            panelSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneSalesTable)
        );
        panelSalesTableLayout.setVerticalGroup(
            panelSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneSalesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSalesAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("Satış"));

        jLabel15.setText("Seçilen ürün:");

        jLabel16.setText("Adet:");

        jLabel17.setText("Müşteri:");

        comboBoxSelectCostumers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonSaleAdd.setText("Satış");
        buttonSaleAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaleAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSalesAddLayout = new javax.swing.GroupLayout(panelSalesAdd);
        panelSalesAdd.setLayout(panelSalesAddLayout);
        panelSalesAddLayout.setHorizontalGroup(
            panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSalesAddLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPickedProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonSaleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelSalesAddLayout.createSequentialGroup()
                            .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17))
                            .addGap(35, 35, 35)
                            .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textSaleCount, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(comboBoxSelectCostumers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        panelSalesAddLayout.setVerticalGroup(
            panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textPickedProduct))
                .addGap(44, 44, 44)
                .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(textSaleCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelSalesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(comboBoxSelectCostumers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(buttonSaleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSalesLayout = new javax.swing.GroupLayout(panelSales);
        panelSales.setLayout(panelSalesLayout);
        panelSalesLayout.setHorizontalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSalesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSalesLayout.createSequentialGroup()
                        .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelSalesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(comboBoxSalesList, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(buttonSalesList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 299, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSalesLayout.setVerticalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSalesList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalesList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalesTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalesAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedCurrentAccount.addTab("Satış Yönetimi", panelSales);

        panelProductTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Listesi"));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        scrollPaneProductTable.setViewportView(tableProduct);

        javax.swing.GroupLayout panelProductTableLayout = new javax.swing.GroupLayout(panelProductTable);
        panelProductTable.setLayout(panelProductTableLayout);
        panelProductTableLayout.setHorizontalGroup(
            panelProductTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneProductTable, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        panelProductTableLayout.setVerticalGroup(
            panelProductTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelProductTableButtons.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonProductTableEdit.setText("Düzenle");
        buttonProductTableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductTableEditActionPerformed(evt);
            }
        });

        buttonProductTableDelete.setText("Sil");
        buttonProductTableDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductTableDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductTableButtonsLayout = new javax.swing.GroupLayout(panelProductTableButtons);
        panelProductTableButtons.setLayout(panelProductTableButtonsLayout);
        panelProductTableButtonsLayout.setHorizontalGroup(
            panelProductTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductTableButtonsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelProductTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonProductTableEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(buttonProductTableDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelProductTableButtonsLayout.setVerticalGroup(
            panelProductTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductTableButtonsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(buttonProductTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(buttonProductTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        panelProductSave.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Kaydet"));

        jLabel18.setText("Ürün Adı:");

        jLabel19.setText("Kategori:");

        jLabel20.setText("Alış Fiyatı:");

        jLabel21.setText("Satış Fiyatı:");

        jLabel22.setText("Stok Durumu:");

        jLabel23.setText("Açıklama:");

        comboBoxProductCategorySave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonProductSave.setText("Kaydet");
        buttonProductSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductSaveLayout = new javax.swing.GroupLayout(panelProductSave);
        panelProductSave.setLayout(panelProductSaveLayout);
        panelProductSaveLayout.setHorizontalGroup(
            panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductSaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductSaveLayout.createSequentialGroup()
                        .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProductStockSave, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(textProductCommentarySave)
                            .addComponent(textProductSalePriceSave)
                            .addComponent(textProductBuyPriceSave)
                            .addComponent(textProductNameSave)
                            .addComponent(comboBoxProductCategorySave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelProductSaveLayout.setVerticalGroup(
            panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textProductNameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(comboBoxProductCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(textProductBuyPriceSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(textProductSalePriceSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(textProductStockSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(textProductCommentarySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(buttonProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelProductEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Düzenle"));

        jLabel24.setText("Ürün Adı:");

        jLabel25.setText("Kategori:");

        jLabel26.setText("Alış Fiyatı:");

        jLabel27.setText("Satış Fiyatı:");

        jLabel28.setText("Stok Durumu:");

        jLabel29.setText("Açıklama:");

        comboBoxProductCategoryEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonProductEdit.setText("Düzenle");
        buttonProductEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductEditLayout = new javax.swing.GroupLayout(panelProductEdit);
        panelProductEdit.setLayout(panelProductEditLayout);
        panelProductEditLayout.setHorizontalGroup(
            panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonProductEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductEditLayout.createSequentialGroup()
                        .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProductStockEdit)
                            .addComponent(textProductCommentaryEdit)
                            .addComponent(textProductSalePriceEdit)
                            .addComponent(textProductBuyPriceEdit)
                            .addComponent(textProductNameEdit)
                            .addComponent(comboBoxProductCategoryEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelProductEditLayout.setVerticalGroup(
            panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(textProductNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(comboBoxProductCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(textProductBuyPriceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(textProductSalePriceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(textProductStockEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(textProductCommentaryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonProductEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addComponent(panelProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelProductLayout.createSequentialGroup()
                .addComponent(panelProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProductTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProductTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProductSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProductEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabbedCurrentAccount.addTab("Ürün Yönetimi", panelProduct);

        panelCategoryTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Listesi"));

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        scrollPaneCategoryTable.setViewportView(tableCategory);

        javax.swing.GroupLayout panelCategoryTableLayout = new javax.swing.GroupLayout(panelCategoryTable);
        panelCategoryTable.setLayout(panelCategoryTableLayout);
        panelCategoryTableLayout.setHorizontalGroup(
            panelCategoryTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCategoryTable, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        panelCategoryTableLayout.setVerticalGroup(
            panelCategoryTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryTableLayout.createSequentialGroup()
                .addComponent(scrollPaneCategoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCategoryTableButtons.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonCategoryTableEdit.setText("Düzenle");
        buttonCategoryTableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryTableEditActionPerformed(evt);
            }
        });

        buttonCategoryTableDelete.setText("Sil");
        buttonCategoryTableDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryTableDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoryTableButtonsLayout = new javax.swing.GroupLayout(panelCategoryTableButtons);
        panelCategoryTableButtons.setLayout(panelCategoryTableButtonsLayout);
        panelCategoryTableButtonsLayout.setHorizontalGroup(
            panelCategoryTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryTableButtonsLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(panelCategoryTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCategoryTableEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(buttonCategoryTableDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        panelCategoryTableButtonsLayout.setVerticalGroup(
            panelCategoryTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryTableButtonsLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(buttonCategoryTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(buttonCategoryTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCategorySave.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Kategori Ekle"));

        jLabel30.setText("Kategori Adı:");

        jLabel31.setText("Açıklama:");

        buttonCategorySave.setText("Ekle");
        buttonCategorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategorySaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategorySaveLayout = new javax.swing.GroupLayout(panelCategorySave);
        panelCategorySave.setLayout(panelCategorySaveLayout);
        panelCategorySaveLayout.setHorizontalGroup(
            panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategorySaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCategorySaveLayout.createSequentialGroup()
                        .addGap(0, 326, Short.MAX_VALUE)
                        .addComponent(buttonCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategorySaveLayout.createSequentialGroup()
                        .addGroup(panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCategoryCommentarySave)
                            .addComponent(textCategoryNameSave))))
                .addContainerGap())
        );
        panelCategorySaveLayout.setVerticalGroup(
            panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategorySaveLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(textCategoryNameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategorySaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(textCategoryCommentarySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCategoryEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Düzenle"));

        jLabel32.setText("Kategori Adı:");

        jLabel33.setText("Açıklama:");

        buttonCategoryEdit.setText("Düzenle");
        buttonCategoryEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoryEditLayout = new javax.swing.GroupLayout(panelCategoryEdit);
        panelCategoryEdit.setLayout(panelCategoryEditLayout);
        panelCategoryEditLayout.setHorizontalGroup(
            panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoryEditLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(textCategoryNameEdit))
                    .addGroup(panelCategoryEditLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(35, 35, 35)
                        .addComponent(textCategotyCommentaryEdit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCategoryEditLayout.setVerticalGroup(
            panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryEditLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(textCategoryNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(textCategotyCommentaryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(buttonCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCategoryLayout = new javax.swing.GroupLayout(panelCategory);
        panelCategory.setLayout(panelCategoryLayout);
        panelCategoryLayout.setHorizontalGroup(
            panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryLayout.createSequentialGroup()
                .addComponent(panelCategoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCategoryTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCategoryLayout.createSequentialGroup()
                .addComponent(panelCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCategoryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCategoryLayout.setVerticalGroup(
            panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryLayout.createSequentialGroup()
                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCategoryTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCategoryTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCategorySave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCategoryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabbedCurrentAccount.addTab("Kategori Yönetimi", panelCategory);

        panelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Parola Değiştir"));

        jLabel34.setText("Eski Parola:");

        jLabel35.setText("Yeni Parola:");

        jLabel36.setText("Yeni Parola Tekrar:");

        buttonPasswordEdit.setText("Değiştir");
        buttonPasswordEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPasswordEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNewPasswordRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(textNewPassword)
                    .addComponent(textOldPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(textOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(textNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(textNewPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(buttonPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelUserOptionsLayout = new javax.swing.GroupLayout(panelUserOptions);
        panelUserOptions.setLayout(panelUserOptionsLayout);
        panelUserOptionsLayout.setHorizontalGroup(
            panelUserOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );
        panelUserOptionsLayout.setVerticalGroup(
            panelUserOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        tabbedCurrentAccount.addTab("Kullanıcı Ayarları", panelUserOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedCurrentAccount))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedCurrentAccount, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void buttonPasswordEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPasswordEditActionPerformed
    if (textNewPassword.getText().trim().equals("") || textNewPasswordRepeat.getText().trim().equals("") || textOldPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (textNewPassword.getText().trim().equals(textNewPasswordRepeat.getText().trim())) {
            Methods m = new Methods();
            m.passwordEdit(this, textOldPassword.getText().trim(), textNewPassword.getText().trim());
        } else {
            JOptionPane.showMessageDialog(this, "Yeni parolalar uyuşmuyor. Lütfen tekrar giriniz.");
        }
    }//GEN-LAST:event_buttonPasswordEditActionPerformed
    
    String cosID = "";
    
    private void tableCostumersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCostumersMouseClicked
        cosID = cosls.get(tableCostumers.getSelectedRow()).getCostumersID();
        System.out.println(cosID);
        setEnabled(true, panelCostumersTableButtons.getComponents());
    }//GEN-LAST:event_tableCostumersMouseClicked
    
    String editCostumersID = "";
    
    private void buttonCostumersTableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersTableEditActionPerformed
        editCostumersID = cosID;
        DB db = new DB();
        try {
            String query = "CALL prcCostumersGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editCostumersID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textCostumersNameEdit.setText(rs.getString("cosname"));
                textCostumersSurnameEdit.setText(rs.getString("cossurname"));
                textCostumersPhoneEdit.setText(rs.getString("cosphone"));
                textCostumersAdressEdit.setText(rs.getString("cosadress"));

            }
        } catch (SQLException e) {
            System.err.println("costumersEdit " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelCostumersEdit.getComponents());
        setEnabled(false, panelCostumersTableButtons.getComponents());
    }//GEN-LAST:event_buttonCostumersTableEditActionPerformed

    
    
    private void buttonCostumersTableDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersTableDeleteActionPerformed
         Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.costumersDelete(this, cosID);
            setEnabled(false, panelCostumersTableButtons.getComponents());
            tableCostumers.setModel(method.costumersTable());
            cosID = "";
            cosls = m.costumersFill();
            costumersIDS = m.comboSaleCostumersFill(comboBoxSelectCostumers);

        }
    }//GEN-LAST:event_buttonCostumersTableDeleteActionPerformed
    
    ArrayList<String> costumersIDS = new ArrayList<>();
    
    private void buttonCostumersSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersSaveActionPerformed
       Methods m = new Methods();
        if (!new Control().isALetter(textCostumersNameSave.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isALetter(textCostumersSurnameSave.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else {
            m.costumersAdd(this, textCostumersNameSave.getText().trim(), textCostumersSurnameSave.getText().trim(), textCostumersPhoneSave.getText().trim(), textCostumersAdressSave.getText().trim());
            tableCostumers.setModel(m.costumersTable());

            cosls = m.costumersFill();
            costumersIDS = m.comboSaleCostumersFill(comboBoxSelectCostumers);
        }
    }//GEN-LAST:event_buttonCostumersSaveActionPerformed
    
    
    
    private void buttonCostumersEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersEditActionPerformed
        
        Methods m = new Methods();
        String name = textCostumersNameEdit.getText().trim();
        String surname = textCostumersSurnameEdit.getText().trim();
        String phone = textCostumersPhoneEdit.getText().trim();
        String adress = textCostumersAdressEdit.getText().trim();

        if (name.equals("") || surname.equals("") || phone.equals("") || adress.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (!new Control().isALetter(textCostumersNameEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isALetter(textCostumersSurnameEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isAPhone(phone)) {
            JOptionPane.showMessageDialog(this, "Telefon formata uygun değil.");
        } else {
            m.costumersEdit(this, editCostumersID, name, surname, phone, adress);
            editCostumersID = "";
            cosID = "";
            tableCostumers.setModel(m.costumersTable());
            textCostumersNameEdit.setText("");
            textCostumersSurnameEdit.setText("");
            textCostumersPhoneEdit.setText("");
            textCostumersAdressEdit.setText("");
            setEnabled(false, panelCostumersEdit.getComponents());
            costumersIDS = m.comboSaleCostumersFill(comboBoxSelectCostumers);
        }
    }//GEN-LAST:event_buttonCostumersEditActionPerformed
    
    ArrayList<String> productIDS = new ArrayList<>();
    
    private void buttonSalesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalesListActionPerformed
        
        String idList = catIDls.get(comboBoxSalesList.getSelectedIndex());

        panelSalesTable.setVisible(true);

        Methods m = new Methods();
        productIDS = m.saleProductList(idList, tableSales);
    }//GEN-LAST:event_buttonSalesListActionPerformed

    String atComboCostumersID = "";
    String atCategoryProductID = "";
    
    private void buttonSaleAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaleAddActionPerformed
        
        atComboCostumersID = costumersIDS.get(comboBoxSelectCostumers.getSelectedIndex());
        Methods m = new Methods();
        Control c = new Control();
        if (textSaleCount.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen adet giriniz.");
        } else if (!c.isANumber(textSaleCount.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Sayısal değer giriniz.");
        } else if (Integer.valueOf(textSaleCount.getText().trim()) <= 0) {
            JOptionPane.showMessageDialog(this, "Adet 0`dan büyük olmalı");
        } else {
            m.saleAction(this, atComboCostumersID, atCategoryProductID, textSaleCount.getText().trim());
        }
    }//GEN-LAST:event_buttonSaleAddActionPerformed
    
    String productID = "";
        
    String editProductID = "";
    
    private void buttonProductTableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductTableEditActionPerformed
        editProductID = productID;

        DB db = new DB();
        try {
            String query = "CALL prcProductGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editProductID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textProductNameEdit.setText(rs.getString("pname"));
                comboBoxProductCategoryEdit.setSelectedItem(rs.getString("cname"));
                textProductBuyPriceEdit.setText(rs.getString("pbuy"));
                textProductSalePriceEdit.setText(rs.getString("psale"));
                textProductStockEdit.setText(rs.getString("pstock"));
                textProductCommentaryEdit.setText(rs.getString("pcommentary"));
            }
        } catch (SQLException e) {
            System.err.println("productTable " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelProductEdit.getComponents());
        setEnabled(false, panelProductTableButtons.getComponents());
    }//GEN-LAST:event_buttonProductTableEditActionPerformed

    
    
    private void buttonProductTableDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductTableDeleteActionPerformed
         
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            m.productDelete(this, productID);
            setEnabled(false, panelProductTableButtons.getComponents());
            tableProduct.setModel(m.productTable());
            productID = "";
            prols = m.productFill();
        }
    }//GEN-LAST:event_buttonProductTableDeleteActionPerformed
    
    
    
    private void buttonProductSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductSaveActionPerformed
        
         if (!new Control().isANumber(textProductStockSave.getText())) {
            JOptionPane.showMessageDialog(this, "Stok sayısal değer olmalı.");
        } else if (!new Control().isANumber(textProductBuyPriceSave.getText())) {
            JOptionPane.showMessageDialog(this, "Alış fiyatı sayısal değer olmalı.");
        } else if (!new Control().isANumber(textProductSalePriceSave.getText())) {
            JOptionPane.showMessageDialog(this, "Satış fiyatı sayısal değer olmalı.");
        } else {

            if (Integer.valueOf(textProductBuyPriceSave.getText()) > Integer.valueOf(textProductSalePriceSave.getText())) {
                int confirmed = JOptionPane.showConfirmDialog(this,
                        "Alış fiyatı satış fiyatından yüksek. Emin misiniz?", "Satış",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    Methods m = new Methods();
                    m.productAdd(this, textProductNameSave.getText().trim(), catIDls.get(comboBoxProductCategorySave.getSelectedIndex()), textProductBuyPriceSave.getText().trim(), textProductSalePriceSave.getText().trim(), textProductStockSave.getText().trim(), textProductCommentarySave.getText().trim());
                    tableProduct.setModel(m.productTable());

                    prols = m.productFill();
                }
            }else{
                Methods m = new Methods();
            m.productAdd(this, textProductNameSave.getText().trim(), catIDls.get(comboBoxProductCategorySave.getSelectedIndex()), textProductBuyPriceSave.getText().trim(), textProductSalePriceSave.getText().trim(), textProductStockSave.getText().trim(), textProductCommentarySave.getText().trim());
            tableProduct.setModel(m.productTable());

            prols = m.productFill();
            }

        }
    }//GEN-LAST:event_buttonProductSaveActionPerformed
    
    
    
    private void buttonProductEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProductEditActionPerformed
        
        Methods m = new Methods();
        String name = textProductNameEdit.getText().trim();
        String category = catIDls.get(comboBoxProductCategoryEdit.getSelectedIndex());
        String buy = textProductBuyPriceEdit.getText().trim();
        String sale = textProductSalePriceEdit.getText().trim();
        String stock = textProductStockEdit.getText().trim();
        String commentary = textProductCommentaryEdit.getText().trim();

        if (name.equals("") || buy.equals("") || sale.equals("") || stock.equals("") || commentary.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (!new Control().isANumber(textProductStockEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Stok sayısal değer olmalı.");
        } else if (!new Control().isANumber(textProductBuyPriceEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Alış fiyatı sayısal değer olmalı.");
        } else if (!new Control().isANumber(textProductSalePriceEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Satış fiyatı sayısal değer olmalı.");
        } else {
            
            if (Integer.valueOf(textProductBuyPriceEdit.getText())>Integer.valueOf(textProductSalePriceEdit.getText())) {
                int confirmed = JOptionPane.showConfirmDialog(this,
                        "Alış fiyatı satış fiyatından yüksek. Emin misiniz?", "Satış",
                        JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                m.productEdit(this, editProductID, name, category, buy, sale, stock, commentary);
            editProductID = "";
            productID = "";
            tableProduct.setModel(m.productTable());
            textProductNameEdit.setText("");
            comboBoxProductCategoryEdit.setSelectedIndex(0);
            textProductBuyPriceEdit.setText("");
            textProductSalePriceEdit.setText("");
            textProductStockEdit.setText("");
            textProductCommentaryEdit.setText("");

            setEnabled(false, panelProductEdit.getComponents());
            }
            }else{
           
                m.productEdit(this, editProductID, name, category, buy, sale, stock, commentary);
            editProductID = "";
            productID = "";
            tableProduct.setModel(m.productTable());
            textProductNameEdit.setText("");
            comboBoxProductCategoryEdit.setSelectedIndex(0);
            textProductBuyPriceEdit.setText("");
            textProductSalePriceEdit.setText("");
            textProductStockEdit.setText("");
            textProductCommentaryEdit.setText("");

            setEnabled(false, panelProductEdit.getComponents());
            
            }
            
        }
    }//GEN-LAST:event_buttonProductEditActionPerformed

    String catID = "";
        
    String editCategoryID = "";
    
    private void buttonCategoryTableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryTableEditActionPerformed
        
        editCategoryID = catID;
        DB db = new DB();
        try {
            String query = "CALL prcCategoryGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editCategoryID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textCategoryNameEdit.setText(rs.getString("cname"));
                textCategotyCommentaryEdit.setText(rs.getString("ccommentary"));
            }
        } catch (SQLException e) {
            System.err.println("categoryEdit " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelCategoryEdit.getComponents());
        setEnabled(false, panelCategoryTableButtons.getComponents());
    }//GEN-LAST:event_buttonCategoryTableEditActionPerformed
    
    
    
    private void buttonCategoryTableDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryTableDeleteActionPerformed
        
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.categoryDelete(this, catID);
            setEnabled(false, panelCostumersTableButtons.getComponents());
            tableCategory.setModel(m.categoryTable());
            catID = "";
            catls = m.categoryFill();
            m.comboCategoryFill(comboBoxProductCategorySave);
            m.comboCategoryFill(comboBoxProductCategoryEdit);
            m.comboCategoryFill(comboBoxSalesList);
            catIDls = m.comboCategoryFill(comboBoxProductCategorySave);

        }
    }//GEN-LAST:event_buttonCategoryTableDeleteActionPerformed

    
    
    private void buttonCategorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategorySaveActionPerformed
        
        Methods m = new Methods();
        m.categoryAdd(this, textCategoryNameSave.getText().trim(), textCategoryCommentarySave.getText().trim());
        tableCategory.setModel(m.categoryTable());
        catls = m.categoryFill();
        m.comboCategoryFill(comboBoxProductCategorySave);
        m.comboCategoryFill(comboBoxProductCategoryEdit);
        m.comboCategoryFill(comboBoxSalesList);
        catIDls = m.comboCategoryFill(comboBoxProductCategorySave);
    }//GEN-LAST:event_buttonCategorySaveActionPerformed
    
    
    
    private void buttonCategoryEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryEditActionPerformed
        
        Methods m = new Methods();
        String name = textCategoryNameEdit.getText().trim();
        String commentary = textCategotyCommentaryEdit.getText().trim();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Kategori Adı boş bırakılamaz.");
        } else {
            m.categoryEdit(this, editCategoryID, name, commentary);
            editCategoryID = "";
            catID = "";
            tableCategory.setModel(m.categoryTable());
            textCategoryNameEdit.setText("");
            textCategotyCommentaryEdit.setText("");
            setEnabled(false, panelCategoryEdit.getComponents());
            m.comboCategoryFill(comboBoxProductCategorySave);
            m.comboCategoryFill(comboBoxProductCategoryEdit);
            m.comboCategoryFill(comboBoxSalesList);
            catIDls = m.comboCategoryFill(comboBoxProductCategorySave);
        }
    }//GEN-LAST:event_buttonCategoryEditActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        productID = prols.get(tableProduct.getSelectedRow()).getProductID();
        System.out.println(productID);
        setEnabled(true, panelProductTableButtons.getComponents()); 
    }//GEN-LAST:event_tableProductMouseClicked

    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
           
        catID = catls.get(tableCategory.getSelectedRow()).getCategoryID();
        setEnabled(true, panelCategoryTableButtons.getComponents());
    }//GEN-LAST:event_tableCategoryMouseClicked

    private void tableSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalesMouseClicked
        Methods m = new Methods();
        atCategoryProductID = productIDS.get(tableSales.getSelectedRow());
        DB db = new DB();
        if (evt.getClickCount() == 2) {
            panelSalesAdd.setVisible(true);
            try {
                String query = "CALL prcProductGet(?)";
                PreparedStatement ps = db.preBaglan(query);
                ps.setString(1, atCategoryProductID);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    textPickedProduct.setText(rs.getString("pname"));
                }

            } catch (SQLException e) {
                System.err.println("tableSales " + e);
            } finally {
                db.kapat();
            }
            costumersIDS = m.comboSaleCostumersFill(comboBoxSelectCostumers);
            }
    }//GEN-LAST:event_tableSalesMouseClicked
    
    
    private void dateChooserStartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserStartPropertyChange
        String start = ((JTextField) dateChooserStart.getDateEditor().getUiComponent()).getText();
        String finish = ((JTextField) dateChooserFinish.getDateEditor().getUiComponent()).getText();

        String search = textReportsSearch.getText();

        if (radioButtonCostumers.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.costumersSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonProduct.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.productSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonCategory.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.categorySearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            labelDateWarning.setText("Lütfen kriter seçiniz.");
        }
    }//GEN-LAST:event_dateChooserStartPropertyChange

    private void dateChooserFinishPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserFinishPropertyChange
        String start = ((JTextField) dateChooserStart.getDateEditor().getUiComponent()).getText();
        String finish = ((JTextField) dateChooserFinish.getDateEditor().getUiComponent()).getText();

        String search = textReportsSearch.getText();

        if (radioButtonCostumers.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.costumersSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonProduct.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.productSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonCategory.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.categorySearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            labelDateWarning.setText("Lütfen kriter seçiniz.");
        }
    }//GEN-LAST:event_dateChooserFinishPropertyChange

    private void textReportsSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textReportsSearchKeyReleased
        String start = ((JTextField) dateChooserStart.getDateEditor().getUiComponent()).getText();
        String finish = ((JTextField) dateChooserFinish.getDateEditor().getUiComponent()).getText();

        String search = textReportsSearch.getText();

        if (radioButtonCostumers.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.costumersSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonProduct.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.productSearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (radioButtonCategory.isSelected()) {
            Date date1 = dateChooserStart.getDate();
            Date date2 = dateChooserFinish.getDate();

            if (date1.compareTo(date2) > 0) {
                labelDateWarning.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.categorySearch(start, finish, search, tableReportsResult);
                labelDateWarning.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            labelDateWarning.setText("Lütfen kriter seçiniz.");
        }
    }//GEN-LAST:event_textReportsSearchKeyReleased

    
    
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCategoryEdit;
    private javax.swing.JButton buttonCategorySave;
    private javax.swing.JButton buttonCategoryTableDelete;
    private javax.swing.JButton buttonCategoryTableEdit;
    private javax.swing.JButton buttonCostumersEdit;
    private javax.swing.JButton buttonCostumersSave;
    private javax.swing.JButton buttonCostumersTableDelete;
    private javax.swing.JButton buttonCostumersTableEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonPasswordEdit;
    private javax.swing.JButton buttonProductEdit;
    private javax.swing.JButton buttonProductSave;
    private javax.swing.JButton buttonProductTableDelete;
    private javax.swing.JButton buttonProductTableEdit;
    private javax.swing.JButton buttonSaleAdd;
    private javax.swing.JButton buttonSalesList;
    private javax.swing.JComboBox comboBoxProductCategoryEdit;
    private javax.swing.JComboBox comboBoxProductCategorySave;
    private javax.swing.JComboBox comboBoxSalesList;
    private javax.swing.JComboBox comboBoxSelectCostumers;
    private com.toedter.calendar.JDateChooser dateChooserFinish;
    private com.toedter.calendar.JDateChooser dateChooserStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JLabel labelDateWarning;
    private javax.swing.JPanel panelCategory;
    private javax.swing.JPanel panelCategoryEdit;
    private javax.swing.JPanel panelCategorySave;
    private javax.swing.JPanel panelCategoryTable;
    private javax.swing.JPanel panelCategoryTableButtons;
    private javax.swing.JPanel panelCostumers;
    private javax.swing.JPanel panelCostumersEdit;
    private javax.swing.JPanel panelCostumersSave;
    private javax.swing.JPanel panelCostumersTable;
    private javax.swing.JPanel panelCostumersTableButtons;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JPanel panelProductEdit;
    private javax.swing.JPanel panelProductSave;
    private javax.swing.JPanel panelProductTable;
    private javax.swing.JPanel panelProductTableButtons;
    private javax.swing.JPanel panelReports;
    private javax.swing.JPanel panelReportsFilter;
    private javax.swing.JPanel panelReportsFinishDate;
    private javax.swing.JPanel panelReportsResult;
    private javax.swing.JPanel panelReportsStartDate;
    private javax.swing.JPanel panelSales;
    private javax.swing.JPanel panelSalesAdd;
    private javax.swing.JPanel panelSalesTable;
    private javax.swing.JPanel panelUserOptions;
    private javax.swing.JRadioButton radioButtonCategory;
    private javax.swing.JRadioButton radioButtonCostumers;
    private javax.swing.JRadioButton radioButtonProduct;
    private javax.swing.JScrollPane scrollPaneCategoryTable;
    private javax.swing.JScrollPane scrollPaneCostumers;
    private javax.swing.JScrollPane scrollPaneProductTable;
    private javax.swing.JScrollPane scrollPaneReportsResult;
    private javax.swing.JScrollPane scrollPaneSalesTable;
    private javax.swing.JTabbedPane tabbedCurrentAccount;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTable tableCostumers;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTable tableReportsResult;
    private javax.swing.JTable tableSales;
    private javax.swing.JTextField textCategoryCommentarySave;
    private javax.swing.JTextField textCategoryNameEdit;
    private javax.swing.JTextField textCategoryNameSave;
    private javax.swing.JTextField textCategotyCommentaryEdit;
    private javax.swing.JTextField textCostumersAdressEdit;
    private javax.swing.JTextField textCostumersAdressSave;
    private javax.swing.JTextField textCostumersNameEdit;
    private javax.swing.JTextField textCostumersNameSave;
    private javax.swing.JTextField textCostumersPhoneEdit;
    private javax.swing.JTextField textCostumersPhoneSave;
    private javax.swing.JTextField textCostumersSurnameEdit;
    private javax.swing.JTextField textCostumersSurnameSave;
    private javax.swing.JPasswordField textNewPassword;
    private javax.swing.JPasswordField textNewPasswordRepeat;
    private javax.swing.JPasswordField textOldPassword;
    private javax.swing.JLabel textPickedProduct;
    private javax.swing.JTextField textProductBuyPriceEdit;
    private javax.swing.JTextField textProductBuyPriceSave;
    private javax.swing.JTextField textProductCommentaryEdit;
    private javax.swing.JTextField textProductCommentarySave;
    private javax.swing.JTextField textProductNameEdit;
    private javax.swing.JTextField textProductNameSave;
    private javax.swing.JTextField textProductSalePriceEdit;
    private javax.swing.JTextField textProductSalePriceSave;
    private javax.swing.JTextField textProductStockEdit;
    private javax.swing.JTextField textProductStockSave;
    private javax.swing.JLabel textProfit;
    private javax.swing.JTextField textReportsSearch;
    private javax.swing.JTextField textSaleCount;
    // End of variables declaration//GEN-END:variables
}
