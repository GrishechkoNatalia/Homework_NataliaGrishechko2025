public class Cat extends Animals {
    public static int catCount = 0;
    private int fedVolume = 10;
    public boolean isFed = false;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public void eat(Bowl bowl) {
        if (bowl.food >= fedVolume) {
            isFed = true;
            bowl.food -= fedVolume;
        }
    }
}
