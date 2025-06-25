class BookLibraryAccess {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibraryAccess(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookLibraryAccess {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayInfo() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title);
    }
}