package ru.pvv.architecture.value_object;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public MyDate add(MyDate myDate) {
        int tempDay = myDate.getDay();
        int tempMonth = myDate.getMonth();
        int tempYear = myDate.getYear();

        //  Упрощение. Предположение, что во всех месецах 30 дней
        tempDay += this.day;
        if (tempDay > 30) {
            tempDay -= 30;
            tempMonth++;
        }

        tempMonth += this.month;
        if (tempMonth > 12) {
            tempMonth -= 12;
            tempYear++;
        }

        tempYear += this.year;

        return new MyDate(tempDay, tempMonth, tempYear);
    }
}
