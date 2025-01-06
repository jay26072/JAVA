/* 43.Write a generic method to count the number of elements in a collection that have a specific
property (for example, odd integers, prime numbers, palindromes).*/

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Ex43 {
    public static <T> long countIf(Stream<T> stream, Predicate<T> predicate) {
        return stream.filter(predicate).count();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of property to check:");
        System.out.println("1. Odd integers");
        System.out.println("2. Prime numbers");
        System.out.println("3. Palindromes");
        System.out.println("4. Armstrong numbers");

        System.out.print("Enter your choice:");
        int choice = scanner.nextInt();

        System.out.println("Enter the number of elements in the collection:");
        int n = scanner.nextInt();

        Stream<Integer> numbers = Stream.generate(() -> scanner.nextInt()).limit(n);

        long count;
        switch (choice) 
        {
            case 1:
                count = countIf(numbers, x -> x % 2 != 0);
                System.out.println("Number of odd numbers: " + count);
                break;
            case 2:
                count = countIf(numbers, x -> isPrime(x));
                System.out.println("Number of prime numbers: " + count);
                break;
            case 3:
                System.out.println("Enter the strings:");
                Stream<String> strings = Stream.generate(() -> scanner.next()).limit(n);
                count = countIf(strings, x -> isPalindrome(x));
                System.out.println("Number of palindromes: " + count);
                break;
            case 4:
                count = countIf(numbers, x -> isArmstrong(x));
                System.out.println("Number of Armstrong numbers: " + count);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String x) {
        return x.equals(new StringBuilder(x).reverse().toString());
    }

    //  Armstrong number
    public static boolean isArmstrong(int x) {
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == x;
    }
}