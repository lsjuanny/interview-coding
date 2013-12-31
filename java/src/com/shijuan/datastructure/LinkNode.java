package com.shijuan.datastructure;

public class LinkNode {
	public int info;
	public LinkNode next;
	public LinkNode(int info) {
		this(info, null);
	}
	public LinkNode(int info, LinkNode next) {
		this.info = info;
		this.next = next;
	}
}
