
package com.example.mockingDemo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;

//looks at the mock, inject mocks annotations, initalises them before running the test
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService mock;
    //same as DataService mock =mock(DataService.class); in each test

    @InjectMocks
    SomeBusinessImpl busimpl;
    //same as  SomeBusinessImpl busimpl = new SomeBusinessImpl(mock); in each test

    @org.junit.Test
    public void testFindGreatest(){

        when(mock.retrieveAllData()).thenReturn(new ArrayList<Integer>(Arrays.asList(24,15,6)));
        int res=busimpl.findTheGreatestFromAllData();
        assertEquals(24,res);

    }

    @org.junit.Test
    public void testFindGreatest_oneval(){

        when(mock.retrieveAllData()).thenReturn(new ArrayList<Integer>(Arrays.asList(1)));
        int res=busimpl.findTheGreatestFromAllData();
        assertEquals(1,res);

    }



}
