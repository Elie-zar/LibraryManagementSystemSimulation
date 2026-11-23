package FinalProject;

public class Book {

    // ===== MEMBER 2: Book class =====
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return id + " | " + title + " by " + author + (available ? " (available)" : " (borrowed)");
    }

    // ===== MEMBER 3: Add and view books =====
    static void addBook() {
        // TODO: ask for title and author, create a new Book,
        // and add it to LibraryManagementSystem.books
        // Hint: new id = LibraryManagementSystem.books.size() + 1
    }

    static void viewBooks() {
        // TODO: loop through LibraryManagementSystem.books and print each one
    }

    // ===== MEMBER 4: Search books =====
    static void searchBooks() {
        // TODO: ask for a title or author keyword,
        // then print books whose title or author contains it
    }
}
