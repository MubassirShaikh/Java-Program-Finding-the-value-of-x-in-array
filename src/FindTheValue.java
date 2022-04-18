import java.util.Scanner;

public class FindTheValue {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the value you find");

        int x= sc.nextInt();
        for (int j = 0;j<arr.length;j++){
            if(x==arr[j]){
                System.out.println("Yes it is Present "+arr[j]);
            }
        }
    }
}
