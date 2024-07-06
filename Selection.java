public class Selection {
    public static void main(String[] args) {
        int ar[]={12,24,6,56,3,9,15,41};
        int min;
        int index=-1;
        int j;
        for(int i=0;i<ar.length;i++){
            min=ar[i];
            index=0;
            for( j=i;j<ar.length-1;j++){
                if(ar[j+1]<min){
                    min=ar[j+1];
                  index=j+1;
                } 

            } 
            ar[index]=ar[i];
            ar[i]=min;
            
        }
        for(int k=0;k<=ar.length-1;k++){
            System.out.println(ar[k]);
        }
    }
}
