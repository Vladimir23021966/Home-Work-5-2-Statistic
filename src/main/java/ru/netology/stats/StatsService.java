    package  ru.netology.stats;

public class StatsService {
    // 1. Метод - сумма всех продаж
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long value : sales) {
            sum = sum + value;
        }
        return sum;
    }

    // 2. Метод - средняя сумма продаж в месяц
    public double averageSalesAmount(long[] sales) {
        long sum = sumAllSales(sales);
        double middle = (double) sum / sales.length;
        return middle;
    }

    // 3. Метод -номер месяца максимальных продаж
    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int monthMax = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = monthMax;
            }
            monthMax = monthMax + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 4. Метод -номер месяца минимальных продаж
    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Метод (Кол-во месяцев, в которых продажи были ниже среднего)
    public int monthLessOverage(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount(sales))
                count++;
        }
        return count;
    }

    // 6. Метод (Кол-во месяцев, в которых продажи были выше среднего)
    public int monthMoreOverage(long[] sales) {
        int count1 = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount(sales))
                count1++;
        }
        return count1;


    }


}







