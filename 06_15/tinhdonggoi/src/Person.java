public class Person {
    private String name;
    private int age;
    private String adrres;

    public Person() {
    }

    public Person(String name, int age, String adrres) {
        this.name = name;
        this.age = age;
        this.adrres = adrres;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdrres() {
        return adrres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }
}
