
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        zero =  cents < 10 ? "0" : "";
        return euros + "." + zero + cents + "e";        
    }
    
    public Money plus(Money added){
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;        
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented){
        Money newMoney = null;
        
        int newEuros = this.euros - decremented.euros;
        int newCents = Math.abs(this.cents - decremented.cents);
        
        if(this.cents < decremented.cents){
            newCents = Math.abs(100 - decremented.cents);
            newEuros--;
        }
        
        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents %= 100;
        }
        newMoney = new Money(newEuros, newCents);
        
        if(this.less(decremented)){
            newMoney = new Money(0, 0);
        }
        
        return newMoney;
    }

}
