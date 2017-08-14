package test01;

import java.util.Scanner;

public class Subway {
	
	public static void main(String[] args)
	{
		String[] stn = {"반석","지족","노은","월드컵 경기장","현충원","구암","유성온천","갑천","월평","갈마","정부청사","시청",
				"탄방","용문","오룡","서대전네거리","중구청","중앙로","대전역","대동","신흥","판암"};
		
		int[] time = {500,300,700,320,440,340,180,230,890,340,120,789,230,543,888,333,456,789,300};
		
		String dep, arv;
		int con;
		
		int ind1=0, ind2=0;  //initialized !!
		
		Scanner scan = new Scanner(System.in);  //scan어디서 닫지??
		
		for(;;){
			
			int total=0;
			//total을 리셋 안해주면 무한 증가반복
			
			System.out.println("※대전 지하철 정거장 목록※"); 	  //(a)문항
			for(int i=0 ; i < stn.length ; i++)
			{
				System.out.print(stn[i]+"   ");
			}
			System.out.println();
			
			
			System.out.println("1. 출발지를 입력하시오.  ");    		//(b)문항
			dep = scan.nextLine();
			System.out.println("2. 도착지를 입력하시오.  ");
			arv = scan.nextLine();
		
			for(int i=0 ; i < stn.length ; i++)//for2 
			{
				if(stn[i].equals(dep)==true)  //안된이유:boolean을 안썼다ㅠㅠ
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
				if(ind1 < ind2)							//(c)문항
				{
					for(int j=ind1 ; j < ind2 ; j++)
					{
						total += time[j];            //total은 반복적으로 더해져서 만들어지는 수이므로 리셋해야함
						
					}
					
				}else if(ind1 > ind2){
					
					for(int j=ind2 ; j < ind1 ; j++)
					{
						total += time[j];
						
					}
					
				}
				
				System.out.printf("%s부터 %s까지 총 소요 시간 : %d분 %d초",
						dep, arv, total/60, total%60);
			
				System.out.println("\n계속하시겠습니까?  (1.네 / 2.아니오)");		//(d)문항
				
				con = scan.nextInt();
				
				if(con==2)						
				{break;}
			
			}//전체 for문 fin.
		
	}

}
