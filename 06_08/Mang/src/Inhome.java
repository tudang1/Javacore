import java.util.Arrays;
import java.util.Scanner;

public class Inhome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước: ");
        //chống trôi lệnh
        int n = Integer.parseInt(sc.nextLine());

        String [] Array = new String[n];
        for (int i = 0; i < n ; i++){
            System.out.printf("Nhập phần tử [%d]: ", i);
            Array[i] = sc.nextLine();
        }
        System.out.println("các phần tử : ");
        System.out.println(Arrays.toString(Array));
//        for (int i = 0; i < n; i++){
//            System.out.printf("");
//        }
        int cont = 0;
        for(int i = 0; i < n ; i++){
            // contains tìm chuỗi trong chuỗi
            if(Array[i].equals("java")){
                cont++;
            }
        }
        System.out.println( "số lần java xuất hiện: "+ cont);

        System.out.println(" nhập từ khóa: ");
        String key = sc.nextLine();
        for (int i= 0; i< n; i ++){
            //equals là so sánh 2 chuỗi
            if(Array[i].equals(key)){
                System.out.println("vị trí key " + key + " xuất hiện "+ i);
            }
        }
    }
}
