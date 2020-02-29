public class ArraySum {

    public int sumOfArray(Integer arr[], int num){
        int sum;
        if (num <= 0) {
            sum = 0;
            return sum;
        }

        return (sumOfArray(arr, num - 1) + arr[num-1] );

    }

    public int fibNum(int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2){
            return 1;
        }
        return fibNum(num -2) + fibNum(num - 1);
    }

}
