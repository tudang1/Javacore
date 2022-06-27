import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //câu 1

        System.out.println("Nhập Họ và Tên: ");
        Scanner sc = new Scanner(System.in);
        String Array = sc.nextLine();
        //tách chuỗi dùng split() cắt khi " "; space
        //tạo 1 mảng Trung gian temp để nhận cách xâu bị cắt
        String[] temp= Array.split("\\s+");
        Array="";
        for(int i=0;i<temp.length;i++) {
            Array+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1) // nếu tempt[i] không phải từ cuối cùng
                Array+=" ";   // cộng thêm một khoảng trắng
        }
        System.out.println("tên chuẩn hóa: " + Array);

        //câu 2

        System.out.println("Nhập kích thước mảng: ");
        //chống bị chôi hàm
        int n = Integer.parseInt(sc.nextLine());
        int [] Array2 = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            Array2[i] = sc.nextInt();
        }
        System.out.println("Phần tử trong mảng: ");
        //xuất mảng nhanh
        System.out.println(Arrays.toString(Array2));

        System.out.println("mảng chuyển hóa: ");
        for(int i= 0; i < n; i++){
            if(Array2[i] % 2 ==0){
                Array2[i]++;
            }
        }
        System.out.println(Arrays.toString(Array2));

    }
}
