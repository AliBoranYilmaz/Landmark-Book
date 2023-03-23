package com.aby.landmarkbookjava;

public class Singleton
{
    /*
    A singleton class is a class that can have only one object (an instance of the class) at a time.
    After the first time, if we try to instantiate the Singleton class,
    the new variable also points to the first instance created.
     */

    private static Singleton singleton;
    // The one and only instance of Singleton class is created
    // static variables/methods can be accessed everywhere

    private Singleton() // Constructor is private!
    {

    }

    public static Singleton getInstance()
    {
        if (singleton == null)
        {
            singleton = new Singleton();
        }

        return singleton;
    }

    // Wherever/whenever i call Singleton.getInstance(), it will return the exact same object.
    // Singleton class can be asked in job interviews.
}
