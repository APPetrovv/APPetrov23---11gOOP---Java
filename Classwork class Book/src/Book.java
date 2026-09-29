class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void ShowInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    public static void main(String[] args) {
            Book book1 = new Book("Iron Lantern", "Dimitar Talev", 164);
            Book book2 = new Book("Stoicism", "Somebody", 235);
            Book book3 = new Book("How to Manipulate people", "Somebody else", 300);
            book1.ShowInfo();
            book2.ShowInfo();
            book3.ShowInfo();
        }
    }