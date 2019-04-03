
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int price(){
        return this.squareMeters * this.pricePerSquareMeter;
    }
    
    public int priceDifference(Apartment otherApartment){
        //Returns the absolute value of the price difference of the Apartment object(this) and the Apartment object(otherApartment)
        int difference = this.price() - otherApartment.price();
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.price() > otherApartment.price();
    }
            
    
}
