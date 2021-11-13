public interface Payments {

    void releaseSlot(Slots s);
    int calculateParkingTime();
    int calculateFee();

}
