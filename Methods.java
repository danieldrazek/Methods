/*
Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.
*/
package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        
        System.out.println("Enter the temperature: ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        tempCheck(temperature);
        
    }
    public static void tempCheck(double temperature){
        if(temperature > 0){
            System.out.println("Temperature " + temperature + " is positive");
        }       
        else{
            System.out.println("Temperature " + temperature + " is negative");
        }
        
    }
    
}
