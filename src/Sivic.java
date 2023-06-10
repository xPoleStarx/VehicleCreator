public class Sivic extends Car {
    public Sivic() {
        basePrice = 50000;
    }

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
    public String toString() {
        return super.toString() + " with ABS, Music System, Air Bag, and Sunroof optionals";
    }
}

