
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundCloudList extends javax.swing.JFrame
{

   ArrayList<songs> al;
   int id=0;
   String path;
   String username;
    public SoundCloudList(String username)
    {
        al=new ArrayList<>();
        this.username=username;
        initComponents();
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        image.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        try
        {
            path="C:\\Users\\Public\\Music Cloud";
            File f=new File("C:\\Users\\Public\\Music Cloud");
            if(!f.exists())
            {
                f.mkdir();
            }
            
            File f1=new File("C:\\Users\\Public\\Music Cloud\\Album Arts");
            File f2=new File("C:\\Users\\Public\\Music Cloud\\Songs");
            if(!f1.exists())
            {
                f1.mkdir();
            }
            if(!f2.exists())
            {
                f2.mkdir();
            }
            
         BufferedImage orgimage = ImageIO.read(new File(path+"\\m8.jpg"));
                    BufferedImage resizedImage = resize(orgimage,image.getWidth(),image.getHeight());
                   image.setIcon(new ImageIcon(resizedImage));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       // image.setIcon(new ImageIcon("D:\\desktop music cloud\\m9.jpg"));
        jScrollPane1.setBounds(300,200,Toolkit.getDefaultToolkit().getScreenSize().width-600,800);
        heading.setBounds((Toolkit.getDefaultToolkit().getScreenSize().width)/2-150,10,500,80);
        jButton1.setBounds(300,130,(Toolkit.getDefaultToolkit().getScreenSize().width-600)/2,70);
         jButton2.setBounds(300+(Toolkit.getDefaultToolkit().getScreenSize().width-600)/2,130,(Toolkit.getDefaultToolkit().getScreenSize().width-600)/2,70);
         jButton3.setBounds(30, 220, 250, 60);
         jButton4.setBounds(30, 283, 250, 60);
         getContentPane().setBackground(Color.BLACK);
       
        getContentPane().setBackground(new Color(255, 255, 255));
        //UIManager.put("TitledBorder.border", new LineBorder(new Color(15,15,15), 1));
    }

    public BufferedImage resize(BufferedImage image, int width, int height) 
    {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(15, 15, 15));
        jButton1.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("My Download List");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 60, 450, 80);

        jButton2.setBackground(new java.awt.Color(15, 15, 15));
        jButton2.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("My Play List");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 60, 430, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Downloaded Songs List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poor Richard", 0, 36), new java.awt.Color(30, 30, 30))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 8000));
        jPanel2.setLayout(null);
        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(290, 160, 1460, 630);

        heading.setFont(new java.awt.Font("Poor Richard", 0, 70)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 51, 0));
        heading.setText("Music Cloud");
        getContentPane().add(heading);
        heading.setBounds(620, 10, 290, 30);

        jButton3.setBackground(new java.awt.Color(15, 15, 15));
        jButton3.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Download");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 160, 250, 60);

        jButton4.setBackground(new java.awt.Color(15, 15, 15));
        jButton4.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Play");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 230, 250, 60);
        getContentPane().add(image);
        image.setBounds(80, 330, 180, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
       new Thread(new showDownload()).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        new Thread(new Download()).start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
      {
          File f=new File("C:\\Users\\Public\\Music Cloud\\Songs\\"+id+".mp3");
          if(!f.exists())
          {
              JOptionPane.showMessageDialog(this,"Download this song first !! ");
          }
          else
          {
          Runtime.getRuntime().exec("\"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" \"C:\\Users\\Public\\Music Cloud\\Songs\\"+id+".mp3\"");
          }
          }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Thread(new playlist()).start();
    }//GEN-LAST:event_jButton2ActionPerformed


    class showDownload implements Runnable
    {
        Socket sock;
        DataOutputStream dos;
        DataInputStream dis;

        @Override
        public void run()
        {
            try
            {
                jPanel2.removeAll();
        jPanel2.repaint();
        al.clear();
               sock=new Socket(Global.ip, Global.port);
               dis=new DataInputStream(sock.getInputStream());
               dos=new DataOutputStream(sock.getOutputStream());
               
               dos.writeBytes("GET /SoundCloud/SendDownloadList?username="+username+" HTTP/1.1\r\n");
               dos.writeBytes("Host: "+Global.ip+":"+Global.port+"\r\n");
               dos.writeBytes("\r\n");
               
               while(true)
               {
                   String s=dis.readLine();
                   System.out.println(" s : "+s);
                   if(s==null || s.equals(""))
                   {
                       break;
                   }
               }
               
               
                int count=Integer.parseInt(dis.readLine());
        
        for(int i=0;i<count;i++)
        {
            int id=Integer.parseInt(dis.readLine());
            String songname=dis.readLine();
            String artist=dis.readLine();
            String size=dis.readLine();
            String duration=dis.readLine();
            
            al.add(new songs(songname,artist,size,duration,id,new File(path+"\\Album Arts\\"+id+".jpg")));
        }
                
                
        for(int h=0;h<count;h++)
        {
            int indexId=al.get(h).id;
             URL url=new URL("http://"+Global.urlinfo+"/albumart/"+indexId+".jpg");
        InputStream in=new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] buf=new byte[1024];
        
        int n=0;
        
        while(-1 !=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        
        in.close();
        
        byte[] response=out.toByteArray();
        FileOutputStream fos=new FileOutputStream(path+"\\Album Arts\\"+indexId+".jpg");
        fos.write(response);
        fos.close();
        out.close();
        
        al.get(h).f=new File(path+"\\Album Arts\\"+id+".jpg");
        }
        
        
                int x=50;
                for(int i=0;i<al.size();i++)
                {
                    int index=i;
                    int y=al.get(i).id;
                    JPanel panel=al.get(i);
                    //panel.setBackground(new Color(150, 150, 150));
                    jPanel2.add(panel);
                    jPanel2.repaint();
                    panel.setLocation(50, x);
                    x=x+400;
                    panel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                panel.setBackground(new Color(255, 0, 0));
                id=y;
                System.out.println(" id : "+id);
                
                for(int p=0;p<al.size();p++)
                {
                    if(p!=index)
                   al.get(p).setBackground(new Color(255,255,255));
                }
                
            }
        });
                }
                
                
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    
    class Download implements Runnable
    {

        @Override
        public void run()
        {
           try
           {
            if(id==0)
            {
                JOptionPane.showMessageDialog(SoundCloudList.this, "Select any song to download first");
            }
            else
            {
                
        URL url=new URL("http://"+Global.urlinfo+"songs/"+id+".mp3");
        InputStream in=new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] buf=new byte[1024];
        
        int n=0;
        
        while(-1 !=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        
        in.close();
        
        byte[] response=out.toByteArray();
        FileOutputStream fos=new FileOutputStream(path+"\\Songs\\"+id+".mp3");
        fos.write(response);
        fos.close();
        out.close();
               JOptionPane.showMessageDialog(SoundCloudList.this, "Dowmload Complete");
            }
               
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
        
    }
    
    
    class playlist implements Runnable
    {
        Socket sock;
        DataOutputStream dos;
        DataInputStream dis;

        @Override
        public void run() 
        {
            try
            {
                al.clear();
                sock=new Socket(Global.ip, Global.port);
               dis=new DataInputStream(sock.getInputStream());
               dos=new DataOutputStream(sock.getOutputStream());
               
               dos.writeBytes("GET /SoundCloud/SendPlaylist?username="+username+" HTTP/1.1\r\n");
               dos.writeBytes("Host: "+Global.ip+":"+Global.port+"\r\n");
               dos.writeBytes("\r\n");
               
               while(true)
               {
                   String s=dis.readLine();
                   System.out.println(" s : "+s);
                   if(s==null || s.equals(""))
                   {
                       break;
                   }
               }
               
               
                int count=Integer.parseInt(dis.readLine());
        
        for(int i=0;i<count;i++)
        {
            int id=Integer.parseInt(dis.readLine());
            String songname=dis.readLine();
            String artist=dis.readLine();
            String size=dis.readLine();
            String duration=dis.readLine();
            
            al.add(new songs(songname,artist,size,duration,id,new File(path+"\\Album Arts\\"+id+".jpg")));
        }
                
                
        for(int h=0;h<count;h++)
        {
            int indexId=al.get(h).id;
             URL url=new URL("http://"+Global.urlinfo+"/albumart/"+indexId+".jpg");
        InputStream in=new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] buf=new byte[1024];
        
        int n=0;
        
        while(-1 !=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        
        in.close();
        
        byte[] response=out.toByteArray();
        FileOutputStream fos=new FileOutputStream(path+"\\Album Arts\\"+indexId+".jpg");
        fos.write(response);
        fos.close();
        out.close();
        
        al.get(h).f=new File(path+"\\Album Arts\\"+id+".jpg");
        }
        
        jPanel2.removeAll();
        jPanel2.repaint();
                System.out.println(" removed ");
                int x=50;
                for(int i=0;i<al.size();i++)
                {
                    int index=i;
                    int y=al.get(i).id;
                    JPanel panel=al.get(i);
                    //panel.setBackground(new Color(150, 150, 150));
                    jPanel2.add(panel);
                    jPanel2.repaint();
                    panel.setLocation(50, x);
                    x=x+400;
                    panel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                panel.setBackground(new Color(255, 0, 0));
                id=y;
                System.out.println(" id : "+id);
                
                for(int p=0;p<al.size();p++)
                {
                    if(p!=index)
                   al.get(p).setBackground(new Color(255,255,255));
                }
                
            }
        });
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heading;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
