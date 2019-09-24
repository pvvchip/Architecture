package ru.pvv.architecture.observer;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Sensor sensor = new Sensor();

        // подключаем наблюдателей за сенсором
        sensor.attach(new Observer_1());
        sensor.attach(new Observer_2());

        for (; ; ) {
            int random = (int) (Math.random() * 10);
            sensor.setT(random);
            System.out.println("Sensor: " + random);
            Thread.sleep(500);
        }

    }
}
