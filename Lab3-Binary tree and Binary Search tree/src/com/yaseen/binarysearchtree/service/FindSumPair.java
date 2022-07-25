package com.yaseen.binarysearchtree.service;

import java.util.HashSet;

public class FindSumPair
{
	//inserting data to root , left and right Nodes
	public Node insert(Node root,int  key)

	{
		if (root == null)
			return new Node(key);
		if (key < root.nodeData)
			root.leftNode = insert (root.leftNode, key);
		else 
			root.rightNode = insert (root.rightNode, key);
		return root;

	}

	// Finding pair of Exact sum
	public boolean findPairUtil(Node root, int sum, HashSet<Integer> set)

	{
		if (root == null)
			return false;

		if (findPairUtil(root.leftNode, sum, set))
			return true;

		if (set.contains(sum - root.nodeData)) {
			System.out.println("Pair is found (" +(sum - root.nodeData) + "," + root.nodeData + ")" );
			return true;

		}
		else 
			set.add(root.nodeData);
		return findPairUtil(root.rightNode, sum, set);
	}

	// Gives Pairs do not Exist if we cannot find the Exact pair of sum
	public void findPairWithGivenSum(Node root, int sum)

	{

		HashSet<Integer> set = new HashSet<Integer>();
		if (!findPairUtil(root, sum, set))
			System.out.println("Pairs do not Exist");


	}
}
