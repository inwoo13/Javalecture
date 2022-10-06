package sixweek;
import java.util.*;

class Book{
    private String title;
    private byte rating;

    public Book(String title, byte rating){
        this.title = title;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    };

    public byte getRating(){
        return rating;
    }

    public static Book createNewBook(Scanner sc){
        String title;
        byte rating;

        System.out.print("����: ");
        title = sc.next();
        System.out.print("����: ");
        rating = sc.nextByte();

        return new Book(title, rating);
    }

    public static Book[] addBook2Array(Book[] origin_arr, Book new_book){
        Book[] rtn = new Book[origin_arr.length + 1];

        for(int i = 0; i < origin_arr.length; i++){
            rtn[i] = origin_arr[i];
        }

        rtn[origin_arr.length] = new_book;

        return rtn;
    }

    private static Book searchBookByIdx(Book[] books, int idx){
        if(idx < 0 || idx >= books.length){
            return null;
        }
        else{
            return books[idx];
        }
    }

    public static void dispBookInfo(Scanner sc, Book[] books){
        int idx;
        Book book;

        System.out.print("å ��ȣ �Է�: ");
        idx = sc.nextInt() - 1;
        book = Book.searchBookByIdx(books, idx);

        if(book == null){
            System.out.println("# " + (idx + 1) + "�� å�� �������� �ʽ��ϴ�.");
            return;
        }

        System.out.println("===== å ���� =====\n����: " + book.getTitle() + "\n����: " + book.getRating());
    }

    public static void dispAllBooks(Book[] books){
        if(books.length == 0){
            System.out.println("��ϵ� å�� �����ϴ�.");
            return;
        }

        for(int i = 0; i < books.length; i++){
            System.out.println("# " + (i + 1) + "�� ����\n����: " + books[i].title);
        }
    }
}

public class hw_2 {
    private static final byte REGIST_BOOK = 1;
    private static final byte SEARCH_BOOK = 2;
    private static final byte DISP_ALL_BOOKS = 3;
    private static final byte EXIT = 4;

    public static void main(String[] args){
        int selector;
        Book book;
        Book[] books = new Book[0];
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("==========================");
            System.out.println("1. å ���");
            System.out.println("2. å �˻�");
            System.out.println("3. ��� å ���");
            System.out.println("4. ����");
            System.out.println("==========================");
            System.out.print("����: ");
            selector = sc.nextByte();

            switch(selector){
                case REGIST_BOOK:
                    book = Book.createNewBook(sc);
                    books = Book.addBook2Array(books, book);
                    break;
                case SEARCH_BOOK:
                    Book.dispBookInfo(sc, books);
                    break;
                case DISP_ALL_BOOKS:
                    Book.dispAllBooks(books);
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("�߸��� �Է��Դϴ�.");
            }
        }while(selector != EXIT);

        sc.close();
    }
}
