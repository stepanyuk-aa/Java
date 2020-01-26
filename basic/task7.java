/*
Единицы длины пронумерованы следующим образом: 
1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. 
Дан номер единицы длины (целое число в диапазоне 1–5) 
и длина отрезка в этих единицах (вещественное число). Найти длину отрезка в метрах.
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Input data [unit, values]: "); Scanner in = new Scanner(System.in);
    
        int A = in.nextInt(); float B = in.nextInt(); 
        float C = 0;
        
        switch (A) {
            case 1:
                System.out.println("decimeter to meter: " + B / 10);        // Зима
                break;
            case 2:
                System.out.println("kilometer to meter: " + B * 1000);      // Весна
                break;
            case 3:
                System.out.println("meter to meter: " + B);                 // Лето                
                break;
            case 4:
                System.out.println("millimeter to meter: " + B / 1000);     // Осень
                break;
            case 5:
                System.out.println("centimeter to meter: ");                // Зима
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}