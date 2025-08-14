package com.example.bank;

public interface Bank2 {
//    Interface for methods used to access Bank1 details
    public String getName();
    public String getNumber();
    public Double getBalance();


    public void setName(String Name);
    public void setNumber(String Number);
    public void setBalance(Double Balance);
    public void printInfo();
}
