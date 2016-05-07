
public class Board {

	
	int [][] board = new int[3][3];
	int count=0,count1=0,temp=0,flag=0,flag1=0;String p1,p2;
	public void name(int choice){
		if (choice==1) {p1 = "Player 2"; p2 = "Player 1";}
		else if (choice==2) {p1 = "Noobie Player"; p2 = "You";}
		else if (choice==3) { p1 = "You";p2 = "Pro player";temp=1;}
		else if (choice==4) { p1 = "Pro player";p2 = "You";temp=0;}
		
		}
	public void add(int x,int y){
	//	System.out.println("move " + (x) + "  "+ (y) );
		count++;
		if(count%2==temp)
		board[x-1][y-1]=1;//represents X
		else 
			board[x-1][y-1]=2;//represents O
	}
	
	public void logic(){
		count1++;
		//horizontal check
	for(int i=0;i<3;i++){	
		if(board[i][0]==board[i][1] &&  board[i][0]==board[i][2]){
			if(board[i][0]!=0)
				this.declare();
		}
	}
	//vertical check
	for(int i=0;i<3;i++){	
		if(board[0][i]==board[1][i] &&  board[0][i]==board[2][i]){
			if(board[0][i]!=0)
				this.declare();
		}
	} 
	//diagonal 1
	if(board[0][0]==board[1][1] &&  board[0][0]==board[2][2]){
			if(board[0][0]!=0)
				this.declare();
		}
	//diagonal 2
	else if(board[2][0]==board[1][1] &&  board[2][0]==board[0][2]){
			if(board[2][0]!=0)
				this.declare();
		}
	//Draw condition
	/*	else if(count1==9 && flag1==0 )
			{System.out.println("GAME DRAWN Well Played :-)");
			
			flag=1;}
	*/}
	public void print(){
		for(int i=0;i<3;i++)
			{System.out.println("-------------");
			System.out.print("|");
			{for(int j=0;j<3;j++)
					{if(board[i][j]==1)
						System.out.print(" X |");
					else if(board[i][j]==2)
						System.out.print(" 0 |");
					else if(board[i][j]==0)
						System.out.print(" - |");
					}
			System.out.println();
		
			}
			}
		System.out.println("-------------");
		//Draw condition
		if(count1==9 && flag1==0 )
		{System.out.println("GAME DRAWN Well Played :-)");
		
		flag=1;}
	
	}
	public void declare(){
		
		if(count1%2==0)
			{System.out.println(p1 +" won the match");
			flag=1;
			}
		else if(count1%2!=0)
			{System.out.println(p2+" won the match");
			flag=1;}
		flag1=1;
	}
	}