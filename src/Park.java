public class Park {
    public class Attraction {
        private String name;
        private int worktime;
        private int price;

        public Attraction(String name, int worktime, int price) {
            this.name = name;
            this.worktime = worktime;
            this.price = price;
        }
    }

    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }
}