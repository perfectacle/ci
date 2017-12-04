package com.github.perfectacle.ci;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testAdd() {
        assertThat(Sum.add(1, 2), is(3));
    }
}