import java.util.*;

public class _2HashmapImplem {

    static class MyHashMap<K, V> { // Generic in java

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // the number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) { // N - capcity/size of bucket array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFuc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // capacity and load are just to test the program
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n=0;
            for(LinkedList<Node> bucket : oldBuckets){
                for(Node node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        // Traverse the ll and looks for a node with key, If found it return it's index
        // otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public int size() { // return the number of entries in map
            return n;
        }

        public void put(K key, V value) { // insert/update
            int bi = HashFuc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // update
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFuc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // Key doesn't exist
            return null;
        }

        public V remove(K key) {
            int bi = HashFuc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            // Key doesn't exist
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put : ");
        mp.put("1", 10);
        mp.put("2", 20);
         System.out.println("load : "+ mp.load());
        mp.put("3", 30);
         System.out.println("load : "+ mp.load());
        mp.put("4", 40);
        mp.put("5", 50);
        System.out.println("Testing size : ");
        System.out.println(mp.size());

        System.out.println("Testing get : ");
        System.out.println(mp.get("3"));
        System.out.println(mp.get("1"));
        System.out.println(mp.get("5"));
        System.out.println(mp.get("7"));

        System.out.println("Testing remove : ");
        System.out.println(mp.remove("5"));
        System.out.println(mp.remove("7"));
        System.out.println(mp.size());

        System.out.println("Capacity "+ mp.capacity());
        System.out.println("load"+ mp.load()); // <0.75

    }

}