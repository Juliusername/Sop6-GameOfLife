package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        Computer c = new Computer();
        
        c.AddPart(new Casing("Cooler Master Centurion 6", 49.50, "Midi tower"));
        c.AddPart(new Processor("Intel i7-4790", 295.0, 3.6));
        c.AddPart(new Memory("G.SKILL Ripjaws X Series", 99.99, "DDR3", 16));
        c.AddPart(new Motherboard("MSI H97 PC MATE - Socket 1150 - ATX", 89.0));
                      
        System.out.println( c.IsComplete() ? "Total price is EUR " + c.GetPrice() : "Your computer is not ready yet..." );
    }
}
