public abstract class Car extends Vehicle {
    protected boolean abs;
    protected boolean musicSystem;
    protected boolean airBag;
    protected boolean sunRoof;

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = super.calculatePrice();
        if (abs) {
            totalPrice += 5000;
        }
        if (musicSystem) {
            totalPrice += 1000;
        }
        if (airBag) {
            totalPrice += 3000;
        }
        if (sunRoof) {
            totalPrice += 2000;
        }
        return totalPrice;
    }
}