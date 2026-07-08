import java.util.Arrays;

class SearchIn2D{
    public static void main(String[] args) {
        int [][] arr ={
            {1223,54,236,13,876,124},
            {23,68,90,124,75,246,78},
            {40,45,65,12,685,243}
        };
        int target = 243;

      System.out.println(Arrays.toString(Search(arr, target)));

    }

    static int[] Search(int[][] arr, int target){
        for (int row=0; row<arr.length; row++){
            for(int coloumn=0; coloumn <arr[row].length; coloumn++){
                if(arr[row][coloumn] == target){
                    return new int[]{row, coloumn};
                }
            }
        }
        return new int[]{-1, -1};
    }
}