package com.shijuan.datastructure;

public class LinkList {
	LinkNode head;
	LinkNode tail;
	
	public void addFromHead(int info) {
		head = tail = new LinkNode(info);
	}

}
