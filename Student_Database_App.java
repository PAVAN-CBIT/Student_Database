public  StudentDatabaseApp
{
 public static void main(string[] args)
 {
 
 System.out.print("enter no of students to enroll: ");
 scanner in = new scanner (System.in);
 int noofstudents=in.nextint();
 Student[]student = new student[no of students];
 for(n=0;n<noOfStudents;n++)
    {
    students[n]=new student();
    students[n].enroll();
    students[n].paytuition();
    
     }
     for(n=0;n<noOfstudents;n++)
     {
     System.out.println(Students[n]to String());
     }
 
 
 
 }


}
