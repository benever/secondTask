package task;

import java.util.Scanner;

public class MathTask {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        if(a%5==0){ System.out.println("a"+"="+a); }
        if(b%5==0){ System.out.println("b"+"="+b); }
        if(c%5==0){ System.out.println("c"+"="+c); }
        if(a%5!=0 && b%5!=0 && c%5!=0) { System.out.println("Нет значений, кратных 5"); }

        System.out.println("Результат целочисленного деления a на b: " + a/b);
        System.out.println("Результат деления a на b: " + (double) a/b);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceilDiv(a,b));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floorDiv(a,b));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a/b));
        System.out.println("Остаток от деления b на c: " + b%c);
        System.out.println("Наименьшее значение из a и b: " + Math.min(a,b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b,c));

    }
}
