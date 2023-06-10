public class Sity extends Car {
    public Sity() {
        basePrice = 40000;
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public String toString() {
        return super.toString() + " with Music System and Sunroof optionals";
    }
}