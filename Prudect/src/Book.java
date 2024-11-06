public class Book extends Prudect {
    private String auther;

    public Book() {

    }

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public double getDiscount() {

        return getPrice()-(getPrice()*0.15);
    
    }
}
