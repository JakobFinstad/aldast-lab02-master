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
        this.capacity = 100;
        this.length = length;
        this.array = new int[capacity];
    }


    public int getLength() {
        return this.length;
    }

    public void insert( int item) {
        if(this.length==this.capacity){
            growSize();
        }
        array[length] = item;
        this.length++;
    }

    public void remove() {
        if(length<=capacity/2){
            shrinkSize();
        }

        array[length] = 0;
        this.length--;
    }

    public int search(int item) {
        int index = -1;

        for(int i=0;i<length;i++){
            if(array[i]==item){
                index=i;
                i=length;
            }
        }

        return index;
    }
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

    public int lookUp(int item){

    }

}
