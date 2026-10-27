package Arrays.TwoDimension;

import java.util.Arrays;


//to access a 2d element
//number [row][column]
// number[0][0];
// Use Arrays.deeToStrind();
// ragged array is 2D array with rows of different lenght
public class _2DArrays {

    static void main(String[] args) {
        int [][] numbers= new int [5][3];
        numbers[0][0] = 5;
        numbers[0][1] = 8;
        numbers[2][1] = 8;
        numbers[3][2] = 8;
        numbers[4][2] = 8;
        int [][] number = {{3,5,7},{10,3,9}};

        for (int i = 0 ; i<2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(number[i][j] + " ");
            System.out.println();
        }
        for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(number[j][i] + " ");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));


    }
    static int[][]getArray(){
        return new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    }

    static void printArray(int[][] integers){
        for(int i=0; i<integers.length; i++){
            for (int j = 0 ; j<integers[i].length; j++)
                System.out.print(integers[i][j]);
            System.out.println();
        }
    }
}
