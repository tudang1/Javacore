import java.util.ArrayList;

public interface IService {
    public void updateUserName(User user,String newUserName);

    public void updatePassword(User user,String newPassword);

    public void updateEmail(User user,String Email);

    public void addNewStudent(ArrayList<User> list, User user);
}
