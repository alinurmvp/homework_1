import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myAge ;
        int NUM = 13 ;
        String word = "alinur" ;
        myAge = NUM + word ;
        System.out.println("myAge "+ myAge+" NUM " + NUM +  " word " + word);
        if (NUM < 0 ) {
            System.out.println("Вы сохранили отрицательное число");
            } else if (NUM > 0){
            System.out.println("ВЫ сохранили положительное число");
        } else System.out.println("Вы сохранили ноль");



        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Привет, " + username + "!");

        }
         }











