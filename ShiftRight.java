
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

    public static void newShiftRight(int[][] mat,int space){
        for(int i=0;i<mat.length;i++){
            int[] temp= {0, 0};
            for(int j=0;j<space;j++){
                temp[0]=mat[i][0];
                for (int z = 0; z < mat[i].length; z++) {
                    temp[(z%2+1)%2]=mat[i][(z+1)%mat[i].length];
                    mat[i][(z+1)%mat[i].length]=temp[z%2];
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] number = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        shiftRight(number,1000);
    }
}
