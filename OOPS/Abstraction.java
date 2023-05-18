public class Abstraction {
    public static void main(String args[]){
        one ok = new one();
        ok.sing();
    }
}


// we cannot make object using abstract class

abstract class base{
    base(){
        
        System.out.println("base constructor called");
    }

    // abstract function defination have to be in child class
    abstract void sing();    

}

class one extends base{

    one(){
        
        System.out.println("one's constructor called");
    }
    void sing(){
        System.out.println("this is singing a song");
    }
}


