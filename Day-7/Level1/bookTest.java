import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private double price;

    Book(){
        title = "Wings of Fire";
        author = "APJ Abdul Kalam";
        price = 150;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("The Title of the Book is " + title);
        System.out.println("The Author of the Book is " + author);
        System.out.println("The Price of the Book is " + price);
    }
}

public class bookTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Title of the Book: ");
        String title = input.nextLine();
        System.out.print("Enter the Author of the Book: ");
        String author = input.nextLine();
        System.out.print("Enter the Price of the Book: ");
        double price = input.nextDouble();

        //default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // parameterized constructor
        Book para = new Book(title, author, price);
        para.displayDetails();

        input.close();
    }
}