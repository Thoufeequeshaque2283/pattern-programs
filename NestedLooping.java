package tamilnadu.chennai;

public class NestedLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedLooping nl = new NestedLooping();
		// nl.patern1();
		// nl.patern2();
		// nl.patern3();
		// nl.patter4();
		// nl.patter5();
		// nl.patter6();
		// nl.patter7();
		// nl.patter8();
		// nl.patter9();
		// nl.paternexample();
		// nl.patter10();
		// nl.patter11();
		// nl.pattern_c();
		// nl.patternModified_c();
		// nl.patter_O();
		//nl.pattern_A();
		nl.pattern_8();
		//nl.pattern_D();
		//nl.pattern_B();
		//nl.pattern_P();
		//nl.pattern_2();
		//nl.pattern_E();  
	}

	private void pattern_E() {
		// TODO Auto-generated method stub
		for(int col=1;col<=7;col++)
		{ 
			if( col ==7)
				System.out.print("  ");
			else
	            System.out.print("* ");	
	}
			System.out.println("");
			
		for(int row=1;row<=6;row++) {
			
			System.out.println("*");
		}
		
		
		for(int col=1;col<=7;col++)
		{ 
			if( col ==7)
				System.out.print("  ");
			else
	            System.out.print("* ");
		
	}System.out.println("");
          for(int row=1;row<=6;row++) {
			
			System.out.println("*");
		}
          for(int col=1;col<=7;col++)
  		{ 
  			if( col ==7)
  				System.out.print("  ");
  			else
  	            System.out.print("* ");	
  	}
	}

	private void pattern_2() {
		// TODO Auto-generated method stub
		pattern_D(); 
	       System.out.println();
	       for(int row=1; row<=6;row++)
	      {
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
			System.out.println("*");

		}
		
	}

	private void pattern_P() {
		// TODO Auto-generated method stub

      pattern_D(); 
       System.out.println();
       for(int row=1; row<=6;row++)
      {
	  System.out.println("*");
        }

       }
	private void pattern_B() {
		// TODO Auto-generated method stub
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
		if(col==7)
			System.out.print("  "); 
		else 
			System.out.print("* ");  }
	}

	private void pattern_D() {
		// TODO Auto-generated method stub
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
			System.out.println("*");

		}
		for (int col = 1; col <= 7; col++) {
			if ( col == 7)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
	}

	private void pattern_8() {
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

	private void pattern_A() {
		// TODO Auto-generated method stub
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
	}

	private void patter_O() {
		// TODO Auto-generated method stub
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
	}

	private void patternModified_c() {
		// TODO Auto-generated method stub
		for (int col = 1; col <= 7; col++) {
			if (col == 1)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			if (row == 1 || row == 7)
				System.out.println("* ");
			else
				System.out.println(" ");
		}

		for (int col = 1; col <= 7; col++) {
			if (col == 1)
				System.out.print("  ");
			else
				System.out.print("* ");
		}

	}

	private void pattern_c() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for (int col = 1; col <= 7; col++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int row = 1; row <= 7; row++) {
			System.out.println("* ");
		}

		for (int col = 1; col <= 7; col++) {
			System.out.print("* ");
		}

	}

	private void patter11() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col < row; col++) {
				System.out.print(" " + " ");
			}
			for (int col = 5; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private void patter10() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void paternexample() {

		// TODO Auto-generated method stub
		for (int row = 0; row < 11; row++) {
			if (row < 6) {
				for (int cs1 = 11; cs1 > row - 6; cs1 = cs1 - 2) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

	private void patter9() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int star = 0; star < 5 - row; star++) {
				System.out.print("+ ");
			}
			for (int no = 1; no <= row; no++) {
				System.out.print("*" + "   ");
			}
			System.out.println();
		}
	}

	private void patter8() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int star = 0; star < 5 - row; star++) {
				System.out.print("* ");
			}
			for (int no = 1; no <= row; no++) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	private void patter7() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int star = 4; star >= 5 - row; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void patter6() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void patter5() {
		// TODO Auto-generated method stub
		for (int no = 0; no <= 15; no += 5) {
			for (int col = 1; col <= 5; col++) {
				System.out.print((col + no) + " ");
			}
			System.out.println();

		}

	}

	private void patter4() {
		// TODO Auto-generated method stub

	}

	private void patern3() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
				System.out.print((col * row) + " ");
			}
			System.out.println();
		}
	}

	private void patern2() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 10; row++) {
			for (int col = 5; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void patern1() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
