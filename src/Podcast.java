

import java.util.Date;

public class Podcast extends MusicFile {
    private String guest;

    public Podcast(String fileName,
     double fileDuration, String fileCreator, 
     String genre, Date createdAt, String guest) {
        super(fileName, fileDuration, fileCreator);
        
        this.guest = guest;
    }
}
