// Make a class in separate file with private fields, public getters and setters, a constructor with
// and without parameters.
// Ben
// Car class
public class Car {
  public void print() {
    System.out.println(make);
  }

  private String model;
  private String make;
  private int year;

  // Overload a method
  public Car(String model, String make) {
    this.model = model;
    this.make = make;
  }

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
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
  /**
   * Getting the constructor.
   * 
   * @param m uses m as a model. uses this as a constructor.
   */
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

