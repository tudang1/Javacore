import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //nhập dữ liệu Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Tháng: ");
        int month = sc.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("có 31 ngày");
                break;
            case 2 :
                System.out.println("có 29 ngày");
                break;
            case 4,6,9,11 :
                System.out.println("có 30 ngày");
                break;
            default:
                System.out.println("lỗi");
        }
        System.out.println("Lựa chọn bạn là: ");
        System.out.println("1 - Xem tất cả sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xem giỏ hàng");
        System.out.println("0 - Thoát chương trình");
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("Danh sách sản phẩm");
                System.out.println("abc ... xyz");
                break;
            case 2:
                System.out.println("Nhập tên sản phẩm");
                break;
            case 3:
                System.out.println("Giỏ hàng của bạn");
                break;
                //thoát khỏi chương trình, dừng out hết
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }
}
