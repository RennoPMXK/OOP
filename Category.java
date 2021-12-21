package doan;

import bookstoresimple.TheBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Category {
    private String categoryId;
    private String category;
//    private String[] arrOfCategoryId={"VH","KT","TN","LS","GK","NN","TL"};
//    private String[] listOfCategory ={"Van hoc", "Kinh te", "Thieu nhi", "Lich su", "Giao khoa", "Ngoai ngu", "Tam ly "};
//    private Category[] arrOfCategory={};
//    Category.add(10,20);

    public Category() {
    }

    public Category(String categoryId, String category) {
        this.categoryId = categoryId;
        this.category = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }





    public void setCategoryInfo() {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Nhap the loai: ");
            int index = 0;
            String checkString = scanner.nextLine();
            while (!checkString.equalsIgnoreCase(arrListOfCategory.get(index).getCategory()) && index < arrListOfCategory.size()) {
                index++;
                if (index == arrListOfCategory.size()) {
                    System.out.println("Nhap sai, nhap lai: ");
                    checkString = scanner.nextLine();
                    index = 0;
                }
            }
            this.category = checkString;

        }


    public String toString() {
        return category;
    }
}
