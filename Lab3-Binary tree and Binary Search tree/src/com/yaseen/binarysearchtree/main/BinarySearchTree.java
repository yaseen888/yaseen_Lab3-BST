package com.yaseen.binarysearchtree.main;

import com.yaseen.binarysearchtree.service.FindSumPair;
import com.yaseen.binarysearchtree.service.Node;

public class BinarySearchTree {

	public static void main(String[] args)
	{
		Node root = null;
		// creating object of FindSumPair class
		FindSumPair fsp = new FindSumPair();

		//calling methods and input is hardcoded
		root = fsp.insert(root, 40);
		root = fsp.insert(root, 20);
		root = fsp.insert(root, 60);
		root = fsp.insert(root, 10);
		root = fsp.insert(root, 30);
		root = fsp.insert(root, 50);
		root = fsp.insert(root, 70);

		int sum = 130; // use sum = 150 output: Pairs do not Exist
		fsp.findPairWithGivenSum(root, sum);

	}

}
