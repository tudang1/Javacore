import java.util.ArrayList;

public class Service implements IService{
    public ArrayList<Student> getAllStudent (){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Tư",18,"Thái Bình",7,101));
        list.add(new Student(2,"Đặng",20,"Thái Nguyên",5,102));
        list.add(new Student(3,"Hồng",16,"Bình Dương",6,102));
        list.add(new Student(4,"Ly",22,"Thái Bình",9,101));
        list.add(new Student(5,"Hương",28,"Hải Dương",1,103));
        return list;
    }

    @Override
    public void addNewStudent(ArrayList<Student>list, Student student) {
        list.add(student);
    }

    @Override
    public void updateStudentPoint(Student student, double newPoint) {
        student.setPoint(newPoint);
    }

    @Override
    public void deleteStudent(ArrayList<Student>list,Student student) {
    list.remove(student);
    }
}
