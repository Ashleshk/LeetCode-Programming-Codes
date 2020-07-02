package Week_02;

import java.util.Stack;

/*Backspace String Compare
 
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 * */
public class BackSpaceStringComapre {
	public static boolean backspaceCompare(String S, String T) {
        return backspaceComparehelper(S).equals(backspaceComparehelper(T));
    }
    
	static String  backspaceComparehelper(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='#')
            {
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.push(c);
            }
        }
        return String.valueOf(stk);
    }
    public static  void main(String[] args) {
		String S = "ab#c", T = "ad#c";
		System.out.println(backspaceCompare(S,T));
	}
}
