package wed;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args)
	{
		System.out.println("[Q1. 구구단을 출력하시오.]");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 몇 단? ");
		int x = scan.nextInt();
		
		for(int y=1; y<10; y++){
			System.out.printf("%d*%d=%d  ", x, y, x*y);
		}
		scan.close();
	
	}
}
