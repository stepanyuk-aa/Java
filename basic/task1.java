/*
Даны два целых числа: A, B. Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Input data:"); Scanner in = new Scanner(System.in);
    
        int A = in.nextInt(); int B = in.nextInt();

        if ((A % 2 == 0) || (B % 2 == 0)){
            System.out.println("some variable is even");
        }
        else {
            System.out.println("this variable is not even");
        }
    }
}