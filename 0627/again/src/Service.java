import java.util.ArrayList;

public class Service implements IService{
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("techmaster", "techmaster", "tu@techmaster.com"));
        return list;
    }



    @Override
    public void updateUserName(User user,String newUserName) {
        user.setUsername(newUserName);
    }

    @Override
    public void updatePassword(User user, String newPassword) {
        user.setPassword(newPassword);

    }

    @Override
    public void updateEmail(User user, String newEmail) {
    user.setEmail(newEmail);
    }

    @Override
    public void addNewStudent(ArrayList<User> list, User user) {
        list.add(user);
    }
}
