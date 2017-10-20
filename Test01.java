package wed;

public class Test01 {
	
	public static void main(String[] args)
	{
		System.out.println("[1-100사이의 정수 3의 배수 또는 2의 배수 출력]");
		
		for(int x=1; x<=100; x++ ){
			if(x%2==0 || x%3==0){
				System.out.print(x+" ");
			}
		}
		
		System.out.println("\n[Q1. 아래와 같이 출력이 되는 프로그램을 작성하시오]");
		int cnt=1;
		for(int a=11; a<30; a++){
			if(a%5 != 0){
				System.out.print(a+":"+cnt++ +"카운트" +" " );
			}
		}
		System.out.print("\n[Q2]");
		
		for(int b=1; b<=10; b++){
			if(b%2==0){
				System.out.print("-" + b);
			}else{System.out.print("+"+b);}
		}
		
		System.out.println("\n[Q3. 아래와 같이 출력이 되는 프로그램을 작성하시오]");
		
		for(double c=1 ; c<=10; c++){
			System.out.print(c/10 + " ");   //왜 c*0.1  소수 더하기는 안될까????
		}
		
		System.out.println("\n[Q4.1-100 사이 정수 중 4의 배수를 출력 단 10의 배수는 출력에서 제외]");
		
		for(int d =1; d<=100; d++){
			if(d%4==0 && d%10 != 0){
				System.out.print(d +" ");
			}
		}
		
	
			
		
	}

}
