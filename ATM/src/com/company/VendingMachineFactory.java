package com.company;

public class VendingMachineFactory {

    public static VendingMachine createVendingMachine(){
        return new VendingMachineImpl();
    }
}
