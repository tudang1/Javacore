public class MyGeneric <T>{
    public T obj;

    public T[] arr;

    public MyGeneric(T obj) {
        this.obj = obj;
    }
// phương thước gọi
    public T getObj() {
        return obj;
    }
// phương thúc đặt, thêm giá trị
    public void setObj(T obj) {
        this.obj = obj;
    }
// hàm print tổng thể của Generic
    public static <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.print(t);
        }
        System.out.println();
    }
}