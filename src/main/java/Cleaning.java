public class Cleaning extends Robot{

  private String chemical;
  private String direction = "north";
  private String area = "living room";

  public String move(String a, String b) {
    direction = a;
    area = b;
    //return this.toString();
    return "I am cleaning " + area + " going " + direction;
  }
  
  public Cleaning() {}
  public Cleaning(String a, String b, String c) {
    super(a, b);
    chemical = c;
  }

  
  public String toString() {
    return super.toString() + ", I use " + chemical + " to clean.";
  }
  
}