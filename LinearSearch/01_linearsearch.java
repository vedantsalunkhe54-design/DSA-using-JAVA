class Main {
    public static void main(String[] args) {
       int[] numbs= {1,2,6,83,7,34,247,46,78};
       int target =247;

       System.out.println(LinearSearch(numbs, target));
    }

    static int LinearSearch(int arr[], int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < 10; i++) {
            int element = arr[i];
            if( element == target){
                return i;
            }
        }

        return -1;

    }
}
