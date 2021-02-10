
import java.util.*;
class Book {
    public String Name;
    private int Book_code;
    private String Authors;
    private int price;

    public Book() {

    }

    public Book(String Name, int Book_code, String Authors, int price) {
        this.Name = Name;
        this.Book_code = Book_code;
        this.Authors = Authors;
        this.price = price;
    }

    public void setBookName(String Name) {
        this.Name = Name;
    }

    public String getBookName() {
        return Name;
    }

    public void setBook_code(int Book_code) {
        this.Book_code = Book_code;
    }

    public int getBook_code() {
        return Book_code;
    }

    public void setAuthors_Name(String Authors) {
        this.Authors = Authors;
    }

    public String getAuthors_Name() {
        return Authors;
    }

    public void setBook_price(int price) {
        this.price = price;
    }

    public int getBook_price() {
        return this.price;
    }

    public String toString() {
        return "Name : "+ Name + "\t Book_Code : " + Book_code +   "\t Price :  " + price +  "\t Author :  " + Authors;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Name: ");
        String B_Name = sc.nextLine();
        System.out.println("Enter Book Code:");
        int B_Code = sc.nextInt();
        
       
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        System.out.println("Enter author name: ");
        String Author_name=sc.next();
        Book B = new Book(B_Name, B_Code, Author_name, price);

        // calling all setmethods
        B.setBookName(B_Name);
        B.setAuthors_Name(Author_name);
        B.setBook_code(B_Code);
        B.setBook_price(price);

        // calling all get methods
        System.out.println("Book Name: " + B.getBookName());
        System.out.println("Book_code: " + B.getBook_code());
        System.out.println("Details: " + B.toString());
        sc.close();
    }

}
