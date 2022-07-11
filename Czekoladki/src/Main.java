import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int PionMik = scanner.nextInt();
		int PoziomMik = scanner.nextInt();
		int PionZuz = scanner.nextInt();
		int PoziomZuz = scanner.nextInt();
		int ChocolateNum;
		
		if(PionMik < 1 || PoziomMik < 1 || PionZuz < 1 || PoziomZuz < 1 || PionMik > 1000 || PoziomMik > 1000 || PionZuz > 1000 || PoziomZuz > 1000)
		{
			System.out.println("Every input variable must be >= 1 and <= 1000");
		}
		else
		{
			ChocolateNum = PionMik * PoziomMik + PionZuz * PoziomZuz;
			System.out.println(ChocolateNum);
		}

	}

}
