import java.util.*;
public class DumbPlayer  extends Player{

	public void play(Board b){
		while(true){
	    	int rand1,rand2; 
	    	rand1 = rand.nextInt(3);
	    	rand2 = rand.nextInt(3);
	        if(b.board[rand1][rand2] != 1 && b.board[rand1][rand2] != 2){
	            {
	            x= rand1+1;y= rand2+1;
	            System.out.println("Noobie's move "+x+" "+y);
	            return;
	            }      
	        } 
		}        
		
	}
	
}
