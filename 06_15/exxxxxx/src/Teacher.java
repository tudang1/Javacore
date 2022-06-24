public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
