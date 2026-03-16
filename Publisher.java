public class Publisher 
{
 String publisherName;
}
class Book extends Publisher 
{
 String bookTitle;
 double price;
}
class Literature extends Book
{
 void display() 
 {
  System.out.println("Category: Literature");
  System.out.println("Book Title: " + bookTitle);
  System.out.println("Price: " + price);
  System.out.println("Publisher: " + publisherName);
 }
}
class Fiction extends Book
{
 void display() 
 {
  System.out.println("Category: Fiction");
  System.out.println("Book Title: " + bookTitle);
  System.out.println("Price: " + price);
  System.out.println("Publisher: " + publisherName);
 }
}
class BookPublisher
{
 public static void main(String[] args) 
 {
  Literature l = new Literature();
  l.bookTitle = "Hamlet";
  l.price = 300;
  l.publisherName = "Penguin";
  l.display();
  System.out.println();
  Fiction f = new Fiction();
  f.bookTitle = "Harry Potter";f.price = 500;
  f.publisherName = "Bloomsbury";
  f.display();
 }
}
