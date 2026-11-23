package FinalProject;

public class Member {

    // ===== MEMBER 5: Member class and member functions =====
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " | " + name;
    }

    static void registerMember() {
        // TODO: ask for a name, create a new Member,
        // and add it to LibraryManagementSystem.members
    }

    static void viewMembers() {
        // TODO: loop through LibraryManagementSystem.members and print each one
    }
}