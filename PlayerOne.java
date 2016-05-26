/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.InputStreamReader;
import java.util.Scanner;


class PlayerOne {
	
	 	
		
			Scanner sc = new Scanner(System.in);
        
        private void setBox(int [][] inputbox)
        {
        
			//Accept input from user
			for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 5; j++)
				{
				 	inputbox [i][j] = sc.nextInt();
				}
			} 
        }
        	
        
        
        private void setPlayerID(int inputplayerid)
        {
        	inputplayerid = sc.nextInt();
        
        }
        
        private String turn(int [][] inputbox, int inputplayerid)
        {
        	boolean flag=false;
        	int row=0,col=0,side=0;
        	
        A:	for(int i = 0; i < 5; i++)
        	{
        		for(int j = 0; j < 5; j++)
        		{
        			if(inputbox[i][j]==11||inputbox[i][j]==14||inputbox[i][j]==7||inputbox[i][j]==13)
        			{
        		/*		if(inputplayerid==1)
        				inputbox[i][j]=15;
        				else
        				inputbox[i][j]=31;
        				flag=true;
        				break A;             */
        				switch(inputbox[i][j])
	        				{
	        					case 11 : inputbox[i][j]=15; 
	        					         flag = true; 
	        					         row=i; col=j; side=15-11;
	        					         break A;
	        					case 14 : inputbox[i][j]=15; 
	        					         flag = true;
	        					         row=i; col=j; side=15-14;
	        					         break A;
	        					case 7 : inputbox[i][j]=15; 
	        					         flag = true; 
	        					         row=i; col=j; side=15-7;
	        					         break A;
	        					case 13 : inputbox[i][j]=15; 
	        					         flag = true; 
	        					         row=i; col=j; side=15-13;
	        					         break A;
	        					
	        				}
        			}
        		}
        	}
        	
        B:  if(flag==false)
        	{
        		for(int i = 0; i < 5; i++)
        		{
        			for(int j = 0; j < 5; j++)
        			{
        				
        				if(inputbox[i][j]==0)
        				{
        				//inputbox[i][j]=2;
        				flag=true;
        				row=i; col=j; side=2;
        				break B;
        				}
        			}	
        		}
        	}
        	
        C:	if(flag == false)
        	{
        		for(int i = 4; i >=0; i--)
        		{
	        		for(int j = 0; j >=0; j--)
	        		{
	        			if(inputbox[i][j]==8||inputbox[i][j]==4||inputbox[i][j]==2||inputbox[i][j]==1)
	        			{
	        				switch(inputbox[i][j])
	        				{
	        					case 8 : inputbox[i][j]=10; 
	        					         flag = true; 
	        					         row=i; col=j; side=2;
	        					         break C;
	        					case 4 : inputbox[i][j]=6; 
	        					         flag = true; 
	        					         row=i; col=j; side=2;
	        					         break C;
	        					case 2 : inputbox[i][j]=10; 
	        					         flag = true; 
	        					         row=i; col=j; side=8;
	        					         break C;
	        					case 1 : inputbox[i][j]=9; 
	        					         flag = true; 
	        					         row=i; col=j; side=8;
	        					         break C;
	        					
	        				}
	        			}
	        		}
        		}
        	}
        	
        D: 	if(flag == false)	
            {
            	for(int i = 4; i >= 0; i--)
            	{
            		for(int j = 4; j>= 0; j--)
            		{
            			if(inputbox[i][j]==5||inputbox[i][j]==10||inputbox[i][j]==9||inputbox[i][j]==6||inputbox[i][j]==12||inputbox[i][j]==3)
            			{
            				switch(inputbox[i][j])
	        				{
	        					case 5 : inputbox[i][j]=13; 
	        					         flag = true; 
	        					         row=i; col=j; side=8;
	        					         break D;
	        					case 10 : inputbox[i][j]=11; 
	        					         flag = true; 
	        					         row=i; col=j; side=1;
	        					         break D;
	        					case 9 : inputbox[i][j]=13; 
	        					         flag = true; 
	        					         row=i; col=j; side=4;
	        					         break D;
	        					case 6 : inputbox[i][j]=7; 
	        					         flag = true; 
	        					         row=i; col=j; side=1;
	        					         break D;
	        					case 12 : inputbox[i][j]=13; 
	        					         flag = true; 
	        					         row=i; col=j; side=1;
	        					         break D;
	        					case 3 : inputbox[i][j]=7; 
	        					         row=i; col=j; side=4;
	        					         flag = true; break D;         
	        					
	        				}
            			}
            		}
            	}
            }
            switch(side)
            {
            case 1:
            	side=0;
            	break;
            case 2:
            	side=1;
            	break;
            case 4:
            	side=2;
            	break;
            case 8:
            	side=3;
            	break;
            }
            	
            //	int[]output={row,col,side};
            return (row + ",.," + col + ",.," + side);
        }
        
        /*private void showbox(int[][] outputbox)
        {
        	for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 5; j++)
				{
    				System.out.print(outputbox[i][j]+" ");
				} 
 				System.out.println();
			} 
        } */
        
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         */
         
        int[][] box = new int[5][5];
		int playerid=0; 
		int [] o = new int[3];
		
        PlayerOne p = new PlayerOne();
        
        p.setBox(box);
        p.setPlayerID(playerid);
        
       /* for(int i=0;i<3;i++)
        {
        output[i] = p.turn(box,playerid);
        } */
       String result = p.turn(box,playerid);
       
       for(int i=0;i<3;i++)
       { 
       		o[i] = Integer.parseInt(result.split(",.,")[i]);
       
       }
				for(int j = 0; j < 3; j++)
				{
    				System.out.print(o[j]+" ");
				} 
 			
       	 
        
        //p.showbox(box);

    }
    

}
