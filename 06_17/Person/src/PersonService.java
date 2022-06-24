import java.util.ArrayList;

public class PersonService {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> PersonList = new ArrayList<>();
        PersonList.add(new Person("Tư", 20, "Thái Bình"));
        PersonList.add(new Person("Hồng", 26, "HD"));
        PersonList.add(new Person("Ly", 22, "HD"));
        PersonList.add(new Person("Hương", 17, "Đồng Nai"));
        return PersonList;
    }
    public void show(ArrayList<Person> list){
        for (Person p : list){
            System.out.println(p);
        }
    }
    public void ByAge(ArrayList<Person> list){
        for (Person p : list){
            if(p.getAge() >= 18){
                System.out.println(p);
            }
        }
    }
}
