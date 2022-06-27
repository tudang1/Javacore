import java.util.Scanner;

public class StringArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        //chống bị chôi hàm
        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];

        for(int i = 0; i < n ; i++){
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = sc.nextLine();
        }

        System.out.println("Phần tử trong mảng: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            // contains tìm chuỗi trong chuỗi
            if(arr[i].contains("Java")){
                count++;
            }
        }

        System.out.println("Số lần java xuất hiện: " + count);

        System.out.println("Nhập chuỗi bất kỳ: ");
        String s = sc.nextLine();

        for(int i = 0; i < n; i++){
            if(arr[i].equals(s)){
                System.out.println("Vị trí chuỗi " + s + " xuất hiện là: " + i);
            }
        }
    }
}
