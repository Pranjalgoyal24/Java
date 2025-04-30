
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x = sc.nextInt();
        System.out.print("Enter the second number:");
        int y = sc.nextInt();
        int add = x+y;
        System.out.print("The sum of two number is :"+add);

        sc.close();
    }
}
