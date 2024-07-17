package soal2;

import java.util.*;

public class TwoSum {
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

//        Membaca input target
        System.out.println("Enter target: ");
        int target = scanner.nextInt();

//        Memanggil function findTwoSum
        findTwoSum(numbers, target);

//        Menutup scanner
        scanner.close();
    }

    public static void findTwoSum(List<Integer> numbers, int target) {
//        Perulangan bersarang yang berisi perbandingan antara
//        jumlahan dua angka elemen array dan target
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == target) {
                    System.out.println("The numbers which their sum matches the target are located at index: (" + i + ", " + j + ")");
                    return;
                }
            }
        }
    }
}
