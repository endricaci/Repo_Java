package classes_objects;

public class restaurantSeatingSoftware {



    public static void main(String[] args) {

        restaurantSeatingSoftware restaurant = new restaurantSeatingSoftware();

        restaurant.setName("Greenbrook Restaurant");
        restaurant.setCapacity(150);
        restaurant.setGuestCount(35);
        restaurant.getAvailableSeats(15);
    }


    private String name;
    private int guestCap;
    private int guestCount;


    // 1. Create a method that tells user if the seats are available
    public int getAvailableSeats(int cap) {
        this.guestCap = this.guestCap - (this.guestCount + guestCount + cap);
        if (guestCap >= cap) {
            System.out.println( "There are " + (guestCap- cap) + " available seats");
        } else {
            System.out.println("Sorry, no available seats");
        }
        return guestCap;
    }

     // 2. Create a method that seatsParty

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public void setCapacity(int capacityCount) {
        this.guestCap = capacityCount;
    }


    // 3. Create a method that removesParty

    public void setRemovedParty(int removedParty) {
        this.guestCap = this.guestCap + removedParty;
    }

    // 4. Create a method that allows host open for services by passing restaurant name/guestCapacity

    public void nameRest(String name, int guestCap) {
        this.name = name;
        this.guestCap = guestCap;
    }
    // 5. Create a method that printsRestaurantSummary

    public void getRestSum() {
        String summary = " Name: " + name + " Guest Cap: " + guestCap + " Guest count: " + guestCount;
        System.out.println(summary);
    }


    public void setName(String name) {
        this.name = name;
    }
}
