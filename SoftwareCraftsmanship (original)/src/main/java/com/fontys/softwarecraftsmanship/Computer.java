package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {
    
    PartCollection parts;
    
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
