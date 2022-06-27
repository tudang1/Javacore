import java.util.ArrayList;

public class Service implements IService{
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("techmaster", "techmaster", "tu@techmaster.com"));
        return list;
    }


    public void updateUserName(User user, String newUserName) {

    }

    public void updatePassword(User user, String newPassword) {
    }

    public void updateEmail(User user, String Email) {
    }

    public void addNewStudent(ArrayList<User> list, User user) {
    }
}

