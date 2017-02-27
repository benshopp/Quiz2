package Main;
import java.lang.Math;
import java.util.Scanner;
public class p1{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Tuition:");
	double tuition = sc.nextDouble();
	
	System.out.println("Percentage:");
	double perc = sc.nextDouble();
	
	double X = (1+perc);
	double result = tuition*Math.pow(X, perc);
	
	System.out.println(result);

	sc.close();
	
	}
}
