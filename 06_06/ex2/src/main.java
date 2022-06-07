import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập chuỗi: ");
        String chuoi = "Hello every one";
        System.out.println(chuoi);
//        System.out.println("nhập ký tự : ");
        char kytu = 'e';

        int count = 0;
        //đk
        for(int i = 0; i < chuoi.length(); i++){
            if (chuoi.charAt(i) == kytu ){
                count++;
                System.out.println("xuất hiện tại vị trí "+ i);
            }
        }
        System.out.println("số lần " + kytu + " xuất hiện: " + count);

    }
}
