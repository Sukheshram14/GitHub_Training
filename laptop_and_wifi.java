import java.util.Scanner;

public class Laptop_And_Wifi_Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();//"L***#L#***L*L*"
        // Your Code Here
        String[] arr = input.split("[#]");
        System.out.println(arr.toString());
        int count = 0;
        for (String ch : arr) {
            char[] idk  =ch.toCharArray();
            for(char c:idk){
                // System.out.print(c+" ");
                if (c =='*') {
                    count++;
                }
            };
            for (char c : idk) {
                if (c =='L') {
                    System.out.print(count + " ");
                }
            };
            
            // System.out.print();
            count = 0; // Reset count for the next string
        } // end of main method

    }// end of class
}
