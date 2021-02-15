package com.example.mockingDemo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class SomeBusinessMockTest {

    //instead of creatig multiple ibstancs of data service with diff data for testing,
    //we just mock instances
    @Test
    public void testFindGreatest(){
        DataService mock =mock(DataService.class);
        when(mock.retrieveAllData()).thenReturn(new ArrayList<Integer>(Arrays.asList(24,15,6)));

        SomeBusinessImpl busimpl = new SomeBusinessImpl(mock);
        int res=busimpl.findTheGreatestFromAllData();
        assertEquals(24,res);

    }

    @Test
    public void testFindGreatest_oneval(){
        DataService mock =mock(DataService.class);
        when(mock.retrieveAllData()).thenReturn(new ArrayList<Integer>(Arrays.asList(1)));

        SomeBusinessImpl busimpl = new SomeBusinessImpl(mock);
        int res=busimpl.findTheGreatestFromAllData();
        assertEquals(1,res);

    }



}
