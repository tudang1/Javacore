import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(2);

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------");
        //cách xuất dữ liệu nhanh
        linkedList.forEach(i -> System.out.println(i));
    }
}
