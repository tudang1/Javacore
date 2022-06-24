import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Nhập Cân Nặng: ");
        double weight = input();
        System.out.println("Nhập Chiều Cao: ");
        double height = input();

    }
    public static double bmiCalculator(double weight, double height){
        return weight/(height*height);
    }
    public static double input(){
        //xảy ra th sai dữ liệu
        //dữ liệu nhập vào nhỏ hơn hoặc bằng 0
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            try {
                double num = Double.parseDouble(sc.nextLine());
                if (num<=0) throw new CustomExeption("Dữ liệu lớn hơn 0");
                flag = false;
            }catch (CustomExeption e){
                System.out.println(e.getMessage()+ " nhập lại");
            }catch (NumberFormatException e){
                System.out.println("nhập sai kiểu dữ liệu, nhập lại: ");
            }
        }
        return  0;
    }
}
