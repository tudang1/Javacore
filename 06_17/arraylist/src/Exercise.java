import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        //Tạo ArrayList để chứa các phần tử kiểu String
        //Thêm phần tử vào ArrayList
        //Lấy ra số lượng phần tử
        //Đếm các phần tử Java trong ArrayList
        ArrayList<String> Array = new ArrayList<>();
        Array.add("java");
        Array.add("PHP");
        Array.add("VsC");
        Array.add("C++");

        System.out.println("Số phần tử là : " + Array.size());

        int count = 0;
        for (String s : Array){
            if (s.equals("java")){
                count++;
            }
        }
        System.out.printf("số phần tử java suất hiện là %d", count);

    }
}
