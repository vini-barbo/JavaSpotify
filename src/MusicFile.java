public class MusicFile {
    protected String fileName;
    protected double fileDuration;
    protected String fileCreator;

    public MusicFile(String fileName, double fileDuration, String fileCreator) {
        this.fileName = fileName;
        this.fileDuration = fileDuration;
        this.fileCreator = fileCreator;
    }

    public void deleteFile() {

        System.out.println("Arquivo excluído: " + fileName);
    }

    public void addFile() {

        System.out.println("Arquivo adicionado: " + fileName);
    }

    public void pause() {

        System.out.println("Arquivo pausado: " + fileName);
    }

    public void start() {

        System.out.println("Arquivo iniciado: " + fileName);
    }

    public void rate() {

        System.out.println("Arquivo avaliado: " + fileName);
    }
}
