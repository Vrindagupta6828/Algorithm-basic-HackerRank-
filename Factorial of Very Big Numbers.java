static void extraLongFactorials(int n) {
         BigInteger f=new BigInteger("1");
         for(int i=n;i>=2;i--){
             f=f.multiply(BigInteger.valueOf(i));
         }System.out.println(f);
    }
