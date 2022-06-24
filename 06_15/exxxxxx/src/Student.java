public class Student extends Person{
    private double theoreticalPoint;
    private double practicelPoint;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double theoreticalPoint, double practicelPoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicelPoint = practicelPoint;
    }

    public double getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(double theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public double getPracticelPoint() {
        return practicelPoint;
    }

    public void setPracticelPoint(double practicelPoint) {
        this.practicelPoint = practicelPoint;
    }
}
