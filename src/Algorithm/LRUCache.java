package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final DoubleList list;
    private final Map<Integer, Node> map;
    private final int MaxSize;

    public LRUCache(int capacity) {
        MaxSize = capacity;
        list = new DoubleList();
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(map.get(key));
            list.add(map.get(key));
            return map.get(key).value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        if (map.containsKey(key)) {
            list.remove(map.get(key));
            map.put(key, node);
            list.add(map.get(key));
        } else {
            if (list.getSize() >= MaxSize) {
                map.remove(list.removeLast());
            }
            list.add(node);
            map.put(key, node);
        }
    }
}

class Node {
    Node pre;
    Node next;
    int key;
    int value;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class DoubleList {
    Node head;
    Node tail;
    int size;

    public DoubleList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        size = 0;
        head.next = tail;
        tail.pre = head;
    }

    public void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        size--;
    }

    public int removeLast() {
        Node last = tail.pre;
        remove(last);
        return last.key;
    }

    public void add(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next = node;
        node.next.pre = node;
        size++;
    }

    public int getSize() {
        return this.size;
    }
}
