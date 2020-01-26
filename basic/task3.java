/*
Дано целое число. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Input data:"); Scanner in = new Scanner(System.in);
    
        int A = in.nextInt(); 

        // Чет/Нечет
        if (A > 0) {
            System.out.println("is negative");
        }
        else if (A == 0) { System.out.println("is zero"); }
        else { System.out.println("is negative"); }   
        
        if (A % 2 == 0){
            if (A != 0) {
                System.out.println("is even");
            }
        }
        else{
            System.out.println("is odd");
        }
    }
}