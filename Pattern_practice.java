package tamilnadu.chennai; // alphabets practice in pattern

public class Pattern_practice {
	public static void main(String[] args) {
		
		Pattern_practice p=new Pattern_practice();
		//p.patern1();		
		//p.patern2();		
	    //p.patern3();		
	    //p.patern4();
	    //p.patern_8();
	    //p.pattern_5();
//		p.pattern_A();
//		p.pattern_B();
//		p.pattern_C();
//		p.pattern_D();
//		p.pattern_E();
//		p.pattern_F();
//		
//		p.pattern_H();
//		p.pattern_I();
//		p.pattern_J();
//		p.pattern_K();
//		p.pattern_L();
//		p.pattern_M();
//		p.pattern_N();
//		p.patern_O();
//		p.pattern_P();
//		
//		p.pattern_R();
//		p.pattern_S();
//		p.pattern_T();
//		p.pattern_U();
//		p.pattern_v();
//		p.pattern_W();
		
		
//		p.pattern_Z();
			
		
	
		
		
			
			
			
		
	}
	   
	
	private void pattern_N() {
		// TODO Auto-generated method stub
		   for (int row = 1; row <=7; row++) {
			   System.out.print(" *");
			   for(int col=1;col<row;col++)
			   {System.out.print(" ");}
			   System.out.print("*");
			   for(int col=6;col>=row;col--)
			   {System.out.print(" ");}
			   System.out.print("*");
			   for(int col=7;col>=row;col--)
			   {System.out.print(" ");}
			   
			  
			   System.out.println(" ");
		   }
		   
	}

	private void pattern_M() {
		// TODO Auto-generated method stub
		   
		   for (int row = 1; row <=5; row++) {
			   System.out.print(" *");
			   for(int col=1;col<row;col++)
			   {System.out.print(" ");}
			   System.out.print("*");
			   for(int col=5;col>=row;col--)
			   {System.out.print(" ");}
			   for(int col=5;col>=row;col--)
			   {System.out.print(" ");}
			   System.out.print("*");
			   for(int col=1;col<row;col++)
				     
			   {System.out.print(" ");}
			   System.out.println("*");
		   }
		  
		   for (int row = 1; row <= 1; row++) {
				System.out.print(" * ");
				for (int col = 1; col < 11; col++) {
					if( col==5)
					{System.out.print("**");}
					else {
					System.out.print(" ");}
				}
				System.out.println("*");
			} 
		   
		   
		   for (int row = 1; row <=5; row++) {
				System.out.print(" * ");
				for (int col = 1; col < 12; col++) {	
					System.out.print(" ");
				}
				System.out.println("*");
			}   
	}

	private void pattern_W() {
		// TODO Auto-generated method stub
		   for (int row = 1; row <=5; row++) {
				System.out.print("* ");
				for (int col = 1; col < 14; col++) {
				
					
					System.out.print(" ");
				}
				System.out.println("*");
			}
		   for (int row = 1; row <= 1; row++) {
				System.out.print("* ");
				for (int col = 1; col < 13; col++) {
					if( col==6)
					{System.out.print("**");}
					else {
					System.out.print(" ");}
				}
				System.out.println("*");
			}  
		   for(int row=1;row<=5;row++)
			{System.out.print("*");
				for(int col=5;col>=row;col--)
				{
				  System.out.print(" ");
				}
				System.out.print("*");
				for(int space=1;space<=row;space++)
				{
				  System.out.print(" ");
				}
				
				for(int space=1;space<=row;space++)
				{
				  System.out.print(" ");
				}
				System.out.print("*");
				for(int col=5;col>=row;col--)
				{
				  System.out.print(" ");
				}
				
				
				
				System.out.println("*");
			}
		   for(int row=1;row<=5;row++)
			{
				
				System.out.println();
			}
		   
	   }

