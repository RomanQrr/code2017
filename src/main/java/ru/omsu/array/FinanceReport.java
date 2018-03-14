package ru.omsu.array;

import java.io.*;

public class FinanceReport {
    Payment[] payments;
    public FinanceReport(int i){
        payments = new Payment[i];
    }
    public FinanceReport(FinanceReport f){
        this.payments=f.payments.clone();
    }
    public int getLength(){
        return payments.length;
    }
    public Payment getPayment(int i){ //по хорошему нужно кидать эксепшон
        return payments[i];
    }
    public void readPayment(DataInputStream strm, int index){
        try
        {
            StringBuilder NSF = new StringBuilder();
            for(int i = strm.readInt();i>0;i--){
                NSF.append(strm.readChar());
            }
            int day = strm.readInt();
            int month = strm.readInt();
            int year = strm.readInt();
            int amount = strm.readInt();
            payments[index] = new Payment(NSF.toString(),day,month,year,amount);
        }
        catch(IOException e){

        }
    }
    public void writePayment(DataOutputStream strm, int index){
        String NSF = payments[index].getNSF();
        try{
            strm.writeInt(NSF.length());
            strm.writeChars(NSF);
            strm.writeInt(payments[index].getDay());
            strm.writeInt(payments[index].getMonth());
            strm.writeInt(payments[index].getYear());
            strm.writeInt(payments[index].getAmount());
        }
        catch (IOException e){

        }

    }
    public void writePaymentAsString(DataOutputStream strm, int index){
        int rub = payments[index].getAmount();
        int penny = rub % 100;
        rub = (rub - (penny))/100;
        try{
            strm.writeChars(String.format("Плательщик: «%s» дата: %d.%d.%d сумма: %d руб. %d коп.", payments[index].getNSF(),
                    payments[index].getDay(), payments[index].getMonth(), payments[index].getYear(), rub, penny));
        }
        catch (IOException e){

        }
    }
    public void writePaymentsStartingWith(DataOutputStream strm, char c){
        for(int i=0;i<payments.length;i++){
            if(payments[i].getNSF().charAt(0) == c){
                writePaymentAsString(strm, i);
            }
        }
    }
    public void writePamentsLessThan(DataOutputStream strm, int amount){
        for(int i=0;i<payments.length;i++){
            if(payments[i].getAmount()<amount){
                writePaymentAsString(strm,i);
            }
        }
    }
}
