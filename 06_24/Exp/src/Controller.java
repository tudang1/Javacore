import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<User> listUser;
    Scanner sc;
    public Controller() {
        service = new Service();
        listUser = service.getAllUser();
        sc = new Scanner(System.in);
    }
    public void main(){
        while (true){
            System.out.println("----TECHMASTER----");
            Util.menu();

            int chosse = Integer.parseInt(sc.nextLine());

            switch (chosse){
                case 1:
                    login();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Thao tác không hợp lệ. Xin chọn lại: ");
            }
        }
    }
    public User login(){
        System.out.println("nhập tên Username: ");
        String username = sc.nextLine();

        for (User s: listUser){
            if (s.getUsername() != username){
                System.out.println("Kiểm tra lại username.");
                return null;
            }else {
                System.out.println("nhập tên Password: ");
                String password = sc.nextLine();
                if (s.getPassword() != password){
                    System.out.println("Mật Khẩu Sai.");
                    Util.submanu2();
                }else {
                    Util.submenu1();
                }

            }
        }
        return null;
    }
}
