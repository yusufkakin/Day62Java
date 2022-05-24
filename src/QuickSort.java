public class QuickSort {

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7};
        QuickSort.partition(arr, 0 , 4);
printer(arr);
    }

    public static void partition(int arr[], int low, int high) {
        if(low >= high){
            return;
        }

        int pivot = arr[high];
        int lp = low;
        int rp = high;
        while (lp < rp) {
            while (arr[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (arr[rp] >= pivot && lp < rp) {
                rp--;
            }
            swap(arr, lp, rp);
        }

        swap(arr, lp, high);

        partition(arr, low, lp-1);
        partition(arr, lp+1, high);
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printer(int[] arr){
        for(int items : arr){
            System.out.println(items);
        }
    }
}
