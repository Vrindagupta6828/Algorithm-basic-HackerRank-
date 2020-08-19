static String organizingContainers(int[][] container) {
        List<Long> flag=new ArrayList<>();
        List<Long> flag2=new ArrayList<>();
         for(int i=0;i<container[0].length;i++){
             long sum1=0,sum2=0;
             for(int j=0;j<container.length;j++){
                sum1+=(long)container[i][j];
                sum2+=(long)container[j][i];}
                flag.add(sum1);
                flag2.add(sum2);
             }
             Collections.sort(flag);
             Collections.sort(flag2);
             String f=(flag.equals(flag2))?"Possible":"Impossible";
             return(f);
         }
