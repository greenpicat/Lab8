package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     * returns an empty list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
    * get the size of the list
    * increase the list by adding a new city
    * check if our current size matches the initial size plus one
    */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City testCity = new City("Testyville", "Testority");
        list.addCity(testCity);
        list.deleteCity(testCity);
        assertEquals(list.getCount(), 0);
    }
    @Test
    public void getCountTest(){
        list = MockCityList();
        list.addCity(new City("Testcity", "TestProvince"));
        list.addCity(new City("Helloville", "Hitario"));
        assertEquals(list.getCount(), 2);
    }


}
