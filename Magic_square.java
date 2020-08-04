/*
We define a magic square to be an  n*n matrix of distinct positive integers from 1 to n^2  where the sum of any row, column, or diagonal of length n is always equal to
the same number: the magic constant.

You will be given a 3*3 matrix s of integers in the inclusive range [1,9]. We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|. Given s, 
convert it into a magic square at minimal cost. Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range [1,9].
*/
static int formingMagicSquare(int[][] s) {
 int[][][] ms = {  
            { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },  
            { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },  
            { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },  
            { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },  
            { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },  
            { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },  
            { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },  
            { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },  
         };  
        int Min=9;
        int x=0;
        for(int i=0;i<8;i++){
            x=findmincost(s,ms[i]);
            if (x<Min)
               Min=x;
        }
        return Min;        
    }

    private static int findmincost(int[][] s,int[][] m)
    {   int cost=0;        
        for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                  {
                      if (s[i][j]!=m[i][j])
                      {
                         cost+=Math.abs(m[i][j]-s[i][j]);  
                      }
                  }
    }
        return cost;
    }
