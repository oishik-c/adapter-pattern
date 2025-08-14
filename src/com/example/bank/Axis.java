package com.example.bank;

public class Axis implements Bank1{
//    Axis Bank uses the interface of bank 1
    private String AccName;
    private String AccNumber;
    private Double AccBalance;

    public Axis(String Name, String Number, Double AccBalance){
        this.AccName=Name;
        this.AccNumber=Number;
        this.AccBalance=AccBalance;
    }

    @Override
    public String getAccName() {
        return this.AccName;
    }

    @Override
    public String getAccNumber() {
        return this.AccNumber;
    }

    @Override
    public Double getAccBalance() {
        return this.AccBalance;
    }

    @Override
    public void setAccName(String Name) {
        this.AccName = Name;
    }

    @Override
    public void setAccNumber(String Number) {
        this.AccNumber = Number;
    }

    @Override
    public void setAccBalance(Double Balance) {
        this.AccBalance = Balance;
    }

    @Override
    public void printDetails() {
        System.out.println("Account Name: " + this.AccName);
        System.out.println("Account Number: " + this.AccNumber);
        System.out.println("Account Balance: " + this.AccBalance);
    }
}
