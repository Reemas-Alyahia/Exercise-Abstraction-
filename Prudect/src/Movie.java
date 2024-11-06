public class Movie extends Prudect {
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    @Override
    public double getDiscount() {
        //"%.2f";
        return getPrice()*0.10;
    }
}
