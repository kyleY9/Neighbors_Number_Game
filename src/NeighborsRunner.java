public class NeighborsRunner {
    public static void main(String[] args) {
        Dice obj = new Dice(10);
        for (int i = 0; i <= 10; i++) {
            System.out.println(obj.roll());
        }
    }
}
