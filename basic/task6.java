/*
Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 -февраль и т. д.). Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Input data: "); Scanner in = new Scanner(System.in);
    
        int A = in.nextInt();
        
        switch (A / 3) {
            case 0:
                System.out.println("Winter");   // Зима
                break;
            case 1:
                System.out.println("Spring");   // Весна
                break;
            case 2:
                System.out.println("Summer");   // Лето                
                break;
            case 3:
                System.out.println("Autumn");   // Осень
                break;
            case 4:
                System.out.println("Winter");   // Зима
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}