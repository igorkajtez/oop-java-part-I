
public class MyDate {

    private int day;
    private int month;
    private int year;
    private final int DAYS = 30;
    private final int MONTHS = 12;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean earlier(MyDate compared){
        // first we'll compare years
        if(this.year < compared.year){
            return true;
        }
        // if the years are the same, we'll compare the months
        if(this.year == compared.year && this.month < compared.month){
            return true;
        }
        // years and months the same, we'll compare the days
        if(this.year == compared.year && this.month == compared.month && this.day < compared.day){
            return true;
        }
        return false;
    }
    
    public void advance(){
        this.day++;
        
        if(this.day>DAYS){
            this.day = 1;
            this.month++;
            
            if(this.month>MONTHS){
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int numberOfDays){
        for (int i = 0; i < numberOfDays; i++) {
            advance();            
        }
    }
    
    public MyDate afterNumberOfDays(int days){
    MyDate newMyDate = new MyDate(this.day, this.month, this.year);
    newMyDate.advance(days);
    return newMyDate;
}

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
