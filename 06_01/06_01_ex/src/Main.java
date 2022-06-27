import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //nhập số
        Scanner inp = new Scanner(System.in);
        System.out.println("số của bạn: ");
        int number = inp.nextInt();

        //Xuất randomNumber
        Random RNumber = new Random();
        int comp = RNumber.nextInt(100);
        //100 nghĩa là sẽ chạy 0-99, vì vậy muốn bắt đầu chạy từ 1 thì phải set comp
        comp += 1;
        System.out.println("số của tôi: " + comp);
        String s = number > comp ? "Chúc Mừng" : "Rất Tiếc";
        System.out.println(s);
    }
}
