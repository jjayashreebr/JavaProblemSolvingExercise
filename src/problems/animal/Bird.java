package problems.animal;

public class Bird extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
        Animal c= new Bird();
        c.eat();
        c.sleep();
        }
	public void eat() {
		System.out.println("Bird eat method");
	}

	
	public void sleep() {
		System.out.println("Bird sleep method");
	}
	public void fly() {
		System.out.println("Bird fly method");
	}

}
