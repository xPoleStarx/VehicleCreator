public abstract class Vehicle {
    protected int basePrice;

    public int calculatePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " with a base price of " + basePrice + " TL";
    }
}