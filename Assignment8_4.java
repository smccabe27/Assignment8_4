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
        
        int total = 0;
        int[][] totals = new int[2][employees];
        
        for(int i = 0;i<employees;i++){
            for(int n = 0;n<7;n++){
                total += hours[i][n];
            }
            totals[0][i] = total;
            totals[1][i] = i;
            total = 0;
        }
        
        for(int i = 0;i<employees;i++){
            for(int n = i;n<employees;n++){
                if(totals[0][n]>totals[0][i]){
                    int tempEmp = totals[1][i];
                    int tempTotal = totals[0][i];
                    
                    totals[1][i] = totals[1][n];
                    totals[0][i] = totals[0][n];
                    totals[1][n] = tempEmp;
                    totals[0][n] = tempTotal;
                }
            }
        }
        
        
        System.out.println("\nTOTALS (decreasing order)");
        
        for(int i = 0;i<employees;i++){
            System.out.print("Employee " + (totals[1][i]+1) + " Total Hours: "
                             + totals[0][i] + "\n");
        }
    }
}
