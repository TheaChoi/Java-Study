package wed;

public class Add02 {

	public static void main(String[] args) {
		
		int n1=1, n2=1;
		int n3;
		
		System.out.print(n1+" "+n2+" ");
		
		for(int x=1; x<10; x++){
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		
		
		//A ���� 2000 �⵵�� 100 ������ ���࿡ �����ߴ�. ���࿡���� ���� 10%�� ���������� ���ڰ� ���ǰ�,
		//������ �߰����� ���ݰ� ����� ���ٰ� �� ��, A ���� 2020 �⵵�� �� ���ݾ�
		double m = 100;
		
		for(int yr=0; yr<=20; yr++){
			m = m + m*0.1;
		}
		System.out.printf("\n2020�⵵ ���ݾ�: %3.0f",m);
	}

}
