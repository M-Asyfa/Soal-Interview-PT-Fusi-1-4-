package soal4;

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
//        Deklarasi object scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

//        Membaca input string
        System.out.println("Enter string: ");
        String string = scanner.nextLine();

//        Memanggil function findLongestUniqueSubstring
        findLongestUniqueSubstring(string);
    }

    public static void findLongestUniqueSubstring(String string) {
//        Deklarasi object set untuk menampung substring
        HashSet<Character> set = new HashSet<>();

//        Deklarasi variabel pointer untuk object set
        int start = 0;
        int end = 0;

//        Deklarasi variabel untuk melacak ukuran maksimum dan
//        indeks awal dari substring terpanjang
        int maxStart = 0;
        int maxLength = 0;

//        Melakukan pengecekan setiap karakter selama kondisi terpenuhi
        while (end < string.length()) {
//            Deklarasi variabel untuk menampung setiap karakter yang akan dibandingkan
            char currentChar = string.charAt(end);

//            Proses ini dilakukan jika tidak ditemukan karakter berulang dalam substring
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                end++;

                if (end - start > maxLength) {
                    maxLength = end - start;
                    maxStart = start;
                }
//                Proses ini dilakukan jika ditemukan karakter berulang dalam substring
            } else {
                set.remove(string.charAt(start));
                start++;
            }

        }

//        Hasil akhir substring unik
        string = string.substring(maxStart, maxStart + maxLength);
        System.out.println("The longest unique substring is: " + string);
    }
}
