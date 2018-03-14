package com.AustinShootTheJ;

// example:  this is a subclass of a subclass. the same rules apply the primary constructor accepts all fields of both the super and sub class
// fields present in the super class are populated using the super constructor and additional fields are populated using the this keyword in the primary constructor.


public class Lab extends Dog {

    private boolean isDumb;

    public Lab(){
        this("dopey",0,0,0,0,0,0,"thick",true);

    }

    public Lab(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat, boolean isDumb) {
        super(name, size, weight, eyes, legs, tail, teeth, coat);
        this.isDumb = isDumb;
    }
}
