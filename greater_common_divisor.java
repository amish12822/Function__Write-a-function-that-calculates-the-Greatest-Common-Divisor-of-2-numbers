import java.util.Scanner;

/**
 * greater_common_divisor
 */
public class greater_common_divisor {

    public static void GreaterCommonDivision(int a, int b){

        System.out.print("Greater Common Division of " + a +" and "+ b + " is = ");

        for (int i=2; i<=a; i++){

            if ( a%i == 0 && b%i == 0){

                System.out.print(i + ", ");
            }
        } 

    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value = ");int a = sc.nextInt();

        System.out.print("Enter b value = ");int b = sc.nextInt();

        GreaterCommonDivision(a, b);

    }
}