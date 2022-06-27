import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 12;
        if (x % 2 == 0) {
            System.out.println(x + "số chắn");
        }
        else {
            System.out.println(x + "số lẻ");
        }

//        int a =5;
//        int b = 6;
//        int c = 10;
//
//        if (a<b){
//            if (a<c){
//                System.out.println(a + "là số nn");
//            }
//            else {
//                System.out.println(c + " là số nn");
//            }
//        }

        double bmi = 17.7;
        if (bmi < 18){
            System.out.println("gầy");
        } else if (bmi >= 18 && bmi <= 22) {
            System.out.println("cân đối");
        }else {
            System.out.println("mập");
        }
        //cho 3 cạnh nhập từ bàn phím . kiểm tra xem 3 cạnh có hợp thành tam giác k? ĐK tổng 2 cạnh > cạnh còn lại.
        // khởi tạo scannerx
        Scanner sc = new Scanner(System.in);
        System.out.println("số của bạn: ");
        double a = sc.nextDouble();
        System.out.println("số của bạn: ");
        double b = sc.nextDouble();
        System.out.println("số của bạn: ");
        double c = sc.nextDouble();

        if ( a + b > c && a + c > b && b +c > a){
            System.out.println("phù hợp");
        }else {
            System.out.println("k phù hợp");
        }

    }

}
