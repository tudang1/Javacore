import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //FIFO first in first out
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //cho phép chứa phần tử trùng lặp
        priorityQueue.add(3);
        priorityQueue.add(9);
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(1);
        priorityQueue.add(4);
        //xuất dữ liệu theo dạng ưu tiên
        System.out.println(priorityQueue);
        //lấy ra đồng thời xóa khỏi chuỗi
        System.out.println("Phần tử đầu tiên: " + priorityQueue.poll());
        System.out.println(priorityQueue);

        //lấy ra - không xóa
        System.out.println("Phần tử đầu tiên: " + priorityQueue.peek());
        System.out.println(priorityQueue);

        priorityQueue.offer(9);
        System.out.println(priorityQueue);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.offer(4);
        linkedList.add(12);
        linkedList.add(3);
        linkedList.add(7);
        System.out.println(linkedList);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(3);
        arrayDeque.add(5);
        arrayDeque.add(4);

        //kokokara
    }
}
