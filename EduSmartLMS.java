package myassignment;

//Interface
interface ProgressTrackable {
 void trackProgress();
}

//Abstract User 
abstract class User {
 private String name;
 private String email;
 private String userId;

 public User(String name, String email, String userId) {
     this.name = name;
     this.email = email;
     this.userId = userId;
 }

 public String getName() {
	 return name;
	 }
 
 public String getEmail()
 {
	 return email; 
	 }
 
 public String getUserId()
 {
	 return userId; 
	 }

 public void setName(String name) 
 { 
	 this.name = name;
	 }
 
 public void setEmail(String email)
 { 
	 this.email = email;
	 }
 
 public void setUserId(String userId) 
 {
	 this.userId = userId;
	 }

 public final void displayWelcome()
 {
     System.out.println("Welcome, " + name + "!");
 }

 public abstract void viewProfile();
}

//Student class
class Student extends User implements ProgressTrackable {
 private String enrolledCourse1;
 private String enrolledCourse2;

 public Student(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void enrollCourse(String courseName) {
     if (this.enrolledCourse1 == null) {
         this.enrolledCourse1 = courseName;
     } else if (this.enrolledCourse2 == null) {
         this.enrolledCourse2 = courseName;
     } else {
         System.out.println(getName() + " cannot enroll in more than 2 courses.");
     }
 }

 @Override
 public void viewProfile() {
     System.out.println("Student Profile:");
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("User ID: " + getUserId());
     System.out.println("Enrolled Courses: " + enrolledCourse1 + ", " + enrolledCourse2);
 }

 @Override
 public void trackProgress() {
     System.out.println(getName() + " is tracking progress in courses.");
 }
}

//Instructor class
class Instructor extends User {
 private String createdCourse1;
 private String createdCourse2;

 public Instructor(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void createCourse(String courseName) {
     if (this.createdCourse1 == null) {
         this.createdCourse1 = courseName;
     } else if (this.createdCourse2 == null) {
         this.createdCourse2 = courseName;
     } else {
         System.out.println(getName() + " cannot create more than 2 courses.");
     }
 }

 @Override
 public void viewProfile() {
     System.out.println("Instructor Profile:");
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("User ID: " + getUserId());
     System.out.println("Created Courses: " + createdCourse1 + ", " + createdCourse2);
 }
}

//Admin class
class Admin extends User {
 public Admin(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void removeUser(User user) {
     System.out.println("Removed user: " + user.getName());
 }

 @Override
 public void viewProfile() {
     System.out.println("Admin Profile:");
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("User ID: " + getUserId());
 }
}

//Course class
class Course {
 private String title;
 private int durationInHours;
 private final int maxStudents;

 public Course(String title, int durationInHours, int maxStudents) {
     this.title = title;
     this.durationInHours = durationInHours;
     this.maxStudents = maxStudents;
 }

 public Course(String title) {
     this(title, 0, 0);
 }

 public void showCourseDetails() {
     System.out.println("Course Title: " + title);
     System.out.println("Duration: " + durationInHours + " hours");
     System.out.println("Max Students: " + maxStudents);
 }
}

public class EduSmartLMS {
 public static void main(String[] args) {
	 
     Student s1 = new Student("Priya", "priya@gmail.com", "S001");
     Student s2 = new Student("Kruthi", "kruthi@gmail.com", "S002");

     Instructor i1 = new Instructor("Karthik", "karthik@gmail.com", "I001");
     Instructor i2 = new Instructor("Rishi", "rishi@gmail.com", "I002");

     Admin admin = new Admin("Admin", "admin@gmail.com", "A001");

     i1.createCourse("C");
     i1.createCourse("C#");
     i2.createCourse("Core Java");
     i2.createCourse("Advanced Java");

     s1.enrollCourse("C");
     s1.enrollCourse("C#");
     s2.enrollCourse("Core Java");
     s2.enrollCourse("Advanced Java");

     s1.viewProfile();
     s2.viewProfile();
     i1.viewProfile();
     i2.viewProfile();
     admin.viewProfile();

     s1.trackProgress();
     s2.trackProgress();

     admin.removeUser(s2);

     Course c1 = new Course("C", 30, 50);
     Course c2 = new Course("C#", 40, 60);
     c1.showCourseDetails();
     c2.showCourseDetails();
 }
}