
public class oops {
    public static void main(String args[]){

        // student st = new student();
        // st.name = "praveen";
        // st.id = 5032;

        
        // student st = new student(3848,"subham","bsc it");
        // System.out.println(st.id+" - "+st.name+" - "+st.course);


        
        student std = new student(3848,"subham","bsc it");
        student st = new student(std);
        System.out.println(st.id+" - "+st.name+" - "+st.course);
    }
}


class student{
    public String name;
    public int id;
    public String course;
    public int marks[];


    // coundstructor
    student(){
        id = 00;
        name = "Admin";
        marks = new int[3];
    }

    // perameterized constructor
    student(int id,String name,String cour){
        this.id = id;
        this.name = name;
        course = cour;
    }

    // //shallow copy constructor  ( changace reflects )
    // student(student std){
    //     this.name = std.name;
    //     this.course = std.course;
    //     this.marks = std.marks;
    // }

    //deep copy constructor  ( changace reflects )
    student(student std){
        this.name = std.name;
        this.course = std.course;

        for(int i=0;i<this.marks.length;i++){
            this.marks[i]=std.marks[i];
        }
    }


    // java dont have distructor becouse it have in bult garbage collector wich automatically dealocate memory location wich is accoupied by that object
}

