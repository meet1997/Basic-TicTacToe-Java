import java.util.*;
public class Test {
/*
 * Author meet shah
 * created on 13/4/16
 */
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		Scanner sc = new Scanner(System.in);
		Board game = new Board();
		
		System.out.println("Play Human vs Human ---> press 1");
		System.out.println("Play Human vs Noobie ---> press 2");
		System.out.println("Play Pro Player vs Human ---> press 3");
		System.out.println("Play Human vs Pro Player ---> press 4");
		int choice;
		while(true){
		 choice = sc.nextInt();
		if(choice>0 && choice<5) break;
		System.out.println("Enter Valid Input");}
		game.name(choice);
		sc.nextLine();//goes to next line
		
		//Human vs Human
		if(choice==1){
		Human h = new Human();
		for(int i=0;i<9;i++){
			h.play(game,i);
			if(h.flag==0){i--;
			continue;}
			   game.add(h.x, h.y);
	   			
		game.logic();
		game.print();
			if(game.flag==1)
				break;
		}
		}
		
		//Human Vs NoobieComputer
		else if(choice==2){
		DumbPlayer dp = new DumbPlayer();
		Player p = new Player();
		int count=0;
		for(int i=0;i<9;i++){
			
			if(count%2==1){
			dp.play(game);
			   game.add(dp.x,dp. y);
	   			
			}
			else{
				p.play(game);if(p.flag==0){i--;
				continue;}
				   game.add(p.x, p.y);
		   			
			}
			count++;
		
		    		game.logic();
		    		game.print();
		    			
	   				if(game.flag==1)
	   				break;
	   		   
	           
	           
	           
		}}
		
		//Pro vs Human
		else if(choice==3){
			Player p = new Player();
			IntelligentPlayer ip = new IntelligentPlayer();
			int count=0;
			for(int i=0;i<9;i++){
			if(count%2==0)
				{ip.play(game);
				game.add(ip.x, ip.y);
				}
			else{
				p.play(game);if(p.flag==0){i--;
				continue;}
				   game.add(p.x, p.y);
			}
			count++;
			game.logic();
			game.print();
			
				if(game.flag==1)
				break;
			}
		}
		
		
		else if(choice==4){
			Player p = new Player();
			IntelligentPlayer ip = new IntelligentPlayer();
			int count=0;
			for(int i=0;i<9;i++){
			if(count%2==1)
				{ip.play(game);
				game.add(ip.x, ip.y);
				}
			else{
				p.play(game);if(p.flag==0){i--;
				continue;}
				   game.add(p.x, p.y);
			}
			count++;
			game.logic();
			game.print();
			
				if(game.flag==1)
				break;
			}
		}
		
		
			
}}