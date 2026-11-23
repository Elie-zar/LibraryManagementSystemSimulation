package FinalProject;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManagementSimulationSystem {

    public class LibraryManagementSystem {

        // ===== LEADER: Shared data (used by all files) =====
        static ArrayList<Book> books = new ArrayList<>();
        static ArrayList<Member> members = new ArrayList<>();
        static ArrayList<Loan> loans = new ArrayList<>();
        static Scanner input = new Scanner(System.in);

        // ===== LEADER: Main menu =====
        public static void main(String[] args) {
            boolean running = true;

            while (running) {
                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. Add book");
                System.out.println("2. View all books");
                System.out.println("3. Search books");
                System.out.println("4. Register member");
                System.out.println("5. View members");
                System.out.println("6. Borrow book");
                System.out.println("7. Return book");
                System.out.println("8. Reports");
                System.out.println("0. Exit");
                System.out.print("Choose: ");

                int choice = input.nextInt();
                input.nextLine(); // clear the leftover newline

                switch (choice) {
                    case 1: Book.addBook(); break;
                    case 2: Book.viewBooks(); break;
                    case 3: Book.searchBooks(); break;
                    case 4: Member.registerMember(); break;
                    case 5: Member.viewMembers(); break;
                    case 6: Loan.borrowBook(); break;
                    case 7: Loan.returnBook(); break;
                    case 8: showReports(); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid choice.");
                }
            }
            System.out.println("Goodbye!");
        }

        // ===== MEMBER 1: Reports =====
        static void showReports() {
            // TODO: for example, show the number of books, borrowed books, and overdue loans
        }
    }
}
