import java.util.ArrayList;

public class Service {
    public ArrayList<Information> getAllAccount (){
        ArrayList<Information> list = new ArrayList<>();
        list.add(new Information("0912345678","1122334455","password",5000));
        list.add(new Information("0987654321","1234567890","password",5000));


        return list;
    }
}
