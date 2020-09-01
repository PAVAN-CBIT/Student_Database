public class student
{
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalence;
    private static int costofCourse = 600;
   private static  int ID = 1000;
   public Student()
   {
    
     Scanner in = new Scanner(System.in);
     System.out.print("Enter student first name");
     this.firstName = in.nextline();
     
     System.out.print("Enter student last name");
     this.lastName = in.nextline();
     System.out.print("1 - Freshmen\n2 -Sophmore\n3 -Junior\n4 - Senior\nEnter student class level");
     this.gradeYear = in.nextInt();
     setStudentID()
     System.out.println(firstName+""+lastName+""+studentID);
        
      
   }
  private void setStudentID()
  {
    id++;
    this.studentID =gradeYear+""+id;
  }
  public void enroll(){
     do{
       System.out.print("Enter course to enroll(Q to quit): ");
       Scanner in = new Scanner(System.in);
       String course = in.nextline();
       if(!course.equals(Q))
       {
       courses = courses+\n+course;
         tuitionBalance = tuitionBalance+costOfCourse;
       }
       else
         {
           System.out.println("BREAK");
           break;
         
       
        }
     
     
     
    }While(1!=0);
    {
    
      System.out.println("ENROLLED IN:"+courses);
    
    
    }
  
    public void viewBalance()
    {
    
    System.out.println("your balance is $"+tuitionBalance);
      
    }
  public void payTuition()
  {
    
    viewBalance();
    System.out.println("Enter your payment: $");
    Scanner in = new Scanner(System.in);
    int payment =in.nextInt();
    tuitionBalance = tuitionBalnce-payment;
    System.out.println("Thank you for your payment of $"+payment);
    viewBalance();
     }
    public String toString
    {
      return "Name: "+firstName+" "+lastName+"\nGradelevel:"+gradeYear+"\n StudentID:"+studentID
      +"\ncourses Enrolled"+courses+\nBalance: $+tuitionBalance;
    
    }
  }





}
