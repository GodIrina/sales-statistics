package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void TotalCalculateAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 208;
        int actual = service.calculateAmount(sales);
        assertEquals(expected, actual);

    }


    @Test
    void calculateAvgAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 17;
        int actual = service.calculateAvgAmount(sales);
        assertEquals(expected, actual);

    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);


    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 4;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }


    @Test
    void monSalesBelowAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 5;
        int actual = service.monSalesBelowAvg(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monSalesAboveAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 30, 17, 20, 19, 22, 7, 25, 14, 18};
        int expected = 6;
        int actual = service.monSalesAboveAvg(sales);
        assertEquals(expected, actual);

    }
}
