package test01;

import java.util.Scanner;

public class Subway {
	
	public static void main(String[] args)
	{
		String[] stn = {"�ݼ�","����","����","������ �����","�����","����","������õ","��õ","����","����","����û��","��û",
				"ź��","�빮","����","�������װŸ�","�߱�û","�߾ӷ�","������","�뵿","����","�Ǿ�"};
		
		int[] time = {500,300,700,320,440,340,180,230,890,340,120,789,230,543,888,333,456,789,300};
		
		String dep, arv;
		int con;
		
		int ind1=0, ind2=0;  //initialized !!
		
		Scanner scan = new Scanner(System.in);  //scan��� ����??
		
		for(;;){
			
			int total=0;
			//total�� ���� �����ָ� ���� �����ݺ�
			
			System.out.println("�ش��� ����ö ������ ��ϡ�"); 	  //(a)����
			for(int i=0 ; i < stn.length ; i++)
			{
				System.out.print(stn[i]+"   ");
			}
			System.out.println();
			
			
			System.out.println("1. ������� �Է��Ͻÿ�.  ");    		//(b)����
			dep = scan.nextLine();
			System.out.println("2. �������� �Է��Ͻÿ�.  ");
			arv = scan.nextLine();
		
			for(int i=0 ; i < stn.length ; i++)//for2 
			{
				if(stn[i].equals(dep)==true)  //�ȵ�����:boolean�� �Ƚ�٤Ф�
				{
					
					ind1 = i ;
					
				}
			
				if(stn[i].equals(arv)==true)
				{
					ind2 = i;
					
				}
			}   // for2 fin.
		/*	System.out.println(ind1);
			System.out.println(ind2);
		*/	
				if(ind1 < ind2)							//(c)����
				{
					for(int j=ind1 ; j < ind2 ; j++)
					{
						total += time[j];            //total�� �ݺ������� �������� ��������� ���̹Ƿ� �����ؾ���
						
					}
					
				}else if(ind1 > ind2){
					
					for(int j=ind2 ; j < ind1 ; j++)
					{
						total += time[j];
						
					}
					
				}
				
				System.out.printf("%s���� %s���� �� �ҿ� �ð� : %d�� %d��",
						dep, arv, total/60, total%60);
			
				System.out.println("\n����Ͻðڽ��ϱ�?  (1.�� / 2.�ƴϿ�)");		//(d)����
				
				con = scan.nextInt();
				
				if(con==2)						
				{break;}
			
			}//��ü for�� fin.
		
	}

}
