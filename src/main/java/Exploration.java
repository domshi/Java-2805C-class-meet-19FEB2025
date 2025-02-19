public class Exploration extends Robot {

  private String scienceThing;
  private String direction = "north";
  private String speed = "0";

  public String move(String a, String b) {
    direction = a;
    speed = b;
    //return this.toString();
    return "I am moving " + speed + " " + direction;
  }
  
  public Exploration() {}
  public Exploration (String a, String b, String c) {
    super(a, b);
    scienceThing = c;
  }

  
  public String toString() {
    return super.toString() + ": Science thing is " + scienceThing + ", moving " + direction + " at " + speed + " speed.";
  }
  
}