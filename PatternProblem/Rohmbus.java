package cloud.PatternProblem;
import java.util.*;
public class Rohmbus {

    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of your rohmbus");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for (int j=1; j<= n-i;j++){
                System.out.print(" ");
            }
            for ( int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        sc.close();

    }
}
    

