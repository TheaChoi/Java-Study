package wed;

public class Add {

	public static void main(String[] args) {

/*[추가문제] 아래를 참고하여 4 자리로 구성된 Kaprika 수를 구하는 프로그램을 작성하시오.

Kaprika 수란?  

예를 들어 네 자리 숫자 2025의 가운데를 갈라보면 20과 25의 두개의 숫자가 생긴다. 
이 두개의 숫자를 더하면 45이고, 45를 제곱하면 2025가 되어 원상태로 되돌아간다. 
이러한 성질을 갖는 수를 Kaprika수 라고 한다.
또 81은 가운데를 잘라보면 8 과 1로 갈라지고, 더하면 9가 되고 다시 제곱하면 81로 돌아간다. 
그러므로 81은 두 자리 숫자의 Kaprika수가 되는 것이다.
   
참고] 출력되는 Kaprika 수는 2025 , 3025 , 9801 임 */
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
	
	System.out.println("[Q5. kaprika 4 자리를 구하는 프로그램]");
	
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
