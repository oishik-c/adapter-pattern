package com.example.bank;

public class SBI implements Bank2{
//    SBI uses the interface of bank 2
    private String Name;
    private String Number;
    private Double Balance;

    public SBI(String Name, String Number, Double Balance){
        this.Name=Name;
        this.Number=Number;
        this.Balance=Balance;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getNumber() {
        return this.Number;
    }

    @Override
    public Double getBalance() {
        return this.Balance;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setNumber(String number) {
        this.Number = number;
    }

    @Override
    public void setBalance(Double balance) {
        this.Balance = balance;
    }

    @Override
    public void printInfo() {
        System.out.println("Account Name: " + this.Name);
        System.out.println("Account Number: " + this.Number);
        System.out.println("Balance: " + this.Balance);
    }
}
