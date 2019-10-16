package ru.kireev.junit_mockito.calculator.datasource;

public interface DataProvider {

    int getDataInteger();

    double getDataDouble(int seed);

}
