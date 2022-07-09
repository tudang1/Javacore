import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    ArrayList<Information> listAccount;
    Scanner sc;
    public Controller(){
        this.listAccount = this.service.getAllAccount();
        this.sc = new Scanner(System.in);

    }
    ArrayList<History> history ;

    public void main(){
        Information fAccount = login();
        if (fAccount != null){

            while (true){
                System.out.println("Xin chào " + fAccount.getPhoneNumber());
                Util.menu();
                System.out.println("Lựa chọn của bạn là: ");
                int chosse1 = Integer.parseInt(sc.nextLine());

                switch (chosse1){
                    case 1:
                        System.out.println("Số Dư Hiện Tại Của Bạn Là: ");
                        System.out.println(fAccount.getMoney());
                        break;
                    case 2:
                        Information subacc = findAccount();
                        boolean flag = true;
                       while (flag){
                           if (subacc != null && subacc != fAccount){
                               System.out.println("Nội Dung Chuyển Tiền: ");
                               String content = sc.nextLine();
                               System.out.println("Số tiền muốn chuyển: ");
                               double x = Double.parseDouble(sc.nextLine());
                               if (x >= 50 && fAccount.getMoney() - x >= 50 ){
                                   fAccount.setMoney(fAccount.getMoney()-x);
                                   subacc.setMoney(subacc.getMoney() + x);
                                   System.out.print("Giao Dịch Thành Công. Số dư của bạn Là:" + fAccount.getMoney());
                                   System.out.println();
                                   // khi e chèn thêm dòng này để nhận dữ liệu cho lịch sử thì khi giao dịch kết thúc nó tự kết thúc
                                   //chương trình của e. a coi giùm e nhé
                                   history.add(new History(content,subacc.getAccountNumber(),x));
                                   break;
                               }else {
                                   System.out.println("Số Tiền Không Hợp Lệ, Xin Nhập Lại: ");
                                   flag= false;
                               }
                           }else {
                               System.out.println("Không Tìm Thấy Tài Khoản Thụ Hưởng");
                               flag= false;
                           }
                       }
                       break;

                    case 3:
                        System.out.println("Lịch Sử Giao Dịch: ");
                       checkHistory();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chon này, Xin chọn lại: ");
                }
            }
        }else {
            System.out.println("k tìm thấy");
        }
    }
    public Information login(){
        while (true){
            System.out.println("Ngân Hàng VPBank Xin Chào");
            System.out.println("Xin Nhập SĐT: ");
            String PhoneNumber = sc.nextLine();
            for (Information s: listAccount){
                if (s.getPhoneNumber().equals(PhoneNumber)){
                    System.out.println("Nhập Password: ");
                    String password = sc.nextLine();
                    if (s.getPassword().equals(password)){
//                        System.out.println("Bạn có thể thực hiện các công việc sau ngay trên ứng dụng VPBank Online:");
                        return s;
                    }else {
                        System.out.println("Sai Password");
                    }
                }else {
                    System.out.println("Kiểm tra lại Phone Number");

                }
            }
        }
    }
    public Information findAccount(){
        System.out.println("Nhập tài khoản thụ hưởng: ");
        String subAcc = sc.nextLine();
        for (Information s:listAccount){
            if (s.getAccountNumber().equals(subAcc)){
                return s;
            }
        }
        return null;
    }
    public void checkHistory(){
        boolean flag = true;
        while (flag){
            if (history != null){
                for (History h : history){
                    System.out.println(h);
                }
            }else {
                System.out.println("-------");
                flag = false;
            }
        }
    }

}
