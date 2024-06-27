//Create a class representing a Book with properties like title, author, and methods to display information.
class Book{
    String title,author;
    Book(String title,String author){
        this.author=author;
        this.title=title;
    }
    void display_info(){
        System.out.println("Book Name : "+title+" ,By : "+author);
    }
}
public class bookwithproperties {
    public static void main(String[] args) {
        Book b1=new Book("Book1","author1");
        b1.display_info();
    }    
}
