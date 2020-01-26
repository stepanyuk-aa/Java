/*
Дано целое число, лежащее в диапазоне 1–999. Вывести его строку
описание вида «четное двузначное число», «нечетное трехзначное число»
и т. д.
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Input data: "); Scanner in = new Scanner(System.in);
    
        int A = in.nextInt(); 

        // Проверка на чет/нечет
        if (A % 2 == 0) { System.out.print("even"); }
        else            { System.out.print("odd"); }

        // Узнаём количество разрядов
        if      (A / 10   == 0) { System.out.println(" and unequivocal      "); }
        else if (A / 100  == 0) { System.out.println(" and double-digit     "); }
        else if (A / 1000 == 0) { System.out.println(" and three-digit      "); }
        else                    { System.out.println(" and more three-digit "); }
    }
}