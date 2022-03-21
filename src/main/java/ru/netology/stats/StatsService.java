package ru.netology.stats;

public class StatsService {
    public int calculateAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int calculateAvgAmount(int[] sales) {
        return calculateAmount(sales) / sales.length;


    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;


    }

    public int monSalesBelowAvg(int[] sales) {
        int bellowAvgMon = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < calculateAvgAmount(sales)) {
                bellowAvgMon++;
            }
            month = month + 1;
        }
        return bellowAvgMon;


    }

    public int monSalesAboveAvg(int[] sales) {
        int AboveAvgMon = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > calculateAvgAmount(sales)) {
                AboveAvgMon++;
            }
            month = month + 1;
        }
        return AboveAvgMon;

    }
}
