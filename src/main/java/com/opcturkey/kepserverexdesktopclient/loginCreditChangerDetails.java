/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.opcturkey.kepserverexdesktopclient;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author yunus
 */
public class loginCreditChangerDetails extends JFrame implements ActionListener{
    
     Container container = getContentPane();
     JLabel newUsername = new JLabel("New Username:");
     JLabel newPassword = new JLabel("New Password:");
     JTextField newUsernameTextField= new JTextField();
     JPasswordField newPasswordTextFeield = new JPasswordField();
     JButton saveNewCredentialsButton = new JButton("Save");
      String newUsernameTextFieldTXT;
          String newPasswordTextFeieldTXT;
          String latinPassW;
             private BufferedImage icon1;
     loginCreditChangerDetails(){
         setContainerLayout();
         setLocationAndSizeOfEachComponent();
         addAllComponentsToTheContainer();
         addActionEvent();
     }
     
     public void setContainerLayout(){
         container.setLayout(null);
            try {
             this.icon1 = ImageIO.read(new File("C:\\Users\\yunus\\Documents\\NetBeansProjects\\KepServerExDesktopClient\\src\\main\\java\\com\\opcturkey\\kepserverexdesktopclient\\resources\\robotic-arm.png"));
             setIconImage(icon1);  } catch (IOException ex) {
             Logger.getLogger(loginCreditChangerDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public void setLocationAndSizeOfEachComponent(){
         
         newUsername.setBounds(50,150,100,30);
         newPassword.setBounds(50,220,100,30);
         newUsernameTextField.setBounds(150,150,150,30);
         newPasswordTextFeield.setBounds(150,220,150,30);
         saveNewCredentialsButton.setBounds(150,340,90,30);
         
     }
     
     public void addAllComponentsToTheContainer(){
     
         container.add(newUsername);
         container.add(newPassword);
         container.add(newUsernameTextField);
         container.add(newPasswordTextFeield);
         container.add(saveNewCredentialsButton);
          
     }
     
     
     public void saveTheseNewCredentials() throws NoSuchAlgorithmException{
          // newUsernameTextFieldTXT
          // newPasswordTextFeieldTXT
            
MessageDigest MD = MessageDigest.getInstance("MD5");
MD.update(newPasswordTextFeieldTXT.getBytes());

byte[] bytes = MD.digest();

StringBuilder sb=new StringBuilder();

for(int i=0;i<bytes.length;i++){
    sb.append(Integer.toString((bytes[i]&0xff)+0x100,16).substring(1));
}
newPasswordTextFeieldTXT=sb.toString();

        
          try{
              
                 Path path = Paths.get("tempdatafile2.ini");
              Path path2 = Paths.get("tempdatafile.ini");
              File file = new File("tempdatafile2.ini");
              File file2 = new File("tempdatafile.ini");
              
                if(file.isHidden() || file2.isHidden()){
                    Files.setAttribute(path, "dos:hidden", false,LinkOption.NOFOLLOW_LINKS );
              Files.setAttribute(path2, "dos:hidden", false,LinkOption.NOFOLLOW_LINKS );
                }
                
             ////PRINTWIRTER AREA
               PrintWriter printWriter = new PrintWriter("tempdatafile.ini");
      

             String userN="3f7thFDHgebrtrtbdHfd5w"+newUsernameTextFieldTXT+"th7thFDgH6tssmj7766DHudHfd5w";
             String passW="d399thFD5g5HgebrtrtbdHfd5w"+newPasswordTextFeieldTXT+"bh7thFD5g5H6tssmj7766DHudHfd5w";
             
             
            
              printWriter.println(userN);
              printWriter.println(passW);
              
              
              printWriter.close();
              
              
              Files.setAttribute(path, "dos:hidden", true,LinkOption.NOFOLLOW_LINKS );
              Files.setAttribute(path2, "dos:hidden", true,LinkOption.NOFOLLOW_LINKS );
              
              
              
              
              
             
              
              
              
              
          }catch(Exception e){
              e.printStackTrace();
          }
          
          
          try{
              BufferedReader bufferedReader = new BufferedReader(new FileReader("tempdatafile.ini"));
              
              System.out.println(bufferedReader.readLine());
              System.out.println(bufferedReader.readLine());
            
              
              bufferedReader.close();
          }catch(Exception e){
               e.printStackTrace();
          }
          
          
          
          
          
     }
     
    public void addActionEvent(){
        saveNewCredentialsButton.addActionListener(this);
    }
     @Override
     public void actionPerformed(ActionEvent e){
         
           newUsernameTextFieldTXT=newUsernameTextField.getText();
           newPasswordTextFeieldTXT=newPasswordTextFeield.getText();
         latinPassW=newPasswordTextFeield.getText();
         if(newUsernameTextFieldTXT.length()!=0 && newPasswordTextFeieldTXT.length()!=0){
             
             if(!newUsernameTextFieldTXT.contains(" ")&&!newPasswordTextFeieldTXT.contains(" ")){
                 
                 if(newUsernameTextFieldTXT.length() <50 && newPasswordTextFeieldTXT.length()<50){
                     
                     JOptionPane.showMessageDialog(this, "Your New Login Credentials Saved Successfully!");
                     try {
                         saveTheseNewCredentials();
                     } catch (NoSuchAlgorithmException ex) {
                         Logger.getLogger(loginCreditChangerDetails.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }else{
             
             JOptionPane.showMessageDialog(this, "Your new password or username does NOT comply with standards.\n"
                     + "Both your username and password must be below 50 characters.");
             
         } 
             }  else{
             
             JOptionPane.showMessageDialog(this, "Your new password or username does NOT comply with standards.\n"
                     + "Both your username and password should not include spaces.");
             
         } 
         }else{
             
             JOptionPane.showMessageDialog(this, "Your new password or username does NOT comply with standards.\n"
                     + "username and password cannot be empty.");
             
         } 
     }
     
     
     
      
}
     
   

    





 /*

 JFrame frame = new JFrame("Change Login Credentials");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
       
      
        frame.setPreferredSize(new Dimension(409,494));
        frame.setResizable(false);
        frame.setTitle();
        frame.pack();
        frame.setVisible(true);
       try{
            PrintWriter pwriter = new PrintWriter("usercredentials.ser");
            
            pwriter.println();
            pwriter.println();
            
            pwriter.close();
        }catch(FileNotFoundException ex){
        }
        
       
*/