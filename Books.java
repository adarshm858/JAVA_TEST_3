package JAVA_TEST_3;

public class Books {
    String isbn;
    String title;
    boolean isAvailable;

    public Books(boolean isAvailable, String isbn, String title) {
        this.isAvailable = isAvailable;
        this.isbn = isbn;
        this.title = title;

    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
