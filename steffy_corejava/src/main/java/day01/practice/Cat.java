package day01.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;
    private String speak;

//    // Constructor
//    public Cat(int b, String color) {
//        this.age = b;
//        this.color = color;
//    }

    // Getters and setters
    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

		public String speak() {
       return speak;
    }
		 public void setSpeak(String speak) {
		        this.speak = speak;
		    }
		

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat();
    	cat1.setAge(4);
    	cat1.setColor("White");
    	cat1.setSpeak("Meow!");
    	Cat cat2 = new Cat();
    	cat2.setAge(3);
    	cat2.setColor("Black");
    	cat2.setSpeak("Meow!");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.age());
        System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.age());
        System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.speak());
    }
}
