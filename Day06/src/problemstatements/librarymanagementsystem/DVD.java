package problemstatements.librarymanagementsystem;

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean available;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;  // Initially, the DVD is available
    }

    @Override
    public int getLoanDuration() {
        return 5;  // DVDs are loaned for 5 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("The DVD '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("The DVD '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}