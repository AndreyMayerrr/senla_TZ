import java.text.DecimalFormat;
import java.util.Scanner;

public class CourseOfMoney {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("#.##");
        final double fkp = 129.6822; //Фунт Фолклендских островов
        final double ghs = 13.9436; //Ганский седи
        final double hrk = 14.1658; //Хорватская куна
        final double jod  = 137.1746; //Иорданский динар
        final double awg = 53.7330; //Арубанский флорин
        System.out.println("Это конвертер валют. Введите количество денег в рублях.");
        double rub = scan.nextDouble();
        System.out.println("Ваши " + rub+" рублей можно поменять на:");
        System.out.println(money.format(rub/fkp)+" фунтов Фолклендских островов");
        System.out.println(money.format(rub/ghs)+" ганских седи");
        System.out.println(money.format(rub/hrk) + " хорватских кун");
        System.out.println(money.format(rub/jod)+ " иоданских динар");
        System.out.println(money.format(rub/awg)+ " арубанских флоринов");
    }
}
