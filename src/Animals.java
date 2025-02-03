public class Animals {
    public String name;
    public int runDistance;
    public int swimDistance;
    public static int animalCount = 0;

    public Animals(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        animalCount++;
    }

    public void run(int distance) {
        if(distance <= 0) {
            System.out.println("Error! You are trying to run less than 0 distance");
        } else if(distance <= runDistance) {
            System.out.println(this.name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(this.name + " пробежал " + runDistance + " метров.");
        }
    }

    public void swim(int distance) {
        if(distance <= 0) {
            System.out.println("Error! You are trying to swim less than 0 distance");
        } else if(distance <= swimDistance) {
            System.out.println(this.name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(this.name + " проплыл " + swimDistance + " метров.");
        }
    }
}

