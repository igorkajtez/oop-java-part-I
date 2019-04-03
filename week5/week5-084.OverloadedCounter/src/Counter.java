public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int value, boolean check){
        this.value = value;
        this.check = check;
    }
    
    public Counter(int value){
        this(value, false);        
    }
    
    public Counter(boolean check){
        this(0, check);        
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return value;
    }
    
    public void increase(){
        increase(1);
    }
    
    public void increase(int amount){
        if(amount < 0){
            return;
        }
        this.value+=amount;
    }
    
    public void decrease(){
        decrease(1);
    }
    
    public void decrease(int amount){
        if(amount < 0){
            return;
        }  
        if(this.check && this.value < amount){
          this.value = 0;
          return;
        }
        this.value -= amount;

        
    }

}
