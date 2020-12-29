package com.company;
/**
 * Лабораторна робота №2
 * @autor Roman Turok
 * @version 1.0
 */
import com.train.Train;
import java.util.Scanner;
/**
 * Імпорти необхідних даних
 */
public class Main {
    public static void main(String[] args) {
        /**
         * @Train[] Trains - масив поїздів
         * @city - Місто яке перевіряється, задається користувачем
         * @hour - Година яка перевіряється, задається користувачем
         * @minute - Хвилина яка перевіряється, задається користувачем
         */
        Train[] Trains = new Train[6];
        Scanner in = new Scanner(System.in);
        String city;
        System.out.println("Введіть місто призначення  -");
        city = in.nextLine();
        int hour;
        System.out.println("Введіть годину прибуття  -");
        hour =  in.nextInt();
        int minute;
        System.out.println("Введіть хвилину призначення  -");
        minute =  in.nextInt();

        Trains[0] = new Train(34, "Одеса", 16,15, 30, 20, 6, 5);
        Trains[1] = new Train(13, "Київ", 7,15, 1, 7, 10, 14);
        Trains[2] = new Train(85, "Львів", 22,55, 40, 15, 1, 0);
        Trains[3] = new Train(4, "Одеса", 12,45, 8, 0, 15, 0);
        Trains[4] = new Train(28, "Вінниця", 13,10, 25, 7, 10, 7);
        Trains[5] = new Train(5, "Полтава", 9,00, 0, 3, 0, 2);
        /**
         * Виклик функцій
         * @WithIdenticalDestination - з однаковим місцем призначення
         * @WithIdenticalTimeDestination - в однакове місто після заданого часу
         * @WithSeats - з вільними місцями
         */
        WithIdenticalDestination (Trains, city);
        WithIdenticalTimeDestination(Trains, hour,minute, city);
        WithSeats(Trains,city);
    }


    public static void WithIdenticalDestination(Train[] Trains, String destination)
    {
        System.out.println("Поїзди, що прямують до " + destination);

        for (int i = 0; i < Trains.length; i++) {
            if (Trains[i].GetDestination().equals(destination)) {
                Trains[i].PrintTrain();
            }
        }
    }


    public static void WithIdenticalTimeDestination(Train[] Trains, int timeHours,int timeMinutes, String destination)
    {
        if (timeMinutes < 10) {
            System.out.println("Поїзди, що прямують до " + destination
                    + " та " + "відправляються після " + timeHours + ":0" + timeMinutes);
        }
        else {
            System.out.println("Поїзди, що прямують до " + destination
                    + " та " + "відправляються після " + timeHours + ":" + timeMinutes);
        }


        for (int i = 0; i < Trains.length; i++)
        {
            if ((Trains[i].GetDestination().equals(destination))&
                    (Trains[i].getTimeHours()>=timeHours&&Trains[i].getTimeHours()>timeMinutes))
            {
                Trains[i].PrintTrain();
            }
        }

    }

    public static void WithSeats(Train[] Trains, String destination)
    {
        System.out.println("Поїзди, що прямують до " + destination
        + " і мають загальні місця");

        for (int i = 0; i < Trains.length; i++)
        {
            if ((Trains[i].GetDestination().equals(destination))&(Trains[i].GetSeatsz() > 0))
            {
                Trains[i].PrintTrain();
            }
        }

    }

















}