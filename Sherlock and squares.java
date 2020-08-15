 static int squares(int a, int b) {
          //int c=0;
          //for(int i=(int)Math.sqrt(a);i<=(int)Math.sqrt(b);i++){
            //  if((i*i)>=a && (i*i)<=b)   c++;
            int c=(int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a));
         return ( c + 1);
    }
