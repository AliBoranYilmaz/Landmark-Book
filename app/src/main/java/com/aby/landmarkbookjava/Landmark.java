package com.aby.landmarkbookjava;

import java.io.Serializable;

// Landmark sinifinin objelerini intentlerle gonderebilmek icin Serializable interface'ini kullandim
public class Landmark implements Serializable
{
    String name;
    String country;
    int image; // gorsellere R.drawable ifadesiyle erisebiliyoruz ve android studio her gorsele bir int atiyor

    // Constructor
    public Landmark (String name, String country, int image)
    {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