	private void pattern_v() {
		// TODO Auto-generated method stub
		   
		   for (int row = 1; row <= 7; row++) {
				System.out.print(" * ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println(" *");
			}
		   for(int row=1;row<6;row++)
		   {
			  for(int col=1;col<=row;col++) {
			   System.out.print(" ");}
			  System.out.print("*");
			  for(int space=7;space>row;space--) {
				  System.out.print(" ");}
			  
			  for(int space=7;space>row;space--) {
				  System.out.print(" ");}
			  System.out.print("*");
			  for(int col=1;col<=row;col++) {
				   System.out.print(" ");}
			  System.out.println("");   
		   }
		   for(int col=1;col<=7;col++) {
			   System.out.print(" ");}
		   System.out.print("**");
	   }
	

	private void pattern_K() {
		// TODO Auto-generated method stub
		   for (int row = 6; row >1; row--) {
				System.out.print("*");
				for (int col = 1; col <= row; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
		   for (int row = 1; row < 7; row++) {
				System.out.print("*");
				for (int col = 1; col <= row; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
	}

	private void pattern_R() {
		// TODO Auto-generated method stub
		   
		   for (int col = 1; col <= 7; col++) {
				if ( col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int col = 1; col <= 7; col++) {
				if (col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			
			for (int row = 1; row < 7; row++) {
				System.out.print("*");
				for (int col = 1; col <= row; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
	}

	private void pattern_Z() {
		// TODO Auto-generated method stub
		   System.out.print(" ");
		   for(int row=4;row>=1;row--) {
			   System.out.print(" * ");
		   }
		   System.out.println(" *");
		for(int row=7;row>=1;row--)
		{
			for(int col=0;col<row;col++)
			{System.out.print("  ");
			}
			System.out.println("*");
		}
		System.out.print("  * ");
		for(int row=4;row>=1;row--) {
			   System.out.print(" * ");
		   }
	}

	private void pattern_J() {
		// TODO Auto-generated method stub
		   for (int row = 1; row <= 5; row++) {
			   for(int col=1;col<7;col++)
			   {System.out.print(" ");}
				System.out.println("* ");				
				}
		   
		   
		   for (int row = 1; row <= 2; row++) {
			   
			   System.out.print("*");
			  
			   for(int curv = 1; curv <= 5; curv++) {
				   System.out.print(" ");
			   }
			   System.out.println("*");
		   }
		   
		   
			for (int col = 1; col <= 5; col++) {
				if(col==1||col==5 )
					System.out.print(" ");
				else
				System.out.print("* ");
		}
		   
	}

	private void pattern_L() {
		// TODO Auto-generated method stub			
			for (int row = 1; row <= 7; row++) {
				System.out.println("* ");				
				}
			for (int col = 1; col <= 4; col++) {
				System.out.print("* ");
		}
		   
	}

	private void pattern_S() {
		// TODO Auto-generated method stub
		   for (int col = 1; col <= 7; col++) {
				if ( col == 1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 3; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("");
			}
			for (int col = 1; col <= 7; col++) {
				if ( col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 3; row++) {
				System.out.print(" ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for(int col=1; col<=7; col++)
			{ 
			if(col==7)
				System.out.print("  "); 
			else 
				System.out.print("* ");  }
	}

	private void pattern_5() {
		// TODO Auto-generated method stub
		   for (int col = 1; col <= 7; col++) {
				if ( col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("");
			}
			for (int col = 1; col <= 7; col++) {
				if ( col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print(" ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for(int col=1; col<=7; col++)
			{ 
			if(col==7)
				System.out.print("  "); 
			else 
				System.out.print("* ");  }
		
	}

	private void pattern_U() {
		// TODO Auto-generated method stub
		   
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int col = 1; col <= 7; col++) {
				if (col == 1||col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
		}
	

	private void pattern_P() {
		// TODO Auto-generated method stub
		   for (int col = 1; col <= 7; col++) {
				if ( col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int col = 1; col <= 7; col++) {
				if (col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("");
			}
			
	}

	private void pattern_T() {
		// TODO Auto-generated method stub
for (int col = 1; col <= 7; col++) {
			   
			   System.out.print("* ");
		   }
		   System.out.println("");
           for(int center=1;center<=7;center++) {
		   for (int col = 1; col <= 6; col++) {
			   
			   System.out.print(" ");
		   }
           System.out.println("*");
	}
           
	}

	private void pattern_I() {
		// TODO Auto-generated method stub
		   for (int col = 1; col <= 7; col++) {
			   
			   System.out.print("* ");
		   }
		   System.out.println("");
           for(int center=1;center<=7;center++) {
		   for (int col = 1; col <= 6; col++) {
			   
			   System.out.print(" ");
		   }
           System.out.println("*");
	}
           for (int col = 1; col <= 7; col++) {
			   
			   System.out.print("* ");
		   }}

	private void pattern_C() {
		// TODO Auto-generated method stub
			for (int col = 1; col <= 7; col++) {
				if ( col == 1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("");
			}
			for (int col = 1; col <= 7; col++) {
				if (col == 1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
		}
	

	private void pattern_H() {
		// TODO Auto-generated method stub
		   
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int col = 1; col <= 7; col++) {
				
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			
	}

	private void pattern_A() {
		// TODO Auto-generated method stub
		   for (int col = 1; col <= 7; col++) {
				if (col == 1 || col == 7)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int col = 1; col <= 7; col++) {
				
					System.out.print("* ");
			}
			System.out.println();
			for (int row = 1; row <= 7; row++) {
				System.out.print("* ");
				for (int col = 1; col <= 5; col++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			

		}

	private void pattern_F() {
		// TODO Auto-generated method stub
		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("");
		}
		for (int col = 1; col <= 5; col++) {
			
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("");
		}
		  }
	

	private void pattern_E() {
		// TODO Auto-generated method stub
		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("");
		}
		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("");
		}
		for(int col=1; col<=7; col++)
		{ 
		if(col==7)
			System.out.print("  "); 
		else 
			System.out.print("* ");  }
	}

	private void pattern_B() {
		// TODO Auto-generated method stub

		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int col=1; col<=7; col++)
		{ 
		if(col==7)
			System.out.print("  "); 
		else 
			System.out.print("* ");  }
	
		
	}

	private void pattern_D() {
		// TODO Auto-generated method stub

		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for (int col = 1; col <= 7; col++) {
			if (col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
	}

	private void patern_O() {
		

		for (int col = 1; col <= 7; col++) {
			if (col == 1 || col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for (int col = 1; col <= 7; col++) {
			if (col == 1 || col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
	}

	private void patern_8() {
		// TODO Auto-generated method stub
		
		for (int col = 1; col <= 7; col++) {
			if (col == 1 || col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for (int col = 1; col <= 7; col++) {
			if (col == 1 || col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.print("* ");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int col=1; col<=7; col++)
		{ 
		if(col==1|| col==7)
			System.out.print("  "); 
		else 
			System.out.print("* ");  }
	
	
	}

	private void patern4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int space=1;space<row;space++)
			{
			  System.out.print(" ");
			}
			
			for(int col=5;col>=row;col--)
			{
			  System.out.print(row);
			}
			System.out.println();
		}
			
		
	}

	private void patern3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=5;col>row;col--)
			{
			  System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++)
			{
			  System.out.print(row);
			}
			System.out.println();
		}
				
	}
	

	private void patern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=5;col>=row;col--)
			{
			  System.out.print(row);
			}
			System.out.println();
		}
				
	}
	

	private void patern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
			  System.out.print(row);
			}
			System.out.println();
		}
				
	}

}
