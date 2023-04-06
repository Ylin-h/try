import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String name;
    String author;
    String ISBN;
    boolean available;

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String name, String author, String ISBN) {
        Book newBook = new Book(name, author, ISBN);
        this.books.add(newBook);
        System.out.println("Book added successfully.");
    }

    public void viewAllBooks() {
        System.out.println("All books:");
        for (Book book : this.books) {
            System.out.println(book.name + " by " + book.author + " (ISBN: " + book.ISBN + ")");
        }
    }

    public void findBook(String name) {
        for (Book book : this.books) {
            if (book.name.equals(name)) {
                System.out.println("Book found:");
                System.out.println(book.name + " by " + book.author + " (ISBN: " + book.ISBN + ")");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void borrowBook(String ISBN) {
        for (Book book : this.books) {
            if (book.ISBN.equals(ISBN)) {
                if (book.available) {
                    book.available = false;
                    System.out.println("Book borrowed successfully.");
                    return;
                } else {
                    System.out.println("Book not available for borrowing.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String ISBN) {
        for (Book book : this.books) {
            if (book.ISBN.equals(ISBN)) {
                if (!book.available) {
                    book.available = true;
                    System.out.println("Book returned successfully.");
                    return;
                } else {
                    System.out.println("Book already available.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
}

public class bookSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View all books");
            System.out.println("2. Add a book");
            System.out.println("3. Find a book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    library.viewAllBooks();
                    break;
                case 2:
                    System.out.println("Enter book name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String ISBN = scanner.nextLine();
                    library.addBook(name, author, ISBN);
                    break;
                case 3:
                    System.out.println("Enter book name:");
                    String searchName = scanner.nextLine();
                    library.findBook(searchName);
                    break;
                case 4:
                    System.out.println("Enter book ISBN:");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN);
                    break;
                case 5:
                    System.out.println("Enter book ISBN:");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }     
    }
}
    