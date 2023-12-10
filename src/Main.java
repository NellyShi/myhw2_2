public class Main {
    public static void main(String[] args) {
        int bonusCost = 100;
        int bonus = 0;
        int balance = 80;
        int balanceReplenishment = 5678;

        balance = balance + balanceReplenishment;
        if (balanceReplenishment > 1000) {
            bonus = bonus + balanceReplenishment / bonusCost;
            balance = balance + bonus;
        }

        System.out.println("Итоговый баланс = " + balance + ";" + " бонусы = " + bonus);
    }
}