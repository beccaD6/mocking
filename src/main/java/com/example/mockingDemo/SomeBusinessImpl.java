package com.example.mockingDemo;

import java.util.ArrayList;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){
        ArrayList<Integer> data = dataService.retrieveAllData();
        int g = data.stream().max(Integer::compare).get();
        return g;
    }

}
