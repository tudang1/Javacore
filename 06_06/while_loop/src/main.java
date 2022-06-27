import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
            //khi biết số vòng lặp thì nên dung for loop
            // khi k biết vòng lặp, vô tận thì nên dùng while loop
        }
//        int age =0;
//             Scanner sc = new Scanner(System.in);
//        while(age<18){
//            System.out.println("nhập Tuổi: ");
//            age = sc.nextInt();
//        }
//        //khi đủ điều kiện thì xuất kết quả
//        System.out.println("ok");


//        Random rd = new Random();


//       boolean flag =true;
//       while (flag){
//           System.out.println("đoán");
//           int number = sc.nextInt();
//
//           if (number < rdNumber){
//               System.out.println("nhỏ");
//               System.out.println("nhập lại");
//           }else if(number > rdNumber) {
//               System.out.println("lớn");
//               System.out.println("nhập lại");
//           }else {
//               System.out.println("đúng r");
//               flag = false;
//           }
//           int age = -1;
//        do{
//            System.out.println("nhập tuổi");
////            Scanner sc =  newScanner(System.in);
//            age = sc.nextInt();
//       }while (age > 0){
//            System.out.println("tuổi là: ");
//        }
        //bài tập pt b2 1 ẩn
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        int a = sc.nextInt();
        System.out.println("nhập b: ");
        int b = sc.nextInt();
        System.out.println("nhập c: ");
        int c = sc.nextInt();
        if (a == 0){
            System.out.println("nhập lại");
        }else {
            double delta = b*b - 4*a*c;
            System.out.println("delta = " + delta);
            if (delta < 0){
                System.out.println("vô nghiệm");
            }else {
                if (delta > 0){
                    double x1 = (-b + Math.sqrt(delta))/2*a;
                    double x2 = (-b - Math.sqrt(delta))/2*a;
                    System.out.println("x1 = "+ x1);
                    System.out.println("x1 = "+ x2);
                }else {
                    double x = -b /(2*a);
                    System.out.println("nghiem kep:" + x);
                }
            }
        }



    }
}
