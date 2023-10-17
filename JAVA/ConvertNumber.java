package convertRomanToInteger;

import java.util.*;

public class ConvertNumber {

	static boolean isValid(String romanNumber) {
        // below line is the regex to check valid roman numbner.
        String validator = "^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        return romanNumber.matches(validator);
    }
    static int convertRoman(String romanNumber) {
        HashMap<Character, Integer> romanIndex = new HashMap<>();
        romanIndex.put('I', 1);
        romanIndex.put('V', 5);
        romanIndex.put('X', 10);
        romanIndex.put('L', 50);
        romanIndex.put('C', 100);
        romanIndex.put('D', 500);
        romanIndex.put('M', 1000);

        int intValue = 0;
        int previous_value = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int current_value = romanIndex.get(romanNumber.charAt(i));

            if (current_value < previous_value) {
                intValue -= current_value;
            } else {
                intValue += current_value;
            }

            previous_value = current_value;
        }

        return intValue;
    }
    

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String romanNumeral = sc.nextLine(); 	//user input for the roman number
        
        // Validation of correct roman number input
        if(isValid(romanNumeral)) {
        	int result = convertRoman(romanNumeral);
        	System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
        }
        else {
        	System.out.println("Invalid input!!!");
        }
    }
}

