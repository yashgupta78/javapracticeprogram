/* Write a java program to reverse a given string 
* Condition : 
* The reverse string should be printed in lowercase only.
* Input : WelCome
* output : emoclew
*/
import java.util.*;
public class Solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str = st.toLowerCase();
        for(int i =str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
