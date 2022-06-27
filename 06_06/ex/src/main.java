import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //khai biến 1 số bất kỳ , chạy tới 100
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);
        System.out.println(rdNumber);
        boolean flag = true;

        //tạo vòng lặp while
//        while (flag){
//            System.out.println("đoán số: ");
//            int number = sc.nextInt();
//
//            //điều kiện
//            if(number > rdNumber){
//                System.out.println("lớn r");
//                System.out.println("thử lại");
//            }else if(number < rdNumber){
//                System.out.println("nhỏ r");
//                System.out.println("thử lại");
//            }else {
//                System.out.println("katsu");
//                flag = false;
//            }
//        }

        //do while
//        int age = -1;
//        do {
//            System.out.println("nhập Tuổi: ");
//            age = sc.nextInt();
//            // khi điều kiện sai flase thì câu lệnh sẽ thực thi ít nhất 1 lần
//            // thế nên trong TH này sẽ để đk sai flase age < 0
//        }while(age < 0);
//            System.out.println("tuổi bạn là :" + age);
            //sai
            System.out.println("nhập a : ");
            double a = sc.nextDouble();
            System.out.println("nhập b : ");
            double b = sc.nextDouble();
            System.out.println("nhập c : ");
           double c = sc.nextDouble();

            //sai
           while (a != 0) {
               double delta = b * b - 4 * a * c;
               System.out.println("delta = " + delta);

               if (delta < 0) {
                   System.out.println("vô");
                   break;

               } else if (delta > 0) {
                   double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                   double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                   System.out.println(" có x1 =" + x1);
                   System.out.println("x2 = " + x2);
                   break;
               } else {
                   double x = -b / 2 * a;
                   System.out.println(x);
                   break;
               }

           }
    }
}
