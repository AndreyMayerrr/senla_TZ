import java.util.ArrayList;
import java.util.Scanner;
public class Viselitsa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] wordsList={"яблоко", "банан", "груша", "вишня", "апельсин",
                "книга", "ручка", "карандаш", "тетрадь", "дневник",
                "стул", "стол", "диван", "кресло", "кровать",
                "собака", "кошка", "мышь", "хомяк", "попугай",
                "дом", "квартира", "дача", "балкон", "подвал",
                "цветы", "розы", "лилии", "тюльпаны", "ромашки",
                "солнце", "луна", "звезда", "небо", "облако",
                "вода", "река", "море", "озеро", "фонтан",
                "птица", "воробей", "синица", "голубь", "сова",
                "рыба", "карась", "щука", "окунь", "сом",
                "горы", "лес", "поле", "сад", "парк",
                "город", "деревня", "село", "улица", "дорога",
                "машина", "автобус", "поезд", "самолет", "корабль",
                "компьютер", "телефон", "планшет", "ноутбук", "монитор",
                "музыка", "песня", "танцы", "театр", "кино",
                "спорт", "футбол", "баскетбол", "волейбол", "теннис",
                "еда", "обед", "ужин", "завтрак", "десерт",
                "любовь", "дружба", "семья", "счастье", "мечта",
                "работа", "учеба", "отдых", "путешествие", "приключения",
                "весна", "лето", "осень", "зима", "погода",
                "день", "ночь", "час", "минута", "секунда",
                "время", "прошлое", "настоящее", "будущее", "жизнь",
                "смерть", "рождение", "мир", "война", "мир"
        };
        String answer = wordsList[(int) (Math.random()*wordsList.length)].toUpperCase();
        ArrayList<String> inputs = new ArrayList<String>();
        char[] table =new char[answer.length()];
        int lives = 5;
        System.out.println("Загаданное слово:");
        for(int i = 0;i<table.length;i++){
            table[i]='_';
        }
        for (char ch : table){
            System.out.print(ch);
        }
        System.out.println();
        while (lives != 0){
            System.out.println("Введите букву!"+ "    Количество жизней - "+lives);
            String currentChar=scan.next().toUpperCase();
            if(typedLater(inputs,currentChar)){
                System.out.println("Вы вводили эту букву ранее!");
                continue;
            }
            if (answer.contains(currentChar)){
                for(int i=0;i<answer.length();i++) {
                    if (answer.charAt(i) == currentChar.charAt(0)) {
                        System.out.println("Вы угадали букву!");
                        table[i]=currentChar.charAt(0);
                        }
                    }
                }
            else {
                    System.out.println("Вы не угадали букву!");
                    lives-=1;
                }
            for (char ch : table){
                System.out.print(ch);
                }
            System.out.println();
            if (isEnd(table)){
                System.out.println("Вы выйграли! Поздравляем!");
                break;
                }
            else if(lives==0){
                System.out.println("Вы програли. Попробуйте еще раз!");
                System.out.println("Ответ - "+ answer);
                }
            }

        }
        public static boolean isEnd(char[] table){
            int k=0;
            for(char ch:table){
                if(ch=='_') {
                    k += 1;
                    break;
                }
            }
            return k==0;
        }
        public static boolean typedLater(ArrayList<String> inputs, String currentChar){
        if (inputs.contains(currentChar)){
            return true;
        }
        else{
            inputs.add(currentChar);
            return false;
            }
        }
    }
