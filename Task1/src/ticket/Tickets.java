package ticket;
import java.util.Scanner;
public class Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int luckyTicket;
		System.out.println("input your ticket number");
		luckyTicket=sc.nextInt();
		
		if(luckyTicket>1000 && luckyTicket<9999){
			int leftNumber=luckyTicket/100;
			int rightNumber=luckyTicket%100;
			int leftSum=(leftNumber/10)+(leftNumber%10);
			int rightSum=(rightNumber/10)+(rightNumber%10);
			if(leftSum==rightSum) {
		System.out.println("It is luckyTicket");
		}else {
			System.out.println("It is not luckyTicket");
		}
		}else{
			System.out.println("Incorrectly entered number");
		}
		}
			
			
		}
		


