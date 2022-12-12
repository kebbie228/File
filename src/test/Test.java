package test;

import java.util.*;

public class Test {
    /* Студенты нескольких групп сдают экзамен по одному предмету, который оценивается по шкале от 1 до 10.
     Вывести список студентов и их оценок для выбранной группы с сортировкой по фамилиям; по оценкам.
     После списка группы вывести статистику (количество студентов, получивших 10 баллов, 9 баллов и т.д.;
     среднюю успеваемость по выбранной группе).

     */
    public static void main(String[] args) {
        Student st1 = new Student("Dima", 3, 1);
        Student st2 = new Student("Kolya", 6, 5);
        Student st3 = new Student("Nikita", 9, 2);
        Student st4 = new Student("Miroslav", 7, 3);
        Student st5 = new Student("Svatoslav", 10, 3);

       StudentList studentList=new StudentList();
       studentList.addStudent(st1);
       studentList.addStudent(st2);
       studentList.addStudent(st3);
       studentList.addStudent(st4);
       studentList.addStudent(st5);
//studentList.printfList();
//studentList.printfListByGrope(3);
//studentList.printfListSortByMark();
//studentList.studentStatic();
//System.out.println( "avetage score " + studentList.averageScore());
        StudentList2 studentList2=new StudentList2();
        studentList2.addStudent(st1,st1.getMark());
        studentList2.addStudent(st2,st2.getMark());
        studentList2.addStudent(st3,st3.getMark());
        studentList2.addStudent(st4,st4.getMark());
        studentList2.addStudent(st5,st5.getMark());
        studentList2.printfList2();

    }
}

class StudentList2 {
    private Map<Student,Integer> studentList2 = new HashMap<>();

    public void addStudent(Student st,int m) {
        studentList2.put(st,m);
    }
    public void  printfList2(){
        for (Student student: studentList2.keySet())
            System.out.println( student.toString());
    }
}
 class StudentList {
     private List<Student> studentList = new ArrayList<>();
     public void addStudent(Student st){
         studentList.add(st);
     }
     public void  printfList(){
         for (Student student:studentList)
             System.out.println( student.toString());
     }
     public void  printfListByGrope(int a){
         for (Student student:studentList)
             if(student.getGrope()==a) System.out.println( student.toString());
     }
     public void  printfListSortByMark( ){
         Collections.sort(studentList,Comparator.comparing(Student::getMark));

         for (Student student:studentList){
              System.out.println( student.toString());
         }
     }
     public void studentStatic(){
         for (Student student:studentList){
             for(int i=10;i>=0;i--)
                 if(student.getMark()==i)
                 System.out.println("mark "+ i+" "+student.getName());
         }
     }
     public double averageScore (){
         double avg;
         int sum=0;
         int i=0;
         for (Student student:studentList){
             sum+=student.getMark();
             i++;
         }
         avg=sum/i;
         return avg;

     }
 }