package problemstatements.librarymanagementsystem;

// Subclass Book implements Reservable
class Book extends LibraryItem implements Reservable {
    private boolean available;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;  // Initially, the book is available
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Books are loaned for 14 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("The book '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("The book '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
