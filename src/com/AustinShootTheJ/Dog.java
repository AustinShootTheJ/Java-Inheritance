package com.AustinShootTheJ;

// the keyword extends is used to subclass in java subclass extends parent class notation. The subclass will have all of the fields present in the parent class
// The primary constructor of the subclass should accept all values of both the superclass and subclass and populate fields present in the superclass using the super keyword.
// Additional fields should be added after the super constructor is called and all other subclass constructors should populate fields using the primary constructor.





public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog() {
        this("test",0,0,0,0,0,0,"yes");
    }


    // in the primary constructor it is important to note that you can save a bit of code by initalizing values that are always the same for a subclass but may vary for the super.
    // in the case of an animal, not all animals have a brain but a dog sure does so we can set the value to 1 directly in our initialization. The value for body is defined in the same way.

    public Dog(String name, int size, int weight, int eyes,int legs, int tail, int teeth, String coat){
        super(name,1,1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this. teeth = teeth;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("dog.chew() called from dog class");

    }

    // if we want to make a function within our subclass similar to what is performed in our superclass we use the override keyword to create a version of that method which is specific to our
    // subclass. If we wish to then call the method present in our super class we will need to use the super keyword before it.

    @Override
    public void eat(){
        System.out.println("eat called from the dog class");
        chew();
        super.eat();
    }

    // overriding the move method in the super to demonstrate a point.

    @Override
    public void move(int speed){
        System.out.println("Dog.Move() called ");
        moveLegs(speed);
        super.move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("moveLegs()) called");
    }

    // this will call the move method from the dog class.
    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }

    // this will call the move method from the animal class
    public void run(){
        System.out.println("dog.run() called");
        super.move(10);

    }

}
