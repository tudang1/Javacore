import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kt");
        //chống trôi lệnh
        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];
        for (int i =0; i < n ; i++){
            System.out.println(" nhập phần tử arr[%d]: " + i);
        }
        System.out.println(" pt trong mảng: ");
        for(int i =0; i < n ; i++){
            System.out.println(arr[i]);
        }



    }
}
