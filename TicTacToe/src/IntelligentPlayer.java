
public class IntelligentPlayer extends Player{
int x,y;
	
	 
	public void play(Board b){
	int count=0,counter=0;
        for(int i=0;i<3;i++)
        	{for(int j=0;j<3;j++){
        		if(b.board[i][j]==1 || b.board[i][j]==2)
        			 counter++;
        		}}
    for(int i = 0; i<3; i++){
        if(b.board[0][i]==(b.board[1][i]) && b.board[0][i]==1){
            if(b.board[2][i] != 1 && b.board[2][i] != 2){
            	count=1;x=2;y=i;x++;y++;
                }}
    			}
    for(int i = 0; i<3; i++){
        if( count==0 && b.board[0][i]==(b.board[2][i]) && b.board[0][i]==1){
            if(b.board[1][i] != 1 && b.board[1][i] != 2){
            	count=1;x=1;y=i;x++;y++;//System.out.println("kkkk");
                }
        }
    }
    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[2][i]==(b.board[1][i]) && b.board[2][i]==1){

            if(b.board[0][i] != 1 && b.board[0][i] != 2){
                x=0;
                y=i;x++;y++;count=1;
                }

        }


    }



    // check if you can take a win horizontally
    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[i][0]==(b.board[i][1]) && b.board[i][0]==1){

            if(b.board[i][2] != 1 && b.board[i][2] != 2){
                x=i;y=2;x++;y++;count=1;}

        }

    }

    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[i][0]==(b.board[i][2]) && b.board[i][0]==1){

            if(b.board[i][1] != 1 && b.board[i][1] != 2){
                x=i;y=1;x++;y++;count=1;}

        }

    }
    
    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[i][2]==(b.board[i][1]) && b.board[i][2]==(1)){

            if(b.board[i][0] != 1 && b.board[i][0] != 2){
                x=i;y=0;x++;y++;count=1;
                }

        }

    }


    // check if you can take a win diagonally bottom


    if(count==0 &&b.board[0][0]==(b.board[1][1]) && b.board[0][0]==1){

        if(b.board[2][2] != 1 && b.board[2][2] != 2){
            x=2;y=2;x++;y++;count=1;
            }
    }
    if(count==0 &&b.board[2][2]==(b.board[1][1]) && b.board[2][2]==(1)){
    		
    	if(b.board[0][0] != 1 && b.board[0][0] != 2){
            x=0;count=1;y=0;x++;y++;System.out.println("kk");
            }
    }

    if(count==0 &&b.board[0][0]==(b.board[1][1]) && b.board[0][0]==(1)){

        if(b.board[2][2] != 1 && b.board[2][2] != 2){
        x=2;y=2;   x++;y++;count=1;
        }
    }

    if(count==0 &&b.board[0][2]==(b.board[1][1]) && b.board[0][2]==(1)){

        if(b.board[2][0] != 1 && b.board[2][0] != 2){
            x=2;y=0;x++;y++;count=1;
           
        }
    }

    if(count==0 &&b.board[2][0]==(b.board[1][1]) && b.board[2][0]==(1)){

        if(b.board[0][2] != 1 && b.board[0][2] != 2){
           
           x=0;y=2; x++;y++;count=1;
            
        }
    }
    
    if(count==0 &&b.board[0][2]==(b.board[2][0]) && b.board[0][2]==(1)){

        if(b.board[1][1] != 1 && b.board[1][1] != 2){
            x=1;y=1;x++;y++;count=1;//System.out.println("k");
           
        }
    }

    // BLOCKS!!!! //

    // check if you can block a win horizontally
    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[0][i]==(b.board[1][i]) && b.board[0][i]==(2)){
            if(b.board[2][i] != 2 && b.board[2][i] != 1){
               x=2;y=i;x++;y++;count=1;
            }

        }

    }

    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[2][i]==(b.board[1][i]) && b.board[0][i]==(2)){

            if(b.board[0][i] != 2 && b.board[0][i] != 1){
            x=0;y=i;x++;y++;count=1;
            }

        }


    }

    // check if you can block a win vertically


    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[i][0]==(b.board[i][1]) && b.board[i][0]==(2)){
        		
            if(b.board[i][2] != 2 && b.board[i][2] != 1){
              x=i;y=2;     x++;y++;count=1;
            }

        }

    }

    
    for(int i = 0; i<3; i++){
//System.out.print(b.board[i][0]+" "+b.board[i][2]);
        if(count==0 && b.board[i][0]==(b.board[i][2]) && b.board[i][0]==(2)){
//System.out.println("k");
            if(b.board[i][1] != 2 && b.board[i][1] != 1){
              x=i;y=1;     x++;y++;count=1;//System.out.println("kk");
            }

        }

    }

    
    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[i][2]==(b.board[i][1]) && b.board[i][2]==(2)){

            if(b.board[i][0] != 2 && b.board[i][0] != 1){
                x=i;y=0;     x++;y++;count=1;
                }

        }

    }

    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[2][i]==(b.board[1][i]) && b.board[2][i]==(2)){

            if(b.board[0][i] != 2 && b.board[0][i] != 1){
                x=0;y=i;x++;y++;count=1;
                }

        }

    }

    for(int i = 0; i<3; i++){

        if(count==0 &&b.board[0][i]==(b.board[1][i]) && b.board[0][i]==(2)){

            if(b.board[2][i] != 2 && b.board[2][i] != 1){
                x=2;y=i;x++;y++;count=1;
                }

        }

    }
    
    for(int i = 0; i<3; i++){
        if(count==0 &&b.board[2][i]==(b.board[0][i]) && b.board[2][i]==(2)){
            if(b.board[1][i] != 2 && b.board[1][i] != 1){
                System.out.println("dsd");x=1;y=i;x++;y++;count=1;
                }

        }

    }
    // check if you can block a win diagonally 


    if(count==0 &&b.board[0][0]==(b.board[1][1]) && b.board[0][0]==(2)){

        if(b.board[2][2] != 2 && b.board[2][2] != 1){
            x=2;y=2;x++;y++;count=1;
            }
    }

    if(count==0 &&b.board[2][2]==(b.board[1][1]) && b.board[2][2]==(2)){

        if(b.board[0][0] != 2 && b.board[0][0] != 1){
            x=0;y=0;x++;y++;count=1;
            }
    }

    if(count==0 &&b.board[0][0]==(b.board[2][2]) && b.board[0][0]==(2)){
        if(b.board[1][1] != 2 && b.board[1][1] != 1){
            x=1;y=1;x++;y++;count=1;
            
        }
    }

    if(count==0 &&b.board[0][2]==(b.board[1][1]) && b.board[0][2]==(2)){

        if(b.board[2][0] != 2 && b.board[2][0] != 1){
            x=2;y=0;x++;y++;count=1;
            }
    }

    if(count==0 &&b.board[2][0]==(b.board[1][1]) && b.board[2][0]==(2)){

        if(b.board[0][2] != 2 && b.board[0][2] != 1){
           x=0;y=2; x++;y++;count=1;
           
        }
    }

    if(count==0 &&b.board[2][0]==(b.board[0][2]) && b.board[2][0]==(2)){

        if(b.board[1][1] != 2 && b.board[1][1] != 1){
           x=1;y=1; x++;y++;count=1;
           
        }
    }


    if(count>0) {System.out.println("Intelligent player's move"+" "+x+" "+y);
   // System.out.println("kk");
    return;}
    if( b.board[1][1]!=1 && b.board[1][1]!=2){
        	x=1;y=1;count=1;x++;y++;}

    
    		if(count==0 && b.board[1][1]==2 && b.board[0][1]==1){
    			while(true){
    	           int temp =	rand.nextInt(2);
           		if(temp==0 && b.board[2][0]!=1 && b.board[2][0]!=2) {x=3;y=1;break;}
           		if(temp==1 && b.board[2][2]!=1 && b.board[2][2]!=2) {x=3;y=3;break;}
    			}
    		}
    		
    		if(count==0 &&b.board[1][1]==2 && b.board[1][0]==1){
    			while(true){
    	           		int temp =	rand.nextInt(2);
           		if(temp==0 && b.board[0][2]!=1 && b.board[0][2]!=2) {x=1;y=3;break;}
           		if(temp==1 && b.board[2][0]!=1 && b.board[2][0]!=2) {x=3;y=1;break;}
    			}
    		}
    		
    		if(count==0 && b.board[1][1]==2 && b.board[1][2]==1){
    			while(true){
    	           		int temp =	rand.nextInt(2);
           		if(temp==0 && b.board[0][0]!=1 && b.board[0][0]!=2) {x=1;y=1;break;}
           		if(temp==1 && b.board[2][0]!=1 && b.board[2][0]!=2) {x=3;y=1;break;}
    			}
    		}
    		
    		if(count==0 &&b.board[1][1]==2 && b.board[2][1]==1){
    			while(true){
    	           		int temp =	rand.nextInt(2);
           		if(temp==0 && b.board[0][0]!=1 && b.board[0][0]!=2) {x=1;y=1;break;}
           		if(temp==1 && b.board[0][2]!=1 && b.board[0][2]!=2) {x=1;y=3;break;}
    			}
    		}
	
    		if(count==0 && b.board[1][1]==1 && b.board[0][0]==2){
    			if(b.board[2][2]==0)
    				{x=3;y=3;count=1;}
    		}
    		if(count==0 &&b.board[1][1]==1 && b.board[2][0]==2){
    			if(b.board[0][2]==0)
    				{x=1;y=3;count=1;}
    		}if(count==0 &&b.board[1][1]==1 && b.board[0][2]==2){
    			if(b.board[2][0]==0)
    				{x=3;y=1;count=1;}
    		}if(count==0 &&b.board[1][1]==1 && b.board[2][2]==2){
    			if(count==0 &&b.board[0][0]==0)
    				{x=1;y=1;count=1;}
    		}
    		
    		
        if(count>1) {System.out.println("Intelligent player's move"+" "+x+" "+y);
        return;}
       
        if(count==0){
    	 //  System.out.println("k");
     if(b.board[1][1]==1 && (b.board[0][0]==b.board[2][2] ||   b.board[2][0]==b.board[0][2])){
    	   while(true){
    		   //System.out.println("k");
        	   int ran = rand.nextInt(4);
            if(ran==0 && b.board[1][0]==0){x=2;y=1;count=1;break;}
    		if(ran==1 && b.board[0][1]==0){x=1;y=2;count=1;break;}
    		if(ran==2 && b.board[2][1]==0){x=3;y=2;count=1;break;}
    		if(ran==3 && b.board[1][2]==0){x=2;y=3;count=1;break;}
           }
    	   }
     //System.out.println(x+" qwe"+y);
       }
   	
        if(count==0)
    	   while(true){
    	   int ran = rand.nextInt(4);
       
       if(counter>0 && count==0){
		if(ran==0 && b.board[0][0]==0){x=1;y=1;count=1;break;}
		if(ran==1 && b.board[0][2]==0){x=1;y=3;count=1;break;}
		if(ran==2 && b.board[2][0]==0){x=3;y=1;count=1;break;}
		if(ran==3 && b.board[2][2]==0){x=3;y=3;count=1;break;}
       }
       
       
       }
          
if(count>0) {System.out.println("Intelligent player's move"+" "+x+" "+y);
    // make random move if above rules dont apply
return;}
 if(count==0) {
    	while(true){
    		int rand1,rand2; 
    	rand1 = rand.nextInt(3);
    	rand2 = rand.nextInt(3);
        if(b.board[rand1][rand2] != 1 && b.board[rand1][rand2] != 2){
            {x= rand1+1;y= rand2+1;
            System.out.println("Pro Player's move "+x+" "+y);
            return;
            }      

        }
}}
    }}

