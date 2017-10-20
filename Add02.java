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
		
		
		//A 씨는 2000 년도에 100 만원을 은행에 예금했다. 은행에서는 연간 10%의 복리법으로 이자가 계산되고,
		//이후의 추가적인 예금과 출금이 없다고 할 때, A 씨의 2020 년도의 총 예금액
		double m = 100;
		
		for(int yr=0; yr<=20; yr++){
			m = m + m*0.1;
		}
		System.out.printf("\n2020년도 예금액: %3.0f",m);
	}

}
