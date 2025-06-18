import java.util.*;
class User  {
    String username;
    String password;
    double balance;
    List<String> transactions;
    User (String username,String password)  {
        this.username=username;
        this.password=password;
        this.balance=0.0;
        this.transactions=new ArrayList<>();
        transactions.add("Account created with balance ₹ 0.0");
    }
    void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited ₹ "+ amount + ",current balance ₹ "+balance);
    }
    boolean withdraw (double amount) {
        if(amount<= balance) {
            balance-=amount;
            transactions.add("withdrew ₹ "+ amount +",current balance ₹ " +balance);
            return true;
        } else {
            transactions.add("failed withdrawal attempt of ₹ "+ amount +"(Insufficient balance)");
            return false;
        }
    }
    void receiverTransfer(String fromUser,double amount) {
        balance += amount;
        transactions.add("Received ₹ "+ amount +"from "+ fromUser +",current balance :₹ "+balance);
    }
    boolean sendTransfer(User toUser ,double amount) {
        if(amount <=balance){
            balance -= amount;
            transactions.add("send ₹ "+ amount +"to "+ toUser.username +",current balance :₹ "+ balance);
            toUser.receiverTransfer(username,amount);
            return true;
        } else {
            transactions.add("failed transfer of ₹" + amount +"to "+toUser.username +"(Insufficient funds)");
            return false;
        }
    }
    void printTransactions() {
        System.out.println("Transactions History for "+username +":");
        for(String t:transactions) {
            System.out.println("- " +t);
        }
    }
}
    
public class BankProject
{
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,User>users=new HashMap<>();
	public static void main(String[] args) {
	    System.out.println("=== Welcome to CLI Bank System===");
	    while(true) {
	        System.out.println("\n1. Login \n2. Signup \n3. Exit ");
	        System.out.print("Enter your choice :");
	        int choice=sc.nextInt();
	        sc.nextLine();
	        switch(choice) {
	            case 1 -> Login();
	            case 2 -> Signup();
	            case 3 -> {
	                System.out.println("Thankyou for using CLI Bank !");
	                return ;
	            }
	            default -> System.out.println("Invalid choice !");
	        }
	    }
	}
	static void Signup() {
	    System.out.print("choose a username:");
	    String username=sc.nextLine();
	    if(users.containsKey(username)) {
	        System.out.println("username already exists, Try login, ");
	        return;
	    }
	    System.out.print("choose a password :");
	    String password=sc.nextLine();
	    users.put(username,new User (username,password));
	    System.out.println("Signup successful ! you can now login .");
	}
	static void Login() {
	    System.out.print("Enter username :");
	    String username=sc.nextLine();
	    if( !users.containsKey(username)) {
	        System.out.println("user doesnot exist , please signup first.");
	        return;
	}
	System.out.print("Enter password :");
	String password=sc.nextLine();
	User user=users.get(username);
	if(!user.password.equals(password))
	{
	    System.out.println("Incorrect password");
	    return;
	}
	System.out.println("login successful ! welcome "+ username);
	userDashboard(user);
	}
	static void userDashboard(User currentUser)
	{
	    while(true){
	        System.out.println("\n--Menu--");
	        System.out.println("1.check balance ");
	        System.out.println("2.deposit ");
	        System.out.println("3.withdraw ");
	        System.out.println("4.view transactions ");
	        System.out.println("5.Transfer money ");
	        System.out.println("6.logout ");
	        System.out.print("choose an option :");
	        int choice =sc.nextInt();
	        sc.nextLine();
	        switch(choice) {
	            case 1 ->System.out.println("current balance:₹ "+currentUser.balance);
	            case 2 -> {
	                System.out.print("Enter deposit amount :₹ ");
	                double amount =sc.nextDouble();
	                currentUser.deposit(amount);
	            }
	            case 3-> {
	                System.out.print("Enter withdraw amount :₹");
	                double amount=sc.nextDouble();
	                if(!currentUser.withdraw(amount)){
	                    System.out.println("Insufficient balance!");
	                }
	            }
	            case 4 -> currentUser.printTransactions();
	            case 5 ->{
	                System.out.print("Enter recepient username :");
	                String toUser=sc.nextLine();
	                if(!users.containsKey(toUser))
	                {
	                    System.out.println("recepient not found !");
	                    break;
	                }
	                if(toUser.equals(currentUser.username)) {
	                    System.out.println("You can't send money to yourself.");
	                    break;
	                }
	                System.out.print("Enter amount to transfer:");
	                double amount=sc.nextDouble();
	                if(currentUser.sendTransfer(users.get(toUser),amount)) {
	                    System.out.println("Transfer successful.");
	                }
	                else 
	                {
	                    System.out.println("Transfer failed due to insufficient funds.");
	                }
	            }
	            case 6 -> {
	                System.out.println("logged out.");
	                return;
	            }
	            default -> System.out.println("Invalid option!");
	        }
	    }
	}
}