public class Person {

  public Person(int a) {
    System.out.println("In Person Constructor");
    age = a;
  }

  protected int age;
  // private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
    System.out.println("I am in Person");
  }

  public void nogender() {
    System.out.println("I am a person!");
  }
}
