// Develop code that makes use of polymorphism
  public class Male extends Person {
    // Use super
    public Male(int a) {
      super(a);
      // TODO Auto-generated constructor stub
    }

    public void setAge(int a) {

      age = a;

      System.out.println("I am in Male");
    }

    public void printInfo() {
      System.out.println("I'm a man");

    }

  }
