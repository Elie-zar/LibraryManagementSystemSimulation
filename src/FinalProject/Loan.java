package FinalProject;

public class Loan {

    // ===== MEMBER 6: Loan class and borrowing =====
    private int bookId;
    private int memberId;
    private boolean returned;

    public Loan(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.returned = false;
    }

    public int getBookId() { return bookId; }
    public int getMemberId() { return memberId; }
    public boolean isReturned() { return returned; }
    public void setReturned(boolean returned) { this.returned = returned; }

    static void borrowBook() {
        // TODO: ask for book ID and member ID, check that the book exists
        // and is available, then add a new Loan to LibraryManagementSystem.loans
        // and mark the book as not available
    }

    // ===== MEMBER 7: Returning and fines =====
    static void returnBook() {
        // TODO: ask for book ID, find the matching active loan,
        // mark it returned, and make the book available again
    }

    static void calculateFine() {
        // TODO: calculate and print a fine for late returns
        // (you can decide the rule, for example 5 per day late)
    }
}