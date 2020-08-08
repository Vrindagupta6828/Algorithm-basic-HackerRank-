  static int birthday(List<Integer> s, int d, int m) {
        int count=0,sum=0,p=0,k=0;
        for(int i=0;i<s.size();i++)
        {   
            if (p<m && sum<d)
                {
                  sum+=s.get(i);
                  p+=1;
                  //System.out.println(i+" "+sum+" "+k);
                }
            if (sum==d && p==m) 
                { count+=1;
                 sum-=s.get(k);
                 p-=1;
                 k+=1;
                }
            while((p>m) || (sum>d) || (p==m && sum<d) || (p<m && sum==d))
                { sum-=s.get(k);
                  p-=1;
                  k+=1;
                }
        
        }
        return count;
    }
