package com.example;

public class Carta {

    private int numero;
    private Naipe Naipe;


    public Carta(){
        
    }
    public String imagePath(){
        return "classic-cards/"+ numero + this.Naipe + ".png";

    }
    public int getNumero(){
        return numero;
    
    }

    public Naipe getNaipe(){
       return Naipe;
    }

}