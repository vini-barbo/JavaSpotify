import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private List<String> playlist;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.playlist = new ArrayList<>();
    }

    public boolean verifyLogin(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public void registerProfile() {
        // Perform registration logic
        System.out.println("Profile registered for user: " + username);
    }

    public void deleteProfile() {
        // Perform deletion logic
        System.out.println("Profile deleted for user: " + username);
    }

    public void updateProfile(String newName, String newEmail) {
        // Perform update logic
        this.name = newName;
        this.email = newEmail;
        System.out.println("Profile updated for user: " + username);
    }

    public void addToPlaylist(String media) {
        playlist.add(media);
        System.out.println("Added to playlist for user " + username + ": " + media);
    }

    public void displayPlaylist() {
        System.out.println("Playlist for user " + username + ":");
        for (String media : playlist) {
            System.out.println(media);
        }
    }

    public static void main(String[] args) {
        User user = new User("jteste", "password123", "John Doe", "john@example.com");
        user.registerProfile();
        user.addToPlaylist("Song 1");
        user.addToPlaylist("Podcast Episode 1");
        user.displayPlaylist();

        if (user.verifyLogin("password123")) {
            System.out.println("Logim aceito !");
        } else {
            System.out.println("O login falhou");
        }


        user.updateProfile("teste do teste", "teste.teste@example.com");


        System.out.println("Perfil atualizado:");
        System.out.println("Name: " + user.name);
        System.out.println("Email: " + user.email);
    }
}
