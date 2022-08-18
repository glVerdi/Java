class Solution{
    public int ConsecutiveNumbersSum(int N){
        int count = 0, i = 1;
        while (N > 0){
            N -= i;
            if (N % i == 0) count++;
            i++;
        }
        return count;
    }
}