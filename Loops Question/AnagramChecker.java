import java.util.Arrays;
public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {

        int n1 = str1.length(); 
        int n2 = str2.length(); 
  
        if (n1 != n2) 
            return false; 
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();


        Arrays.sort(arr1); 
        Arrays.sort(arr2); 
  
        for (int i = 0; i < n1; i++) 
            if (arr1[i] != arr2[i]) 
                return false; 
  
        return true; 
    }
}