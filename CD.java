public class CD extends Product {
    String artist;
    int numSong;
    String label;

public CD() {
    super();
    artist = "";
    numSong = 0;
    label = "";
}   

public CD(int number, String name, int quantity, double price, String artist, int numSong, String label) {
    super(number, name, quantity, price );
    this.artist = artist;
    this.numSong = numSong;
    this.label = label;
}

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yang sama dengan method di superclass
    public void print() {
        super.print();
        System.out.println("Artist : " + artist);
        System.out.println("NumSong : " + numSong);
        System.out.println("Label : " + label);
    }
    
}
