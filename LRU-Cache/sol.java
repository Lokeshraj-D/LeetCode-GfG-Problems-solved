class LRUCache {

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node() {
            this.prev = null;
            this.next = null;
        }

        Node(Node prev, int key, int val, Node next) {
            this.prev = prev;
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public void moveToTail(Node ptr) {
        Node pre = ptr.prev;
        Node nxt = ptr.next;
        pre.next = nxt;
        nxt.prev = pre;

        tail.prev.next = ptr;
        ptr.prev = tail.prev;
        tail.prev = ptr;
        ptr.next = tail;
    }

    public int removeNode(){
        Node ptr = head.next;
        head.next = ptr.next;
        ptr.next.prev = head;
        return ptr.key;
    }

    Map<Integer, Node> map = new HashMap<>();
    int size = 0;
    int capacity;
    public Node head;
    public Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        head.prev = null;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node ptr = map.get(key);
        this.moveToTail(ptr);
        return ptr.val;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key)) {
            Node ptr = new Node(tail.prev, key, value, tail);
            tail.prev.next = ptr;
            tail.prev = ptr;
            map.put(key, ptr);
            ++size;
            if (size > capacity){
                int p = removeNode();
                map.remove(p);
            }

        }else{
            Node ptr = map.get(key);
            ptr.val = value;
            moveToTail(ptr);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
