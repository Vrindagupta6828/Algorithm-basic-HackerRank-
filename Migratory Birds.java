    static int migratoryBirds(List<Integer> arr) {
          Set<Integer> distinct=new HashSet<>(arr);
          int c=0,id=0;
          for(int i:distinct){
              if (c<Collections.frequency(arr,i))
                {
                    c=Collections.frequency(arr,i);
                    id=i;
                }
          }
        return id;
    }
