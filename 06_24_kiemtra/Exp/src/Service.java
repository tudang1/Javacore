import java.util.ArrayList;

public class Service implements IService{
    public ArrayList<User> getAllUser (){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("techmaster","tu","tu@techmaster.com"));
        list.add(new User("admin","password","admin@techmaster.com"));
        return list;
    }

    @Override
    public void updateUserName(User user, String newUserName) {

    }

    @Override
    public void updatePassword(User user, String newPassword) {

    }

    @Override
    public void updateEmail(User user, String Email) {

    }

    @Override
    public void addNewStudent(ArrayList<User> list, User user) {

    }
}
