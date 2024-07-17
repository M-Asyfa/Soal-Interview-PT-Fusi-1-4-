package soal3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
//        Deklarasi object scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

//        Membaca input string yang nantinya diubah menjadi integer
        System.out.println("Enter array of numbers: ");
        String inputLine = scanner.nextLine();
        String[] inputStrings = inputLine.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

//        Perulangan yang berisi proses konversi input string menjadi integer
        for (String string : inputStrings) {
            try {
                int number = Integer.parseInt(string);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + string + " is not a valid integer.");
            }
        }

//        Membaca input k
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

//        Memanggil function rotateArray
        rotateArray(numbers, k);
        System.out.println("Rotated array: " + numbers);

//        Menutup scanner
        scanner.close();
    }

    public static void rotateArray(List<Integer> numbers, int k) {
//        Deklarasi variabel n sebagai ukuran array
        int n = numbers.size();
//        Memastikan bahwa k tidak lebih dari n
        k = k % n;

//        Memanggil function reverse untuk menukar elemen-elemen array
        reverse(numbers, 0, n-1);
        reverse(numbers, 0, k-1);
        reverse(numbers, k, n-1);
    }

    public  static void reverse(List<Integer> numbers, int start, int end) {
//        Melakukan penukaran elemen-elemen array selama kondisi terpenuhi
        while (start < end) {
            Integer temp = numbers.get(start);
            numbers.set(start, numbers.get(end));
            numbers.set(end, temp);
            start++;
            end--;
        }
    }
}
