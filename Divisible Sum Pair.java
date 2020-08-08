//by O(n) using bucket solution
static int divisibleSumPairs(int n, int k, int[] ar) {
    int [] bucket = new int[k];
    int count = 0;
    for (int value : ar) {
        int modValue = value % k;
        count += bucket[(k - modValue) % k]; // adds # of elements in complement bucket
        bucket[modValue]++;                  // saves in bucket
    }
    return count;
}
