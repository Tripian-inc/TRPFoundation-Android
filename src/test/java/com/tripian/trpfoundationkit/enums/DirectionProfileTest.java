package com.tripian.trpfoundationkit.enums;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DirectionProfileTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void should() {
        assertThat(DirectionErrorStatus.WALKING.toString(), is("WALKING"));
        assertThat(DirectionErrorStatus.AUTOMOBILE.toString(), is("AUTOMOBILE"));
    }
}