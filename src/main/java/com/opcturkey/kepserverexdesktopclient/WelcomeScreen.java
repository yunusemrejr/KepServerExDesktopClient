/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.opcturkey.kepserverexdesktopclient;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
 import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author yunus
 */
public final class WelcomeScreen extends javax.swing.JFrame  {
      securityFrame securityFrame = new securityFrame();
      
         loginCreditChanger LCC = new loginCreditChanger();

          
     
      static int checkerchecker=0;
      
        
      
      
    public int securityScreen() {
   
        
         /* //  jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(false);
            
        securityFrame.show();
        securityFrame.setAlwaysOnTop(true);
       
       
        
         
         */
        
       
    return 0;
    }
    
    
 

      private BufferedImage icon1;
     /**
     * Creates new form WelcomeScreen
     */
    public WelcomeScreen() {
       
        
        initComponents();
        jMenuBar1.setEnabled(true);
        jMenuBar1.setVisible(true);
         this.getContentPane().setBackground(new Color(245, 245, 245));
               jButton7.setVisible(false);
 
        try {
            securityScreen();
            this.icon1 = ImageIO.read(new File("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\robotic-arm.png"));
            
            
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        setIconImage(icon1);
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KepServerEX Desktop Client by OPCTurkey");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\robotic-arm.png")); // NOI18N
        jLabel2.setText("Kepware Server Access Through API Client");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 840, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 255));
        jButton2.setText("IoT Gateway REST API Access");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 514, 251, -1));

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 255));
        jButton3.setText("About");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton4.setBackground(new java.awt.Color(0, 51, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 255));
        jButton4.setText("Usage Manual");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 525, 0, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 255));
        jButton5.setText("Kepware Server API Access");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 514, 226, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\ezgif.com-gif-maker (2).gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 203, -1, 249));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\opc-asp-logo.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 6, 405, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\download-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 95, 17));

        jLabel4.setMaximumSize(new java.awt.Dimension(512, 512));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 71, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 125, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 102, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Change Lock Password");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 574, 0, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 658, 0, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\diji.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 640, 266, 33));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\Untitled design (49).png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 680));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        jMenuBar1.setMargin(new java.awt.Insets(0, 20, 0, 20));

        jMenu1.setText("Pages");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Kepware Server API Access");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("IoT Gateway REST API Access");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setText("CLI");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Save Multiple KepServer Configs");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Security Settings");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem1.setText("Change Application Password");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manual");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
      var xxx= new ReadAndWrite();
         xxx.setSize(ReadAndWrite.WIDTH, ReadAndWrite.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
         xxx.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         About about = new About();
        about.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Manual manual = new Manual();
        manual.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          var xxx= new ProjectAPIClient();
         xxx.setSize(ProjectAPIClient.WIDTH, ProjectAPIClient.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           loginCreditChanger.main(null);
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        
        loginCreditChanger.main(null);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 
        var xxx= new ReadAndWrite();
         xxx.setSize(ReadAndWrite.WIDTH, ReadAndWrite.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
         xxx.setVisible(true);
        
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      var xxx= new ProjectAPIClient();
         xxx.setSize(ProjectAPIClient.WIDTH, ProjectAPIClient.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
        
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
// TODO add your handling code here:       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
      var xxx= new Manual();
         xxx.setSize(Manual.WIDTH, Manual.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
      var xxx= new About();
         xxx.setSize(About.WIDTH, About.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
         xxx.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

 var xxx= new MutlipleKepServerList();
         xxx.setSize(MutlipleKepServerList.WIDTH, MutlipleKepServerList.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
   

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

         var xxx= new SecuritySettings();
         xxx.setSize(SecuritySettings.WIDTH, SecuritySettings.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
        
           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           
          try {
              var xxx= new CLI();
              xxx.setSize(CLI.WIDTH, CLI.HEIGHT);
              xxx.pack();
              xxx.setLocationRelativeTo(null);
              xxx.setVisible(true);
          } catch (IOException ex) {
              Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed
  public void securityF_Says_Turn_Settings_Enabled_The_User_Entered_Right(){
       jMenuItem1.setEnabled(true);
             jMenu2.setEnabled(true);
             
  }
  
    public void securityF_Says_Turn_Settings_Enabled_The_User_Entered_False(){
       jMenuItem1.setEnabled(false);
             jMenu2.setEnabled(false);
             
  }
  
  public static void securityF_Says_Turn_Settings_Enabled_The_User_Entered_Right_Static(){
     
      WelcomeScreen wsws= new WelcomeScreen();
      wsws.securityF_Says_Turn_Settings_Enabled_The_User_Entered_Right();
   
      
         wsws.setSize(WelcomeScreen.WIDTH, WelcomeScreen.HEIGHT);
         wsws.pack();
         wsws.setLocationRelativeTo(null);
        wsws.setVisible(true);
  }
  
    public static void securityF_Says_Turn_Settings_OFF_The_User_Entered_GUEST_Static(){
     
      WelcomeScreen wsws= new WelcomeScreen();
      wsws.securityF_Says_Turn_Settings_Enabled_The_User_Entered_False();
      
      wsws.setVisible(true);
  }
  
  public void destroyCurrent(){
      this.dispose();
  }
    public void checkPassEnable(){
              try  {
             BufferedReader bufferedReader = new BufferedReader(new FileReader("tempdatafile2.ini"));
            String passenablecheck=bufferedReader.readLine();
         if(passenablecheck.contains("01110000 01100001 01110011 01110011")){
              System.out.println("01110000 01100001 01110011 01110011");
              securityFrame.setLocationRelativeTo(null);
              securityFrame.pack();
             securityFrame.setVisible(true);
             securityFrame.setAlwaysOnTop(true);
            
             jMenu2.setEnabled(false);
         }else{
               System.out.println("no");
              securityFrame.dispose();
              WelcomeScreen ws = new WelcomeScreen();
              ws.setVisible(true);
         }
          bufferedReader.close();
           
      
      }catch(IOException e){
          
      }
    }
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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                WelcomeScreen welcomescrn = new WelcomeScreen();
                welcomescrn.checkPassEnable();
                welcomescrn.setVisible(false);
                welcomescrn.dispose();
            }

           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
