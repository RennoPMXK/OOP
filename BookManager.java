package doan;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static ArrayList<Book> listofBook = new ArrayList<>() ;
    public static ArrayList<Book> listofBookByCategory = new ArrayList<Book>();

    public BookManager() {
    }

    public static ArrayList<Book> getListofBook() {
        return listofBook;
    }

    public static void setListofBook(ArrayList<Book> listofBook) {
        BookManager.listofBook = listofBook;
    }

    public static ArrayList<Book> getListofBookByCategory() {
        return listofBookByCategory;
    }

    public static void setListofBookByCategory(ArrayList<Book> listofBookByCategory) {
        BookManager.listofBookByCategory = listofBookByCategory;
    }

    public void searchBook() {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String checkString = scanner.nextLine();
        while (!listofBook.get(index).getBookName().contains(checkString) && index < listofBook.size()) {
            System.out.println(listofBook.get(index).getBookName());
            index++;
            if (index == listofBook.size()) {
                System.out.println("Khong tim thay");
            }
        }
//        for(int i=0;i<listofBook.size();i++){
//            if(listofBook.get(i).getBookName().contains(checkString));
//                System.out.println(listofBook.get(i).getBookName());//
//        }

    }

    public void searchBookByCategory() {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String checkString = scanner.nextLine();
        ArrayList<Category> arrListOfCategory = new ArrayList<Category>();
        arrListOfCategory.add(new Category("01","Van hoa"));
        arrListOfCategory.add(new Category("02","Kinh te"));
        arrListOfCategory.add(new Category("03","Thieu nhi"));
        arrListOfCategory.add(new Category("04","Lich su"));
        arrListOfCategory.add(new Category("05","Giao khoa"));
        arrListOfCategory.add(new Category("06","Ngoai ngu"));
        arrListOfCategory.add(new Category("07","Tam ly"));
        for (int i = 0; i < arrListOfCategory.size(); i++)
            System.out.print(arrListOfCategory.get(i)+", ");
        while (!checkString.equalsIgnoreCase(arrListOfCategory.get(index).getCategory()) && index < arrListOfCategory.size()) {
            index++;
            if (index == arrListOfCategory.size()) {
                System.out.println("Nhap sai, nhap lai: ");
                checkString = scanner.nextLine();
                index = 0;
            }
        }
        int i= 0;
        while (!listofBook.get(i).getBookName().contains(checkString) && i < listofBook.size()) {
            System.out.println(listofBook.get(i).getBookName());
            i++;
            if (i == listofBook.size()) {
                System.out.println("Khong tim thay");
            }
        }

    }


    public void addBook() {
        listofBook.add(new Book());
    }

    public void changeBook(Book book) {
        int index = 0;
//        listofBook.set(index,listofBook.get(book));
    }


    public void removeBook(Book book){
        listofBook.remove(book);
    }


    public void showBook(){

    }
}
