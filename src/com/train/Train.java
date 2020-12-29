package com.train;

/**
 * class train
 */
public class Train {

    private int number;
    private String destination;
    private int timeHours;
    private int timeMinutes;

    private int seatsz;
    private int seatsk;
    private int seatsp;
    private int seatsl;

   public Train() {}

    /**
     *
     * @param number - число вільних місць
     * @param destination -пункт призначення
     * @param timeHours - година відправлення
     * @param timeMinutes - хвилина відправлення
     * @param seatsz - кількість загальних місць
     * @param seatsk - кількість купе
     * @param seatsp - кількість плацкартних
     * @param seatsl - кількість люкс
     */
   public Train(int number,String destination,int timeHours,int timeMinutes, int seatsz,int seatsk,int seatsp,int seatsl)
   {
       this.number = number;
       this.destination = destination;
       this.timeHours = timeHours;
       this.timeMinutes = timeMinutes;
       this.seatsz = seatsz;
       this.seatsk = seatsk;
       this.seatsp = seatsp;
       this.seatsl = seatsl;
   }

    /**
     * @PrintTrain() - ВИводить дані про поїзд
     */
   public void PrintTrain()
   {
       System.out.println("Номер поїзда - " + number);
       System.out.println("Пункт призначення - " + destination);
       if (timeMinutes < 10) {
           System.out.println("Час відправки - " + timeHours + ":0"+ timeMinutes);
       }
       else {
           System.out.println("Час відправки - " + timeHours + ":"+ timeMinutes);
       }
       System.out.println("Число загальних місць - " + seatsz);
       System.out.println("Число купе місць - " + seatsk);
       System.out.println("Число плацкарт місць - " + seatsp);
       System.out.println("Число люкс місць - " + seatsl);

   }
    public int getTimeHours() {
    return timeHours;
    }

    public int getTimeMinutes() {
    return timeMinutes;
    }


    public void setTimeHours(int timeHours) {
        this.timeHours = timeHours;
    }

    public void setTimeMinutes(int timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    public int GetNumber()
{
    return number;
}

public String GetDestination()
{
    return destination;
}

public int GetSeatsz()
{
    return seatsz;
}

public int GetSeatsk()
{
    return seatsk;
}

public int GetSeatsp()
{
    return seatsp;
}

public int GetSeatsl()
 {
     return seatsl;
 }

 public void SetNumber(int number)
 {
     this.number = number;
 }

 public void SetDestination(String destination)
 {
     this.destination = destination;
 }

public void SetSeatsz(int seatsz)
{
    this.seatsz = seatsz;
}

public void SetSeatsk(int seatsk)
{
    this.seatsk = seatsk;
}

public void SetSeatsp(int seatsp)
{
    this.seatsp = seatsp;
}

public void SetSeatsl(int seatsl)
{
    this.seatsl = seatsl;
}



}

