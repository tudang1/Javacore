import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    ArrayList<User> listUser;
    Scanner sc;

    public Controller() {
        this.listUser = this.service.getAllUser();
        this.sc = new Scanner(System.in);
        sc = new Scanner(System.in);
    }
    public void main(){
        boolean flag = true;
        while (flag){
            Scanner sc= new Scanner(System.in);
            System.out.println("---TECHMASTER---");
            System.out.println("1 - Đăng Nhập");
            System.out.println("2 - Đăng Ký");
            System.out.println("lựa chọn của bạn: ");
            int chosse = Integer.parseInt(sc.nextLine());
            switch (chosse) {
                case 1:
                    checkLogin();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Thao tác không hợp lệ. Xin chọn lại: ");
            }
        }
    }
    public void submain(){
        while (true){
            Util.submenu1();
            System.out.println("Lựa chọn của bạn là: ");
            int chosse1 = Integer.parseInt(sc.nextLine());

            switch (chosse1){
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chon này, Xin chọn lại: ");
            }
        }
    }
    public User findUser(){
        System.out.println("Xác nhận User: ");
        String find = sc.nextLine();
        for (User s:listUser){

        }
        return null;
    }
    String username = " ";
    String password = " ";
    public User checkLogin(){
        while (true){
            System.out.println("Nhập Username: ");
            username = sc.nextLine();
            for (User s: listUser){
                if (s.getUsername().equals(username)){
                    System.out.println("Nhập Password: ");
                    password = sc.nextLine();
                    if (s.getPassword().equals(password)){
                        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
                        submain();
                    }else {
                        System.out.println("Sai Password");
                        Util.submenu2();
                        break;
                    }
                }else {
                    System.out.println("Kiểm tra lại username");
                    return s;
                }
            }return null;
        }
    }

    public void updateUserName(){
        User fUser = findUser();
        if (fUser != null){
            System.out.println(fUser);
        }else {
            System.out.println("k tìm thấy");
        }

        System.out.println("Nhập New UserName: ");
        String newUserName = sc.nextLine();

        service.updateUserName(fUser,newUserName);
        System.out.println("thông tin sau khi cập nhật : ");
        System.out.println(fUser);
    }

}
