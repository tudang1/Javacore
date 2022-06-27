import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //tạo đối tượng
        BMI bmiCalcu = new BMI();
        double bmi = bmiCalcu.bmiCalculator();
        System.out.println("chỉ số: " + bmi);

        //k cần tạo đối tượng để sd phương thức Static
        double bmiResult = bmiCalculatorUsingStatic();
        System.out.println("chỉ số " + bmiResult);

        //pt chỉ dùng tham số

    }
    //phạm vi truy cập
    public double bmiCalculator(){
        //bắt buộc có return để trả dữ liệu về
        Scanner sc = new Scanner(System.in);
        System.out.println("chiều cao");
        double height = sc.nextDouble();

        System.out.println("cân nặng: ");
        double weight = sc.nextDouble();


        double bmi = weight/(height*height);
        return bmi;

    }
    public static double bmiCalculatorUsingStatic(){
        //bắt buộc có return để trả dữ liệu về
        Scanner sc = new Scanner(System.in);
        System.out.println("chiều cao");
        double height = sc.nextDouble();

        System.out.println("cân nặng: ");
        double weight = sc.nextDouble();


        double bmi = weight/(height*height);
        return bmi;

    }
}
