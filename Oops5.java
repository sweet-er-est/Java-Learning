// class Student{
//     int r_no;
//     String name;
//     float marks;

//     Student(){
//         this.r_no = 2;
//         this.name = "Cheems";
//         this.marks = 88.9f;
//     }

//     void greeting(){
//         System.out.println("Hello ! My name is " + this.name);
//     }

//     Student(int roll,String name,float marks){
//         this.r_no = roll;
//         this.name = name;
//         this.marks = marks;
//     }

//     Student(Student s1){
//         this.name = s1.name;
//         this.r_no = s1.r_no;
//         this.marks = s1.marks;
//     }
// }

// public class Oops5 {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         System.out.println(s1.r_no);
//         System.out.println(s1.name);
//         System.out.println(s1.marks);
//         s1.greeting();

//         Student s2 = new Student(33,"Chut",56.3f);
//         System.out.println(s2.r_no);
//         System.out.println(s2.name);
//         System.out.println(s2.marks);
//         s2.greeting();

//         Student random = new Student(s1);
//         System.out.println(random.r_no);
//         System.out.println(random.name);
//         System.out.println(random.marks);
//         random.greeting();
//     }
// }
