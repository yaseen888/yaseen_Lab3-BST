package com.yaseen.balancingbracket.service;

import java.util.Stack;

public class BalancingBrackets {

	public boolean checkingBracketsBalanced(String bracketExpression)
	{
		Stack <Character> stack = new Stack<Character>();

		for (int i = 0; i < bracketExpression.length(); i++)
		{
			char character = bracketExpression.charAt(i);
			// ( [ { push to stack
			if (character == '(' || character == '[' || character == '{')
			{
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char c;

			// ) } ] pop from stack
			switch (character) {

			case '}':
				c = stack.pop();  // c = {
				if (c == '(' || c == '[')
					return false;
				break;

			case ')':
				c = stack.pop(); // c = (
				if (c == '{' || c == '[')
					return false;
				break;

			case ']':
				c = stack.pop(); // c = [
				if (c == '{' || c == '(')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}

