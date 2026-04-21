package com.algo.random;

/**
 * Luhn Algorithm — a mathematical checksum invented in 1954 by IBM scientist Hans Peter Luhn. Here's how it works in seconds, entirely on your device:
 * <p>
 * 🔹 Step 1 — Starting from the rightmost digit, double every second digit
 * 🔹 Step 2 — If doubling gives a number > 9, subtract 9
 * 🔹 Step 3 — Sum all the digits
 * 🔹 Step 4 — If total is divisible by 10 → Valid format ✅
 * 🔹 Step 5 — If NOT divisible by 10 → "Invalid card number" ❌
 * <p>
 * Example with 1223 2462 4662 1556:
 * Run Luhn → sum doesn't pass the mod 10 check → rejected instantly, no server call needed.
 * <p>
 * 🔹 Bonus: The first digits also identify the card network:
 * • 4 → Visa
 * • 5 → Mastercard
 * • 3 → Amex
 * • 6 → Discover
 * <p>
 * So the form also auto-detects your card type just from the first digit — again, zero database query.
 */
public class LuhnAlgorithm {


    public static boolean isValidCard(int[] nums) {

        int sum = 0;
        boolean isAlt = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            if (isAlt) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            isAlt = !isAlt;

        }

        return sum % 10 == 0;
    }
}
