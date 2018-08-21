
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class songs extends javax.swing.JPanel
{
int id;
File f;
    public songs(String name,String artist,String size,String duration,int id,File f) 
    {
        this.id=id;
        this.f=f;
        initComponents();
        int x=Toolkit.getDefaultToolkit().getScreenSize().width;
        int y=Toolkit.getDefaultToolkit().getScreenSize().height;
        setSize(x-700,400);
        jLabel1.setBounds((x-700)/6, 50, 200, 250);
        jLabel2.setBounds(((x-700))/2, 40 , 400, 50);
        jLabel3.setBounds(((x-700))/2, 110 , 400, 50);
        jLabel4.setBounds(((x-700))/2, 160 , 400, 50);
        jLabel5.setBounds(((x-700))/2, 200 , 400, 50);
        jLabel2.setText(name);
        jLabel3.setText(artist);
        jLabel4.setText(size);
        jLabel5.setText(duration);
        //jLabel1.setIcon(new ImageIcon("E:\\sm.jpg"));
        setBackground(new Color(240, 240, 240));
        try
        {
         BufferedImage orgimage = ImageIO.read(f);
                    BufferedImage resizedImage = resize(orgimage,jLabel1.getWidth(),jLabel1.getHeight());
                    jLabel1.setIcon(new ImageIcon(resizedImage));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Song Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Poor Richard", 0, 24), new java.awt.Color(15, 15, 15))); // NOI18N
        setOpaque(false);
        setLayout(null);

        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(140, 30, 190, 250);

        jLabel2.setBackground(new java.awt.Color(50, 50, 50));
        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 15, 15));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(470, 40, 50, 30);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(470, 110, 96, 37);

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(470, 170, 89, 35);

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 100, 100));
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(470, 230, 88, 35);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
