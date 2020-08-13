class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int g=a.get(0);
    for(int i=1;i<a.size();i++)
    { if(a.get(i)>g)  g=a.get(i);
    }
    int[] bucket=new int[g+1];
    for(int i=0;i<a.size();i++)
    {  bucket[a.get(i)]+=1;
    }
    int gf=bucket[0];
    for(int i=0;i<g;i++)
    {   if((bucket[i]+bucket[i+1])>gf)  gf=bucket[i]+bucket[i+1];
    }
    return gf;
    }

}
