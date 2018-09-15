
public class ClassExample{

  public static void main(String... args) {
    
    
  }
}


class Example {
 private String name;
 private int roll;
 private int day;
 private int month;
 private int year;

 public void setName(String name) {
   this.name = name;
 }
 public void setRoll(int roll) {
   this.roll = roll;
 }
 public void setBirth(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;

 }

 public String getName() {
  return(this.name);
 }
 public int getRoll() {
  return(this.roll);
 }
 public int getDay() {
   return(this.day);
 }
 public int getYear() {
   return(this.year);
 }
 public int getMonth() {
   return(this.month);
 }
  
 public String getBirth() {
   return(day+"/"+month+"/"+year);
 }
}



















