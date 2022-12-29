package cn.itcast;

public class Arry2 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=0;
        arr[1]=49;
        arr[2]=38;
        arr[3]=65;
        arr[4]=97;
        arr[5]=76;
        arr[6]=13;
        arr[7]=27;
        arr[8]=49;
        arr[9]=89;
        InsertSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] InsertSort(int[] arr) {
        for(int i=2;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                arr[0]=arr[i];
                arr[i]=arr[i-1];
                int j;
                for(j=i-2;arr[0]<arr[j];j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=arr[0];
            }
        }
        return arr;
    }
}
