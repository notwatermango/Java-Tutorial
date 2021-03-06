package abstractClass;
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book{
    // Declare the price instance variable
    private int price;
    
    /**   
     *   Class Constructor
     *   
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    public MyBook(String tit, String aut, int pri){
        super(tit,aut);
        this.price = pri;
    }


    /**   
     *   Method Name: display
     *   
     *   Print the title, author, and price in the specified format.
     * Title: The Alchemist
     * Author: Paulo Coelho
     * Price: 248
     **/
    // Write your method here
    void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
    // End class
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
