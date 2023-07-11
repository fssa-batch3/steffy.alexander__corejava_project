package misc.day04;

//Hare.java Assume the below code is a separate Hare.java file



class Hare {

public void init() {

System.out.println("init-");

}

protected void race() {

System.out.println("hare-");

}

}



//Tortoise.java Assume the below code is a separate Tortoise.java file






public class Tortoise extends Hare {

protected void race(Tortoise hare) {

hare.init(); // x1

hare.race(); // x2

System.out.print("tortoise-");

}

public static void main(String[] args) {

Tortoise tortoise = new Tortoise();

Tortoise hare = new Tortoise();

tortoise.race(hare);

}

}