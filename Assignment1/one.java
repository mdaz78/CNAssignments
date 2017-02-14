import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char name = s.next().charAt(0);
		
		int n1, n2, n3;
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		int sum = 0;
		
		if (n1 < n2 && n1 < n3)
		{
			sum = n2 + n3;
		}
		else if (n2 < n1 && n2 < n3)
		{
			sum = n1 + n3;
		}
		else
		{
			sum = n1 + n2;
		}
		
		int avg = sum / 2;
		
		System.out.println(name + " " + avg);
		
		
		
		s.close();

	}

}
