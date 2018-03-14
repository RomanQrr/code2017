package ru.omsu.array;

public class Payment {

    String NSF; //name, second name, family name
    int day, month, year; //date of payment
    int amount; //payed in pennies

    public String getNSF() {
        return NSF;
    }

    public void setNSF(String NSF) {
        this.NSF = NSF;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (day != payment.day) return false;
        if (month != payment.month) return false;
        if (year != payment.year) return false;
        if (amount != payment.amount) return false;
        return NSF != null ? NSF.equals(payment.NSF) : payment.NSF == null;
    }

    @Override
    public int hashCode() {
        int result = NSF != null ? NSF.hashCode() : 0;
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "NSF='" + NSF + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }

    public Payment(String NSF, int day, int month, int year, int amount) {
        this.NSF = NSF;
        this.day = day;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }
    public Payment(){
        NSF = "";
        day = 0;
        month = 0;
        year = 0;
        amount = 0;
    }
}
