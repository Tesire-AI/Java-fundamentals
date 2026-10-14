package LibraryManagementSystem;

public class main {
    public static void main(String[] args) {
        LibraryManager manager=new LibraryManager();
         manager.addbook(new book(1, "To Kill a Mockingbird", "Harper Lee", "Fiction", true));
        manager.addbook(new book(2, "1984", "George Orwell", "Dystopian", false));
        manager.addbook(new book(3, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", true));
        manager.addbook(new book(4, "The Hobbit", "J.R.R. Tolkien", "Fantasy", false));
        manager.addbook(new book(5, "Fahrenheit 451", "Ray Bradbury", "Dystopian", true));
        manager.addbook(new book(6, "Pride and Prejudice", "Jane Austen", "Romance", false));
        manager.addbook(new book(7, "The Catcher in the Rye", "J.D. Salinger", "Fiction", true));
        manager.addbook(new book(8, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", true));
        manager.addbook(new book(9, "Animal Farm", "George Orwell", "Satire", true));
        manager.addbook(new book(10, "Brave New World", "Aldous Huxley", "Dystopian", false));


        System.out.println("The details of the registered books:");
        for(book b:manager.books){
            System.out.println(b);
        }

    }
}
