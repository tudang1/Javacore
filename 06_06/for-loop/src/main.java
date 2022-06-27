public class main {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 10; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
//in ngược lại
        System.out.println("-----------");
        for (int i = 10; i >=0 ; i--){
            System.out.println(i);
        }
        System.out.println("-----------");

        for(int i = 0; i <= 100; i++){
            if (i % 3 == 0){
                if (i % 5 == 0){
                    System.out.println("fizzbuzz");
                }else {
                    System.out.println("fizz");
                }
            }else {
                if(i % 5 ==0){
                    System.out.println("buzz");
                }else {
                    System.out.println(i);
                }
            }
        }

    }
}
