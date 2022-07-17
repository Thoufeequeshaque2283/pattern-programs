package tamilnadu.chennai;
public class LoopingBasics {
	public static void main(String[] args) {

		LoopingBasics lb = new LoopingBasics();
		//lb.travel();
		//lb.PrintDiviser();
		//lb.printCountOfDivisors();
		//lb.printPrimeOrNot();
		//lb.printCommonDivisors();
		//lb.printCommonDivisorsTurnary();
		//lb.printGCD();
		//lb.printLCM();
		//lb.printLCM();
		//lb.printNumber_reverse();
		//lb.sum_of_digits();
		//lb.count_of_digits();
		//lb.printNumber_reverse();
		//lb.check_palindrome(12321);
		//lb.print_fibo();
		//lb.swap_two_numbers_third_variable();
		//lb.swap_two_numbers_withoutvariable();
		//lb.fibo_without_third();
		//lb.do_while_loop();
		
	}
    private void travel() {
	int days=0,salary=12000;
	int bus=5, auto=10 ;
	int TExpance =(bus+auto)*2; // total expanse 
	int OnlyAuto= auto*2; // total expanse without bus
	double ExpanseAutoBus=0;
	double ExpanseAuto =0;
	double PExpanse , NExpanse;
	
		while(days<25)
		{
			//salary = salary - TExpance;
			ExpanseAutoBus = ExpanseAutoBus + TExpance ;
			ExpanseAuto = ExpanseAuto + OnlyAuto ;
			days =days+1;
		}
		System.out.println(ExpanseAutoBus);
		System.out.println(ExpanseAuto);
		
		PExpanse = (ExpanseAutoBus* 100) /salary; 
		NExpanse = (ExpanseAuto* 100) / salary; 
		System.out.println("percentage is % " + PExpanse);
		System.out.println("percentage is % " + NExpanse);
		//int percentag_of_expance = salary /salary;
		//System.out.println(percentage);
	}
    private void PrintDiviser() {
	// Divisors of Given Number
	int no =123; 
	int div = 2; 
	int count = 0;
	while(div<no)
	{
	if(no%div==0) 
	{
	System.out.println(div); 
	}
	div++;
	}
    }
	private void printCountOfDivisors() {
		// TODO Auto-generated method stub
		int no = 19; 
		int div = 2;
		int count =0; 
		while(div<no)
		{
		if(no%div==0) 
		{
		//System.out.print(div+" "); 
		count++;
		}
		div++;
		}
System.out.println("No. of Divisors is "+ count);

		
	}
	private void printPrimeOrNot() {
		// TODO Auto-generated method stub
		// Given Number is Prime Number or Not
		int no = 123; 
		int div = 2; int count =0; 
		while(div<no)
		{
		if(no%div==0) 
		{
		//System.out.println(div);
		count++; 
		}
		div++;
		}
		System.out.println(count);
		if(count==0)
		System.out.println("Prime Number");
		else
		System.out.println("Not Prime"); 


	}
	private void printCommonDivisors() {
		// TODO Auto-generated method stub
		int no1 = 100, no2 = 80; 
		int div = 2;
		int small =0; 
		if(no1<no2)
		{
		small = no1; 
		} 
		else{
		small = no2; }
		while(div<small)
		{
		if(no1%div==0 && no2%div==0)
		{
		System.out.print(div+" "); 
		}
		div++;
		}
		
	}
	private void printCommonDivisorsTurnary() {
		// TODO Auto-generated method stub
		int no1 = 100, no2 = 80; 
		int div = 2;
		//ternary operator
		int small = no1<no2 ? no1: no2;
		while(div<small)
		{
		if(no1%div==0 && no2%div==0)
		{
		System.out.print(div+" "); 
		}
		div++;
		}
		
	}
	private void printGCD() {
		// TODO Auto-generated method stub
		int no1 = 32100, no2 = 3375;
		int div = 2;
		int greatest = 0; 
		//ternary operator
		int small = no1<no2 ? no1: no2;
		while(div<small)
		{
		if(no1%div==0 && no2%div==0)
		{
		System.out.print(div+" "); 
		greatest = div; 
		}
		div++;
		}
		System.out.println();
		System.out.println("Greatest Common Divisor is "+ greatest);
		
	}
    private void printLCM()
{
	int no1 =3, no2 =10;  
	int big = no1>no2? no1: no2; //big = 10
	while(true){
	if(big%no1==0 && big%no2==0){
	System.out.println("LCM "+ big); 
	break;
	}
	big++; 
	}
}
    private void printLCM() 
    {
	// TODO Auto-generated method stub
	int no1 =3, no2 =10; 
	int big = no1>no2? no1: no2; //big = 10
	while(true)
	{ 
	if(big%no1==0 && big%no2==0)
		{
		System.out.println("LCM "+ big); 
		break;
		}
	big++; 
	}
}
    private void printNumber_reverse()
    {
     int no = 1234; // decimal
    while(no>0)
    {
    System.out.println(no%10); //4
     no = no/10; //no=1234
    }
    }
    private void sum_of_digits() {
	int no = 1234; // decimal
	int sum = 0; 
	while(no>0)
	{
	int rem = no%10; 
	sum = sum + rem; //4+3+2
	no = no/10; //no=123 /12
	}
	System.out.println("Sum Of Digits "+ sum);
	
    }
    private void count_of_digits() {
	// TODO Auto-generated method stub
	int no = 123456; // decimal
	int sum = 0; 
	int count =0; 
	while(no>0)
	{
	int rem = no%10; 
	sum = sum + rem; 
	no = no/10; //no=123
	count++; 
	}
	System.out.println("Count Of Digits "+ count); 

	
}
    private void printNumber_reverse() {
	int no = 1234; 
	int rev = 0; 
	while(no>0)  // no = 123
	{
	int rem = no%10; //rem = 1
	rev = rev*10 + rem; //rev = 4321     321  
	no = no/10;// no = 
	}
	System.out.println(rev);
    }
    private void check_palindrome(int no) {
	
	int no2=no; 
		int rev = 0; 
		while(no>0)  
		{
		int rem = no%10;
		rev = rev*10 + rem;        
		no = no/10; 
		}

		if(no2==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
    }
    private void print_fibo() {
			// TODO Auto-generated method stub
		int first =-1, second = 1;
		int third =0; 
		while(third<55){
		third = first+second; 
		System.out.print(third+" ");
		first  = second; 
		second = third; 
		}

		}
    private void fibo_without_third() {
		// TODO Auto-generated method stub
	int first = -1, second =1; 
	while((first+second)<55)
	{
	System.out.println(first+second);
	second = first+second; //0
	first = second-first; //1
	}
		
	}   
    private void do_while_loop() {
		// TODO Auto-generated method stub
	int no=10; 
	do
	{
	System.out.println(no); 
	no++; 
	}while(no<=5);
	System.out.println(no);
		
	}

}

