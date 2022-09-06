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


public class SequenceTest
{

    @Test
    public void emptySequenceHasLengthZero() {
        var sequence = new Sequence();
        assertEquals(0, sequence.getLength());
    }

}
