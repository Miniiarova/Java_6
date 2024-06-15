package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowSalesMonthsNumber(long[] sales) {
        int monthsNumber = 0;
        long averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                monthsNumber++;
            }
        }
        return monthsNumber;
    }

    public int highSalesMonthsNumber(long[] sales) {
        int monthsNumber = 0;
        long averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                monthsNumber++;
            }
        }
        return monthsNumber;
    }
}

