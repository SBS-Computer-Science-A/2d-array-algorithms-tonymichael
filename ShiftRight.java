
//Michael and Tony, Group 1
import java.util.*;
public class ShiftRight {
    public static void shiftRight(int[][] mat, int steps){
        int[][] temp = new int [mat.length][mat[0].length];
        for(int i =0;i< mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                temp[i][(j+steps)%mat[0].length]=mat[i][j];
            }
        }
        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] number = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        shiftRight(number,1);
    }
}
