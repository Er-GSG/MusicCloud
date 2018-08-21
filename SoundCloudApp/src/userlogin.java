
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class userlogin extends javax.swing.JFrame {

 
   String username;
    public userlogin() 
    {
       
        initComponents();
        setSize(400, 300);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 70, 100, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 110, 100, 20);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 150, 120, 23);

        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 70, 90, 14);

        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 90, 14);

        jLabel3.setText("UserLogin");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 30, 120, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 250, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login obj=new login();
        Thread th=new Thread(obj);
        th.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }

   
   

    class login implements Runnable
    {

        @Override
        public void run() 
        {
            try
            {
        Socket sock=new Socket("127.0.0.1",8084);
        DataInputStream dis=new DataInputStream(sock.getInputStream());
        DataOutputStream dos=new DataOutputStream(sock.getOutputStream());
        
        
        username=jTextField1.getText();
        String password=jTextField2.getText();
        
        dos.writeBytes("GET /SoundCloud/login?user="+username+"&password="+password+" HTTP/1.1\r\n");
        dos.writeBytes("Host: 127.0.0.1:8084\r\n");
        dos.writeBytes("\r\n");
        while(true)
   
        {
            String s1=dis.readLine();
            System.out.println(" s1 : "+s1);
            
            if(s1==null || s1.equals(""))
            {
                System.out.println(" break ");
                break;
            }
            
        }
        String l=dis.readLine();
        System.out.println(" l : "+l);
        if(l.equals("login"))
        {
            JOptionPane.showMessageDialog(getContentPane(), "login successful");
            new SoundCloudList(username);
            userlogin.this.dispose();
        } 
        else
        {
            JOptionPane.showMessageDialog(getContentPane(), "login failed");
        }
        
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    
    
    
  
    
  
    
     class playlist implements Runnable {

        public playlist() {
        }

        @Override
        public void run() {

                try
            {
               
             Socket sock=new Socket("127.0.0.1",8084);
        DataInputStream dis=new DataInputStream(sock.getInputStream());
        DataOutputStream dos=new DataOutputStream(sock.getOutputStream());
       
        
        dos.writeBytes("GET /SoundCloud/SendPlaylist?user="+username+" HTTP/1.1\r\n");
        dos.writeBytes("Host: 127.0.0.1:8084\r\n");
        dos.writeBytes("\r\n");
        while(true)
   
        {
            String s1=dis.readLine();
            System.out.println(" s1 : "+s1);
            
            if(s1==null || s1.equals(""))
            {
                System.out.println(" break ");
                break;
            }
            
        }
        int count=Integer.parseInt(dis.readLine());
        
        for(int i=0;i<count;i++)
        {
            String songname=dis.readLine();
            String album=dis.readLine();
            String artist=dis.readLine();
            String albumart=dis.readLine();
            String genre=dis.readLine();
            String size=dis.readLine();
            String duration=dis.readLine();
            
           // al.add(new list(songname,artist,album,albumart,genre,size,duration));
        }
        
        
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
            
        


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
