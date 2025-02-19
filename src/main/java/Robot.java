public abstract class Robot {

  private String make;
  private String model;
  private static final String DEF_MAKE = "Generic Company";
  private static final String DEF_MODEL = "Standard";

  public abstract String move(String a, String b);
  
  public Robot() {
    this(DEF_MAKE, DEF_MODEL);
  }
  
  public Robot (String a, String b) {
    make = a;
    model = b;
  }
  
  public String toString() {
    return ("I am a " + model + " Robot made by " + make);
  }
  
}