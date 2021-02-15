package com.example.mockingDemo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());
        assertEquals(10,listMock.size());
    }

    @Test
    public void test_multipleReturns(){
        List listMock = mock(List.class);
        //FIRST time returns 10, second call it return 20
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void testGetSpecificFunctionParam(){
        List listMock = mock(List.class);
        //FIRST time returns 10, second call it return 20
        when(listMock.get(0)).thenReturn("string");

        assertEquals("string",listMock.get(0));
        assertEquals(null,listMock.get(2));
    }

    @Test
    public void testGetGenericFunctionParam(){
        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("string");

        assertEquals("string",listMock.get(0));
        assertEquals("string",listMock.get(2));
    }
}
