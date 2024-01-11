class Student{
    int r_no;
    String name;
    float marks;

    

    Student(){
        this.r_no = 11;
    }
}

public class Oops7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.r_no = 56;
        Student s2 = s1;
        System.out.println(s2.r_no);
        
    }
}
