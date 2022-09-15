/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;



public class Sequence {

    private int capacity;
    private int length;
    private int[] array;

    public Sequence() {
        this.capacity = 4;
        this.length = length;
        this.array = new int[capacity];
    }


    /**
     * Get the length of the sequence.
     *
     * @return the length of the sequence
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Insert element in the sequence. Must be element of Z.
     *
     * @param item the integer that shall be added to the sequence
     */
    public void insert( int item) {

        if(this.length==this.capacity){
            growSize();
        }
        array[length] = item;
        this.length++;
    }

    /**
     * Delete the last int in the sequence. Sequence must contain content.
     *
     * @throws ArrayIndexOutOfBoundsException if sequence does not contain elements
     */
    public void remove() throws ArrayIndexOutOfBoundsException{
        if(length==0){
            throw new ArrayIndexOutOfBoundsException("Sequence cannot be empty");
        }
        if(length<=capacity/2){
            shrinkSize();
        }

        array[length] = 0;
        this.length--;
    }

    /**
     * Doubling the size of the array.
     */
    public void growSize()
    {
        int tempArray[] = null;

        if (this.length == this.capacity){
            tempArray = new int[this.capacity * 2];

            for (int i = 0; i < this.length; i++){
                tempArray[i] = array[i];
            }
        }

        this.array = tempArray;
        this.capacity = capacity * 2;
    }

    /**
     * Half the size of the sequence.
     */
    public void shrinkSize(){
        int temp[] = null;

        if (length > 1/4*capacity) {
            temp = new int[capacity/2];

            for (int i = 0; i < length; i++)
            {
                temp[i] = array[i];
            }

            this.capacity = capacity/2;
            this.array = temp;
        }
    }


    /**
     * Lookup an element of the sequence. Stops on the first matching element.
     *
     * @param item the item that shall be searched for
     * @return -1 if not found, else it returns the index of the item
     * @throws NullPointerException if method is called while sequence is empty
     */
    public int lookUp(int item) throws NullPointerException{
        if(getLength()==0){
            throw new NullPointerException("The sequence is empty");
        }
        int foundItem = -1;
        boolean searching = true;
        int i=0;
        while(i< array.length&&searching){
            if(array[i]==item){
                foundItem = i;
                searching = false;
            }
            i++;
        }
        return foundItem;
    }

}
