import java.util.Date;

public class Park {
    public class Atractions {
        public String info;
        public String time;
        public int cost;

        public Atractions (String info, String time, int cost) {
            this.info = info;
            this.time = time;
            this.cost = cost;
        }

        public void getInfo() {
            System.out.println(info + "\n" + "Work time " + time + "\n" + "Cost: " + cost);
        }
    }
}




