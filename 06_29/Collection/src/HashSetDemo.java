import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        //k chứa các phần tử trùng lặp
        //mặc định sắp xếp theo 1 quy luật nào đó
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(7);
        hashSet.add(3);

        System.out.println(hashSet);

        //LinkedhashSet
        //duy trì thứ tự thêm
        //cũng k xuất hiện phần tử bị trùng lặp
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet);

        //treeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(9);
        System.out.println(treeSet);

        System.out.println("Sắp xếm giảm dần: " + treeSet.descendingSet());
    }
}
