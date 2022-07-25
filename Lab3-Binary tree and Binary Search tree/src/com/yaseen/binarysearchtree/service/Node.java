package com.yaseen.binarysearchtree.service;

public class Node
{
	//creating node and its Data
	int nodeData;

	//creating left and right node
	Node leftNode, rightNode;

	//creating data for left and right node
	Node (int data)
	{
		nodeData = data;
		leftNode = rightNode =null;
	}

}
