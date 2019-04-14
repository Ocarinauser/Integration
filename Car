  // Make a class in separate file with private fields, public getters and setters, a constructor
  // with
  // and without parameters.
  // Ben
  // Car class

  public class Car {
    public void print() {
      System.out.println(make);
    }
    
  // PSI 3 requirement 2
  // Overload a method
 
    private String model;
    private String make;
    private int year;

    public Main(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public Main(String model, String make) {
    this.model = model;
    this.make = make;
  }
   
    public String getInfo() {
      return "Make is " + make + "\nModel is " + model;
    }

    public void setModel(String m) {
      model = m;
    }

    public String getModel() {
      return model;
    }

    public void setMake(String ma) {
      make = ma;
    }

    public String getMake() {
      return make;
    }

    public void setYear(int y) {
      year = y;
    }

    public int getYear() {
      return year;
    }



    // constructor with parameters
    public Car(String m) { // header for constructor
      // called automatically when objects created
      this.model = m;
      make = "Unknown";
    }

    // Constructor without parameters
    public Car() {
      year = 1998;
    }

  }
