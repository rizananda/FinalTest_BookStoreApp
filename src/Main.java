import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner inputMenu = new Scanner(System.in);
    private static List<Book> book = new ArrayList<>();
    private static List<Keranjang> keranjang = new ArrayList<>();
    private static boolean valueOfBookCode = false;
    private static int grandTotal = 0;
    private static Exception notif = new Exception();

    private static void menu(){
            System.out.println("=====================================================");
            System.out.println("Selamat Datang di Book Store");
            System.out.println("Silahkan Pilih Menu:");
            System.out.println("1. Lihat Buku yang Tersedia");
            System.out.println("2. Pesan");
            System.out.println("3. Perbaruhi Stok Buku");
            System.out.println("4. Masukkan Buku Baru");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            try {
            	int pilihMenu = inputMenu.nextInt();
                switch (pilihMenu){
                    case 1:{
                        listBook();
                    }
                    case 2:{
                        buyBook();
                    }
                    case 3:{
                        updateStok();
                    }
                    case 4:{
                        inputNewBook();
                    }
                    case 5:{
                        System.exit(5);
                    }
                    default:System.out.println("Pilihan Tidak Ada");
                        //menu();
                }
            }
            catch (Exception err) {
            	System.out.println("Ada error "+notif);
            	System.out.println("Anda akan kembali ke menu");
            	// menu();
            	return;
            }
            

    }

    private static void inputNewBook() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukan Kode Buku : ");
        String bookCode = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan Judul Buku : ");
        String bookName = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Masukan Nama Pengarang : ");
        String author = input3.nextLine();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Masukan Harga Buku : ");
        int bookPrice = input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Masukan Jumlah Buku : ");
        int qtyBook = input5.nextInt();
        
        book.add(new Book(bookCode, bookName, author, bookPrice,qtyBook ));
        menu();
    }

    private static void updateStok() {
        int newStock = 0;
        Scanner inputCode = new Scanner(System.in);
        Scanner inputQTY = new Scanner(System.in);
        System.out.print("Masukan Kode Buku : ");
        String code = inputCode.nextLine();
        for (Book data : book) {
            if (data.getBookCode().equals(code)) {
                System.out.print("Masukan Jumlah Buku : ");
                String qty = inputQTY.nextLine();
                newStock = Integer.parseInt(String.valueOf(data.getQtyBook())) + Integer.parseInt(qty);
                data.setQtyBook(newStock);
                System.out.println(data.getBookCode() + " " + data.getBookName() + " " + data.getAuthor() + " " +
                        data.getBookPrice() + " " + data.getQtyBook());
                newStock=0;
                menu();
            }
        }
    }

    private static void buyBook() {
        int totalItems = 0;
        int stock = 0;

        Scanner inputCode = new Scanner(System.in);
        Scanner inputQTY = new Scanner(System.in);
        System.out.print("Masukan Kode Buku : ");
        String code = inputCode.nextLine();
        for (Book data : book) {
            if (data.getBookCode().equals(code)) {
                System.out.print("Masukan Jumlah Buku : ");
                String qty = inputQTY.nextLine();
                totalItems = Integer.parseInt(String.valueOf(data.getBookPrice())) * Integer.parseInt(qty);
                keranjang.add(new Keranjang(data.getBookCode(),  data.getBookName() ,data.getAuthor(), data.getBookPrice(),
                        data.getQtyBook() , totalItems));
                stock = Integer.parseInt(String.valueOf(data.getQtyBook())) - Integer.parseInt(qty);
                data.setQtyBook(stock);
                grandTotal += totalItems;
                totalItems = 0;
                stock = 0;
            }
        }
        keranjang.forEach(data -> {
            System.out.println(data.getBookCode() + " " + data.getBookName() + " " + data.getAuthor() + " "
                    + data.getBookPrice() + " " + data.getQtyBook() + " " + data.getTotalItem());
        });
        System.out.println("TOTAL " + grandTotal);
        menu();
    }

    private static void listBook() {
        book.forEach(data -> {
            System.out.println(data.getBookCode() + " " + data.getBookName() + " " + data.getAuthor() + " "
                    + data.getBookPrice() + " " + data.getQtyBook());
        });
        menu();
    }

    public static void main(String[] args) {
    
    	  book.add(new Book("K001", "Akuntansi Dasar SMK/MAK Kelas X (Program Akuntansi & Keuangan)",
                  "Dwi Harti", 148000, 10));
          book.add(new Book("K002", "Sma/Ma Kl.12 Matematika Peminatan Rev.2020 Kur.2013",
                  "ANNA YUNI ASTUTI, MIYANTO, NGAPININGSIH", 20000, 10));
          book.add(new Book("K003", "Kamus Bahasa Indonesia",
                  "MANDA PUTERI, S.PD", 199000, 10));
          book.add(new Book("K004", "Puebi & Pedoman Pembentukan Istilah Terlengkap",
                  "Bright Learning Center", 59000, 10));
          book.add(new Book("K005", "Teori Dan Algoritma Graph Dengan Bahasa Java + Cd",
                  "Cipta Ramadhani, S.T.,M.Eng", 94000, 10));
          menu();
    	
//    	try{
//            book.add(new Book("K001", "Akuntansi Dasar SMK/MAK Kelas X (Program Akuntansi & Keuangan)",
//                    "Dwi Harti", 148000, 10));
//            book.add(new Book("K002", "Sma/Ma Kl.12 Matematika Peminatan Rev.2020 Kur.2013",
//                    "ANNA YUNI ASTUTI, MIYANTO, NGAPININGSIH", 20000, 10));
//            book.add(new Book("K003", "Kamus Bahasa Indonesia",
//                    "MANDA PUTERI, S.PD", 199000, 10));
//            book.add(new Book("K004", "Puebi & Pedoman Pembentukan Istilah Terlengkap",
//                    "Bright Learning Center", 59000, 10));
//            book.add(new Book("K005", "Teori Dan Algoritma Graph Dengan Bahasa Java + Cd",
//                    "Cipta Ramadhani, S.T.,M.Eng", 94000, 10));
//            menu();
//        }catch (Exception etc){
//            notif = etc;
//        } finally {
//            System.out.println("\nInputan Anda tidak sesuai format. \nAnda akan kembali ke menu");
//            menu();
//        }

    }
}
