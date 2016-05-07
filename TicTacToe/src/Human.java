import java.util.*;
public class Human extends Player{

	Scanner sc = new Scanner(System.in);
//	ArrayList ar = new ArrayList();
	int x,y,i;
	/*	//human vs Human
	public void play(Board b){
			System.out.print("player "+(i%2+1)+" turn  ");
			x = sc.nextInt();
			y= sc.nextInt();
			if(x>3 || x<0 || y>3 || y<0 ){
				flag=0;
				System.out.println("Invalid move Fill again to play ");
				return;
			}
			if(ar.contains(3*x+y)){
	System.out.println("Already Filled so enter another numbers");this.i--;	
}
			ar.add(3*x+y);
			
			
			if(x>3 || x< 0 || y>3 || y< 0){
				System.out.println("please enter valid input otherwise you will get these errors");
				return;
			}
		}

	*
	*/
	
	
	
	
	
	
	

	public void play(Board b,int i){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("player "+(i%2+1)+" turn  ");
		
		x= sc.nextInt();flag=1;
		y = sc.nextInt();
		if(x>3 || x<0 || y>3 || y<0 ){
			flag=0;
			System.out.println("Invalid move Fill again to play ");
			return;
		}
		if(b.board[x-1][y-1] == 1 || b.board[x-1][y-1] == 2){
			System.out.println("Already Filled Fill Once Again");
			flag=0;	return;
		}
	
	}
	
}