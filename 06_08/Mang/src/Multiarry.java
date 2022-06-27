public class Multiarry {
    public static void main(String[] args) {
        int row = 3;//số hàng
        int col =2;//số cột
        int [][] array = new int[row][col];

        //gán giá trị
        //hàng 1
        array[0][0]=5;
        array[0][1]=7;
        //hàng 2
        array[1][0]=2;
        array[1][1]=3;
        //hàng 3
        array[2][0]=8;
        array[2][1]=9;

        for(int i = 0; i< row;i++){
            for (int j= 0; j < col; j++){
                //dùng print
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //khai báo nhanh
        int[] arr = {1,2,3,4};
        int[][] multiArr = {{1,1,1},
                            {2,2,2},
                            {3,3,3}
        };

    }
}
