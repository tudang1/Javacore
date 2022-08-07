import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //key k đc trùng lặp
        // có sắp xếp
        hashMap.put(5, "tư");
        hashMap.put(3, "Ly");
        hashMap.put(2, "hồng");
        hashMap.put(6, "Hương");
        hashMap.put(1, "Lủng");

        for (Map.Entry<Integer,String > entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("--------");
        hashMap.put(2,"Đặng");
        for (Map.Entry<Integer,String > entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        // khi key bị trùng thì sẽ lấy giá trị xuất hiện lần thứ 2(phần tử nhập sau)

        System.out.println(hashMap.remove(1));

        System.out.println(hashMap.get(3));

        //treeMap

        TreeMap<Integer,String > treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //sắp xếp giảm dần
                return o2.compareTo(o1);
            }
        });
        treeMap.put(6,"A");
        treeMap.put(3,"B");
        treeMap.put(1,"C");
        treeMap.put(5,"D");
        treeMap.put(9,"E");

        for (Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }
    }
}
