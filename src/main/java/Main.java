
public class Main {
  
  public static void main(String[] args) {//main method
    
    System.out.println("Testing override, overload, and abstract. \n\n\n\n");

    //Robot rOne = new Robot("Roomba", "Mopper");
    //Robot rTwo = new Robot();
    Cleaning cOne = new Cleaning("Roomba", "Floor Cleaner", "Pine sol");
    Exploration eOne = new Exploration("Mars One", "Mapping", "Mass Spectrometer");
    
    //System.out.println(rOne);
    //System.out.println(rTwo);
    System.out.println(cOne + cOne.move("south", "700MPH"));
    System.out.println(eOne + eOne.move("west", "10MPH"));
    
  }//end method
  
}//end class