import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Student> listStudent;
    // nghĩa là:
//    ArrayList<Student> listStudent = service.getAllStudent();
    Scanner sc;
//tao contructer trống để làm việc
    public Controller() {
        service = new Service();
        listStudent = service.getAllStudent();
        sc = new Scanner(System.in);
    }
    public void main(){
        while (true){
            Util.menu();
            System.out.println("chọn đi: ");
            //chống trôi lệnh
            int chosse = Integer.parseInt(sc.nextLine());

            switch (chosse){
                case 1:
                    show();
                    break;
                case 2:
                    Student newStudent = createNewStudent();
                    service.addNewStudent(listStudent, newStudent);
                    break;
                case 3:
                    updetaStudentPoint();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    findStudentByCR();
                    break;
                case 6:
                    sortByName();
                    break;
                case 7:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("đéo có, chọn lại: ");
            }
        }
    }

    public void show(){
        for(Student s : listStudent){
            System.out.println(s);
        }
    }
    //tạo phương thức nhập dự trên phần tử khai báo createNewStudent bên dưới
    public Student createNewStudent(){
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập Tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Địa Chỉ: ");
        String address = sc.nextLine();
        System.out.println(" Nhập Điển: ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("NHập phòng: ");
        int classroom = Integer.parseInt(sc.nextLine());

        Student newStudent = new Student(id, name,age,address,point,classroom);
        return newStudent;
    }
    //tìm học sinh theo id
    public Student findStudentById(){
        System.out.println("nhập tên id: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student s: listStudent){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }
    public void updetaStudentPoint(){
        Student fStudent = findStudentById();
        if (fStudent != null){
            System.out.println(fStudent);
        }else {
            System.out.println("k tìm thấy");
        }
        System.out.println("nhập điểm mới: ");
        double newPoint = Double.parseDouble(sc.nextLine());
        //đưa thông tin học sinh,, newpoint
        service.updateStudentPoint(fStudent,newPoint);
        System.out.println("thông tin sau khi cập nhật : ");
        System.out.println(fStudent);
    }

    public void deleteStudent(){
        Student fStudent = findStudentById();
        if (fStudent != null){
            System.out.println(fStudent);
            //nhập công việc
            //trong () nhập mảng và phần tử muốn đưa vào
            service.deleteStudent(listStudent,fStudent);
        }else {
            System.out.println("k tìm thấy");
        }

    }
    //xem học sinh theo lớp
    public Student findStudentByCR(){
        System.out.println("nhập số phòng: ");
        int cr = Integer.parseInt(sc.nextLine());
        for (Student s: listStudent){
            if (s.getClassroom() == cr ){
                System.out.println(s);
            }
        }
        return null;
    }
    //sắp xếp theo tên
    public Student sortByName(){
        listStudent.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //lệnh sắp xếp theo tên
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên: ");
        for (Student f : listStudent){
            System.out.println(f);
        }
        return null;
    }
    //sắp xếp theo điểm
//    public Student sortByPoint(){
//        listStudent.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return null;
//            }
//        });
//        return null;
//    }
}
