import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int age = getAge();
        System.out.println(age);



    }
    public static int getAge() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int age = 0;
        while (flag){
            try {
                System.out.println(" nhập tuổi");
                age = Integer.parseInt(sc.nextLine());
                //truyền vào message
                if (age < 0) throw  new CustomExeption("tuổi là số dương");

                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu");
            }catch (ArithmeticException e){
                //gọi ra message
                System.out.println(e.getMessage()+ ", vui lòng nhập lại");
            }catch (CustomExeption e){
                System.out.println(e.getMessage());

            }
        }
        System.out.println(" tuổi bạn là: " + age);
        return age;
    }
}
