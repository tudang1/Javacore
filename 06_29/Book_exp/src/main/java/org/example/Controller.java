package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    ArrayList<Book> list = new ArrayList<>();
    Gson gson = new Gson();

    Scanner sc = new Scanner(System.in);

    public void main() throws FileNotFoundException {
        while (true){
            Util.menu();
            System.out.println("Lựa Chọn Của Bạn Là: ");
            int chosse = sc.nextInt();

            switch (chosse){
                case 1:
                    show();
                    break;
                case 2:
                    findBookByID();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chon này, Xin chọn lại: ");
            }
        }
    }
    public void show(){
        try {
            FileReader reader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            System.out.println(type);

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn file");
        }

        for(Book p : list){
            System.out.println(p);
        }
    }
    public void findBookByID() throws FileNotFoundException {
        FileReader reader = new FileReader("book.json");
        Type type = new TypeToken<ArrayList<Book>>(){}.getType();
        list = gson.fromJson(reader, type);
        System.out.println("Nhập ID sách: ");

        
        int id = sc.nextInt();
        Object item = null;

        for(Book p : list){
            if(p.getId() == id){
                item = p;
            }
        }
        
        if(item == null){
            System.out.println("no mang");
        }else{
            System.out.println(item);
        }
        

    }
}





