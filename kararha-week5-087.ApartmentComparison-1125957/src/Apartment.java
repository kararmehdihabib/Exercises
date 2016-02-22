
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    //says which apartment is larger when compared between two apartments
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    // returns the price difference between two apartments
    public int priceDifference(Apartment otherApartment) {
        int diff = (this.squareMeters * this.pricePerSquareMeter) - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        if (diff < 0) {
            diff = (-1) * diff;
            return diff;
        }
        return diff;
    }
//says which apartment is expensive when compared between two
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if ((this.squareMeters * this.pricePerSquareMeter) > (otherApartment.squareMeters * otherApartment.pricePerSquareMeter)) {
            return true;
        }
        return false;
    }

}
