package com.yaseen.balancingbracket.main;

import com.yaseen.balancingbracket.service.BalancingBrackets;

public class BalanceBracket
{

	public static void main(String[] args) 

	{
		// creating object of Balancing Brackets class
		BalancingBrackets brackets= new BalancingBrackets();
		
		// hardcoded input
		String bracketExpression = "([[{}]])";

		boolean result;
		result = brackets.checkingBracketsBalanced(bracketExpression); // calling method of Balancing Brackets class

		if (result)
			System.out.println("The entered Strings has Balanced Brackets");
		else 
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}
