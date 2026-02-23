package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Media> mediaList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("admin", "1234");

        while (true) {
            System.out.println("\n1. Add Media");
            System.out.println("2. View Media");
            System.out.println("3. Play Media");
            System.out.println("4. Delete Media");
            System.out.println("5. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Title: ");
                    String title = input.nextLine();
                    System.out.print("Enter Type (Video/Audio/PDF): ");
                    String type = input.nextLine();

                    Media media = new Media(id, title, type);
                    admin.addMedia(mediaList, media);
                    break;

                case 2:
                    for (Media m : mediaList) {
                        System.out.println(m);
                    }
                    break;

                case 3:
                    System.out.print("Enter Media ID to play: ");
                    int playId = input.nextInt();
                    for (Media m : mediaList) {
                        if (m.getId() == playId) {
                            m.play();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Media ID to delete: ");
                    int deleteId = input.nextInt();
                    admin.deleteMedia(mediaList, deleteId);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}