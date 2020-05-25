/*-----------------------------------------------------------------------------------------------------
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 106

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.

------------------------------------------------------------------------------*/



import java.util.*;
import java.lang.*;
import java.io.*;
class Anagram{
	public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
	boolean flag;

	    while(t>0){
	        String str1 = sc.next();
	        String str2 = sc.next();
	        //If string length differs print No else Check for Anagram
	        if(str1.length() != str2.length()){
	            System.out.println("NO");
	        }
	        else{
	            flag = isAnagram(str1,str2);
	            System.out.println((flag== true)?"YES":"NO"); 
	        }
	        t--;
	    }
	}
	public static boolean isAnagram(String str1, String str2){
      /*Converting String to char arrat
      Sorting the char array
      Now Compare each character
      if character does not match 
      return false
      */
	    char[] arr1 = str1.toCharArray();
	    char[] arr2 = str2.toCharArray();
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	
	    for(int i = 0; i<arr1.length; i++){
	        if(arr1[i] != arr2[i])
	            return false;
	    }
	return true;
	}
}



!----------!------------!-----------!---------!-----------!
	//The Complexity is O(N)
import java.util.*;

class Anagram{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
	    int t  = sc.nextInt();
		boolean flag;

		    while(t>0){
		        String str1 = sc.next();
		        String str2 = sc.next();
		        //If string length differs print No else Check for Anagram
		        if(str1.length() != str2.length()){
		            System.out.println("NO");
		        }
		        else{
		            flag = isAnagram(str1,str2);
		            System.out.println((flag== true)?"YES":"NO"); 
		        }
		        t--;
		    }
		    sc.close();
		}
		public static boolean isAnagram(String s1, String s2){
			
			char []arr1 = new char[26];
			char []arr2 = new char[26];
			for(int i=0; i<s1.length(); i++) {
				arr1[s1.charAt(i)-'a'] +=1;
			}
			for(int j=0; j<s2.length(); j++) {
				arr2[s2.charAt(j)-'a'] +=1;
			}
			
			for(int k=0; k<26; k++) {
				if(arr1[k] != arr2[k])
					return false;
			}
		return true;
		}
}

	
	
