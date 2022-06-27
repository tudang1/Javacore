import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("tư");
        //sử dụng từ khóa new
        String address = new String("Hà thành");
        System.out.println("tôi đến từ :" + address);

        System.out.println("độ dài:" + address.length());
        System.out.println(address.toUpperCase());

        //so sánh chuỗi
        String name1 = "thái";
        String name = "lập";
        System.out.println("name.equalsIgnoreCase(name1)=");
//tìm ký tự theo dự liệu truyền vào
        System.out.println(name.charAt(1));
        // dựa vào ký tự trả về số
        System.out.println(name.indexOf("l"));
        //loại bỏ khoảng trắng
        String gender="  male  ";
        System.out.println(gender);
        System.out.println(gender.trim());
//GỌI ký tự theo số tt
        String myaddress = "mỹ tho";
        System.out.println(myaddress.substring(3));
        System.out.println(myaddress.substring(3,5));

        String myname= " Thành";
        //cách1
        String uppercase = myname.toUpperCase();
        String result=uppercase.charAt(0) + myname.substring(1);
        System.out.println(result);
        //cách 2 ép kiểu
        String uppercaseT = String.valueOf(myname.charAt(0)).toUpperCase();
        String rs = uppercaseT + myname.substring(1);
        System.out.println(rs);

        //lấy giờ ngày hiện tại
        LocalDate toDay = LocalDate.now();
        System.out.println("ngày:" + toDay);

LocalDate date = LocalDate.of(2020,12,20);
        System.out.println(date);
//khi lấy dữ liệu thì dùng "get"
        System.out.println(toDay.getDayOfMonth());

        LocalTime now = LocalTime.now();
        System.out.println("bây giờ là :" + now);
        LocalTime hour = LocalTime.of(20,20,10);
        System.out.println(hour);

    }
}
