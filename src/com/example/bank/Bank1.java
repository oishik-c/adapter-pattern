package com.example.bank;

public interface Bank1 {
//    Interface for methods used to access Bank1 details
    public String getAccName();
    public String getAccNumber();
    public Double getAccBalance();


    public void setAccName(String Name);
    public void setAccNumber(String Number);
    public void setAccBalance(Double Balance);
    public void printDetails();
}
