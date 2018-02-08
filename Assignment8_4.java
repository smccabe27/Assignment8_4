import java.util.Scanner;
import java.util.Random;

public class Assignment8_4 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("How many employees?");
        int employees = scan.nextInt();
        
        System.out.println("\nHOURS" + "\n           Su Mo Tu We Th Fr Sa");
        int[][] hours = new int[employees][7];
        
        for(int i = 0;i<employees;i++){
            for(int n = 0;n<7;n++){
                hours[i][n] = rand.nextInt(8);
            }
        }
        
        for(int i = 0;i<employees;i++){
            System.out.print("Employee " + (i+1) + ": ");
            for(int n = 0;n<7;n++){
                System.out.print(hours[i][n] + "  ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nTOTALS");
        int total = 0;
        for(int i = 0;i<employees;i++){
            System.out.print("Employee " + (i+1) + " Total Hours: ");
            for(int n = 0;n<7;n++){
                total += hours[i][n];
            }
            System.out.print(total + "\n");
            total = 0;
        }
    }
    
}