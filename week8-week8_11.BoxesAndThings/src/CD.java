public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.publishingYear = publishingYear;
        this.title = title;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
}
