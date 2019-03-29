
public class Accounts {

    public static void main(String[] args) {
        Account accountA = new Account("A", 100);
        Account accountB = new Account("B", 0);
        Account accountC = new Account("C", 0);
        
        transfer(accountA, accountB, 50);
        transfer(accountB, accountC, 25);
        
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
        
    }
    
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
