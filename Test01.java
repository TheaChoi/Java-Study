package wed;

public class Test01 {
	
	public static void main(String[] args)
	{
		System.out.println("[1-100������ ���� 3�� ��� �Ǵ� 2�� ��� ���]");
		
		for(int x=1; x<=100; x++ ){
			if(x%2==0 || x%3==0){
				System.out.print(x+" ");
			}
		}
		
		System.out.println("\n[Q1. �Ʒ��� ���� ����� �Ǵ� ���α׷��� �ۼ��Ͻÿ�]");
		int cnt=1;
		for(int a=11; a<30; a++){
			if(a%5 != 0){
				System.out.print(a+":"+cnt++ +"ī��Ʈ" +" " );
			}
		}
		System.out.print("\n[Q2]");
		
		for(int b=1; b<=10; b++){
			if(b%2==0){
				System.out.print("-" + b);
			}else{System.out.print("+"+b);}
		}
		
		System.out.println("\n[Q3. �Ʒ��� ���� ����� �Ǵ� ���α׷��� �ۼ��Ͻÿ�]");
		
		for(double c=1 ; c<=10; c++){
			System.out.print(c/10 + " ");   //�� c*0.1  �Ҽ� ���ϱ�� �ȵɱ�????
		}
		
		System.out.println("\n[Q4.1-100 ���� ���� �� 4�� ����� ��� �� 10�� ����� ��¿��� ����]");
		
		for(int d =1; d<=100; d++){
			if(d%4==0 && d%10 != 0){
				System.out.print(d +" ");
			}
		}
		
	
			
		
	}

}
