import java.util.Scanner;

public class Count_of_Integers_Multiples_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int arr[] = new int[]{10,10,10,10,10,10,10,10,10,10};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        boolean counted = false;
        for (int i = 0; i < arr.length ; i++ ) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                continue;
            }
            if (arr[i]%arr[j]==0 || arr[j]%arr[i]==0) {
                // System.out.println(arr[i] + " " + arr[j]);
                counted= true;
            }
            }
            if (counted) {
                count++;
                counted = false;
            }
            
        }
        System.out.println(count);

    }
}
