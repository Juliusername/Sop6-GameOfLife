/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julius
 */
public class PartCollection {
    
    private List<Part> parts = new ArrayList<>();
    
    public PartCollection() {
        
    }
    
    public void AddPart(Part p) {
        parts.add(p);
    }
    
    public int NumberOfParts() {
        int count = 0;
        for (Part p : parts) { 
            count++;
        }
        return count;
    }
    
    public double GetPrice() {
        double price = 0.0;
        
        for (int i = 0; i < NumberOfParts(); i++) {
            Part part = parts.get(i);
            //price += part.GetPrice();
            price += part.price;
        }
        
        return price;
    }
    
    public boolean hasCasing() {
        for (Part part : parts) {
            return part instanceof Casing;
        }
        return false;
    }
    
    public boolean hasProcessor() {
        for (Part part : parts) {
            return part instanceof Processor;
        }
        return false;
    }
    
    public boolean hasMemory() {
        for (Part part : parts) {
            return part instanceof Memory;
        }
        return false;
    }
    
    public boolean hasMotherboard() {
        for (Part part : parts) {
            return part instanceof Motherboard;
        }
        return false;
    }
}