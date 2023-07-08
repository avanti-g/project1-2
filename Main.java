public class Solution {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        System.out.println("This is a debug message");

        int[] arr1 = new int[] {1,3,4,9,10,11,12,20};
        int[] arr2 = new int[] {2,3,8,11,19,20};
        int[] arr3 = new int[8];

        int p1=0; int p2=0; int p3=0;
        while( p1 < arr1.length)
        {
            if( arr1[p1] < arr2[p2]) {
                p1++;
            } else if( arr1[p1] > arr2[p2]){
                p2++;
            } else if(arr1[p1] == arr2[p2]){
                arr3[p3] = arr1[p1];
                p1++;
                p2++;
                p3++;
            }

           
        }

        for(int i= 0 ; i< arr3.length; i++)
        {
             System.out.println(arr3[i]);
        }
    }
}
