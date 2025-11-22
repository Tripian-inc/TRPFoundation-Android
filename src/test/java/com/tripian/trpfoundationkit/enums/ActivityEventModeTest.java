package com.tripian.trpfoundationkit.enums;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ActivityEventModeTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void should() {
        assertThat(ActivityEventMode.OPEN_USER_PROFILE_ACTIVITY.toString(), is("OPEN_USER_PROFILE_ACTIVITY"));
        assertThat(ActivityEventMode.LOG_OUT.toString(), is("LOG_OUT"));
        assertThat(ActivityEventMode.LOG_IN.toString(), is("LOG_IN"));
    }
}