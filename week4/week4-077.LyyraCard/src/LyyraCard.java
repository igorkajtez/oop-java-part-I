public class LyyraCard {
    private double balance;
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.0;
    private final double MAX_AMOUNT = 150;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical(){
        if(this.balance>=ECONOMICAL){
            this.balance-=ECONOMICAL;
        }        
    }
    
    public void payGourmet(){
        if(this.balance>=GOURMET){
            this.balance-=GOURMET;
        }        
    }
    
    public void loadMoney(double amount){
        if(amount >= 0){
           this.balance+=amount; 
            
           if(this.balance > MAX_AMOUNT){
               this.balance = MAX_AMOUNT;
           }
        }        
    }
    
    
    

}
