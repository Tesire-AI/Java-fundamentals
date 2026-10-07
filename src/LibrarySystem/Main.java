package LibrarySystem;

public class Main {

    public static void main(String[] args) {
      
        Book book1 = new Book("Effective Java", "12345", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "67890", "Robert C. Martin");

        Member student = new StudentMembers("Alice", "STU001");
        Member publisher = new PublisherMember("Bob", "PUB001");
        Member librarian = new LibrarianMember("Clara", "LIB001");

        System.out.println(student.toString());
        System.out.println("Fees: " + student.CalculateFees());

        System.out.println(publisher.toString());
        System.out.println("Fees: " + publisher.CalculateFees());

        System.out.println(librarian.toString());
        System.out.println("Fees: " + librarian.CalculateFees());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}

    

