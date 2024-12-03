public class Item {
    private String name;
    private double weight; // Weight in pounds
    
    // Constructor
      public Item(String name, double weight) {
      this.name = name; 
      this.weight = weight;
      }
      
    // Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String aHName) {
        name = aHName;
    }

    public void setWeight(double aHWeight) {
        weight = aHWeight;
    }


// Copy Constructor and ToString 

 public Item(Item otherItem) {
        this.name = otherItem.name;
        this.weight = otherItem.weight;
    }
  
  public String toString(){
      return name + ": " + weight + "lbs.";
      
      }
  }
  
