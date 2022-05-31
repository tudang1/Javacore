import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("sdsa");
        System.out.println(12);
        System.out.println(20-10);
        
        int age;//khai báo biến age thuộc tính int
        age = 26;
        
        long salary = 20000L;

        System.out.println(" lương của t: " + salary);

        float   height = 1.5f;//phải có f cuối cùng dành cho float
        double weight = 40;

        double bmi = weight/(height*height)                     ;
        System.out.println("chỉ số bmi:"+ bmi);
        char ch = '6';
        System.out.println(ch);

        int a=1;
        int b=2;
        int c=3;

        System.out.println((a +b ) > c ? "đúng": "sai");
        //chia lấy phần dư là %, còn lấy phần nguyên là /
        System.out.println(a % 2 == 0 ? a + "so chan": a + " so le");

        //ex
        float toan=5f;
        float van =6.5f;
        System.out.println(((toan + van)/2) > 5 ? "dat":"truot");

        System.out.println(Math.PI);

        System.out.println(Math.max(5,7));
        //tạo đối tượng
        //<tên lớp > <tên biến tham chiếu>= new<tên class>();
        Random rd = new Random();
         int rdNumber = rd.nextInt(100);
        System.out.println("số Ngẫu Nhiên" + rdNumber);
    }

}