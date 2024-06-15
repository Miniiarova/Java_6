package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {
    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();

        long actual = service.sumSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(180, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();

        long actual = service.averageSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(15, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(8, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        int actual = service.minSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(9, actual);
    }

    @Test
    void shouldCalculateLowSalesMonthsNumber() {
        StatsService service = new StatsService();

        int actual = service.lowSalesMonthsNumber(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(5, actual);
    }

    @Test
    void shouldCalculateHighSalesMonthsNumber() {
        StatsService service = new StatsService();

        int actual = service.highSalesMonthsNumber(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});

        Assertions.assertEquals(5, actual);
    }
}
