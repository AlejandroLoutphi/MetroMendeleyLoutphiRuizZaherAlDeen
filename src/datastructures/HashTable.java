/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package datastructures;

/**
 * Hash Table class, built from an array of lists of elements of type E.
 *
 * @author ayahzaheraldeen
 * @author Alejandro Loutphi
 * @param <E> type of elements to store
 */
public class HashTable<E> extends GenericArray<LinkedList<E>> {

    /**
     * Constructs hash table with passed-in length.
     *
     * @param length length of hash table
     */
    public HashTable(int length) {
        super(length);
        for (int i = 0; i < this.length(); i++) {
            this.set(i, new LinkedList<>());
        }
    }

    /**
     * Hash function some int corresponding to passed-in key.
     * 
     * @param key String to be hashed
     * @param x number to which mod the result
     * @return some int corresponding to passed-in key.
     */
    public static int hashModX(String key, int x) {
        int len = key.length();
        if (len < 3) {
            return 0;
        }

        // Do something kinda random with the first and last few characters
        // These magic numbers are all primes
        int o = key.charAt(0)
                - 1223 * key.charAt(1)
                + 863 * key.charAt(2)
                - 541 * key.charAt(len - 3)
                + 1987 * key.charAt(len - 2)
                - 673 * key.charAt(len - 1);
        if (o < 0)
            o = -o;
        return o % x;
    }

    /**
     * Hash function returning position of element with passed-in key.
     * 
     * @param key String to be hashed
     * @return position of element with passed-in key
     */
    public int hash(String key) {
        return HashTable.hashModX(key, this.length());
    }

    /**
     * Returns true if there are no elements in the table. Otherwise, false.
     * 
     * @return true if there are no elements in the table. Otherwise, false
     */
    public boolean isEmpty() {
        for (int i = 0; i < this.length(); i++) {
            if (!this.get(i).isEmpty())
                return false;
        }
        return true;
    }

    /**
     * Returns the amount of elements housed inside the hash table.
     *
     * @return the amount of elements housed inside the hash table
     */
    public int size() {
        int o = 0;
        for (int i = 0; i < this.length(); i++) {
            for (LinkedListNode<E> j = this.get(i).getHead(); j != null; j = j.getNext()) {
                o++;
            }
        }
        return o;
    }

    /**
     * Returns the element of the input list with the passed-in key or null if there
     * were no matches.
     * 
     * @param key       String key to check for matches
     * @param entryList list to search in
     * @return element of the input list with the passed-in key or null if there
     *         were no matches
     */
    private E lookUpEntryListFor(String key, LinkedList<E> entryList) {
        if (entryList.isEmpty()) {
            return null;
        }
        // For each entry in the entryList
        for (HashTableEntry<E> i = (HashTableEntry<E>) entryList.getHead(); i != null; i = (HashTableEntry<E>) i
                .getNext()) {
            if (i.getKey().equals(key))
                return i.getElt();
        }
        return null;
    }

    /**
     * Returns the element in the table with the passed-in key or null if there were
     * no matches.
     * 
     * @param key String key to check for matches
     * @return the element in the table with the passed-in key or null if there were
     *         no matches
     */
    public E lookUp(String key) {
        int hash = this.hash(key.toLowerCase());
        return this.lookUpEntryListFor(key.toLowerCase(), this.get(hash));
    }

    /**
     * Returns true if there's an element of the input list with the passed-in key.
     * Otherwise, false.
     * 
     * @param key       String key to check for matches
     * @param entryList list to search in
     * @return true if there's an element of the input list with the passed-in key.
     *         Otherwise, false
     */
    private boolean entryListContains(String key, LinkedList<E> entryList) {
        return this.lookUpEntryListFor(key, entryList) != null;
    }

    /**
     * Returns true if there's an element in the table with the passed-in key.
     * Otherwise, false.
     * 
     * @param key String key to check for matches
     * @return true if there's an element in the table with the passed-in key.
     *         Otherwise, false
     */
    public boolean contains(String key) {
        int hash = this.hash(key.toLowerCase());
        return this.entryListContains(key.toLowerCase(), this.get(hash));
    }

    /**
     * Adds passed-in element to the table.
     * 
     * @param key key identifying elt
     * @param elt element to add
     * @return true if element could be added. Otherwise, false
     */
    public boolean add(String key, E elt) {
        String lowerKey = key.toLowerCase();
        int hash = this.hash(lowerKey);
        LinkedList<E> entryList = this.get(hash);
        if (this.entryListContains(lowerKey, entryList)) {
            return false;
        }
        entryList.addAtHead(new HashTableEntry<>(lowerKey, elt));
        return true;
    }

    /**
     * Returns an array with all the hash table's keys.
     * 
     * @return an array with all the hash table's keys
     */
    public String[] keySet() {
        String[] o = new String[this.size()];
        int counter = 0;
        for (int i = 0; i < this.length(); i++) {
            for (HashTableEntry<E> j = (HashTableEntry<E>) this.get(i).getHead(); j != null; j = (HashTableEntry<E>) j
                    .getNext()) {
                o[counter] = j.getKey();
                counter++;
            }
        }
        return o;
    }

    /**
     * Puts the elements of the hash table (that can fit) into the passed-in array.
     * The reason this is a "putEltsInArray" and not a "getEltsArray" is because
     * Java doesn't allow you to create new generic arrays: they have to be passed
     * in as parameters that are not generic.
     * 
     * @param o array to write
     */
    public void putEltsInArray(E[] o) {
        int counter = 0;
        for (int i = 0; i < this.length(); i++) {
            for (HashTableEntry<E> j = (HashTableEntry<E>) this.get(i).getHead(); j != null; j = (HashTableEntry<E>) j
                    .getNext()) {
                if (counter >= o.length) {
                    return;
                }
                o[counter] = j.getElt();
                counter++;
            }
        }
    }
}
