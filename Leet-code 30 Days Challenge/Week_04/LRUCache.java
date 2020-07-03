package Week_04;
/*
 * LRU Cache

Solution
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?

//Example:
//
//LRUCache cache = new LRUCache( 2 /* capacity  )
//
////cache.put(1, 1);
////cache.put(2, 2);
////cache.get(1);       // returns 1
////cache.put(3, 3);    // evicts key 2
////cache.get(2);       // returns -1 (not found)
////cache.put(4, 4);    // evicts key 1
////cache.get(1);       // returns -1 (not found)
////cache.get(3);       // returns 3
////cache.get(4);       // returns 4
//*/

import java.util.*;

class LRUCache {
	    private int capacity;
	    private int size;
	    private Map<Integer, Node> keyToPrev = new HashMap<>();
	    private Node dummyHead = new Node(0, 0);
	    private Node tail = dummyHead;

	    public LRUCache(int capacity) {
	        this.capacity = capacity;
	    }
	    
	    public int get(int key) {
	        if (!keyToPrev.containsKey(key)) {
	            return -1;
	        }
	        moveToTail(key);
	        return tail.value;
	    }
	    
	    public void put(int key, int value) {
	        if (keyToPrev.containsKey(key)) {
	            moveToTail(key);
	            tail.value = value;
	        } else {
	            Node curr = new Node(key, value);
	            keyToPrev.put(key, tail);
	            tail.next = curr;
	            tail = curr;
	            if (size < capacity) {
	                size++;
	            } else {
	                Node first  = dummyHead.next;
	                Node second = first.next;
	                dummyHead.next = second;
	                keyToPrev.remove(first.key);
	                keyToPrev.put(second.key, dummyHead);
	            }
	        }
	    }
	    
	    private void moveToTail(int key) {
 
	        Node prev = keyToPrev.get(key);
	        Node curr = prev.next;
	        // conor case 
	        if (tail == curr) {
	            return;
	        }
	 
	        prev.next = curr.next;
	        tail.next = curr;
	        curr.next = null;
	 
	        keyToPrev.put(prev.next.key, prev);
	        keyToPrev.put(key, tail);
	        
	        tail = curr;
	    }
	    
	    private static class Node {
	        public int key;
	        public int value;
	        public Node next;
	        public Node(int key, int value) {
	            this.key   = key;
	            this.value = value;
	        }
	    }
	}
 