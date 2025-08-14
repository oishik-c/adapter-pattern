package com.example.bank;

public class AxisToHDFC implements Bank2{
    private String Name;
    private String Number;
    private Double Balance;

    private final Axis axisAcct;

    public AxisToHDFC(Axis axisAcct){
        this.axisAcct=axisAcct;
        this.setProp();
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public void setBalance(Double balance) {
        Balance = balance;
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
    public void printInfo() {
        System.out.println("Account Name: " + this.Name);
        System.out.println("Account Number: " + this.Number);
        System.out.println("Balance: " + this.Balance);
    }

    public void setProp(){
//        Sets the initial properties using the Account initialised with Axis Bank
        setName(this.axisAcct.getAccName());
        setNumber(this.axisAcct.getAccNumber());
        setBalance(this.axisAcct.getAccBalance());
    }
}
