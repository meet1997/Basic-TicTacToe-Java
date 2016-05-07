import java.util.*; 
public class Player {
	int flag=1;
	
	
	
	int x=0,y=0;
	Random rand = new Random();
	
	
	public void play(Board b){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Your move  ");
		x= sc.nextInt();flag=1;
		y = sc.nextInt();
		if(x>3 || x<=0 || y>3 || y<=0 ){
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
	        
	