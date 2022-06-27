import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //nhập dữ liệu vào
//        Scanner sc =new Scanner(System.in);
//        System.out.println("nhập Chiều cao:");
//        double height = sc.nextDouble();
//
//        System.out.println("Nhập Cân Nặng:");
//        double  weight = sc.nextDouble();
//
//        double bmi = weight/(height*height);
//        System.out.println("chỉ số bmi:" + bmi  );
//        System.out.printf("chỉ số %f,", bmi);

        //tính chu vi
        Scanner item = new Scanner(System.in);
        System.out.println("nhập Chiều dài");
        float height = item.nextFloat();
        System.out.println("nhập chiều rộng");
        float width = item.nextFloat();
        float cv = (height+width)*2;
        float dt = height*width;
        System.out.println("chu vi " + cv);
        System.out.println("diện tích " +  dt );
    }
}
