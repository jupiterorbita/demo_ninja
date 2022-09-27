public class TesterNinja{
    public static void main(String[] args) {

        
        // instantiate class

        Weapon skateboard = new Weapon("skateboard", 20);

        Ninja ninja1 = new Ninja("Michael Angelo", skateboard);
        Ninja turtle2 = new Ninja("Leonardo", new Weapon("katanas", 22));
        // Ninja nemesis = new Ninja("Shredder", "claws", 40);
        Ninja mystery = new Ninja();

        turtle2.attack(ninja1);
        String message = turtle2.sayHi(ninja1);
        System.out.println(message);
        //   Integer x = ninja1.getHealth();
        //   System.out.println(x);
        //   System.out.println(turtle2.getName());

    }
}