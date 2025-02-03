public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Гуся");
        cats[1] = new Cat("Мартин");
        cats[2] = new Cat("Алиса");

        Bowl bowl = new Bowl(10);
        for(int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);

            if(cats[i].isFed) {
                System.out.println("Кот " + cats[i].name + " сытый.");
            } else {
                System.out.println("Кот " + cats[i].name + " голодный.");
            }
        }
    }
}