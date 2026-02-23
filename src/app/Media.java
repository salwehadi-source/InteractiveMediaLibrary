package app;

public class Media {
    private int id;
    private String title;
    private String type;

    public Media(int id, String title, String type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getType() { return type; }

    public void play() {
        System.out.println("Playing: " + title + " (" + type + ")");
    }

    @Override
    public String toString() {
        return id + " - " + title + " [" + type + "]";
    }
}