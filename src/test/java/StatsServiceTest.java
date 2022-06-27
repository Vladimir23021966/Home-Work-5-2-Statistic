import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void shouldFindSumSales() {
        // 1. Метод - сумма всех продаж
        StatsService sum = new StatsService();
        long expectedSumAll=180;
        long actualSumAll = sum.sumAllSales(sales);
       // System.out.println("Сумма всех продаж -  " + actualSumAll);
        Assertions.assertEquals(expectedSumAll,actualSumAll);
    }

    @Test
    public void shouldFindAverageSales() {
        //2. Метод - Средняя сумма продаж в месяц
        StatsService average = new StatsService();
        double expectedMiddle=15.0;
        double actualMiddle= average.averageSalesAmount(sales);
       // System.out.println("Средняя сумма продаж - " + actualMiddle);
        Assertions.assertEquals(expectedMiddle,actualMiddle );
    }

    @Test
    public void shouldFindMaxMonthSales() {
        // 3. Метод -номер месяца максимальных продаж
        StatsService maxMonth = new StatsService();
        int expectedIndexMaxMonth=8;
        int actualIndexMaxMonth = maxMonth.maxMonthSales(sales);
       // System.out.println("Номер месяца максимальных продаж - " + actualIndexMaxMonth);
        Assertions.assertEquals(expectedIndexMaxMonth,actualIndexMaxMonth);
    }

    @Test
    public void shouldFindMinMonthSales() {
        // 4. Метод -номер месяца минимальных продаж
        StatsService minMonth = new StatsService();
        int expectedIndexMinMonth=9;
        int actualIndexMinMonth = minMonth.minMonthSales(sales);
       // System.out.println("Номер месяца минимальных продаж - " + actualIndexMinMonth);
        Assertions.assertEquals(expectedIndexMinMonth,actualIndexMinMonth);
    }

    @Test
    public void shouldFindMonthLessOverage() {
        // 5. Метод (Кол-во месяцев, в которых продажи были ниже среднего)
        StatsService indexMin = new StatsService();
        int expectedIndexLessMonth =5;
        int actualIndexLessMonth = indexMin.monthLessOverage(sales);
       // System.out.println("Колличество месяцев с продажами ниже средней суммы продаж - " + actualIndexLessMonth);
        Assertions.assertEquals(expectedIndexLessMonth,actualIndexLessMonth);
    }

    @Test
    public void shouldFindMonthMoreOverage() {
        // 6. Метод (Кол-во месяцев, в которых продажи были выше среднего)
        StatsService indexMax = new StatsService();
        int expectedIndexMoreMonth =5;
        int actualIndexMoreMonth = indexMax.monthMoreOverage(sales);
      //  System.out.println("Колличество месяцев с продажами выше средней суммы продаж - " + actualIndexMoreMonth);
        Assertions.assertEquals(expectedIndexMoreMonth,actualIndexMoreMonth);
    }
}
