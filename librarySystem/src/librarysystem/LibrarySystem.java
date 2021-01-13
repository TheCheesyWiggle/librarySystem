
package librarysystem;

import java.util.*;


public class LibrarySystem {
    
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Book> Booklist = new ArrayList<>();
    
    public static void main(String[] args) {
            mainMenu();
    }
    
    public static void mainMenu(){
        System.out.println("welcome to my library system");
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("1- Add book");
            System.out.println("2- View all books");
            System.out.println("3- Edit book");
            System.out.println("0 - Exit");

            int userChoice = input.nextInt();

            switch(userChoice){
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();    
                    break;
                case 3:
                    editBook();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void addBook(){
        System.out.println("Enter name of book");
        input.nextLine();// to prevent skipping lines
        String name = input.nextLine();
        System.out.println("Enter ISBN of book");
        String ISBN = input.next();
        System.out.println("Enter Author of book");
        input.nextLine();// to prevent skipping lines
        String author = input.nextLine();
        System.out.println("Enter price of book");
        double price = input.nextDouble();
        System.out.println("Enter release date of book");
        String release = input.next();
        System.out.println("Enter genre of book");
        input.nextLine();// to prevent skipping line
        String genre = input.nextLine();
        
        Book myBook = new Book(name,ISBN,author,price,release,genre);
        Booklist.add(myBook);
        
        System.out.println(myBook.toString());
    }
    
    public static void viewBooks(){
        //loop through the arraylist
        if(Booklist.isEmpty()){
            System.out.println("Sorry there are no books in this directory");
        }
        else{
            for (int i = 0; i < Booklist.size(); i++) {
                System.out.println(Booklist.get(i).toString());
            }
        }
    }
    
    public static void editBook(){
        //choose which book you hat to edit
        
        //search for the names in the obj in the array
        System.out.println("Enter ISBN of book");
        String ISBN = input.next();
        
        int index = -1; //to set as the book they have typed in
        
        if(!Booklist.isEmpty()){
            for (int i = 0; i < Booklist.size(); i++) {
                if(ISBN.equals(Booklist.get(i).getISBN())){
                    index = i;
                    break;
                }
            }
        }
    

        if(index != -1){
            System.out.println("What would you like to edit?");
            System.out.println("1 - name");
            System.out.println("2 - ISBN");
            System.out.println("3 - author");
            System.out.println("4 - price");
            System.out.println("5 - release date");
            System.out.println("6 - genre");

            int userChoice = input.nextInt();

            switch(userChoice){
                case 1:
                    System.out.println("Please type in a name");
                    String newName = input.nextLine();
                    Booklist.get(index).setName(newName);
                    break;
                case 2:
                    System.out.println("Please type in a ISBN");
                    String newISBN = input.nextLine();
                    Booklist.get(index).setISBN(newISBN);
                    break;
                case 3:
                    System.out.println("Please type in a author");
                    String newAuthor = input.nextLine();
                    Booklist.get(index).setAuthor(newAuthor);
                    break;
                case 4:
                    System.out.println("Please type in a price");
                    double newPrice = input.nextDouble();
                    Booklist.get(index).setPrice(newPrice);
                    break;
                case 5:
                    System.out.println("Please type in a release date");
                    String newReleaseDate = input.nextLine();
                    Booklist.get(index).setReleaseDate(newReleaseDate);
                    break;
                case 6:
                    System.out.println("Please type in a release date");
                    String newGenre = input.nextLine();
                    Booklist.get(index).setGenre(newGenre);
                    break;
                }
        }
        else{
            System.out.println("Book not found");
        }
    }   
}