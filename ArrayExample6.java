package ArrayPractice;

public class ArrayExample6 {
    public static void main(String args[]){
        int[]arr=new int []{1,2,3,4,5};
        System.out.println("Print the Original array");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        System.out.println("Print the Reverse array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i] + "");
        }


    }
}
