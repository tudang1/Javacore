import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Person p1 = new Person();
//        p1.name = "tu";
//        p1.age = 27;
//        p1.adrres = " thai bình";
//
//        System.out.println(p1.name + " - " + p1.age + " - " + p1.adrres);

        p1.setName("tuan");
        p1.setAge(30);
        p1.setAdrres("hải dương");
        System.out.println(p1.getName()+ " - " + p1.getAge() + " - " + p1.getAdrres());
        //getter dùng để cập nhập và gán giá trị đều đc
        Person p2 = new Person("ly",22,"hải dương");
        p2.setAdrres("thái Bình");
        System.out.println(p2.getName()+ " - " + p2.getAge() + " - " + p2.getAdrres());

        System.out.println("---------------------------");
        //khởi tạo biến
        UserControl service = new UserControl();
        Scanner sc = new Scanner(System.in);
        User[] arrUsers = service.getAllUser();
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("nhập pass");
        String password = sc.nextLine();
        //khởi tạo tìm kiếm với dạng boolean
        boolean checkLogin = service.checkLogin(email, password, arrUsers);
        //cách 1
        if(checkLogin){
            System.out.println("nhập thành công");
        }else {
            System.out.println("thất bại");
        }
        //cách 2
        User usersLogin = service.checkLoginReturnUser(email, password, arrUsers);
        if(usersLogin != null){
            System.out.println("Đăng nhập thành công");
            System.out.println("Xin chào " + usersLogin.getUserName() );
        }else {
            System.out.println("Đăng nhập thất bại");
        }

    }
}
