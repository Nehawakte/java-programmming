
import java.io.*;
import java.util.*;

// Class
class Solution {
  
 
    public static void sortbyColumn(int arr[][], int col)
    {

      Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
        
    }
    public static void main(String args[])
    {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        sortbyColumn(matrix, col - 1);
  
        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
          
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            
        }
    }
}
