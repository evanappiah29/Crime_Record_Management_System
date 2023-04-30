/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sabina B. Heyford
 */
public class newrecordinsertion extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public newrecordinsertion() {
        initComponents();
    }
    
        
     Connection Con = null;
     Statement St = null;
     java.sql.ResultSet Rs = null;
      public void SelectProd()
    {
        try{
            Con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/crimerecord","root","");
            St = (Statement) Con.createStatement();
            Rs = (java.sql.ResultSet) St.executeQuery("select * from crimerec");
            table.setModel(DbUtils.resultSetToTableModel((java.sql.ResultSet) Rs));
        }catch(java.sql.SQLException e)
        {
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        residentialadd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        court = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        crime = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        skintone = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        eyecolour = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        jailid = new javax.swing.JTextField();
        cellno = new javax.swing.JTextField();
        accussedid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        nameid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CRIME RECORDS MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1065, -1));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setText("NEW RECORD INSERTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 38));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SHOW DATABASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 760, 210, 60));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 560, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel4.setText("NAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 560, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel5.setText("AGE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 560, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel6.setText("DOB:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 560, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel7.setText("GENDER:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 70, -1));

        residentialadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentialaddActionPerformed(evt);
            }
        });
        jPanel1.add(residentialadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 560, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel8.setText("RESIDENTIAL ADD:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 560, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel10.setText("MOTHER'S NAME:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel11.setText("FATHER'S NAME:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 560, -1));

        court.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courtActionPerformed(evt);
            }
        });
        jPanel1.add(court, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 560, -1));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel12.setText("COURT:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 60, -1));

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel13.setText("CRIME:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        crime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeActionPerformed(evt);
            }
        });
        jPanel1.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 560, -1));

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        jPanel1.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 560, -1));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel14.setText("HEIGHT:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel15.setText("WEIGHT:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel16.setText("OCCUPATION:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel17.setText("PHONE NO:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel19.setText("CELL_NO:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 790, -1, -1));

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel20.setText("ACCUSSED_ID:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, -1, -1));

        jLabel21.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel21.setText("JAIL_ID:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, -1, -1));

        jLabel22.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel22.setText("EYE COLOUR:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        jLabel23.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel23.setText("SKIN TONE:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, -1, -1));

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        jPanel1.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 560, 20));

        skintone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skintoneActionPerformed(evt);
            }
        });
        jPanel1.add(skintone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, 560, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 560, -1));

        eyecolour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyecolourActionPerformed(evt);
            }
        });
        jPanel1.add(eyecolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 560, -1));

        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        jPanel1.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 560, -1));

        jailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jailidActionPerformed(evt);
            }
        });
        jPanel1.add(jailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, 560, -1));

        cellno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellnoActionPerformed(evt);
            }
        });
        jPanel1.add(cellno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 790, 560, -1));

        accussedid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accussedidActionPerformed(evt);
            }
        });
        jPanel1.add(accussedid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 760, 560, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 840, -1, -1));

        nameid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameidFocusGained(evt);
            }
        });
        nameid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameidActionPerformed(evt);
            }
        });
        jPanel1.add(nameid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 560, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel9.setText("NAME_ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        crimedb ad = new crimedb();
        ad.setVisible(true);

        //dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void residentialaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentialaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residentialaddActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void courtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courtActionPerformed

    private void crimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void skintoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skintoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skintoneActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void eyecolourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyecolourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eyecolourActionPerformed

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void jailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jailidActionPerformed

    private void cellnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellnoActionPerformed

    private void accussedidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accussedidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accussedidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{ 
          
            Con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/crimerecord","root","");
            PreparedStatement add = (PreparedStatement) Con.prepareStatement("insert into crimerec values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            add.setInt(1,Integer.parseInt(nameid.getText()));
            add.setString(2,age.getText());
            add.setString(3,name.getText());
            add.setString(4,dob.getText());
            add.setString(5,gender.getText());
            add.setString(6,residentialadd.getText());
            add.setString(7,crime.getText());
            add.setString(8,court.getText());
            add.setString(9,fname.getText());
            add.setString(10,mname.getText());
            add.setString(11,phone.getText());
            add.setString(12,occupation.getText());
            add.setString(13,weight.getText());
            add.setString(14,height.getText());
            add.setString(15,skintone.getText());
            add.setString(16,eyecolour.getText());
            add.setString(17,jailid.getText());
            add.setString(18,accussedid.getText());
            add.setString(19,cellno.getText());
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Succsessfully Addded");
            Con.close();
            }catch(java.sql.SQLException e)
        {
          
          System.out.println(e.getMessage()); 
       } 

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameidFocusGained
        // TODO add your handling code here:
        if(nameid.getText().equals("Enter Name_ID"))
        {
            nameid.setText("");
            nameid.setForeground(new Color(00,00,00,00));
        }
    }//GEN-LAST:event_nameidFocusGained

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
            java.util.logging.Logger.getLogger(newrecordinsertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newrecordinsertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newrecordinsertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newrecordinsertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newrecordinsertion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accussedid;
    private javax.swing.JTextField age;
    private javax.swing.JTextField cellno;
    private javax.swing.JTextField court;
    private javax.swing.JTextField crime;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField eyecolour;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jailid;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameid;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField residentialadd;
    private javax.swing.JTextField skintone;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
