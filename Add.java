package wed;

public class Add {

	public static void main(String[] args) {

/*[�߰�����] �Ʒ��� �����Ͽ� 4 �ڸ��� ������ Kaprika ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

Kaprika ����?  

���� ��� �� �ڸ� ���� 2025�� ����� ���󺸸� 20�� 25�� �ΰ��� ���ڰ� �����. 
�� �ΰ��� ���ڸ� ���ϸ� 45�̰�, 45�� �����ϸ� 2025�� �Ǿ� �����·� �ǵ��ư���. 
�̷��� ������ ���� ���� Kaprika�� ��� �Ѵ�.
�� 81�� ����� �߶󺸸� 8 �� 1�� ��������, ���ϸ� 9�� �ǰ� �ٽ� �����ϸ� 81�� ���ư���. 
�׷��Ƿ� 81�� �� �ڸ� ������ Kaprika���� �Ǵ� ���̴�.
   
����] ��µǴ� Kaprika ���� 2025 , 3025 , 9801 �� */
/*		for(int i=10; i<=99; i++){
			for(int j=0; j<=99; j++){
			
				int plus = i+j, mul = plus*plus;
				String m = Integer.toString(mul), I = Integer.toString(i), J = Integer.toString(j);
				if(m.equals(I+J)){
					System.out.print(I);
					System.out.printf("%02s ",J);
			}
		}
	}
*/		
	
	System.out.println("[Q5. kaprika 4 �ڸ��� ���ϴ� ���α׷�]");
	
/*		for(int i=1000; i<10000; i++){
		String I = Integer.toString(i), m = I.substring(0,2), n = I.substring(2,4);
		int plus = Integer.parseInt(m) + Integer.parseInt(n), mul = plus * plus;
		if(i == mul){
			System.out.print(i+" ");
		}
		
	}
	
*/
	
			

		for(int num=1000; num<10000; num++){
			int n1 = num/100 , n2 = num%100;
			int plus = n1+n2, mul = plus*plus;
			if(num == mul){
				System.out.print(num+" ");
			}
		}
	}

}
