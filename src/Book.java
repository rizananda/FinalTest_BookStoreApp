class Book {
    private String bookCode, bookName, author;
    private int qtyBook, bookPrice;

    public Book(String bookCode, String bookName, String author, int bookPrice, int qtyBook) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.bookPrice = bookPrice;
        this.qtyBook = qtyBook;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getQtyBook() {
        return qtyBook;
    }

    public void setQtyBook(int qtyBook) {
        this.qtyBook = qtyBook;
    }
}
