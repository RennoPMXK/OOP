package doan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args){
//    Book book1 = new Book("01","OPP 1001",new Category("01","Tinh cam"),1,
//            new Author[]{new Author("Minh","abc@xyz.com")},"Tuoi tre","Mot ngay that tuoi dep",
//            10000,169);
//    book1.display();
//    EBook book2 = new EBook("01","OPP 1001",new Category("01","Tinh cam"),1,
//            new Author[]{new Author("Minh","abc@xyz.com")},"Tuoi tre","Mot ngay that tuoi dep",
//            10000,169,false,10);
//    book2.display();
        PageBook book3 = new PageBook();
        book3.setInfo();
        book3.display();
//
        Book book4 = new Book("01","OPP 1001",new Category("01","Tinh cam"),1,
            new Author[]{new Author("Minh","abc@xyz.com")},"Tuoi tre","Mot ngay that tuoi dep",
            10000,169,true,true,true);
    }
}
