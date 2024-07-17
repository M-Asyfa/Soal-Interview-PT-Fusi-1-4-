package soal1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
//        Deklarasi object scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

//        Membaca input string
        System.out.println("Enter string: ");
        String string = scanner.nextLine();

//        Memanggil function isPalindrome
        if (isPalindrome(string)) {
            System.out.println("The string IS a palindrome");
        } else {
            System.out.println("The string IS NOT a palindrome");
        }

//        Menutup scanner
        scanner.close();
    }

    public static boolean isPalindrome(String string) {
//        Mengabaikan semua karakter non alfabet-numerik dan
//        mengubah semua string menjadi lower case
        String filtered = string.replaceAll("[^a-zA-Z]", "").toLowerCase();

//        Deklarasi variabel index yang menunjukkan posisi setiap karakter dalam string
        int left = 0;
        int right = filtered.length() - 1;

//        Perulangan yang berisi perbandingan setiap dua karakter yang bercerminan dalam string
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

//        Kembalikan true jika kondisi dari perbandingan di atas tidak terpenuhi
        return true;
    }
}
