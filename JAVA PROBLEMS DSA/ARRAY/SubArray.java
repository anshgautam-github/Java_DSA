class SubArray {
    
    
    public static void subArray(int num[]){
        int sa=0;
        
        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] + " ");
                }
                sa++;
                System.out.println();
            }
            
                System.out.println();
        }
        
                System.out.println("total"+ "="+ sa);
    }
    
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        subArray(num);
        
    }
}
