import java.util.*;


public class Welcome {
 
	static HashMap<String, String> customer = new HashMap<String, String>();
	
	static Scanner  input = new Scanner(System.in);
	public static void  withdraw() // withdraw method
	{   System.out.println(" Money Deduccted"); }
	
	
	public static void  sendMoney() // method to send money
	
	
	{
		
		System.out.println(" Money Sent"); 	
		
	} 
	
	
	public static void  makeDeposit() //method to send money 
	
	{
		
		System.out.println(" Money Deposited"); 
	}
	
	
	public static void viewAccountBalance() // method to view balance in account
	{
		System.out.println(" You H"); 
	}

	
	public static void  Login() // method for the user to login
	{
		
		System.out.println("Enter Your Details");
	    String accountNumber =  input.nextLine();
		
	    
	   System.out.println(" Welccome" + "  " + accountNumber + " " + "Please Select From The Following");
	
	   for (int i=1 ; i <4 ; i++) {   // For Loop To Display User Options After Logging In
		  
		 
		if (i == 1) {System.out.println(i + "  " + " Make Deposit");}
		 
		      
		if (i == 2) {System.out.println(i + "  " + " Make Deposit");}
		   
		   
		if (i == 3) {System.out.println(i + "  " + " Make Deposit");}
		 
		if (i == 4) {System.out.println(i + "  " + " Make Deposit");}
		      
		 
		 }
		 
		
		
		
		int userSelection =  input.nextInt();
		
		
		if (userSelection == 1) {
			
			withdraw();
			
			
			}
		
		
		
		
		else if (userSelection == 2) {
			
			sendMoney();
			
			
			}
		else if (userSelection == 3) {
			
			viewAccountBalance();
			
			
			}
		
		
		
		   
	   }
	   
	
		
	
	
	public static void  signUp() {
 
		
		
		for (int i = 1 ; i < 5 ; i++) {
			
			
		
		switch (i) {
		
		case 1 : System.out.println("Enter First Name");
		String firstName = input.nextLine();
		customer.put("FirstName", firstName);
		
		         
		break;
		
		
		
		
		case 2 :  System.out.println("Enter Last Name");
		 String lastName = input.nextLine() ;
		 customer.put("Last Name", lastName);
			
		break;
		case 3 :  System.out.println("Enter Password");
			String password = input.nextLine();  
			String balance = "0";
			    	 customer.put("Password", password);	
			    	 customer. put("Balance", balance);
			break;
			
		case 4 :
			
		System.out.println(customer);
		   
		   
		
		}	
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String arg[]) 
	
	{
		Scanner scan = new Scanner (System.in);// Creating Scanner for selection
		// Message THat Prompts the user to select an option
		System.out.println("Please Select From The Following");
		
		for (int i=1; i<3 ; i++) {
			
			
		
			if (i == 1) {System.out.println(i + " "+ "Log In");}
			else if (i == 2) {System.out.println(i + " "+ "Sign Up");}
			
			
			
			
			}
		int  input = scan.nextInt();   //  Taking In User Input
	
		switch (input) {      // Switch Statement  for user selection
		case  1 :  Login();
		break;
		case 2 : signUp();
			
			}
			
			
			
			
	
			}
		   
		
		   
			
		}
		
	;


