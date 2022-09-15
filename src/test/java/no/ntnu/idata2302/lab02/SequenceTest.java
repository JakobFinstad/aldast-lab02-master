/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;


import static org.junit.Assert.*;
import org.junit.Test;

import javax.crypto.SealedObject;


public class SequenceTest
{

    @Test
    public void emptySequenceHasLengthZero() {
        var sequence = new Sequence();
        assertEquals(0, sequence.getLength());
    }


    @Test
    public void zeroInputOnInsert(){
        var sequence = new Sequence();
        sequence.insert(0);
        assertEquals(1,sequence.getLength());
    }

    @Test
    public void negativeValuesInSequence(){
        var sequence = new Sequence();
        sequence.insert(-3);
        assertEquals(1,sequence.getLength());
    }

    @Test
    public void removeTest(){
        var sequence = new Sequence();
        sequence.insert(0);
        sequence.remove();
        assertEquals(0,sequence.getLength());
    }

    @Test
    public void removeFromEmptySequence(){
        var sequence = new Sequence();
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->{sequence.remove();});
    }

    @Test
    public void lookUpPositiveTest(){
        var sequence = new Sequence();
        for(int i=0;i<5;i++){
            sequence.insert(i);
        }
        assertEquals(3,sequence.lookUp(3));
    }

    @Test
    public void lookUpNotFound(){
        var sequence = new Sequence();
        for(int i=0;i<5;i++){
            sequence.insert(i);
        }
        assertEquals(-1,sequence.lookUp(19));
    }

    @Test
    public void lookUpEmptySequence(){
        var sequence = new Sequence();
        assertThrows(NullPointerException.class,()->{sequence.lookUp(3);});
    }

}
