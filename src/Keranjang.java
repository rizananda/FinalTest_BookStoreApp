class Keranjang {
    private String bookCode, bookName, author;
    private int qtyBook,  bookPrice, totalItem;

    public Keranjang(String bookCode, String bookName, String author, int bookPrice, int qtyBook, int totalItem) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.bookPrice = bookPrice;
        this.qtyBook = qtyBook;
        this.totalItem = totalItem;
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


    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }
}
