public class UserControl {
    public User[] getAllUser(){
        //tạo mảng user
        User[] arrUser = new User[5];
        arrUser[0]= new User(1, "Tư", "abc1@gmail.com", "xyz1");
        arrUser[1]= new User(2, "Ly", "abc2@gmail.com", "xyz2");
        arrUser[2]= new User(3, "Hương", "abc3@gmail.com", "xyz3");
        arrUser[3]= new User(4, "Hồng", "abc4@gmail.com", "xyz4");
        arrUser[4]= new User(5, "Lủng", "abc5@gmail.com", "xyz5");
        return arrUser;
    }

    //cách 1
    //(String email, String password, User[] arrUser) cho các biến cần kiềm tra thì thêm vào
    public boolean checkLogin (String email, String password, User[] arrUser){
        boolean flag = false;
        for(User u : arrUser){
            //so sánh dung equals
            if(u.getEmail().equals(email) && u.getPassword().equals(password)){
                flag = true;
            }
        }
        return flag;
    }
    //cách 2
    public User checkLoginReturnUser(String email, String password, User[] arrUser) {
        User users = null;
        for (User u : arrUser) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                users = u;
            }
        }
        return users;
    }
}