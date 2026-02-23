package app;

import java.util.ArrayList;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void addMedia(ArrayList<Media> mediaList, Media media) {
        mediaList.add(media);
        System.out.println("Media added successfully.");
    }

    public void deleteMedia(ArrayList<Media> mediaList, int id) {
        mediaList.removeIf(media -> media.getId() == id);
        System.out.println("Media deleted successfully.");
    }
}