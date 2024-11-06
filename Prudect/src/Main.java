//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book b1=new Book("something",56.8,"Ali");
        Movie m1=new Movie("Hope",97.4,"khled");
        System.out.println("Congratulations, you got a discount %!5 on this book:  "+b1.getDiscount());
        System.out.println("Congratulations, you got a discount %10 on this move:  "+m1.getDiscount());


    }
}