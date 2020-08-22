/* Given a sequence of integers a, a triplet (a[i],a[j],a[k])  is beautiful if:

1.i<j<k
2.a[j]-a[i]=a[k]-a[j]=d

Given an increasing sequenc of integers and the value of d, count the number of beautiful triplets in the sequence.

For example, the sequence [2,2,3,4,5]  and d=1. There are three beautiful triplets, by index: [i,j,k]=[0,2,3],[1,2,3],[2,3,4]. To test the first triplet,arr[j]-arr[i]=
3-2=1 and arr[k]-arr[j]=4-3=1.

Function Description

Complete the beautifulTriplets function in the editor below. It must return an integer that represents the number of beautiful triplets in the sequence.

beautifulTriplets has the following parameters:

1.d: an integer
2.arr: an array of integers, sorted ascending */

//O(n) complexity

static int beautifulTriplets(int d, int[] arr) {
     int count = 0;
     Map<Integer, Integer> seen = new HashMap<>();
     for (int i : arr) {
        if (seen.containsKey(i - 2 * d) && seen.containsKey(i - d)) {
           int firstCount = seen.get(i - 2 * d);
           int secondCount = seen.get(i - d);
           count += firstCount * secondCount;
        }
        seen.merge(i, 1, (oldValue, value) -> ++oldValue);
     }
     return(count);
}
