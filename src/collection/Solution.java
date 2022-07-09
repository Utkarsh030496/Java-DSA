package collection;

import java.util.Stack;

	class Solution {
	    public boolean isValid(String s) {
	        Stack<Character> stack = new Stack();
	        for(int i=0;i<s.length();i=i++){
	            char c = s.charAt(i);
	            if(c == '(' || c== '{' || c == '[') {
	                stack.push(c);}
	            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();}
	            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();}
	            else if(c == '}' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();}
	            else {
	                return false;}
	        }
	        return stack.isEmpty();
	    }
	    public static void main(String[] args) {
			Solution s = new Solution();
	    	System.out.println(s.isValid("()"));
		}
	}

