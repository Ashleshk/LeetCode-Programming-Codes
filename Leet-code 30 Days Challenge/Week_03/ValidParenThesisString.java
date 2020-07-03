package Week_03;

import java.util.Stack;

public class ValidParenThesisString {
	public static boolean checkValidString(String s) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c == '('){
                stk1.push(i);
            }
            else if(c == '*'){
                stk2.push(i);
            }
            else{
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
                else if(!stk2.isEmpty())
                {
                    stk2.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        while(!stk1.isEmpty() && !stk2.isEmpty()){
            if(stk1.pop()> stk2.pop())
                return false;
        }
        return stk1.isEmpty();
    }
	
	public static void main(String[] args) {
		String str = "(*)";
		System.out.println(checkValidString(str));
	}
}
