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
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
/**
 *
 * @author matata
 */
public class JSon extends javax.swing.JFrame {
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
    
    public JSon() {
        initComponents();
        setLocationRelativeTo(null);
        checkFolder();
    }
    
    public void checkFolder(){
        
        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        String s = File.separator;
        //System.out.println("Current relative path is: " + s);
        
        File dataFile = new File(kategoryPath);            
        File buildingsFile = new File(buildingsPath);
        File armyFile = new File(armyPath);
        File resourceFile = new File(resourcePath);       
        File defensesFile = new File(defensesPath);
        File armybuildFile = new File(armybuildPath);
        File reStorageFile = new File(reStoragePath);
        File reProdusenFile = new File(reProdusenPath);
        File rePusatFile = new File(rePusatPath);
        File armyStorageFile = new File(armyStoragePath);
        File armyProdusenFile = new File(armyProdusenPath);
        File buildingsDefFile = new File(buildingsDefPath);
        File trapsDefFile = new File(trapsDefPath);
        
        boolean dataexist = dataFile.exists();
        boolean buildingsExist = buildingsFile.exists();
        boolean armyExist = armyFile.exists();
        boolean resourceExist = resourceFile.exists(); 
        boolean defensesExist = defensesFile.exists(); 
        boolean armybuildExist = armybuildFile.exists(); 
        boolean reStorageExist = reStorageFile.exists(); 
        boolean reProdusenExist = reProdusenFile.exists();
        boolean rePusatExist = rePusatFile.exists();
        boolean armyStorageExist = armyStorageFile.exists();
        boolean armyProdusenExist = armyProdusenFile.exists();
        boolean buildingsDefExist = buildingsDefFile.exists();
        boolean trapsDefExist = trapsDefFile.exists();
        
        
        
        boolean success;
        if(!dataexist) {
            success = (new File(currentPathString + s + "unit kategory")).mkdirs();
            
        }
        if(!buildingsExist) {
            success = (new File(currentPathString + s + "unit kategory" + s + "buildings")).mkdirs();
            
        }
        if(!armyExist){
            success = (new File(currentPathString  + s +  "unit kategory" + s + "army")).mkdirs();
            
        }
        if(!resourceExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "resource")).mkdirs();
            
        }
        if(!defensesExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "defenses")).mkdirs();
            
        }
        if(!armybuildExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "army buildings")).mkdirs();
            
        }
        if(!reStorageExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "resource" + s + "storage")).mkdirs();
            
        }
        if(!reProdusenExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "resource" + s + "produsen")).mkdirs();
            
        }
        if(!rePusatExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "resource" + s + "pusat")).mkdirs();
            
        }
        if(!armyStorageExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "army buildings" + s + "storage")).mkdirs();
            
        }
        if(!armyProdusenExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "army buildings" + s + "produsen")).mkdirs();
            
        }
        if(!buildingsDefExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "defenses" + s + "buildings")).mkdirs();
            
        }
        if(!trapsDefExist) {
            success = (new File(currentPathString  + s +  "unit kategory" + s + "buildings" + s + "defenses" + s + "traps")).mkdirs();
            
        }
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        boostCostRes = new javax.swing.JTextField();
        pCapacityRes = new javax.swing.JTextField();
        productionRateRes = new javax.swing.JTextField();
        timeToFillRes = new javax.swing.JTextField();
        catchUpPointRes = new javax.swing.JTextField();
        pLevelRes = new javax.swing.JComboBox<>();
        pTownHallLevelReqRes = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sLevelRes = new javax.swing.JComboBox<>();
        sCapacityRes = new javax.swing.JTextField();
        sTownHallLevelReqRes = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unitTypeRes = new javax.swing.JTextField();
        nameRes = new javax.swing.JTextField();
        hitpointRes = new javax.swing.JTextField();
        buildTimeRes = new javax.swing.JTextField();
        buildCostRes = new javax.swing.JTextField();
        experienceRes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionRes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        bLevelDef = new javax.swing.JComboBox<>();
        hitpointDef = new javax.swing.JTextField();
        attackSpeedDef = new javax.swing.JTextField();
        bTownHallLevelReqDef = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        damageSecondDef = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        rangeDef = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        damageShotDef = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tLevelDef = new javax.swing.JComboBox<>();
        reArmCostDef = new javax.swing.JTextField();
        triggerRadiusDef = new javax.swing.JTextField();
        favoriteTargetDef = new javax.swing.JComboBox<>();
        tTownHallLevelReqDef = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        damageDef = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        damageRadiusDef = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        unitTypeDef = new javax.swing.JTextField();
        nameDef = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionDef = new javax.swing.JTextArea();
        buildCostDef = new javax.swing.JTextField();
        buildTimeDef = new javax.swing.JTextField();
        experienceDef = new javax.swing.JTextField();
        damageTypeDef = new javax.swing.JComboBox<>();
        unitTypeTargetedDef = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        pLevelAr = new javax.swing.JComboBox<>();
        boostCostAr = new javax.swing.JTextField();
        maximumUnitAr = new javax.swing.JTextField();
        pTownHallLevelReqAr = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        armyList = new javax.swing.JList<>();
        jButton23 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        armyName = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        sLevelAr = new javax.swing.JComboBox<>();
        troopCapacityAr = new javax.swing.JTextField();
        sTownHallLevelReqAr = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        hitpointAr = new javax.swing.JTextField();
        buildTimeAr = new javax.swing.JTextField();
        buildCostAr = new javax.swing.JTextField();
        experienceAr = new javax.swing.JTextField();
        unitTypeAr = new javax.swing.JTextField();
        nameAr = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        descriptionAr = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        hitpointArmy = new javax.swing.JTextField();
        trainingCostArmy = new javax.swing.JTextField();
        researchCostArmy = new javax.swing.JTextField();
        rangeArmy = new javax.swing.JTextField();
        movementSpeedArmy = new javax.swing.JTextField();
        trainingTimeArmy = new javax.swing.JTextField();
        housingSpaceArmy = new javax.swing.JTextField();
        attackTypeArmy = new javax.swing.JComboBox<>();
        preferredTargetArmy = new javax.swing.JComboBox<>();
        researchTimeArmy = new javax.swing.JTextField();
        laboratoryLevelReqArmy = new javax.swing.JComboBox<>();
        levelArmy = new javax.swing.JComboBox<>();
        barracksLevelReqArmy = new javax.swing.JComboBox<>();
        unitTypeArmy = new javax.swing.JTextField();
        nameArmy = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        descriptionArmy = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        damageAttackArmy = new javax.swing.JTextField();
        damageSecondArmy = new javax.swing.JTextField();
        attackSpeedArmy = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        thLevel = new javax.swing.JComboBox<>();
        maximumNumberOfBuildAvailable = new javax.swing.JTextField();
        goldAvailable = new javax.swing.JTextField();
        elixirAvailable = new javax.swing.JTextField();
        darkElixirAvailable = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        availableToBeStolen = new javax.swing.JTextField();
        capTH = new javax.swing.JTextField();
        storageAmountToReachCap = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        nameList1 = new javax.swing.JList<>();
        jScrollPane22 = new javax.swing.JScrollPane();
        capacityList1 = new javax.swing.JList<>();
        jScrollPane23 = new javax.swing.JScrollPane();
        nameList2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        capacityList2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        maxLevelList2 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        maxLevelList1 = new javax.swing.JList<>();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        nameList3 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        maxLevelList3 = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        capacityList3 = new javax.swing.JList<>();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        unitTypeRes1 = new javax.swing.JTextField();
        nameRes1 = new javax.swing.JTextField();
        hitpointRes1 = new javax.swing.JTextField();
        buildTimeRes1 = new javax.swing.JTextField();
        buildCostRes1 = new javax.swing.JTextField();
        experienceRes1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionRes1 = new javax.swing.JTextArea();
        capacity1 = new javax.swing.JTextField();
        capacity2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        maxLevel1 = new javax.swing.JTextField();
        maxLevel2 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        name3 = new javax.swing.JTextField();
        maxLevel3 = new javax.swing.JTextField();
        capacity3 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Export");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boostCostRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pCapacityRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pCapacityRes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pCapacityResFocusLost(evt);
            }
        });

        productionRateRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productionRateRes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productionRateResFocusLost(evt);
            }
        });

        timeToFillRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timeToFillRes.setEnabled(false);

        catchUpPointRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        catchUpPointRes.setEnabled(false);

        pLevelRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pLevelRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        pTownHallLevelReqRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pTownHallLevelReqRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productionRateRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(154, 154, 154)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boostCostRes)
                            .addComponent(pLevelRes, 0, 50, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(149, 149, 149)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeToFillRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(catchUpPointRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(timeToFillRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(boostCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catchUpPointRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(pCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(productionRateRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Produsen", jPanel4);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Level");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Storage Capacity");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Town Hall Level Required");

        sLevelRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sLevelRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        sCapacityRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sTownHallLevelReqRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sTownHallLevelReqRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Export");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(110, 110, 110)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(563, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sLevelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(sCapacityRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sTownHallLevelReqRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Storage", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Hitpoint");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Build Time");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Build Cost");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Experience Gained");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Unit Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Description");

        unitTypeRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hitpointRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildCostRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        experienceRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionRes.setColumns(20);
        descriptionRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionRes.setRows(5);
        jScrollPane1.setViewportView(descriptionRes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(139, 139, 139)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameRes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(experienceRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hitpointRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buildTimeRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buildCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(186, 186, 186)
                                .addComponent(unitTypeRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(unitTypeRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nameRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitpointRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buildTimeRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buildCostRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experienceRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resource Buildings", jPanel2);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Level");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Hitpoint");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Attack Speed");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Town Hall Level Required");

        bLevelDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bLevelDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        hitpointDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        attackSpeedDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackSpeedDef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                attackSpeedDefFocusLost(evt);
            }
        });

        bTownHallLevelReqDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bTownHallLevelReqDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Damage Per Second");

        damageSecondDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageSecondDef.setEnabled(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Range");

        rangeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Damage per Shot");

        damageShotDef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                damageShotDefFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28))
                        .addGap(179, 179, 179)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(bTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(attackSpeedDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(220, 220, 220)
                                .addComponent(rangeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(211, 211, 211)
                        .addComponent(hitpointDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(damageSecondDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(damageShotDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(bLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(damageShotDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(hitpointDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damageSecondDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(attackSpeedDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(rangeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(bTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Buildings", jPanel15);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Level");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Re-Arm Cost");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Trigger Radius");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Favorite Target");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Town Hall Level Required");

        tLevelDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tLevelDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        reArmCostDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        triggerRadiusDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        favoriteTargetDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        favoriteTargetDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Hog Rider" }));

        tTownHallLevelReqDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tTownHallLevelReqDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Export");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("Damage");

        damageDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel88.setText("Damage Radius");

        damageRadiusDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88))
                        .addGap(176, 176, 176)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(damageRadiusDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(triggerRadiusDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(damageDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(230, 230, 230)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reArmCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favoriteTargetDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tLevelDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(favoriteTargetDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(reArmCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(tTownHallLevelReqDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(triggerRadiusDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(damageDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(damageRadiusDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Traps", jPanel9);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Build Cost");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Build Time");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Experience Gained");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Damage Type");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Unit Type Targeted");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Unit Type");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Name");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Description");

        unitTypeDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionDef.setColumns(20);
        descriptionDef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionDef.setRows(5);
        jScrollPane2.setViewportView(descriptionDef);

        damageTypeDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Target", "Splash", "Multiple Targets" }));

        unitTypeTargetedDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ground", "Ground & Air", "Air" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitTypeTargetedDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(damageTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buildTimeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(experienceDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buildCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(86, 86, 86))
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameDef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(buildCostDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(unitTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(buildTimeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(nameDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(experienceDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(damageTypeDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(unitTypeTargetedDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Defensive Buildings", jPanel5);

        jPanel10.setPreferredSize(new java.awt.Dimension(855, 267));

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Level");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("Boost Cost");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("Maximum Unit Queue Length");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("Town Hall Level Required");

        pLevelAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pLevelAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        boostCostAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        maximumUnitAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pTownHallLevelReqAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pTownHallLevelReqAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Export");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        armyList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane20.setViewportView(armyList);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setText("Add");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("Unlocked Unit Troops");

        armyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("Open File");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setText("Delete");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
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
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel46))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maximumUnitAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boostCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(254, 254, 254)
                        .addComponent(pLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(189, 189, 189))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(armyName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton22))))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton9)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(pLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(boostCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(maximumUnitAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(pTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jButton5))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(armyName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton23)
                                    .addComponent(jButton22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Produsen", jPanel11);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("Level");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("Troop Capacity");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("Town Hall Level Required");

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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(troopCapacityAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(228, 228, 228)
                        .addComponent(sLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(554, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(sLevelAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(troopCapacityAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(sTownHallLevelReqAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(25, 25, 25))
        );

        jTabbedPane4.addTab("Storage", jPanel13);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Hitpoint");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Build Time");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("Build Cost");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("Experience Gained");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("Unit Type");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("Name");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Description");

        hitpointAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildCostAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        experienceAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        unitTypeAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameAr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(experienceAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buildCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buildTimeAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hitpointAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(unitTypeAr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel44)
                                        .addGap(101, 101, 101)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(nameAr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel44)
                            .addComponent(hitpointAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(buildTimeAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(buildCostAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(experienceAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(unitTypeAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(nameAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Army Buildings", jPanel6);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("Level");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("Damage Per Second");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("Damage Per Attack");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("Hitpoint");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("Training Cost");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("Research Cost");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("Laboratory Level Required");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("Research Time");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("Preferred Target");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("Attack Type");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Housing Space");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("Training Time");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("Movement Speed");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("Attack Speed");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Barracks Level Required");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("Range");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("Unit Type");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("Name");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("Description");

        hitpointArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        trainingCostArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        researchCostArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        rangeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        movementSpeedArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        trainingTimeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        housingSpaceArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        attackTypeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackTypeArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melee (Ground Only)", "Ranged (Ground & Air)", "Area Splash Tile Radius (Ground Only)\t", "Area Splash Tile Radius (Ground & Air)", "Heal Splash Tile Radius (Ground Only)", "Single Target" }));

        preferredTargetArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        preferredTargetArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Defenses", "Resources", "Walls" }));

        researchTimeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        laboratoryLevelReqArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        laboratoryLevelReqArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        levelArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        levelArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        barracksLevelReqArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        barracksLevelReqArmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        unitTypeArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionArmy.setColumns(20);
        descriptionArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionArmy.setRows(5);
        jScrollPane5.setViewportView(descriptionArmy);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Export");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        damageAttackArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageAttackArmy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                damageAttackArmyFocusLost(evt);
            }
        });

        damageSecondArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        damageSecondArmy.setEnabled(false);

        attackSpeedArmy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attackSpeedArmy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                attackSpeedArmyFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(167, 167, 167)
                        .addComponent(attackTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel60))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preferredTargetArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trainingCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(researchCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(researchTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(laboratoryLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(damageSecondArmy, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(damageAttackArmy, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hitpointArmy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63))
                                .addGap(155, 155, 155)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trainingTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(housingSpaceArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addGap(138, 138, 138))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barracksLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rangeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(movementSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(attackSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(levelArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movementSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel65)
                    .addComponent(damageSecondArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attackSpeedArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel66)
                    .addComponent(barracksLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damageAttackArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(hitpointArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(rangeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(trainingCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(researchCostArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(unitTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(laboratoryLevelReqArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(nameArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(researchTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(preferredTargetArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(attackTypeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(housingSpaceArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(trainingTimeArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Army", jPanel7);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("TH Level");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setText("Maximum Number of Buildings Available");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("Gold Available");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("Elixir Available");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setText("Dark Elixir Available");

        thLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        thLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        maximumNumberOfBuildAvailable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        goldAvailable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        elixirAvailable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        darkElixirAvailable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setText("% Available to be Stolen");

        availableToBeStolen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        capTH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        storageAmountToReachCap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        storageAmountToReachCap.setEnabled(false);
        storageAmountToReachCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageAmountToReachCapActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel105.setText("Cap");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel106.setText("Storage Amount to Reach Cap");

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Export");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addGap(108, 108, 108)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goldAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elixirAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximumNumberOfBuildAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capTH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storageAmountToReachCap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableToBeStolen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(darkElixirAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(thLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(availableToBeStolen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(maximumNumberOfBuildAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(goldAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storageAmountToReachCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(elixirAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(darkElixirAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Town Hall", jPanel23);

        nameList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane21.setViewportView(nameList1);

        capacityList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane22.setViewportView(capacityList1);

        nameList2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane23.setViewportView(nameList2);

        capacityList2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(capacityList2);

        maxLevelList2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane7.setViewportView(maxLevelList2);

        maxLevelList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane8.setViewportView(maxLevelList1);

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("Name File");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("MAX Lvl");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("Capacity");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel78.setText("Capacity");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setText("MAX Lvl");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setText("Name File");

        nameList3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane24.setViewportView(nameList3);

        maxLevelList3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane9.setViewportView(maxLevelList3);

        capacityList3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane10.setViewportView(capacityList3);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("Name File");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("MAX Lvl");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("Capacity");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83)
                            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Resource Buildings");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Defensive Buildings");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Offensive Buildings");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Army and Other");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel107)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel86)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel109)
                        .addGap(55, 55, 55))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jLabel85)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Town Hall Available", jPanel24);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel114.setText("Hitpoint");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("Build Time");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel116.setText("Build Cost");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel117.setText("Experience Gained");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel118.setText("Unit Type");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel119.setText("Name");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel120.setText("Description");

        unitTypeRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nameRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hitpointRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildTimeRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buildCostRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        experienceRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        descriptionRes1.setColumns(20);
        descriptionRes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionRes1.setRows(5);
        jScrollPane3.setViewportView(descriptionRes1);

        capacity1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        capacity2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        capacity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacity2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setText("Open File");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("Open File");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("Delete");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("Delete");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name1.setEnabled(false);
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        name2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name2.setEnabled(false);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("Name File");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("Capacity");

        maxLevel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maxLevel1.setToolTipText("");

        maxLevel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("MAX");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("Level");

        name3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name3.setEnabled(false);

        maxLevel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        capacity3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        capacity3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacity3ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setText("Add");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setText("Delete");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setText("Open File");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel119)
                                            .addComponent(jLabel117))
                                        .addGap(139, 139, 139)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(hitpointRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(buildCostRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(experienceRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(buildTimeRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                                                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(jPanel19Layout.createSequentialGroup()
                                                                .addComponent(maxLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(capacity3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel19Layout.createSequentialGroup()
                                                                .addComponent(maxLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(capacity1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel19Layout.createSequentialGroup()
                                                                .addComponent(maxLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(capacity2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton11)
                                                    .addComponent(jButton8)
                                                    .addComponent(jButton13)))
                                            .addComponent(nameRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel118)
                                        .addGap(186, 186, 186)
                                        .addComponent(unitTypeRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel120)
                                .addGap(110, 110, 110)))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jButton21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton16))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jButton18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton15)))
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jLabel120)
                            .addComponent(unitTypeRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel119)
                            .addComponent(nameRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hitpointRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel114)
                        .addComponent(jLabel74)
                        .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buildTimeRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel115))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(capacity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8)
                        .addComponent(jButton18)
                        .addComponent(jButton10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(buildCostRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jButton21)
                    .addComponent(jButton16))
                .addGap(16, 16, 16)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experienceRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117)
                    .addComponent(capacity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton20)
                    .addComponent(jButton15))
                .addGap(16, 16, 16)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Town Hall", jPanel19);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(unitTypeRes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameRes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionRes.getText().equals("")) {
            descriptionRes.setText("-");
        }
        
        if(buildTimeRes.getText().equals("")) {
            buildTimeRes.setText("0");
        }
        if(hitpointRes.getText().equals("")) {
            hitpointRes.setText("0");
        }
        
        int unitType = getInt(unitTypeRes);
        int buildCost = getInt(buildCostRes);
        int experience = getInt(experienceRes);
        int boostCost = getInt(boostCostRes);
        int capacity = getInt(pCapacityRes);
        int productionRate = getInt(productionRateRes);
        
        Object Name = nameRes.getText();
        Object BuildTime = buildTimeRes.getText();
        Object Hitpoint = hitpointRes.getText();
        Object Description = descriptionRes.getText();
        Object Level = pLevelRes.getSelectedItem();
        Object TownHallLevelReq = pTownHallLevelReqRes.getSelectedItem();

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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"produsen"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
            jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
            jo.addProperty("description", sDescription);

            try {
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"produsen"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }

        unitTypeRes.setText("");
        nameRes.setText("");
        descriptionRes.setText("");
        buildTimeRes.setText("");
        hitpointRes.setText("");
        buildCostRes.setText("");
        experienceRes.setText("");
        boostCostRes.setText("");
        pCapacityRes.setText("");
        productionRateRes.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:                
        if(unitTypeRes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameRes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionRes.getText().equals("")) {
            descriptionRes.setText("-");
        }
        
        if(buildTimeRes.getText().equals("")) {
            buildTimeRes.setText("0");
        }
        if(hitpointRes.getText().equals("")) {
            hitpointRes.setText("0");
        }
        
        int unitType = getInt(unitTypeRes);
        int buildCost = getInt(buildCostRes);
        int experience = getInt(experienceRes);
        int storageCapacity = getInt(sCapacityRes);
        
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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"storage"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"storage"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Gagal membuat file");
                    e.printStackTrace();
                }
            
        unitTypeRes.setText("");
        nameRes.setText("");
        descriptionRes.setText("");
        buildTimeRes.setText("");
        hitpointRes.setText("");
        buildCostRes.setText("");
        experienceRes.setText("");
        sCapacityRes.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(unitTypeDef.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameDef.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionDef.getText().equals("")) {
            descriptionDef.setText("-");
        }
        
        if(damageShotDef.getText().equals("")) {
            damageShotDef.setText("0");
        }
        if(rangeDef.getText().equals("")) {
            rangeDef.setText("0");
        }
        if(hitpointDef.getText().equals("")) {
            hitpointDef.setText("0");
        }
        if(buildTimeDef.getText().equals("")) {
            buildTimeDef.setText("0");
        }
        if(attackSpeedDef.getText().equals("")) {
            attackSpeedDef.setText("0");
        }        

        int unitType = getInt(unitTypeDef);
        int buildCost = getInt (buildCostDef);
        int experience = getInt(experienceDef);
        
        Object Damage = damageShotDef.getText();
        Object Range = rangeDef.getText();
        Object Name = nameDef.getText();
        Object Description = descriptionDef.getText();
        Object Hitpoint = hitpointDef.getText();
        Object DamageType = damageTypeDef.getSelectedIndex();
        Object UnitTypeTargeted = unitTypeTargetedDef.getSelectedIndex();
        Object Level = bLevelDef.getSelectedItem();
        Object TownHallLevelReq = bTownHallLevelReqDef.getSelectedItem();
        Object BuildTime = buildTimeDef.getText();
        Object AttackSpeed = attackSpeedDef.getText();
        Object DamagePerSecond = damageSecondDef.getText();

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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"defenses"+s+"buildings"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"defenses"+s+"buildings"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Gagal membuat file");
                    e.printStackTrace();
                }

          unitTypeDef.setText("");
          buildCostDef.setText("");
          experienceDef.setText("");
          damageShotDef.setText("");
          rangeDef.setText("");
          nameDef.setText("");
          descriptionDef.setText("");
          hitpointDef.setText("");
          buildTimeDef.setText("");
          attackSpeedDef.setText("");
          damageSecondDef.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       if(unitTypeDef.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameDef.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionDef.getText().equals("")) {
            descriptionDef.setText("-");
        }
        
        if(damageDef.getText().equals("")) {
            damageDef.setText("0");
        }
        if(triggerRadiusDef.getText().equals("")) {
            triggerRadiusDef.setText("0");
        }
        if(buildTimeDef.getText().equals("")) {
            buildTimeDef.setText("0");
        }
        if(damageRadiusDef.getText().equals("")) {
            damageRadiusDef.setText("0");
        }
        
        int unitType = getInt(unitTypeDef);
        int buildCost = getInt (buildCostDef);
        int reArmCost = getInt (reArmCostDef);
        int experience = getInt(experienceDef);
        
        Object Damage = damageDef.getText();
        Object TriggerRadius = triggerRadiusDef.getText();
        Object Name = nameDef.getText();
        Object Description = descriptionDef.getText();
        Object DamageType = damageTypeDef.getSelectedIndex();
        Object UnitTypeTargeted = unitTypeTargetedDef.getSelectedIndex();
        Object Level = bLevelDef.getSelectedItem();
        Object TownHallLevelReq = bTownHallLevelReqDef.getSelectedItem();
        Object BuildTime = buildTimeDef.getText();
        Object FavoriteTarget = favoriteTargetDef.getSelectedIndex();
        Object DamageRadius = damageRadiusDef.getText();

        String sDamage = (String)Damage;
        String sTriggerRadius = (String)TriggerRadius;
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
        float fTriggerRadius = Float.parseFloat(sTriggerRadius);
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fDamageRadius = Float.parseFloat(sDamageRadius);

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"defenses"+s+"traps"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
            jo.addProperty("triggerRadius", fTriggerRadius);
            jo.addProperty("damageRadius", fDamageRadius);
            jo.addProperty("buildCost", buildCost);
            jo.addProperty("buildTime", fBuildTime);
            jo.addProperty("reArmCost", reArmCost);
            jo.addProperty("damageType", iDamageType);
            jo.addProperty("unitTypeTarget", iUnitTypeTargeted);
            jo.addProperty("favoriteTargeted", iFavoriteTarget);
            jo.addProperty("experienceGained", experience);
            jo.addProperty("townHallLevelRequired", iTownHallLevelReq);
            jo.addProperty("description", sDescription);

            try {
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"defenses"+s+"traps"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
          unitTypeDef.setText("");
          buildCostDef.setText("");
          reArmCostDef.setText("");
          experienceDef.setText("");
          damageDef.setText("");
          triggerRadiusDef.setText("");
          nameDef.setText("");
          descriptionDef.setText("");
          buildTimeDef.setText("");
          damageRadiusDef.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(unitTypeAr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameAr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionAr.getText().equals("")) {
            descriptionAr.setText("-");
        }
        
        if(hitpointAr.getText().equals("")) {
            hitpointAr.setText("0");
        }
        if(buildTimeAr.getText().equals("")) {
            buildTimeAr.setText("-");
        }
        
        int unitType = getInt(unitTypeAr);
        int buildCost = getInt(buildCostAr);
        int experience = getInt(experienceAr);
        int boostCost = getInt(boostCostAr);
        int maximumUnit = getInt(maximumUnitAr);
        
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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"army buildings"+s+"produsen"+s+unitType+"-"+sName+"-"+iLevel+".json");

            if(fa.exists()){
                int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
                    return;
                }
            }

          int army = armyList.getModel().getSize();
//        StringBuilder allCruises = new StringBuilder("All cruises:");
//        for(int i = 0; i < size; i++){
//        allCruises.append("\n").append(armyList.getModel().getElementAt(i));
//        }
        
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
            JsonArray unitQueueArray = new JsonArray();
            for ( int a = 0; a < army; a++ ){
                unitQueueArray.add(new JsonPrimitive(Integer.parseInt(armyList.getModel().getElementAt(a).split("-")[0])));
            }
            jo.add("maximumUnitQueueItems", unitQueueArray);
                 
            try {
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"army buildings"+s+"produsen"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
            modelArmy.clear();
            armyList.setModel(modelArmy);
          
          unitTypeAr.setText("");
          buildCostAr.setText("");
          experienceAr.setText("");
          boostCostAr.setText("");
          maximumUnitAr.setText("");
          hitpointAr.setText("");
          buildTimeAr.setText("");
          nameAr.setText("");
          descriptionAr.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       if(unitTypeAr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameAr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionAr.getText().equals("")) {
            descriptionAr.setText("-");
        }
        
        if(hitpointAr.getText().equals("")) {
            hitpointAr.setText("0");
        }
        if(buildTimeAr.getText().equals("")) {
            buildTimeAr.setText("-");
        }
        
        int unitType = getInt(unitTypeAr);
        int buildCost = getInt(buildCostAr);
        int experience = getInt(experienceAr);
        int troopsCapacity = getInt(troopCapacityAr);
        
        Object Hitpoint = hitpointAr.getText();
        Object BuildTime = buildTimeAr.getText();
        Object Name = nameAr.getText();
        Object Description = descriptionAr.getText();
        Object Level = sLevelAr.getSelectedItem();
        Object LevelTownHallReq = sTownHallLevelReqAr.getSelectedItem();

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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"army buildings"+s+"storage"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"army buildings"+s+"storage"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
          unitTypeAr.setText("");
          buildCostAr.setText("");
          experienceAr.setText("");
          boostCostAr.setText("");
          maximumUnitAr.setText("");
          hitpointAr.setText("");
          buildTimeAr.setText("");
          nameAr.setText("");
          descriptionAr.setText("");
          troopCapacityAr.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(unitTypeArmy.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameArmy.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionArmy.getText().equals("")) {
            descriptionArmy.setText("-");
        }

        if(damageAttackArmy.getText().equals("")) {
            damageAttackArmy.setText("0");
        }
        if(hitpointArmy.getText().equals("")) {
            hitpointArmy.setText("0");
        }
        if(researchTimeArmy.getText().equals("")) {
            researchTimeArmy.setText("0");
        }
        if(trainingTimeArmy.getText().equals("")) {
            trainingTimeArmy.setText("0");
        }
        if(movementSpeedArmy.getText().equals("")) {
            movementSpeedArmy.setText("0");
        }
        if(attackSpeedArmy.getText().equals("")) {
            attackSpeedArmy.setText("0");
        }
        if(rangeArmy.getText().equals("")) {
            rangeArmy.setText("0");
        }
        
        int trainingCost = getInt(trainingCostArmy);
        int researchCost = getInt(researchCostArmy);
        int hausingSpace = getInt(housingSpaceArmy);
        int unitType = getInt(unitTypeArmy);
        
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

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"army"+s+unitType+"-"+sName+"-"+iLevel+".json");

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
            jo.addProperty("movementSpeed", fMovemendSpeed);
            jo.addProperty("attackSpeed", fAttackSeed);
            jo.addProperty("range", fRange);
            jo.addProperty("trainingCost", trainingCost);
            jo.addProperty("researchCost", researchCost);
            jo.addProperty("housingSpace", hausingSpace);
            jo.addProperty("unitType", unitType);
            jo.addProperty("preferredTarget", iPreferredTarget);
            jo.addProperty("attackType", iAttackType);
            jo.addProperty("description", sDescription);

            try {
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"army"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
          trainingCostArmy.setText("");
          researchCostArmy.setText("");
          housingSpaceArmy.setText("");
          unitTypeArmy.setText("");          
          damageAttackArmy.setText("");
          hitpointArmy.setText("");          
          researchTimeArmy.setText("");
          nameArmy.setText("");
          descriptionArmy.setText("");          
          trainingTimeArmy.setText("");
          movementSpeedArmy.setText("");
          attackSpeedArmy.setText("");
          rangeArmy.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed
 int damage,speed,hasil ;
 int damageD,speedDef,hasilDef ;
 int capacityR,productionR,hasilR;
    private void damageAttackArmyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_damageAttackArmyFocusLost
        // TODO add your handling code here:
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

    private void damageShotDefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_damageShotDefFocusLost
        // TODO add your handling code here:
//       if (!damageDef.getText().equals("")){
       damageD=Integer.parseInt(damageShotDef.getText());
//       }
       if (!attackSpeedDef.getText().equals("")){
       speedDef=Integer.parseInt(attackSpeedDef.getText());
           hasilDef = damageD/speedDef;    
       damageSecondDef.setText(Integer.toString(hasilDef));
       }
    }//GEN-LAST:event_damageShotDefFocusLost

    private void attackSpeedDefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attackSpeedDefFocusLost
        // TODO add your handling code here:
//       if (!attackSpeedDef.getText().equals("")){
       speedDef=Integer.parseInt(attackSpeedDef.getText());
//       }
       if (!damageDef.getText().equals("")){
       damageD=Integer.parseInt(damageDef.getText());
           hasilDef = damageD/speedDef;    
       damageSecondDef.setText(Integer.toString(hasilDef));
       }
    }//GEN-LAST:event_attackSpeedDefFocusLost
    
    DefaultListModel modelArmy = new DefaultListModel();
    
    DefaultListModel nameModel1 = new DefaultListModel();
    DefaultListModel nameModel2 = new DefaultListModel();
    DefaultListModel nameModel3 = new DefaultListModel();

    DefaultListModel numberCapacity1 = new DefaultListModel();
    DefaultListModel numberCapacity2 = new DefaultListModel();
    DefaultListModel numberCapacity3 = new DefaultListModel();
    
    DefaultListModel maxLvlbuild1 = new DefaultListModel();
    DefaultListModel maxLvlbuild2 = new DefaultListModel();
    DefaultListModel maxLvlbuild3 = new DefaultListModel();

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(armyName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
        String name = new String();
        name = armyName.getText();
        String [] arrayName = name.split("-");
        String data1 = arrayName[0];
        String data2 = arrayName[1];
        modelArmy.addElement(data1 + "-" + data2);
        armyList.setModel(modelArmy);
        armyName.setText("");
        //System.out.println(data2);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();        
        String s = File.separator;
        JFileChooser army = new JFileChooser(currentPathString+s+"unit kategory"+s+"army");
        army.showOpenDialog(null);
        File f = army.getSelectedFile();
        if (f == null) {
        return;
        }
        String filename = f.getName();
        armyName.setText(filename);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(unitTypeRes1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan unit type dengan lengkap");
            return;
        }
        if(nameRes1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Isikan name dengan lengkap");
            return;
        }
        if(descriptionRes1.getText().equals("")) {
            descriptionRes1.setText("-");
        }

        if(buildTimeRes1.getText().equals("")) {
            buildTimeRes1.setText("0");
        }
        if(hitpointRes1.getText().equals("")) {
            hitpointRes1.setText("0");
        }
        if(availableToBeStolen.getText().equals("")) {
            availableToBeStolen.setText("0");
        }
        
        int unitType = getInt(unitTypeRes1);
        int maximumNumberOfBuild = getInt(maximumNumberOfBuildAvailable);
        int goldAva = getInt(goldAvailable);
        int elixirAva = getInt(elixirAvailable);
        int darkElixirAva = getInt(darkElixirAvailable);
        int availableToBeStolenTH = getInt(availableToBeStolen);
        int cap = getInt(capTH);
        int storageAmount = getInt(storageAmountToReachCap);
        int buildCost = getInt(buildCostRes1);
        int experience = getInt(experienceRes1);
        
        Object Name = nameRes1.getText();
        Object BuildTime = buildTimeRes1.getText();
        Object Description = descriptionRes1.getText();
        Object Level = thLevel.getSelectedItem();
        Object Hitpoint = hitpointRes1.getText();
        Object AvailableToBeStolen = availableToBeStolen.getText();
        Object List1 = capacityList1;

        String sList1 = (String)List1.toString();
        String sAvailableToBeStolen = (String)AvailableToBeStolen;
        String sLevel = (String)Level;
        String sName = (String)Name;
        String sBuildTime = (String)BuildTime;
        String sDescription = (String)Description;
        String sHitpoint =(String)Hitpoint;

        System.out.println(sList1);
        int iLevel = Integer.parseInt(sLevel);
        float fBuildTime = Float.parseFloat(sBuildTime);
        float fHitpoint = Float.parseFloat(sHitpoint);
        float fAvailableToBeStolen = Float.parseFloat(sAvailableToBeStolen);

        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();
        
        String s = File.separator;
        File fa = new File(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"pusat"+s+unitType+"-"+sName+"-"+iLevel+".json");

        
            if(fa.exists()){
                int Ex = JOptionPane.showConfirmDialog(this, "Timpa file?");
                if (Ex == JOptionPane.OK_OPTION) {
                } else {
                    return;
                }
            }
            
            int nameCp1 = nameList1.getModel().getSize();
            int nameCp2 = nameList2.getModel().getSize();
            int nameCp3 = nameList3.getModel().getSize();
            int capacity1 = capacityList1.getModel().getSize();
            int capacity2 = capacityList2.getModel().getSize();
            int capacity3 = capacityList3.getModel().getSize();
            int maxLvl1 = maxLevelList1.getModel().getSize();
            int maxLvl2 = maxLevelList2.getModel().getSize();
            int maxLvl3 = maxLevelList3.getModel().getSize();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject jo = new JsonObject();
            jo.addProperty("unitType", unitType);
            jo.addProperty("name", sName);
            jo.addProperty("level", iLevel);
            jo.addProperty("maxHitpoint", fHitpoint);
            jo.addProperty("buildCost", buildCost);
            jo.addProperty("buildTime", fBuildTime);
            jo.addProperty("experienceGained", experience);
            jo.addProperty("experienceGained", maximumNumberOfBuild);
            jo.addProperty("experienceGained", goldAva);
            jo.addProperty("experienceGained", elixirAva);
            jo.addProperty("experienceGained", darkElixirAva);
            jo.addProperty("experienceGained", availableToBeStolenTH);
            jo.addProperty("experienceGained", fAvailableToBeStolen);
            jo.addProperty("experienceGained", cap);
            jo.addProperty("experienceGained", storageAmount);
            JsonArray namefile1 = new JsonArray();
            for ( int a = 0; a < nameCp1; a++ ){
                namefile1.add(new JsonPrimitive(nameList1.getModel().getElementAt(a)));
            }
            jo.add("nameFile1", namefile1);
            
            JsonArray capacityLs1 = new JsonArray();
            for ( int a = 0; a < nameCp1; a++ ){
                capacityLs1.add(new JsonPrimitive(Integer.parseInt(capacityList1.getModel().getElementAt(a))));
            }
            jo.add("capacity1", capacityLs1);
            
            JsonArray maxLevel1 = new JsonArray();
            for ( int a = 0; a < nameCp1; a++ ){
                maxLevel1.add(new JsonPrimitive(Integer.parseInt(maxLevelList1.getModel().getElementAt(a))));
            }
            jo.add("maxLevel1", maxLevel1);
            
            JsonArray namefile2 = new JsonArray();
            for ( int b = 0; b < nameCp2; b++ ){
                namefile2.add(new JsonPrimitive(nameList2.getModel().getElementAt(b)));
            }
            jo.add("nameFile2", namefile2);
            
            JsonArray capacityLs2 = new JsonArray();
            for ( int a = 0; a < nameCp2; a++ ){
                capacityLs2.add(new JsonPrimitive(Integer.parseInt(capacityList2.getModel().getElementAt(a))));
            }
            jo.add("capacity2", capacityLs2);
            
            JsonArray maxLevel2 = new JsonArray();
            for ( int a = 0; a < nameCp2; a++ ){
                maxLevel2.add(new JsonPrimitive(Integer.parseInt(maxLevelList2.getModel().getElementAt(a))));
            }
            jo.add("maxLevel2", maxLevel2);
            
            JsonArray namefile3 = new JsonArray();
            for ( int b = 0; b < nameCp3; b++ ){
                namefile3.add(new JsonPrimitive(nameList3.getModel().getElementAt(b)));
            }
            jo.add("nameFile3", namefile3);
            
            JsonArray capacityLs3 = new JsonArray();
            for ( int a = 0; a < nameCp3; a++ ){
                capacityLs3.add(new JsonPrimitive(Integer.parseInt(capacityList3.getModel().getElementAt(a))));
            }
            jo.add("capacity3", capacityLs3);
            
            JsonArray maxLevel3 = new JsonArray();
            for ( int a = 0; a < nameCp3; a++ ){
                maxLevel3.add(new JsonPrimitive(Integer.parseInt(maxLevelList3.getModel().getElementAt(a))));
            }
            jo.add("maxLevel3", maxLevel3);
            
            jo.addProperty("description", sDescription);
        
            try {
                FileWriter file = new FileWriter(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource"+s+"pusat"+s+unitType+"-"+sName+"-"+iLevel+".json");
                    String json = gson.toJson(jo);
                    file.write(json);
                    file.flush();
                    file.close();
                    System.out.println(json);
                } catch (IOException e) {

                    JOptionPane.showMessageDialog(this, "Gagal membuat file!");

                    e.printStackTrace();
                }
            nameModel1.clear();
            nameList1.setModel(nameModel1);
            nameModel2.clear();
            nameList2.setModel(nameModel2);
            nameModel3.clear();
            nameList3.setModel(nameModel3);
            
            numberCapacity1.clear();
            capacityList1.setModel(numberCapacity1);
            numberCapacity2.clear();
            capacityList2.setModel(numberCapacity2);
            numberCapacity3.clear();
            capacityList3.setModel(numberCapacity3);
            
            maxLvlbuild1.clear();
            maxLevelList1.setModel(maxLvlbuild1);
            maxLvlbuild2.clear();
            maxLevelList2.setModel(maxLvlbuild2);
            maxLvlbuild3.clear();
            maxLevelList3.setModel(maxLvlbuild3);
            
        unitTypeRes1.setText("");
        nameRes1.setText("");
        descriptionRes1.setText("");
        buildTimeRes1.setText("");
        hitpointRes1.setText("");
        buildCostRes1.setText("");
        experienceRes1.setText("");
        
        
    }//GEN-LAST:event_jButton12ActionPerformed
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            if(capacity1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(name1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(maxLevel1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
        String name = new String();
        name = name1.getText();
        String [] arrayName = name.split("-");
        String data2 = arrayName[1];
        nameModel1.addElement(data2);
        nameList1.setModel(nameModel1);
        name1.setText("");
        numberCapacity1.addElement(capacity1.getText());
        capacityList1.setModel(numberCapacity1);
        capacity1.setText("");
        maxLvlbuild1.addElement(maxLevel1.getText());
        maxLevelList1.setModel(maxLvlbuild1);
        maxLevel1.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
            if(capacity2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(name2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(maxLevel2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
        String name = new String();
        name = name2.getText();
        String [] arrayName = name.split("-");
        String data2 = arrayName[1];
        nameModel2.addElement(data2);
        nameList2.setModel(nameModel2);
        name2.setText("");
        numberCapacity2.addElement(capacity2.getText());
        capacityList2.setModel(numberCapacity2);
        capacity2.setText("");
        maxLvlbuild2.addElement(maxLevel2.getText());
        maxLevelList2.setModel(maxLvlbuild2);
        maxLevel2.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();        
        String s = File.separator;
        JFileChooser army = new JFileChooser(currentPathString+s+"unit kategory"+s+"buildings"+s+"resource");
        army.showOpenDialog(null);
        File f = army.getSelectedFile();
        if (f == null) {
        return;
        }
        String filename = f.getName();
        name1.setText(filename);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();        
        String s = File.separator;
        JFileChooser army = new JFileChooser(currentPathString+s+"unit kategory"+s+"buildings"+s+"defenses");
        army.showOpenDialog(null);
        File f = army.getSelectedFile();
        if (f == null) {
        return;
        }
        String filename = f.getName();
        name2.setText(filename);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        armyName.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        name1.setText("");
        maxLevel1.setText("");
        capacity1.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        name2.setText("");
        maxLevel2.setText("");
        capacity2.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
            if(capacity3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(name3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
            if(maxLevel3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukan file army terlebih dahulu");
            return;
        }
        String name = new String();
        name = name3.getText();
        String [] arrayName = name.split("-");
        String data2 = arrayName[1];
        nameModel3.addElement(data2);
        nameList3.setModel(nameModel3);
        name3.setText("");
        numberCapacity3.addElement(capacity3.getText());
        capacityList3.setModel(numberCapacity3);
        capacity3.setText("");
        maxLvlbuild3.addElement(maxLevel3.getText());
        maxLevelList3.setModel(maxLvlbuild3);
        maxLevel3.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        name3.setText("");
        maxLevel3.setText("");
        capacity3.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Path currentRelativePath = Paths.get("");
        String currentPathString = currentRelativePath.toAbsolutePath().toString();        
        String s = File.separator;
        JFileChooser army = new JFileChooser(currentPathString+s+"unit kategory"+s+"buildings"+s+"army buildings");
        army.showOpenDialog(null);
        File f = army.getSelectedFile();
        if (f == null) {
        return;
        }
        String filename = f.getName();
        name3.setText(filename);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void capacity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacity2ActionPerformed

    private void capacity3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacity3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacity3ActionPerformed

    private void pCapacityResFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pCapacityResFocusLost
        // TODO add your handling code here:
        capacityR=Integer.parseInt(pCapacityRes.getText());
       
       if (!productionRateRes.getText().equals("")){
       productionR=Integer.parseInt(productionRateRes.getText());
           hasilR = capacityR/productionR;    
       timeToFillRes.setText(Integer.toString(hasilR));
       }
    }//GEN-LAST:event_pCapacityResFocusLost

    private void productionRateResFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productionRateResFocusLost
        // TODO add your handling code here:
       productionR=Integer.parseInt(productionRateRes.getText());
        
       if (!pCapacityRes.getText().equals("")){
       capacityR=Integer.parseInt(pCapacityRes.getText());
           hasilR = capacityR/productionR;    
       timeToFillRes.setText(Integer.toString(hasilR));
       }
    }//GEN-LAST:event_productionRateResFocusLost

    private void storageAmountToReachCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageAmountToReachCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storageAmountToReachCapActionPerformed

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
            java.util.logging.Logger.getLogger(JSon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> armyList;
    private javax.swing.JLabel armyName;
    private javax.swing.JTextField attackSpeedArmy;
    private javax.swing.JTextField attackSpeedDef;
    private javax.swing.JComboBox<String> attackTypeArmy;
    private javax.swing.JTextField availableToBeStolen;
    private javax.swing.JComboBox<String> bLevelDef;
    private javax.swing.JComboBox<String> bTownHallLevelReqDef;
    private javax.swing.JComboBox<String> barracksLevelReqArmy;
    private javax.swing.JTextField boostCostAr;
    private javax.swing.JTextField boostCostRes;
    private javax.swing.JTextField buildCostAr;
    private javax.swing.JTextField buildCostDef;
    private javax.swing.JTextField buildCostRes;
    private javax.swing.JTextField buildCostRes1;
    private javax.swing.JTextField buildTimeAr;
    private javax.swing.JTextField buildTimeDef;
    private javax.swing.JTextField buildTimeRes;
    private javax.swing.JTextField buildTimeRes1;
    private javax.swing.JTextField capTH;
    private javax.swing.JTextField capacity1;
    private javax.swing.JTextField capacity2;
    private javax.swing.JTextField capacity3;
    private javax.swing.JList<String> capacityList1;
    private javax.swing.JList<String> capacityList2;
    private javax.swing.JList<String> capacityList3;
    private javax.swing.JTextField catchUpPointRes;
    private javax.swing.JTextField damageAttackArmy;
    private javax.swing.JTextField damageDef;
    private javax.swing.JTextField damageRadiusDef;
    private javax.swing.JTextField damageSecondArmy;
    private javax.swing.JTextField damageSecondDef;
    private javax.swing.JTextField damageShotDef;
    private javax.swing.JComboBox<String> damageTypeDef;
    private javax.swing.JTextField darkElixirAvailable;
    private javax.swing.JTextArea descriptionAr;
    private javax.swing.JTextArea descriptionArmy;
    private javax.swing.JTextArea descriptionDef;
    private javax.swing.JTextArea descriptionRes;
    private javax.swing.JTextArea descriptionRes1;
    private javax.swing.JTextField elixirAvailable;
    private javax.swing.JTextField experienceAr;
    private javax.swing.JTextField experienceDef;
    private javax.swing.JTextField experienceRes;
    private javax.swing.JTextField experienceRes1;
    private javax.swing.JComboBox<String> favoriteTargetDef;
    private javax.swing.JTextField goldAvailable;
    private javax.swing.JTextField hitpointAr;
    private javax.swing.JTextField hitpointArmy;
    private javax.swing.JTextField hitpointDef;
    private javax.swing.JTextField hitpointRes;
    private javax.swing.JTextField hitpointRes1;
    private javax.swing.JTextField housingSpaceArmy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JComboBox<String> laboratoryLevelReqArmy;
    private javax.swing.JComboBox<String> levelArmy;
    private javax.swing.JTextField maxLevel1;
    private javax.swing.JTextField maxLevel2;
    private javax.swing.JTextField maxLevel3;
    private javax.swing.JList<String> maxLevelList1;
    private javax.swing.JList<String> maxLevelList2;
    private javax.swing.JList<String> maxLevelList3;
    private javax.swing.JTextField maximumNumberOfBuildAvailable;
    private javax.swing.JTextField maximumUnitAr;
    private javax.swing.JTextField movementSpeedArmy;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField nameAr;
    private javax.swing.JTextField nameArmy;
    private javax.swing.JTextField nameDef;
    private javax.swing.JList<String> nameList1;
    private javax.swing.JList<String> nameList2;
    private javax.swing.JList<String> nameList3;
    private javax.swing.JTextField nameRes;
    private javax.swing.JTextField nameRes1;
    private javax.swing.JTextField pCapacityRes;
    private javax.swing.JComboBox<String> pLevelAr;
    private javax.swing.JComboBox<String> pLevelRes;
    private javax.swing.JComboBox<String> pTownHallLevelReqAr;
    private javax.swing.JComboBox<String> pTownHallLevelReqRes;
    private javax.swing.JComboBox<String> preferredTargetArmy;
    private javax.swing.JTextField productionRateRes;
    private javax.swing.JTextField rangeArmy;
    private javax.swing.JTextField rangeDef;
    private javax.swing.JTextField reArmCostDef;
    private javax.swing.JTextField researchCostArmy;
    private javax.swing.JTextField researchTimeArmy;
    private javax.swing.JTextField sCapacityRes;
    private javax.swing.JComboBox<String> sLevelAr;
    private javax.swing.JComboBox<String> sLevelRes;
    private javax.swing.JComboBox<String> sTownHallLevelReqAr;
    private javax.swing.JComboBox<String> sTownHallLevelReqRes;
    private javax.swing.JTextField storageAmountToReachCap;
    private javax.swing.JComboBox<String> tLevelDef;
    private javax.swing.JComboBox<String> tTownHallLevelReqDef;
    private javax.swing.JComboBox<String> thLevel;
    private javax.swing.JTextField timeToFillRes;
    private javax.swing.JTextField trainingCostArmy;
    private javax.swing.JTextField trainingTimeArmy;
    private javax.swing.JTextField triggerRadiusDef;
    private javax.swing.JTextField troopCapacityAr;
    private javax.swing.JTextField unitTypeAr;
    private javax.swing.JTextField unitTypeArmy;
    private javax.swing.JTextField unitTypeDef;
    private javax.swing.JTextField unitTypeRes;
    private javax.swing.JTextField unitTypeRes1;
    private javax.swing.JComboBox<String> unitTypeTargetedDef;
    // End of variables declaration//GEN-END:variables
}
