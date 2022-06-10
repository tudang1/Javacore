import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //câu 1
        char [][] multiArr1 = {{'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'}
        };

        for(int i = 0; i < multiArr1.length; i++){
            for(int j = 0; j < multiArr1[i].length; j++){
                System.out.print(multiArr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------");

        char [][] multiArr2 = {{'*'},
                {'*','*'},
                {'*','*','*'},
                {'*','*','*','*'}
        };

        for(int i = 0; i < multiArr2.length; i++){
            for(int j = 0; j < multiArr2[i].length; j++){
                System.out.print(multiArr2[i][j] + "\t");
            }
            System.out.println();
        }

        //câu 2
        String chuoi = "You only live once, but if you do it right, once is enough";
        char kt = ' ';
        int cont = 0;
        for ( int i = 0; i < chuoi.length();i++){
            if(chuoi.charAt(i) != kt){
                cont++;
            }
        }
        System.out.println(chuoi);
        System.out.println("số từ trong chuỗi là: "+ cont);

        // câu 3

        Random RNumber = new Random();
        int Number = RNumber.nextInt(100);
        System.out.println("số ngẫu nhiên: "+ Number);
        if (isPrimeNumber(Number)) {
            System.out.print(Number + "là số nguyên tố");
        }else {
            System.out.print(Number + " k là số nguyên tố");
        }
        System.out.println();

        // câu 4

        System.out.println("10 số nguyên tố đầu tiên là:");
        int dem = 0;
        int i = 0;
        while (dem < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println();
        System.out.println("số nguyên tố nhỏ hơn 10 là:");
        for(int j = 0 ; j < 10 ; j++){
            if (isPrimeNumber(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        // câu 5
        //5-1
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập Số Dòng : ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("nhập Số Cột : ");
        int col = Integer.parseInt(sc.nextLine());
        int [][] MultiArray = new int[row][col];
        for(int x = 0; x < MultiArray.length; x++){
            for(int y = 0; y < MultiArray[x].length; y++) {
                System.out.printf("Bảng 1: hàng " + x + " phần tử [%d]: ", y);
                MultiArray[x][y] = sc.nextInt();
            }
        }
        //5-2
        System.out.println("bảng 1");
        for(int x = 0; x < MultiArray.length; x++){
            for(int y = 0; y < MultiArray[x].length; y++){
                System.out.print(MultiArray[x][y] + "\t");
            }
            System.out.println();
        }
        //5-3
        System.out.println("các phần tử nằm trên đường chéo chính là : ");
        for(int x = 0; x < MultiArray.length; x++){
            for(int y = 0; y < MultiArray[x].length; y++){
                if (x == y){
                    System.out.print(MultiArray[x][y] + "\t");
                }
            }
            System.out.println();
        }
        //5-4
        int [][] MultiArray2 = new int[row][col];
        for(int x = 0; x < MultiArray2.length; x++){
            for(int y = 0; y < MultiArray2[x].length; y++) {
                System.out.printf("Bảng 2: hàng " + x + " phần tử [%d]: ", y);
                MultiArray2[x][y] = sc.nextInt();
            }
        }
        int [][] MultiArraySum = new int[row][col];
        System.out.println("Bảng tổng là: ");
        for(int x = 0; x < MultiArray2.length; x++){
            for(int y = 0; y < MultiArray2[x].length; y++) {
                MultiArraySum[x][y] = MultiArray[x][y] + MultiArray2[x][y];
                System.out.print(MultiArraySum[x][y] + "\t");
            }System.out.println();
        }
        System.out.println();
        // câu 6
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        System.out.println("Nhập Mail: ");
        String Mail = sc.next();
        System.out.println(Mail + ": " + Pattern.matches(EMAIL_PATTERN, Mail));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
