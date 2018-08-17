import com.mpatric.mp3agic.*;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Mp3_MetaData_ID3_Tag 
{
    public static void main(String[] args) 
    {
      try
      {
      Mp3File mp3File = new Mp3File("Lovely12.mp3");
      double duration= mp3File.getLengthInSeconds()/60;
          System.out.println(" duration : "+duration);
      System.out.println("Song Length - " + mp3File.getLength()/(1024*1024));
      
      
       float length=mp3File.getLength();
      
                     
                     if(length<(1024*1024))
                     {
                           length=length/(1024);
                            
                     }
                     else if(length>=(1024*1024))
                      {
                           length=length/(1024*1024);
                      }
                      DecimalFormat obj=new DecimalFormat("#.##");
                      
                     System.out.println(" length : "+obj.format(length));
      
      if(mp3File.hasId3v2Tag())
      {
          ID3v2 id32tag = mp3File.getId3v2Tag();
          
          System.out.println(id32tag.getAlbum()); // all the options like genre , artist n stuff.
          System.out.println(id32tag.getTitle());
          System.out.println(id32tag.getTrack());
          System.out.println(id32tag.getYear());
          System.out.println(id32tag.getVersion());
//          int length=id32tag.getDataLength();
//                     // length=length/(1000);
//                      System.out.println(" DataLength : "+length);
//                      
                      int length1=id32tag.getLength();
                     // length=length/(1000);
                      System.out.println(" Length : "+length1);
          byte [] b = id32tag.getAlbumImage();
          FileOutputStream fos = new FileOutputStream("album art1.jpg");
          fos.write(b);
      }
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
    }
}
