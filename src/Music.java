import java.util.Date;

public class Music extends MusicFile {
    private String genre;
    private Date createdAt;

    public Music(String fileName,
     double fileDuration, String fileCreator, 
     String genre, Date createdAt) {
        super(fileName, fileDuration, fileCreator);
        this.genre = genre;
        this.createdAt = createdAt;
    }

    public void displayFileInfo() {
        System.out.println("Nome do arquivo: " + fileName);
        System.out.println("Duração do arquivo: " + fileDuration + " segundos");
        System.out.println("Criador do arquivo: " + fileCreator);
        System.out.println("Gênero do arquivo: " + genre);
        System.out.println("Data de criação do arquivo: " + createdAt);
    }
}
