package wed;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("\n[Q2. 2017.1�� �޷��� ����Ͻÿ�.]");
		
		for(int date=1; date<=31; date++){
			System.out.printf("%3d",date);
			if(date%7==0){
				System.out.println();
			}
		}

	}

}
