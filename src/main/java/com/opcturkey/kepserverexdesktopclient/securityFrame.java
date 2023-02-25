/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.opcturkey.kepserverexdesktopclient;

import static com.opcturkey.kepserverexdesktopclient.WelcomeScreen.checkerchecker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Byte.parseByte;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JDialog;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author yunus
 */
public class securityFrame extends javax.swing.JFrame  {
  String  usernameCredit1="cYt76Djs99d";
        String   passCredit1="cYt76Djs99d";
        
          
    public void readSecurityFile() throws FileNotFoundException, IOException, NoSuchAlgorithmException{
      try  {
          
          
             Path path = Paths.get("tempdatafile2.ini");
              Path path2 = Paths.get("tempdatafile.ini");
              File file = new File("tempdatafile2.ini");
              File file2 = new File("tempdatafile.ini");
              
                if(file.isHidden() || file2.isHidden()){
                    Files.setAttribute(path, "dos:hidden", false,LinkOption.NOFOLLOW_LINKS );
              Files.setAttribute(path2, "dos:hidden", false,LinkOption.NOFOLLOW_LINKS );
                }
                
             ////PRINTWIRTER AREA
                 BufferedReader bufferedReader = new BufferedReader(new FileReader("tempdatafile.ini"));
            usernameCredit1=bufferedReader.readLine();
          passCredit1=bufferedReader.readLine();
          bufferedReader.close();
          
          
   
         

          
          if(usernameCredit1==null || passCredit1==null){
             usernameCredit1="cYt76Djs99d";
                      passCredit1="cYt76Djs99d";
          } 
          
     logicofsecurity(); 
      
      ////////////////
              
              Files.setAttribute(path, "dos:hidden", true,LinkOption.NOFOLLOW_LINKS );
              Files.setAttribute(path2, "dos:hidden", true,LinkOption.NOFOLLOW_LINKS );
              
         }catch(IOException e){
          
      }
    }

    /**
     * Creates new form securityFrame
     * @return 
     */
    String doneornot="sa";
    String username1;
            String password1;
            String ENCRYPTEDPW;
    public int logicofsecurity() throws IOException, NoSuchAlgorithmException {
        
        
        
          username1=jTextField1.getText();
         password1=jPasswordField1.getText();
        
         MessageDigest MD = MessageDigest.getInstance("MD5");
MD.update(jPasswordField1.getText().getBytes());

byte[] bytes = MD.digest();

StringBuilder sb=new StringBuilder();

for(int i=0;i<bytes.length;i++){
    sb.append(Integer.toString((bytes[i]&0xff)+0x100,16).substring(1));
}
ENCRYPTEDPW=sb.toString();
         
         
         
        if(usernameCredit1 != null && usernameCredit1.contains("3f7thFDHgebrtrtbdHfd5w") && usernameCredit1.contains("th7thFDgH6tssmj7766DHudHfd5w")){
         
              
             username1= "3f7thFDHgebrtrtbdHfd5w"+jTextField1.getText()+"th7thFDgH6tssmj7766DHudHfd5w";
             
            
           password1="d399thFD5g5HgebrtrtbdHfd5w"+ENCRYPTEDPW+"bh7thFD5g5H6tssmj7766DHudHfd5w";
           
        } 
       
                         
       
        
        if(  (usernameCredit1.equals(username1)&& passCredit1.equals(password1))){
           // this.setVisible(false);
           
           // final JOptionPane successPaneitself = new JOptionPane("Login Successful!");
           // final JDialog dialogOfSuccess = successPaneitself.createDialog(null,"INFORMATION MESSAGE");
            //  Timer timer1= new Timer(4000, new ActionListener(){
                  
                //  @Override
              //    public void actionPerformed(ActionEvent arg0){
                //      dialogOfSuccess.dispose();
                //  }
                  
            //  });
              
          //    timer1.start();
             // dialogOfSuccess.setVisible(true);
            //  dialogOfSuccess.dispose();
            
              checkerchecker=1;
              
               
              WelcomeScreen.securityF_Says_Turn_Settings_Enabled_The_User_Entered_Right_Static();
            
             if(checkerchecker!=0){
                
         }
           this.dispose();
             
            
            
           
            
        }
        
        
        
        else if(jTextField1.getText().equals("cYt76Djs99d")&& jPasswordField1.getText().equals("cYt76Djs99d")){
            
                      this.setVisible(false);
           
            final JOptionPane successPaneitself = new JOptionPane("Login Successful!");
            final JDialog dialogOfSuccess = successPaneitself.createDialog(null,"INFORMATION MESSAGE");
              Timer timer1= new Timer(4000, new ActionListener(){
                  
                  @Override
                  public void actionPerformed(ActionEvent arg0){
                      dialogOfSuccess.dispose();
                  }
                  
              });
              
              timer1.start();
              dialogOfSuccess.setVisible(true);
              dialogOfSuccess.dispose();
            
              checkerchecker=1;
            
             if(checkerchecker!=0){
                
         }
           this.dispose();
             
            
            
            
            
        }else{doneornot="";
               
              this.setVisible(false);
                                     
                                     /////////
                                  JOptionPane.showMessageDialog(null, "Wrong username or password!");
                               
                              this.setVisible(true);      
                                     //////// }
        }
        return 0;
    }private BufferedImage icon1;
    public securityFrame() {
        initComponents();
        
         
            try {
             this.icon1 = ImageIO.read(new File("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\robotic-arm.png"));
             setIconImage(icon1);  } catch (IOException ex) {
             Logger.getLogger(loginCreditChangerDetails.class.getName()).log(Level.SEVERE, null, ex);
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

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(85, 121, 175));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 273, 43));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 240, 31));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\26494.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 268));

        jButton2.setBackground(new java.awt.Color(65, 65, 172));
        jButton2.setForeground(new java.awt.Color(204, 255, 51));
        jButton2.setText("Continue as guest");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\Copyright © ASP OTOMASYON A.Ş. (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
          // TODO add your handling code here:
          readSecurityFile();
          
      } catch (IOException ex) {
          Logger.getLogger(securityFrame.class.getName()).log(Level.SEVERE, null, ex);
      } catch (NoSuchAlgorithmException ex) {
          Logger.getLogger(securityFrame.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         GUEST_WelcomeScreen wsguest = new GUEST_WelcomeScreen();
           
         wsguest.setSize(GUEST_WelcomeScreen.WIDTH, GUEST_WelcomeScreen.HEIGHT);
         wsguest.pack();
         wsguest.setLocationRelativeTo(null);
        wsguest.setVisible(true);
      
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
     public securityFrame mainPre(){
         var xxx= new securityFrame();
         xxx.setSize(securityFrame.WIDTH, securityFrame.HEIGHT);
         xxx.pack();
         xxx.setLocationRelativeTo(null);
        xxx.setVisible(true);
       
        
        
        return xxx;
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
            java.util.logging.Logger.getLogger(securityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(securityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(securityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(securityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new securityFrame().mainPre();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
