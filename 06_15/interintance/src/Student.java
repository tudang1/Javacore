import com.sun.jdi.Method;

import java.time.LocalDate;

public class Student extends Person{
     // thêm extends + tên class muốn kế thừa
    private double point;

    public Student() {
    }
    //tham chiếu tới lớp cha Person
    public Student(int id, String name, LocalDate dob, String address, double point) {
        super(id, name, dob, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void myMethod(){
        super.myMethod();
        System.out.println("lớp con");
    }
}
