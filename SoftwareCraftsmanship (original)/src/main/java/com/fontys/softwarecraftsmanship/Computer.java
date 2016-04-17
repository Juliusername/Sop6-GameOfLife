package com.fontys.softwarecraftsmanship;

public class Computer {
    
    PartCollection parts = new PartCollection();
    
    public int NumberOfParts() {
        return parts.NumberOfParts();
    }
    
    public void AddPart(Part p) {
        parts.AddPart(p);
    }
    
    public double GetPrice() {
        return parts.GetPrice();
    }
    
    public boolean IsComplete() {
        return this.parts.hasCasing()
            && this.parts.hasProcessor()
            && this.parts.hasMemory()
            && this.parts.hasMotherboard();
    }
}
