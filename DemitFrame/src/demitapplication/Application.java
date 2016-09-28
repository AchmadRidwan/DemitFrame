/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demitapplication;
import com.google.gson.Gson;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.File;

import javax.swing.*;
//import java.io.File;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
/**
 *
 * @author matata
 */
public class Application extends javax.swing.JFrame {
    public static String kategoryPath = "unit kategory";
    public static String buildingsPath = "unit kategory/buildings";
    public static String armyPath = "unit kategory/army";
    public static String resourcePath = "unit kategory/buildings/resource";
    public static String defensesPath = "unit kategory/buildings/defenses";
    public static String armybuildPath = "unit kategory/buildings/army buildings";
    public static String reStoragePath = "unit kategory/buildings/resource/storage";
    public static String reProdusenPath = "unit kategory/buildings/resource/produsen";
    public static String rePusatPath = "unit kategory/buildings/resource/pusat";
    public static String armyStoragePath = "unit kategory/buildings/army buildings/storage";
    public static String armyProdusenPath = "unit kategory/buildings/army buildings/produsen";
    public static String buildingsDefPath = "unit kategory/buildings/defenses/buildings";
    public static String trapsDefPath = "unit kategory/buildings/defenses/traps";
    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        setLocationRelativeTo(null);
        checkFolder();
    }
    
