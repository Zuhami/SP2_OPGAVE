import java.util.ArrayList;
public class LibraryRoyalityCalculator {




    public static void main(String[] args) {
        ArrayList<Title> titles = new ArrayList<>();
        Author author = new Author("Ayman Chaykh");
        // jeg tilføjer mine bøger her
        author.addTitle(new PrintedBook("Prinsen på hesten", "SKØN", 30,200));
        author.addTitle(new PrintedBook("Erindringer", "LYRIK", 500,100 ));
        author.addTitle(new AudioBook( "SPIDERMAN", "TE", 1000, 24));


     

        System.out.println("Forfatter : " + author.getName() + " : " + author.calculateTotalPay() + "kr");
    }

}
