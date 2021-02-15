package com.example.mockingDemo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class SomeBusinessStubTest {

    @Test
    public void testFindGreatest(){
        SomeBusinessImpl busimpl = new SomeBusinessImpl(new DataServiceStub());
        int res=busimpl.findTheGreatestFromAllData();
        assertEquals(24,res);

    }
}

class DataServiceStub implements DataService{
    @Override
    public ArrayList<Integer> retrieveAllData(){
        return new ArrayList<Integer>(Arrays.asList(24,6,15));
    }

}
