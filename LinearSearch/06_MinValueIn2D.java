class MinValueIn2D{
    public static void main(String[] args){
        int arr[][] ={
            {1223,54,236,13,876,124},
            {23,68,90,124,75,246,78},
            {40,45,65,12,685,243}
        };
        System.out.println(min(arr));

    }

    static int min(int arr[][]){
        int ans = arr[0][0];
        for(int row=0; row<arr.length; row++){
            for(int coloumn=0; coloumn<arr[row].length; coloumn++){
                if(arr[row][coloumn] <ans){
                    ans = arr[row][coloumn];
                }
            }
        }
        return ans;
    }
}