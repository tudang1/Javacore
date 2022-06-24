import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //chia ra từng lớp để dễ quản lý và xử lý
        PersonService service = new PersonService();
        ArrayList<Person> list = service.getAllPerson();
        service.show(list);

        System.out.println("lớn hơn 18 là: ");
        service.ByAge(list);



//        ArrayList<Person> PersonList = new ArrayList<>();
//        PersonList.add(new Person("Tư", 20, "Thái Bình"));
//        PersonList.add(new Person("Hồng", 26, "HD"));
//        PersonList.add(new Person("Ly", 22, "HD"));
//        PersonList.add(new Person("Hương", 17, "Đồng Nai"));
//
//        for (Person p : PersonList){
//            System.out.println(p);
//        }
//
//        System.out.println("hơn 18 là: ");
//        for (Person p : PersonList){
//            if(p.getAge() >= 18){
//                System.out.println(p);
//            }
//        }
//
//        for (int i = 0; i < PersonList.size();i++){
//            if(PersonList.get(i).getName().equals("Ly")){
//                PersonList.get(i).setAddress("Thái Bình");
//            }
//        }
//        for (Person p : PersonList){
//            System.out.println(p);
//        }
//        System.out.println("Những người Thái Bình là: ");
//        for (Person n: PersonList){
//            if (n.getAddress().equals("Thái Bình")){
//                System.out.println(n);
//            }
//        }
    }
}
