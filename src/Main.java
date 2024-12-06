public class Main {
    public static void main(String[] args) {

       int originalAmount = 100;
       int replenishment = 1100;
       int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment/100;
        } else {
            bonus = 0;
        }

        int finalBalance = originalAmount + replenishment + bonus;

        System.out.println(finalBalance);
    }
}