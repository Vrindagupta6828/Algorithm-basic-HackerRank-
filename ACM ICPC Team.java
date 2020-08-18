static int[] acmTeam(String[] topic) {
            int known=0,max_known=0,know_all=0;
            for(int i=0;i<topic.length;i++){
                for(int j=i+1;j<topic.length;j++){ known=0;
                    for(int k=0;k<topic[i].length();k++){
                        if (topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1')
                           known++;
                        if(max_known<known)
                        {max_known=known; know_all=0;}
                        if(max_known==known)  know_all++;
                    }
                }
            }
            int[] a={max_known,know_all};
         return(a);   
    }
