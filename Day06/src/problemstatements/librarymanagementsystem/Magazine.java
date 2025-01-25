package problemstatements.librarymanagementsystem;

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean available;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;  // Initially, the magazine is available
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazines are loaned for 7 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("The magazine '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("The magazine '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}