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

    public User login() {
        System.out.println("nhập tên Username: ");
        String username = sc.nextLine();
        for (User s : listUser) {
            if (s.getUsername().equals(username)) {
                System.out.println("nhập tên password: ");
                String password = sc.nextLine();
                if (s.getPassword().equals(password)) {
                    submain();
                }else {
                    System.out.println("password sai");
                    Util.submanu2();
                }
            }else {
                System.out.println("Kiểm tra lại username");
                return s;
            }

        }return null;
    }
    public void submain(){
        User loginUser = login();

        while (true){

            System.out.println("CHÀO MỪNG " + login().getUsername());
            Util.submenu1();

            int chosse = Integer.parseInt(sc.nextLine());

            switch (chosse){
                case 1:
                    updateUserName();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:

                    break;
                default:
                    System.out.println("Thao tác không hợp lệ. Xin chọn lại: ");
            }
        }
    }
    public void updateUserName(){
        User loginUser = login();
        System.out.println("Nhập New UserName: ");
        String newUserName = sc.nextLine();

        service.updateUserName(loginUser,newUserName);
        System.out.println("thông tin sau khi cập nhật : ");
        System.out.println(loginUser);
    }
    public void updatePassword(){
        User loginUser = login();
        System.out.println("Nhập New Password: ");
        String newPassword = sc.nextLine();

        service.updatePassword(loginUser,newPassword);
        System.out.println("thông tin sau khi cập nhật : ");
        System.out.println(loginUser);
    }

}

