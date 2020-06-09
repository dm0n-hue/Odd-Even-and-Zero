package odd.even.and.zero;

import java.util.*;
public class OddEvenAndZero {

    public static void main(String[] args) {

        int num=0, even=0, odd=0, zero=0;
        int temp=num;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number with at least 5 digits");
        num = scan.nextInt();
        
        while(num>0) {
            temp=num%10;
            num=num/10;
            if (temp==0) {
                zero++;
            }
            else if(temp%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        
        System.out.println("The numer of zeros is: " + zero 
        + "\nThe number of evens is: " + even 
        + "\nThe number of odds is: " + odd);
    }
    
}
