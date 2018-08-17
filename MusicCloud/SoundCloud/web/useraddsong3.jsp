<%@page import="java.io.FileInputStream"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="com.mpatric.mp3agic.ID3v2"%>
<%@page import="com.mpatric.mp3agic.Mp3File"%>
<%@page import="java.io.File"%>
<%@page import="vmm.*" %>
<%@page import="java.sql.*"%>

<%  String path = "";
    int max = 0;
    String name=session.getAttribute("un").toString();
  
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection soundcloud1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
        Statement stmt1 = soundcloud1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs1 = stmt1.executeQuery("select max(idsongs)'id' from songs");
        if (rs1.next()) {
            max = rs1.getInt("id");
            max = max + 0;
            session.setAttribute("id", max);
       
        }

        String absolutepath = getServletContext().getRealPath("/songs");

        vmm.FileUploader.savefile(request, absolutepath, max + ".mp3");
        
        path ="./songs/" + max + ".mp3";
     //   vmm.FileUploader.savefile(request, absolutepath,saveFile);
//        String id=session.getAttribute("id").toString();

        Class.forName("com.mysql.jdbc.Driver");
        Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
        Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from songs where idsongs ='" +max+ "'");
       
              if (rs.next())
                 {  
                      
                      try
      {
      Mp3File mp3File = new Mp3File(absolutepath+"/" + max + ".mp3");
      System.out.println("Song Length - " + mp3File.getLength());
      if(mp3File.hasId3v2Tag())
      {
          ID3v2 id32tag = mp3File.getId3v2Tag();
          System.out.println(id32tag.getAlbum()); // all the options like genre , artist n stuff.
          System.out.println(id32tag.getTitle());
          System.out.println(id32tag.getTrack());
          System.out.println(id32tag.getYear());
          System.out.println(id32tag.getVersion());
          if(id32tag.getAlbum()!=null)
          rs.updateString("album", id32tag.getAlbum());
          
          if(id32tag.getAlbumArtist()!=null)
          rs.updateString("artist", id32tag.getAlbumArtist());
          rs.updateString("year", id32tag.getYear());
          
          if(mp3File.getLength()!=0 && mp3File.getLengthInSeconds()!=0)
          {
              double duration= mp3File.getLengthInSeconds()/60;
          rs.updateString("duration",duration+" s");
          
                     float length=mp3File.getLength();
                     DecimalFormat obj=new DecimalFormat("#.##");
                     if(length<(1024*1024))
                     {
                           length=length/(1024);
                            rs.updateString("size",obj.format(length)+" KB"); 
                     }
                     else if(length>=(1024*1024))
                      {
                           length=length/(1024*1024);
                        rs.updateString("size",obj.format(length)+" MB");  
                      }
          }
                     
                     rs.updateString("albumart", "./albumart/"+max+".jpg");
                    rs.updateString("path",path);
                     rs.updateRow();
          byte [] b = id32tag.getAlbumImage();
           String absolutepath1 = getServletContext().getRealPath("/albumart");
          FileOutputStream fos = new FileOutputStream(absolutepath1+"/"+max+".jpg");
          
          if(b!=null)
          {
          fos.write(b);
          }
          else
          {
              FileInputStream fis=new FileInputStream(absolutepath1+"/dummy.jpg");
              byte[] b1=new byte[1024*1024];
              while(true)
              {
                  int r=fis.read(b, 0, b1.length);
                  if(r==-1)
                  {
                      break;
                  }
                  fos.write(b, 0, r);
              }
          }
          fos.close();
      }
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
                       

                    // response.sendRedirect("useraddsong4.jsp");
                 }
              else
              {
                  response.sendRedirect("useraddsong1.jsp");
              }

    }
        catch (Exception ex) {
        ex.printStackTrace();
    }

%>
