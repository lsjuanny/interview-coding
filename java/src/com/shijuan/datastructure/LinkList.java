package com.shijuan.datastructure;

public class LinkList {
	LinkNode head;
	LinkNode tail;

	public LinkList() {
		cleanup();
	}

	public void init(int info) {
		head = new LinkNode(info);
		if (tail == null) {
			tail = head;
		}
	}

	public void cleanup() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void append(int info) {
		if (!isEmpty()) {
			tail.next = new LinkNode(info);
			tail = tail.next;
		} else {
			tail = head = new LinkNode(info);
		}
	}

	public int deleteFromHead() {
		int info = Integer.MIN_VALUE;
		if (head == tail) {
			cleanup();
		} else {
			head = head.next;
			info = head.info;
		}
		return info;
	}

	public int deleteFromTail() {
		int info = Integer.MIN_VALUE;
		if (head == tail) {
			cleanup();
		} else {
			info = tail.info;
			LinkNode tmp = head;
			while (tmp.next != tail) {
				tmp = tmp.next;
			}

			tail = tmp;
			tail.next = null;
		}

		return info;
	}

	public void printAll() {
		for (LinkNode tmp = head; tmp != null; tmp = tmp.next) {
			System.out.println(tmp);
		}
	}

	public boolean isInList(int info) {
		boolean rval = false;
		for (LinkNode tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.info == info) {
				return true;
			}
		}

		return rval;
	}

	public void delete(int info) {
		if (head == tail) {
			if (head.info == info) {
				cleanup();
				return;
			}
		} else if (head.info == info) {
			head = head.next;
		} else {
			LinkNode pre, tmp;
			for (pre = head, tmp = head.next; tmp != null && tmp.info!=info; pre=pre.next, tmp = tmp.next) {
				;
			}
			
			if(tmp != null) {
				pre.next = tmp.next;
				if(tmp == tail) {
					tail = pre;
				}
				tail.next = null;
			}
		}
	}
}
