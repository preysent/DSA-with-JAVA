public class Inheritance {
    public static void main(String atgs[]){

        // Fish f = new Fish();
        // f.eat();
        // f.swim();

        dogs dog = new dogs();
        dog.eats();
        dog.leg();
        dog.teil();
    }
}


// single level inheritance
/*
 * 
 class Animal{
     void eat(){
        System.out.println("eats");
    }
    
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim in water");;
    }
}

*/


// Multilevel inheritance
class Animal{
    void eats(){
        System.out.println("eats the food");
    }
}

class Mamals extends Animal{
    void leg(){        
        System.out.println("use legs to walk");
    }

    // Method overriding this function overrid the function present in base class
    void eats(){
        System.out.println("mamals eats food");
    }
}

class dogs extends Mamals {
    void teil(){
        System.out.println("have a tail");
    }
}