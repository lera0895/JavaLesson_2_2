public class Main {
    public static void main(String[] args) {

        int beginnen = 100; // начальный счет
        int transfer = 100; // сумма пополнения
        int bonus;
        if (transfer > 1000) {
            bonus = transfer / 100;
        } else {bonus = 0; }

        int end = beginnen + transfer + bonus;

        System.out.println("Финальный счет:" + end );
        System.out.println("Бонусный счет:" + bonus);
    }
}