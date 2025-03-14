package dsaAssignmentTwo;
public class Book
{
String BName;
int BEdition;
double BPrice;
public Book(String BName, int BEdition, double BPrice) {
this.BName = BName;
this.BEdition = BEdition;
this.BPrice = BPrice;
}
public void display() {
System.out.println("Book name: " + BName);
System.out.println("Book edition: " + BEdition);
System.out.println("Book price: $" + BPrice);
}
public static void main(String[] args) 
{
Book book1 = new Book("The Great Gatsby", 1, 10.99);
Book book2 = new Book("To Kill a Mockingbird", 2, 9.99);
Book book3 = new Book("1984", 1, 11.99);
Book book4 = new Book("Pride and Prejudice", 3, 12.99);
Book book5 = new Book("The Catcher in the Rye", 2, 8.99);
Book[] books = {book1, book2, book3, book4, book5};
Book maxPriceBook = books[0];
for (int i = 1; i < books.length; i++) {
if (books[i].BPrice > maxPriceBook.BPrice) 
{
maxPriceBook = books[i];
}
}
System.out.println("Book with the maximum price:");
maxPriceBook.display();

	}

}
