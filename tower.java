
import java.util.Scanner;
public class tower{

	 public void solve(int number, String starting, String middle, String ending) 
	 {
	       if (number == 1) 
	       {
	           System.out.println(starting + " -> " + ending);
	       } else 
	       {
	           solve(number - 1, starting, ending, middle);
	           System.out.println(starting + " -> " + ending);
	           solve(number - 1, middle, starting, ending);
	       }
	   }
	 public static void main(String[] args) {
	       towero towers = new tower();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towers.solve(discs, "A", "B", "C");
	   }
	}
