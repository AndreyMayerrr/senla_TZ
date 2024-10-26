import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args){
        System.out.println("Введите длину пароля от 8 до 12 символов.");
        Scanner scan = new Scanner(System.in);
        int lenPass = scan.nextInt();
        if(lenPass<8 || lenPass>12){
            System.out.println("Введите натуральное число от 8 до 12. Запустите программу снова.");
        }
        System.out.println("Ваш пароль: "+generatePassword(lenPass));

    }
    public static String generatePassword(int lenPass) {

        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-={}|:;'<>,.?/";
        Random rnd = new Random();
        StringBuilder password = new StringBuilder(lenPass);
        for (int i = 0; i < lenPass; i++) {
            int nextChar = rnd.nextInt(alphabet.length());
            password.append(alphabet.charAt(nextChar));
        }
        return password.toString();

    }
}
