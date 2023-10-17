package pangram_check;

import java.util.*;

public class PangramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence: ");
        String s = sc.nextLine();		// taking string input from user
        boolean check[] = new boolean[26];
        
        int flag = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                check[s.charAt(i) - 'A'] = true;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                check[s.charAt(i) - 'a'] = true;
            }
            else    continue;
        }
        
        for(int i=0; i<26; i++){
            if(check[i] == false){
                flag=1;
                break;
            }
        }
        if(flag == 1)    System.out.print("NOT Pangram");
        else System.out.print("Pangram");
        
        sc.close();
        
    }

}