//    public class SampleJFileChooser {
//    public SampleJFileChooser(){
//        JFileChooser jFileChooser = new JFileChooser();
//        jFileChooser.setCurrentDirectory(new File("/User/alvinreyes"));
//        int result = jFileChooser.showOpenDialog(new JFrame());
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File selectedFile = jFileChooser.getSelectedFile();
//            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
//        }
//    }
////    public static void main(String[] args) {
////        new SampleJFileChooser();
////    }
//}

    
    public void checkFolder(){
        
        File dataFile = new File(kategoryPath);
        boolean dataexist = dataFile.exists();
        if(dataexist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder kategory dan isi folder kategory terlebih dahulu");
            System.exit(0);
        }            
        File buildingsFile = new File(buildingsPath);
        boolean buildingsExist = buildingsFile.exists();
        if(buildingsExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (buildings) di dalam folder kategory");
            System.exit(0);
        }
        File armyFile = new File(armyPath);
        boolean armyExist = armyFile.exists();
        if(armyExist){
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (army) di dalam folder kategory");
            System.exit(0);
        }
        File resourceFile = new File(resourcePath);
        boolean resourceExist = resourceFile.exists();
        if(resourceExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (resource) di dalam folder (buildings)");
            System.exit(0);
        }        
        File defensesFile = new File(defensesPath);
        boolean defensesExist = defensesFile.exists();
        if(defensesExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (defenses) di dalam folder (buildings)");
            System.exit(0);
        } 
        File armybuildFile = new File(armybuildPath);
        boolean armybuildExist = armybuildFile.exists();
        if(armybuildExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (army) di dalam folder (buildings)");
            System.exit(0);
        } 
        File reStorageFile = new File(reStoragePath);
        boolean reStorageExist = reStorageFile.exists();
        if(reStorageExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (storage) di dalam folder (resource)");
            System.exit(0);
        } 
        File reProdusenFile = new File(reProdusenPath);
        boolean reProdusenExist = reProdusenFile.exists();
        if(reProdusenExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (produsen) di dalam folder (resource)");
            System.exit(0);
        }
        File rePusatFile = new File(rePusatPath);
        boolean rePusatExist = rePusatFile.exists();
        if(rePusatExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (pusat) di dalam folder (resource)");
            System.exit(0);
        }
        File armyStorageFile = new File(armyStoragePath);
        boolean armyStorageExist = armyStorageFile.exists();
        if(armyStorageExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (storage) di dalam folder (army buildings)");
            System.exit(0);
        }
        File armyProdusenFile = new File(armyProdusenPath);
        boolean armyProdusenExist = armyProdusenFile.exists();
        if(armyProdusenExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (produsen) di dalam folder (army buildings)");
            System.exit(0);
        }
        File buildingsDefFile = new File(buildingsDefPath);
        boolean buildingsDefExist = buildingsDefFile.exists();
        if(buildingsDefExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (buildings) di dalam folder (defenses)");
            System.exit(0);
        }
        File trapsDefFile = new File(trapsDefPath);
        boolean trapsDefExist = trapsDefFile.exists();
        if(trapsDefExist) {
        }else {
            JOptionPane.showMessageDialog(this, "buatlah folder (traps) di dalam folder (defenses)");
            System.exit(0);
        }
    }
    
    public float getFloat(JTextField r){
     String a = r.getText();
     if (a.equals("")){
         a = "";
         r.setText(a);
     }
     int i = -1;
        try {            

            i = Integer.parseInt(a);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Anda salah mengisi data silahkan isi kembali");
            r.setText("");

            r.setBackground(Color.red);
            return -1;
        }
       
            if (i < 0){
                r.setBackground(Color.red);
                return -1;
            }
        return i;
    }    
    
    public int getInt(JTextField f){
        String s = f.getText();
        if(s.equals("")) {
            s = "";
            f.setText(s);
        }
        int i = -1;
        try {            

            i = Integer.parseInt(s);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Anda salah mengisi data silahkan isi kembali");
            f.setText("");

            f.setBackground(Color.red);
            return -1;
        }
       
            if (i < 0){
                f.setBackground(Color.red);
                return -1;
            }
        return i;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boostCostRes = new javax.swing.JTextField();
        pCapacityRes = new javax.swing.JTextField();
        productionRateRes = new javax.swing.JTextField();
        timeToFillRes = new javax.swing.JTextField();
        catchUpPointRes = new javax.swing.JTextField();
        pLevelRes = new javax.swing.JComboBox<>();
        pTownHallLevelReqRes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sLevelRes = new javax.swing.JComboBox<>();
        storageCapacityRes = new javax.swing.JTextField();
        sTownHallLevelReqRes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        pusatLevelRes = new javax.swing.JComboBox<>();
        maximumNumberOfBuidingsRes = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        goldAvailableRes = new javax.swing.JTextField();
        elixirAvailableRes = new javax.swing.JTextField();
        collapseDarkElixirRes = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hitpointRes = new javax.swing.JTextField();
        buildTimeRes = new javax.swing.JTextField();
        buildCostRes = new javax.swing.JTextField();
        experienceRes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unitTypeRes = new javax.swing.JTextField();
        nameRes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionRes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        damageDef = new javax.swing.JTextField();
        buildCostDef = new javax.swing.JTextField();
        buildTimeDef = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        unitTypeDef = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nameDef = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionDef = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        bTownHallLevelReqDef = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        attackSpeedDef = new javax.swing.JTextField();
        hitpointDef = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        bLevelDef = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tLevelDef = new javax.swing.JComboBox<>();
        reArmCostDef = new javax.swing.JTextField();
        damageRadiusDef = new javax.swing.JTextField();
        favoriteTargetedDef = new javax.swing.JComboBox<>();
        tTownHallLevelReqDef = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        experienceDef = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        rangeDef = new javax.swing.JTextField();
        unitTypeTargetDef = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        damageTypeDef = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        damagePerSecondDef = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        boostCostAr = new javax.swing.JTextField();
        maximumUnitAr = new javax.swing.JTextField();
        pLevelAr = new javax.swing.JComboBox<>();
        pTownHallLevelReqAr = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        sLevelAr = new javax.swing.JComboBox<>();
        troopCapacityAr = new javax.swing.JTextField();
        sTownHallLevelReqAr = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        hitpointAr = new javax.swing.JTextField();
        buildTimeAr = new javax.swing.JTextField();
        buildCostAr = new javax.swing.JTextField();
        experienceAr = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        unitTypeAr = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        nameAr = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descriptionAr = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        unitTypeArmy = new javax.swing.JTextField();
        nameArmy = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionArmy = new javax.swing.JTextArea();
        damageSecondArmy = new javax.swing.JTextField();
        damageAttackArmy = new javax.swing.JTextField();
        hitpointArmy = new javax.swing.JTextField();
        trainingCostArmy = new javax.swing.JTextField();
        researchCostArmy = new javax.swing.JTextField();
        researchTimeArmy = new javax.swing.JTextField();
        levelArmy = new javax.swing.JComboBox<>();
        preferredTargetArmy = new javax.swing.JComboBox<>();
        attackTypeArmy = new javax.swing.JComboBox<>();
        laboratoryLevelReqArmy = new javax.swing.JComboBox<>();
        housingSpaceArmy = new javax.swing.JTextField();
        trainingTimeArmy = new javax.swing.JTextField();
        movementSpeedArmy = new javax.swing.JTextField();
        attackSpeedArmy = new javax.swing.JTextField();
        rangeArmy = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        barracksLevelReqArmy = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CruiseList = new javax.swing.JList<>();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Level");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Boost Cost");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Capacity");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Production Rate");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Time To Fill");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Catch Up Point");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Town Hall Level Required");

        boostCostRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pCapacityRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        productionRateRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        timeToFillRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        catchUpPointRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pLevelRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pLevelRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        pTownHallLevelReqRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pTownHallLevelReqRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Export");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(187, 187, 187)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boostCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeToFillRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productionRateRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catchUpPointRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170)
                                .addComponent(jButton1)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boostCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(productionRateRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(timeToFillRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(catchUpPointRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(pTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(86, 86, 86))))
        );

        jTabbedPane2.addTab("Produsen", jPanel2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Level");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Storage Capacity");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Town Hall Level Required");

        sLevelRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sLevelRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        storageCapacityRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sTownHallLevelReqRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sTownHallLevelReqRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(storageCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(210, 210, 210)
                        .addComponent(sLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(127, 127, 127))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(storageCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Storage", jPanel3);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("TH Level");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("Maximum Number of Buildings Available");

        pusatLevelRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pusatLevelRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        maximumNumberOfBuidingsRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("Gold Available");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("Elixir Available");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("Dark Elixir Available");

        goldAvailableRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        elixirAvailableRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        collapseDarkElixirRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(jList1);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Resource and Offensive Buildings Available");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("ADD");

        jButton10.setText("Export");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pusatLevelRes, 0, 75, Short.MAX_VALUE)
                            .addComponent(maximumNumberOfBuidingsRes)
                            .addComponent(goldAvailableRes)
                            .addComponent(elixirAvailableRes)
                            .addComponent(collapseDarkElixirRes))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(34, 34, 34))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel71)
                                .addComponent(pusatLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(maximumNumberOfBuidingsRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(goldAvailableRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(elixirAvailableRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(collapseDarkElixirRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jButton10)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Pusat", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Hitpoint");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Build Time");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Build Cost");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Experience Gained");

        hitpointRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildCostRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        experienceRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Unit Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Description");

        unitTypeRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unitTypeRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitTypeResActionPerformed(evt);
            }
        });

        nameRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionRes.setColumns(20);
        descriptionRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionRes.setRows(5);
        jScrollPane1.setViewportView(descriptionRes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(experienceRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buildTimeRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buildCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hitpointRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitTypeRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hitpointRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(unitTypeRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buildTimeRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(buildCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(experienceRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resource Buildings", jPanel1);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Damage");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Build Cost");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Build Time");

        damageDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageDef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                damageDefFocusLost(evt);
            }
        });

        buildCostDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Unit Type");

        unitTypeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Name");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Description");

        nameDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionDef.setColumns(20);
        descriptionDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionDef.setRows(5);
        jScrollPane2.setViewportView(descriptionDef);

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        bTownHallLevelReqDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bTownHallLevelReqDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("Attack Speed");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("Town Hall Level Required");

        attackSpeedDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackSpeedDef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                attackSpeedDefFocusLost(evt);
            }
        });

        hitpointDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Hitpoints");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("Level");

        bLevelDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLevelDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Export");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addGap(199, 199, 199)
                        .addComponent(bLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel77)
                        .addGap(57, 57, 57)
                        .addComponent(attackSpeedDef, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(179, 179, 179)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bTownHallLevelReqDef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hitpointDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(160, 160, 160))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(bLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(attackSpeedDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(hitpointDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(bTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton3)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Buildings", jPanel10);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Level");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Re-Arm Cost");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Damage Radius");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Favorite Target");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Town Hall Level Required");

        tLevelDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tLevelDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        reArmCostDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        damageRadiusDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        favoriteTargetedDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        favoriteTargetedDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Hog Rider" }));

        tTownHallLevelReqDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tTownHallLevelReqDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Export");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(201, 201, 201)
                        .addComponent(tLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel22)
                        .addGap(91, 91, 91)
                        .addComponent(tTownHallLevelReqDef, 0, 75, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reArmCostDef, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(damageRadiusDef)
                            .addComponent(favoriteTargetedDef, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(144, 144, 144))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(tTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(reArmCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(damageRadiusDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(favoriteTargetedDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(87, 87, 87))))
        );

        jTabbedPane4.addTab("Traps", jPanel11);

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("Experience Gained");

        experienceDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("Range");

        rangeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        unitTypeTargetDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unitTypeTargetDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ground", "Ground & Air", "Air" }));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("Damage Type");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("Unit Type Targeted");

        damageTypeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageTypeDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Target", "Splash", "Multiple Targets" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("DPS");

        damagePerSecondDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damagePerSecondDef.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(171, 171, 171)
                                .addComponent(damageDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel83))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buildCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buildTimeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(experienceDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rangeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(damageTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(unitTypeTargetDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel84)
                            .addComponent(jLabel85))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)
                            .addComponent(jLabel24))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(damagePerSecondDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(unitTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(damageDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(nameDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(buildCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(buildTimeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(experienceDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(rangeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(damagePerSecondDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel84)
                                .addComponent(damageTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(unitTypeTargetDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Defensive Buildings", jPanel5);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("Level");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("Boost Cost");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("Maximum Unit Queue Length");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Town Hall Level Required");

        boostCostAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boostCostAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boostCostArActionPerformed(evt);
            }
        });

        maximumUnitAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pLevelAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pLevelAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        pTownHallLevelReqAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pTownHallLevelReqAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Export");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Unlocked Unit");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("Unlocked Army");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boostCostAr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximumUnitAr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTownHallLevelReqAr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(208, 208, 208)
                        .addComponent(pLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton8)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(pLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(boostCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(maximumUnitAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(pTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton5)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Produsen", jPanel8);

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("Level");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("Troop Capacity");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Town Hall Level Required");

        sLevelAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sLevelAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        troopCapacityAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sTownHallLevelReqAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sTownHallLevelReqAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Export");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66))
                .addGap(97, 97, 97)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sTownHallLevelReqAr, 0, 75, Short.MAX_VALUE)
                    .addComponent(troopCapacityAr)
                    .addComponent(sLevelAr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(475, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(243, 243, 243))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(sLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(troopCapacityAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(sTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jButton6)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Storage", jPanel9);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("Hitpoint");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("Build Time");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("Build Cost");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("Experience Gained");

        hitpointAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buildTimeAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildTimeArActionPerformed(evt);
            }
        });

        buildCostAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        experienceAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("Unit Type");

        unitTypeAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("Name");

        nameAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("Description");

        descriptionAr.setColumns(20);
        descriptionAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionAr.setRows(5);
        jScrollPane4.setViewportView(descriptionAr);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buildTimeAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buildCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hitpointAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(148, 148, 148)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58)))
                            .addComponent(experienceAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitTypeAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(hitpointAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(unitTypeAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(buildTimeAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(nameAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(buildCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(experienceAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Army Buildings", jPanel6);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Level");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Damage Per Second");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Damage Per Attack");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Hitpoint");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Training Cost");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Research Cost");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Laboratory Level Required");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("Research Time");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("Preferred Target");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("Attack Type");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("Housing Space");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Training Time");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Movement Speed");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("Attack Speed");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("Barracks Level Required");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("Range");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("Unit Type");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("Name");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("Description");

        unitTypeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionArmy.setColumns(20);
        descriptionArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionArmy.setRows(5);
        jScrollPane3.setViewportView(descriptionArmy);

        damageSecondArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageSecondArmy.setEnabled(false);

        damageAttackArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageAttackArmy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                damageAttackArmyFocusLost(evt);
            }
        });
        damageAttackArmy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                damageAttackArmyMouseClicked(evt);
            }
        });
        damageAttackArmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        damageAttackArmy.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                damageAttackArmyPropertyChange(evt);
            }
        });
        damageAttackArmy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                damageAttackArmyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                damageAttackArmyKeyTyped(evt);
            }
        });

        hitpointArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        trainingCostArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        researchCostArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        researchTimeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        levelArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        preferredTargetArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        preferredTargetArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Defenses", "Resources", "Walls" }));

        attackTypeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackTypeArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melee (Ground Only)", "Ranged (Ground & Air)", "Area Splash Tile Radius (Ground Only)\t", "Area Splash Tile Radius (Ground & Air)", "Heal Splash Tile Radius (Ground Only)", "Single Target" }));

        laboratoryLevelReqArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        laboratoryLevelReqArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        housingSpaceArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        trainingTimeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        movementSpeedArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        attackSpeedArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackSpeedArmy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                attackSpeedArmyFocusLost(evt);
            }
        });
        attackSpeedArmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackSpeedArmyActionPerformed(evt);
            }
        });

        rangeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Export");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        barracksLevelReqArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        barracksLevelReqArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(researchCostArmy)
                            .addComponent(trainingCostArmy)
                            .addComponent(hitpointArmy)
                            .addComponent(researchTimeArmy)
                            .addComponent(damageAttackArmy)
                            .addComponent(laboratoryLevelReqArmy, 0, 75, Short.MAX_VALUE)))
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(levelArmy, javax.swing.GroupLayout.Alignment.LEADING, 0, 75, Short.MAX_VALUE)
                                .addComponent(damageSecondArmy, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(131, 131, 131)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel42)
                        .addComponent(jLabel43)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(jLabel46)
                        .addComponent(jLabel48))
                    .addComponent(jLabel51))
                .addGap(86, 86, 86)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attackTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preferredTargetArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(barracksLevelReqArmy, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rangeArmy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(attackSpeedArmy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(movementSpeedArmy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(trainingTimeArmy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(housingSpaceArmy, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(348, 348, 348))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel41)
                    .addComponent(levelArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preferredTargetArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel42)
                    .addComponent(damageSecondArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attackTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel43)
                    .addComponent(damageAttackArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housingSpaceArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel44)
                    .addComponent(hitpointArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainingTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel45)
                    .addComponent(trainingCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movementSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel46)
                    .addComponent(researchCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attackSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel47)
                    .addComponent(laboratoryLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barracksLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel48)
                    .addComponent(researchTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(unitTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(nameArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton4)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Army", jPanel7);

        CruiseList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(CruiseList);

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jButton11)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton11)))
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buildTimeArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildTimeArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildTimeArActionPerformed

    private void boostCostArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boostCostArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boostCostArActionPerformed

    private void unitTypeResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitTypeResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitTypeResActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        Object Hitpoint = hitpointAr.getText();
        Object BuildTime = buildTimeAr.getText();
        Object Name = nameAr.getText();
        Object Description = descriptionAr.getText();
        Object Level = pLevelAr.getSelectedItem();
        Object LevelTownHallReq = pTownHallLevelReqAr.getSelectedItem();
        
        String sHitpoint = (String)Hitpoint;
        String sBuildTime = (String)BuildTime;
        String sName = (String)Name;
        String sDescription = (String)Description;
        String sLevel = (String)Level;
        String sLevelTownHallReq = (String)LevelTownHallReq;
        
        float fHitpoint = Float.parseFloat(sHitpoint);
        float fBuildTime = Float.parseFloat(sBuildTime);
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sLevelTownHallReq);
        
        int unitType = getInt(unitTypeAr);
        int buildCost = getInt(buildCostAr);
        int experience = getInt(experienceAr);
        int boostCost = getInt(boostCostAr);
        int maximumUnit = getInt(maximumUnitAr);
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\army buildings\\produsen\\"+unitType+sName+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }     
        }
         
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
           jo.addProperty("boostCost", boostCost);
           jo.addProperty("maximumUnitQueueLength", maximumUnit);
           
        try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\army buildings\\produsen\\"+unitType+sName+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
	}
           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Object Name = nameRes.getText();
        Object BuildTime = buildTimeRes.getText();
        Object Description = descriptionRes.getText();
        Object Level = sLevelRes.getSelectedItem();
        Object TownHallLevelReq = sTownHallLevelReqRes.getSelectedItem();
        Object Hitpoint = hitpointRes.getText();
        
        String sLevel = (String)Level;
        String sTownHallLevelReq = (String)TownHallLevelReq;
        String sName = (String)Name;
        String sBuildTime = (String)BuildTime;
        String sDescription = (String)Description;
        String sHitpoint =(String)Hitpoint;
        
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sTownHallLevelReq);
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fHitpoint = Float.parseFloat(sHitpoint);
        
        int unitType = getInt(unitTypeRes);
         if(nameRes.getText().equals("")) {
        nameRes.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan nama dengan lengkap");    
        return;
        }
        int buildCost = getInt(buildCostRes);
        int experience = getInt(experienceRes);
        int storageCapacity = getInt(storageCapacityRes);
        if(descriptionRes.getText().equals("")) {
        descriptionRes.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan description dengan lengkap");    
        return;
        }
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\resource\\storage\\"+unitType+sName+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }     
        }
         
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("storageCapacity", storageCapacity);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
           
           try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\resource\\storage\\"+unitType+sName+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Object Name = nameRes.getText();
        Object BuildTime = buildTimeRes.getText();
        Object Hitpoint = hitpointRes.getText();
        Object TimeToFill = timeToFillRes.getText();
        Object CatchUpPoint = catchUpPointRes.getText();
        Object Description = descriptionRes.getText();
        Object Level = pLevelRes.getSelectedItem();
        Object TownHallLevelReq = pTownHallLevelReqRes.getSelectedItem();
        
        String sLevel = (String)Level;
        String sTownHallLevelReq = (String)TownHallLevelReq;
        String sName = (String)Name;
        String sBuildTime = (String)BuildTime;
        String sTimeToFill = (String)TimeToFill;
        String sCatchUpPoint = (String)CatchUpPoint;
        String sDescription = (String)Description;
        String sHitpoint =(String)Hitpoint;
        
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sTownHallLevelReq);
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fTimeToFill = Float.parseFloat(sTimeToFill);
        float fCatchUpPoint = Float.parseFloat(sCatchUpPoint);
        float fHitpoint = Float.parseFloat(sHitpoint);
        
        int unitType = getInt(unitTypeRes);
         if(nameRes.getText().equals("")) {
        nameRes.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan nama dengan lengkap");    
        return;
        }
        int buildCost = getInt(buildCostRes);
        int experience = getInt(experienceRes);
        int boostCost = getInt(boostCostRes);
        int capacity = getInt(pCapacityRes);
        int productionRate = getInt(productionRateRes);
         if(descriptionRes.getText().equals("")) {
        descriptionRes.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan description dengan lengkap");    
        return;
        }
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\resource\\produsen\\"+unitType+sName+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }
    }
           
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("boostCost", boostCost);
           jo.addProperty("capacity", capacity);
           jo.addProperty("productionRate", productionRate);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("timeToFill", fTimeToFill);
           jo.addProperty("catchUpPoint", fCatchUpPoint);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
           
           try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\resource\\produsen\\"+unitType+sName+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
	}                                        
                                           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Object Damage = damageDef.getText();
        Object Range = rangeDef.getText();
        Object Name = nameDef.getText();
        Object Description = descriptionDef.getText();
        Object Hitpoint = hitpointDef.getText();
        Object DamageType = damageTypeDef.getSelectedIndex();
        Object UnitTypeTargeted = unitTypeTargetDef.getSelectedIndex();
        Object Level = bLevelDef.getSelectedItem();
        Object TownHallLevelReq = bTownHallLevelReqDef.getSelectedItem();
        Object BuildTime = buildTimeDef.getText();
        Object AttackSpeed = attackSpeedDef.getText();
        Object DamagePerSecond = damagePerSecondDef.getText();
        
        String sDamage = (String)Damage;
        String sRange = (String)Range;
        String sName = (String)Name;
        String sDescription = (String)Description;
        String sHitpoint = (String)Hitpoint;
        String sBuildTime = (String)BuildTime;
        int iDamageType = (Integer)DamageType;
        int iUnitTypeTargeted = (Integer)UnitTypeTargeted;
        String sLevel = (String)Level;
        String sTownHallLevelReq = (String)TownHallLevelReq;
        String sAttackSpeed = (String)AttackSpeed;
        String sDamagePerSecond = (String)DamagePerSecond;
        
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sTownHallLevelReq);
        float fDamage = Float.parseFloat(sDamage);
        float fRange = Float.parseFloat(sRange);
        float fHitpoint = Float.parseFloat(sHitpoint);
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fAttackSpeed = Float.parseFloat(sAttackSpeed);
        float fDamagePerSeond = Float.parseFloat(sDamagePerSecond);
        
        if(damageDef.getText().equals("")) {
        damageDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(rangeDef.getText().equals("")) {
        rangeDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(hitpointDef.getText().equals("")) {
        hitpointDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(buildTimeDef.getText().equals("")) {
        buildTimeDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(attackSpeedDef.getText().equals("")) {
        attackSpeedDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        
        int unitType = getInt(unitTypeDef);
        if(nameDef.getText().equals("")) {
        nameDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan nama dengan lengkap");    
        return;
        }
        int buildCost = getInt (buildCostDef);
        int experience = getInt(experienceDef);
        if(descriptionDef.getText().equals("")) {
        descriptionDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan description dengan lengkap");    
        return;
        }
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\defenses\\buildings\\"+unitType+"-"+sName+"-"+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }
    }
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("damage", fDamage);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("range", fRange);
           jo.addProperty("damageType", iDamageType);
           jo.addProperty("unitTypeTarget", iUnitTypeTargeted);
           jo.addProperty("attackSpeed", fAttackSpeed);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
        
        try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\defenses\\buildings\\"+unitType+"-"+sName+"-"+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
	}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Object Damage = damageDef.getText();
        Object Range = rangeDef.getText();
        Object Name = nameDef.getText();
        Object Description = descriptionDef.getText();        
        Object DamageType = damageTypeDef.getSelectedIndex();
        Object UnitTypeTargeted = unitTypeTargetDef.getSelectedIndex();
        Object Level = bLevelDef.getSelectedItem();
        Object TownHallLevelReq = bTownHallLevelReqDef.getSelectedItem();
        Object BuildTime = buildTimeDef.getText();
        Object FavoriteTarget = favoriteTargetedDef.getSelectedIndex();
        Object DamageRadius = damageRadiusDef.getText();
        
        String sDamage = (String)Damage;
        String sRange = (String)Range;
        String sName = (String)Name;
        String sDescription = (String)Description;        
        String sBuildTime = (String)BuildTime;
        int iDamageType = (Integer)DamageType;
        int iUnitTypeTargeted = (Integer)UnitTypeTargeted;
        String sLevel = (String)Level;
        String sTownHallLevelReq = (String)TownHallLevelReq;
        int iFavoriteTarget = (Integer)FavoriteTarget;
        String sDamageRadius = (String)DamageRadius;
        
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sTownHallLevelReq);
        float fDamage = Float.parseFloat(sDamage);
        float fRange = Float.parseFloat(sRange);        
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fDamageRadius = Float.parseFloat(sDamageRadius);
        
        if(damageDef.getText().equals("")) {
        damageDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(rangeDef.getText().equals("")) {
        rangeDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(buildTimeDef.getText().equals("")) {
        buildTimeDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        if(damageRadiusDef.getText().equals("")) {
        damageRadiusDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan data dengan lengkap");    
        return;
        }
        
        int unitType = getInt(unitTypeDef);
        if(nameDef.getText().equals("")) {
        nameDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan nama dengan lengkap");    
        return;
        }
        int buildCost = getInt (buildCostDef);
        int reArmCost = getInt (reArmCostDef);
        int experience = getInt(experienceDef);
        if(descriptionDef.getText().equals("")) {
        descriptionDef.setBackground(Color.red);
        JOptionPane.showMessageDialog(this, "Isikan description dengan lengkap");    
        return;
        }
     
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\defenses\\traps\\"+unitType+"-"+sName+"-"+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }
    }
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject jo = new JsonObject();
        jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("damage", fDamage);
           jo.addProperty("damageRadius", fDamageRadius);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("reArmCost", reArmCost);
           jo.addProperty("range", fRange);
           jo.addProperty("damageType", iDamageType);
           jo.addProperty("unitTypeTarget", iUnitTypeTargeted);
           jo.addProperty("favoriteTargeted", iFavoriteTarget);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
        
        try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\defenses\\traps\\"+unitType+"-"+sName+"-"+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
	}
        
    }//GEN-LAST:event_jButton7ActionPerformed
 int  damage,speed,hasil ;
 int damageD,speedDef,hasilDef ;

    private void damageAttackArmyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_damageAttackArmyPropertyChange
        // TODO add your handling code here:
//       damage=Integer.parseInt(damageAttackArmy.getText());
//       speed=Integer.parseInt(attackSpeedArmy.getText());
//       hasil = damage/speed;
//       damageSecondArmy.setText(Integer.toString(hasil));
    }//GEN-LAST:event_damageAttackArmyPropertyChange

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
//       damage=Integer.parseInt(damageAttackArmy.getText());
//       speed=Integer.parseInt(attackSpeedArmy.getText());
//       hasil = damage/speed;
//       damageSecondArmy.setText(Integer.toString(hasil));
    }//GEN-LAST:event_none
    
    private void damageAttackArmyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_damageAttackArmyKeyPressed
        // TODO add your handling code here:
        
