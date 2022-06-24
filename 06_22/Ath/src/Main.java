import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int [] arr = new int[-3];

        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("nhập số: ");
//            int x = sc.nextInt();
////            System.out.println(x);
//            int[] arr = new int[x];
//            // tách cath ra để biết đó là ngoại lệ kiểu j, sai kiểu, số k âm.....
//            //InputMismatchException kiểu ngoại lệ
//        }catch (InputMismatchException e){
//            System.out.println("sai kiểu ");
//            //NegativeArraySizeException kiểu ngoại lệ tùy theo kiểu dữ liệu
//        }catch (NegativeArraySizeException e){
//            System.out.println("sai kích thước mảng");
//            //finally là lun hoạt động, thực thi
//        }finally {
//            System.out.println("khối này lun dc thực thi");
//        }

       boolean flag =true;
       while (flag){
           try {
               System.out.println("nhập số: ");
               int x = Integer.parseInt(sc.nextLine());
//            System.out.println(x);
               int[] arr = new int[x];
               System.out.println("đúng r");
           }catch (Exception e){
               System.out.println(e.toString());
               System.out.println("sai r. Nhập lại đi: ");
           }finally {
               System.out.println("khối này lun dc thực thi");
           }
       }
    }
}
