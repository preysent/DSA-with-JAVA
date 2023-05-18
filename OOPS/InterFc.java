/*
we have some keyword in java
 
1. static
2. super   (use to excess parenet class in child class)
 */


//one importent concept is----------- Constructor chaining in java ---------------
public class InterFc{
        public static void main( String args[]){
            System.out.println("hello  world");

            praveen pr = new praveen();
            pr.name();
            pr.Interest();
            pr.hobby();
        }
}

    // Interface
    /*
        * All methods are public , abstract & without implementation
        * Use to achive totoal abstraction
        * Variable in interfaces are final public and static
     */

// interface student

interface student{
    void name();
    void Interest();
}

interface boy{
    void hobby();
}


// class wich implements(extends) interface

// multiple inheritance
class praveen implements student, boy{
    public void name(){
        System.out.println("my name is praveen");
    }
    public void Interest(){
        System.out.println("my instrest is js");
    }
    public void hobby(){
        System.out.println("my hobby is just a time pass");
    }
}

class Dhananjay implements student{
    public void name(){
        System.out.println("my name is Dhananjay");
    }
    public void Interest(){
        System.out.println("my instrest is qutex");
    }
}
   

class Sarvesh implements student{
    public void name(){
        System.out.println("my name is Sarvesh");
    }
    public void Interest(){
        System.out.println("my instrest is upsc");
    }
}
   
    
    
    
    
    