//       damage=Integer.parseInt(damageAttackArmy.getText());
//       speed=Integer.parseInt(attackSpeedArmy.getText());
//       hasil = damage/speed;
//       damageSecondArmy.setText(Integer.toString(hasil));
    }//GEN-LAST:event_damageAttackArmyKeyPressed

    private void damageAttackArmyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damageAttackArmyMouseClicked
//        damage=Integer.parseInt(damageAttackArmy.getText());
//       speed=Integer.parseInt(attackSpeedArmy.getText());
//       hasil = damage/speed;
//       damageSecondArmy.setText(Integer.toString(hasil));
    }//GEN-LAST:event_damageAttackArmyMouseClicked

    private void damageAttackArmyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_damageAttackArmyKeyTyped
//       char c = evt.getKeyChar();
//
//
//        damage=Integer.parseInt(damageAttackArmy.getText());
//       speed=Integer.parseInt(attackSpeedArmy.getText());
//       hasil = damage/speed;
//       damageSecondArmy.setText(Integer.toString(hasil));
    }//GEN-LAST:event_damageAttackArmyKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Object Level = levelArmy.getSelectedItem();
        Object DamagePerAttack = damageAttackArmy.getText();
        Object Hitpoint = hitpointArmy.getText();
        Object LaboratoryLevelRequired = laboratoryLevelReqArmy.getSelectedItem();
        Object ResearchTime = researchTimeArmy.getText();
        Object Name = nameArmy.getText();
        Object Description = descriptionArmy.getText();
        Object PreferredTarget = preferredTargetArmy.getSelectedIndex();
        Object AttackType = attackTypeArmy.getSelectedIndex();
        Object TrainingTime = trainingTimeArmy.getText();
        Object MovemendSpeed = movementSpeedArmy.getText();
        Object AttackSpeed = attackSpeedArmy.getText();
        Object Range = rangeArmy.getText();
        Object BarrackLevelReq = barracksLevelReqArmy.getSelectedItem();
        
        String sLevel = (String)Level;
        String sDamagePerAttack = (String)DamagePerAttack;
        String sHitpoint = (String)Hitpoint;
        String sLaboratoryLevelRequired = (String)LaboratoryLevelRequired;
        String sResearchTime = (String)ResearchTime;
        String sName = (String)Name;
        String sDescription = (String)Description;
        int iPreferredTarget = (Integer)PreferredTarget;
        int iAttackType = (Integer)AttackType;
        String sTrainingTime = (String)TrainingTime;
        String sMovemendSpeed = (String)MovemendSpeed;
        String sAttackSpeed = (String)AttackSpeed;
        String sRange = (String)Range;
        String sBarrackLevelReq = (String)BarrackLevelReq;
        
        int iLevel = Integer.parseInt(sLevel);
        int iLaboratoryLevelRequired = Integer.parseInt(sLaboratoryLevelRequired);
        int iBarrackLevelReq = Integer.parseInt(sBarrackLevelReq);
        float fDamagePerAttack = Float.parseFloat(sDamagePerAttack);
        float fHitpoint = Float.parseFloat(sHitpoint);
        float fResearchTime = Float.parseFloat(sResearchTime);
        float fTrainingTime = Float.parseFloat(sTrainingTime);
        float fMovemendSpeed = Float.parseFloat(sMovemendSpeed);
        float fAttackSeed = Float.parseFloat(sAttackSpeed);
        float fRange = Float.parseFloat(sRange);
        
        int trainingCost = getInt(trainingCostArmy);
        int researchCost = getInt(researchCostArmy);
        int hausingSpace = getInt(housingSpaceArmy);
        int unitType = getInt(unitTypeArmy);
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\army\\"+unitType+sName+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }     
        }
           
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("laboratoryLevelRequired", iLaboratoryLevelRequired);
           jo.addProperty("barrackLevelRequired", iBarrackLevelReq);
           jo.addProperty("damagePerAttack", fDamagePerAttack);
           jo.addProperty("researchTime", fResearchTime);
           jo.addProperty("trainingTime", fTrainingTime);
           jo.addProperty("movemendSpeed", fMovemendSpeed);
           jo.addProperty("attackSpeed", fAttackSeed);
           jo.addProperty("range", fRange);
           jo.addProperty("trainingCost", trainingCost);
           jo.addProperty("researchCost", researchCost);
           jo.addProperty("hausingSpace", hausingSpace);
           jo.addProperty("unitType", unitType);
           jo.addProperty("preferredTarget", iPreferredTarget);
           jo.addProperty("attackType", iAttackType);
           jo.addProperty("description", sDescription);
           
           try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\army\\"+unitType+sName+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void damageAttackArmyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_damageAttackArmyFocusLost
        // TODO add your handling code here:
        System.out.println(damageAttackArmy);
       damage=Integer.parseInt(damageAttackArmy.getText());
       
       if (!attackSpeedArmy.getText().equals("")){
       speed=Integer.parseInt(attackSpeedArmy.getText());
           hasil = damage/speed;    
       damageSecondArmy.setText(Integer.toString(hasil));
       }
    }//GEN-LAST:event_damageAttackArmyFocusLost

    private void attackSpeedArmyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attackSpeedArmyFocusLost
        // TODO add your handling code here:
        speed=Integer.parseInt(attackSpeedArmy.getText());
       
       if (!damageAttackArmy.getText().equals("")){
           damage=Integer.parseInt(damageAttackArmy.getText());
           hasil = damage/speed;    
       damageSecondArmy.setText(Integer.toString(hasil));
       }
    }//GEN-LAST:event_attackSpeedArmyFocusLost

    private void damageDefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_damageDefFocusLost
        // TODO add your handling code here:
       damageD=Integer.parseInt(damageDef.getText());
       
       if (!attackSpeedDef.getText().equals("")){
       speedDef=Integer.parseInt(attackSpeedDef.getText());
           hasilDef = damageD/speedDef;    
       damagePerSecondDef.setText(Integer.toString(hasilDef));
       }  
    }//GEN-LAST:event_damageDefFocusLost

    private void attackSpeedDefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attackSpeedDefFocusLost
        // TODO add your handling code here:
       speedDef=Integer.parseInt(attackSpeedDef.getText());
       
       if (!damageDef.getText().equals("")){
       damageD=Integer.parseInt(damageDef.getText());
           hasilDef = damageD/speedDef;    
       damagePerSecondDef.setText(Integer.toString(hasilDef));
       } 
    }//GEN-LAST:event_attackSpeedDefFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Object Hitpoint = hitpointAr.getText();
        Object BuildTime = buildTimeAr.getText();
        Object Name = nameAr.getText();
        Object Description = descriptionAr.getText();
        Object Level = pLevelAr.getSelectedItem();
        Object LevelTownHallReq = pTownHallLevelReqAr.getSelectedItem();
        
        String sHitpoint = (String)Hitpoint;
        String sBuildTime = (String)BuildTime;
        String sName = (String)Name;
        String sDescription = (String)Description;
        String sLevel = (String)Level;
        String sLevelTownHallReq = (String)LevelTownHallReq;
        
        float fHitpoint = Float.parseFloat(sHitpoint);
        float fBuildTime = Float.parseFloat(sBuildTime);
        int iLevel = Integer.parseInt(sLevel);
        int iTownHallLevelReq = Integer.parseInt(sLevelTownHallReq);
        
        int unitType = getInt(unitTypeAr);
        int buildCost = getInt(buildCostAr);
        int experience = getInt(experienceAr);
        int troopsCapacity = getInt(troopCapacityAr);
        
        String dir = System.getProperty("user.dir");
        File fa = new File(dir+"\\unit kategory\\buildings\\army buildings\\produsen\\"+unitType+sName+iLevel+".json");

	   if(fa.exists()){
		int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
              return;
            }     
        }
         
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           JsonObject jo = new JsonObject();
           jo.addProperty("unitType", unitType);
           jo.addProperty("name", sName);
           jo.addProperty("level", iLevel);
           jo.addProperty("maxHitpoint", fHitpoint);
           jo.addProperty("buildCost", buildCost);
           jo.addProperty("buildTime", fBuildTime);
           jo.addProperty("experienceGained", experience);
           jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
           jo.addProperty("description", sDescription);
           jo.addProperty("troopsCapacity", troopsCapacity);
           
           
        try {
		FileWriter file = new FileWriter(dir+"\\unit kategory\\buildings\\army buildings\\produsen\\"+unitType+sName+iLevel+".json");
                String json = gson.toJson(jo);
                file.write(json);
		file.flush();
		file.close();
                System.out.println(json);
	} catch (IOException e) {
		e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JFileChooser army = new JFileChooser();
        army.showOpenDialog(null);
        File f = army.getSelectedFile();
        String filename = f.getName();
        jTextField1.setText(filename);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void attackSpeedArmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackSpeedArmyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_attackSpeedArmyActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int size = CruiseList.getModel().getSize();
        StringBuilder allCruises = new StringBuilder("All cruises:");
        for(int i = 0; i < size; i++) {
        allCruises.append("\n").append(CruiseList.getModel().getElementAt(i));
        }
        System.out.print(allCruises);
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CruiseList;
    private javax.swing.JTextField attackSpeedArmy;
    private javax.swing.JTextField attackSpeedDef;
    private javax.swing.JComboBox<String> attackTypeArmy;
    private javax.swing.JComboBox<String> bLevelDef;
    private javax.swing.JComboBox<String> bTownHallLevelReqDef;
    private javax.swing.JComboBox<String> barracksLevelReqArmy;
    private javax.swing.JTextField boostCostAr;
    private javax.swing.JTextField boostCostRes;
    private javax.swing.JTextField buildCostAr;
    private javax.swing.JTextField buildCostDef;
    private javax.swing.JTextField buildCostRes;
    private javax.swing.JTextField buildTimeAr;
    private javax.swing.JTextField buildTimeDef;
    private javax.swing.JTextField buildTimeRes;
    private javax.swing.JTextField catchUpPointRes;
    private javax.swing.JTextField collapseDarkElixirRes;
    private javax.swing.JTextField damageAttackArmy;
    private javax.swing.JTextField damageDef;
    private javax.swing.JTextField damagePerSecondDef;
    private javax.swing.JTextField damageRadiusDef;
    private javax.swing.JTextField damageSecondArmy;
    private javax.swing.JComboBox<String> damageTypeDef;
    private javax.swing.JTextArea descriptionAr;
    private javax.swing.JTextArea descriptionArmy;
    private javax.swing.JTextArea descriptionDef;
    private javax.swing.JTextArea descriptionRes;
    private javax.swing.JTextField elixirAvailableRes;
    private javax.swing.JTextField experienceAr;
    private javax.swing.JTextField experienceDef;
    private javax.swing.JTextField experienceRes;
    private javax.swing.JComboBox<String> favoriteTargetedDef;
    private javax.swing.JTextField goldAvailableRes;
    private javax.swing.JTextField hitpointAr;
    private javax.swing.JTextField hitpointArmy;
    private javax.swing.JTextField hitpointDef;
    private javax.swing.JTextField hitpointRes;
    private javax.swing.JTextField housingSpaceArmy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> laboratoryLevelReqArmy;
    private javax.swing.JComboBox<String> levelArmy;
    private javax.swing.JTextField maximumNumberOfBuidingsRes;
    private javax.swing.JTextField maximumUnitAr;
    private javax.swing.JTextField movementSpeedArmy;
    private javax.swing.JTextField nameAr;
    private javax.swing.JTextField nameArmy;
    private javax.swing.JTextField nameDef;
    private javax.swing.JTextField nameRes;
    private javax.swing.JTextField pCapacityRes;
    private javax.swing.JComboBox<String> pLevelAr;
    private javax.swing.JComboBox<String> pLevelRes;
    private javax.swing.JComboBox<String> pTownHallLevelReqAr;
    private javax.swing.JComboBox<String> pTownHallLevelReqRes;
    private javax.swing.JComboBox<String> preferredTargetArmy;
    private javax.swing.JTextField productionRateRes;
    private javax.swing.JComboBox<String> pusatLevelRes;
    private javax.swing.JTextField rangeArmy;
    private javax.swing.JTextField rangeDef;
    private javax.swing.JTextField reArmCostDef;
    private javax.swing.JTextField researchCostArmy;
    private javax.swing.JTextField researchTimeArmy;
    private javax.swing.JComboBox<String> sLevelAr;
    private javax.swing.JComboBox<String> sLevelRes;
    private javax.swing.JComboBox<String> sTownHallLevelReqAr;
    private javax.swing.JComboBox<String> sTownHallLevelReqRes;
    private javax.swing.JTextField storageCapacityRes;
    private javax.swing.JComboBox<String> tLevelDef;
    private javax.swing.JComboBox<String> tTownHallLevelReqDef;
    private javax.swing.JTextField timeToFillRes;
    private javax.swing.JTextField trainingCostArmy;
    private javax.swing.JTextField trainingTimeArmy;
    private javax.swing.JTextField troopCapacityAr;
    private javax.swing.JTextField unitTypeAr;
    private javax.swing.JTextField unitTypeArmy;
    private javax.swing.JTextField unitTypeDef;
    private javax.swing.JTextField unitTypeRes;
    private javax.swing.JComboBox<String> unitTypeTargetDef;
    // End of variables declaration//GEN-END:variables

}
