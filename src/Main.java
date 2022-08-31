public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cost = 1100;
        balance = balance + cost;

        if (cost > 1000){
            int bonus = cost / 100;
            balance = balance + bonus;
        }

        System.out.println(balance);
    }
}

