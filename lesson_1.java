// Підключення вбудованого класу Scanner в класи, описані в цьому ж файлі
import java.util.Scanner;

public class lesson_1 {

    public static void main(String[] args) {
        // Ініціалізація обʼєкту Scanner
        // В якості параметру передаємо вхідний потік програми (System.in)
        Scanner sc = new Scanner(System.in);

        // Читаємо два цілих числа (зі вхідного потоку) і записуємо їх в змінні "a" і "b"
        System.out.println("Smallest side of rectangle:");
        int a = sc.nextInt();
        System.out.println("Biggest side of rectangle:");
        int b = sc.nextInt();

        // В нову змінну "sum" записуємо суму "a" і "b"
        int area = a * b;
        int P = 2*(a+b);

        // Виводимо у вихідний потік (System.out) значення змінної "sum"
        System.out.println("Rectangle area:"+area);

        System.out.println("Rectangle perimeter:"+P);

    }
}
