package wed;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args)
	{
		System.out.println("[Q1. �������� ����Ͻÿ�.]");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� ��? ");
		int x = scan.nextInt();
		
		for(int y=1; y<10; y++){
			System.out.printf("%d*%d=%d  ", x, y, x*y);
		}
		scan.close();
	
	}
}
