public class Ninja{
    // member variables
    private String name;
    private Weapon weapon;
    private Integer health;
    // private int power;


    // CONSTRUCTOR(s)
    public Ninja() {
        this.name = "anonymous";
        this.weapon = new Weapon("punches", 10);
        this.health = 100;
    }

    public Ninja(String name,Weapon weapon){
        this.name = name;
        this.weapon = weapon;
        this.health = 100;
    }

    // METHODS -----
    public void attack(Ninja target) {
        System.out.println(this.getName() + " attacks " + target.getName());
        target.setHealth(target.getHealth() - this.weapon.damage);
        System.out.println(target.getName() + " now has " + target.getHealth() + " hp");
    }

    public String sayHi(Ninja otherNinja) {
        return this.getName() + " says hi to " + otherNinja.getName();
    }

    // --------------- getters and setters ----
    // getter
    public String getName() {
        return this.name;
    }
    // setter
    public void setName(String someName) {
        this.name = someName;
    }

    // getter
    public Weapon getWeapon() {
        return this.weapon;
    }
    // setter
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // getter
    public Integer getHealth() {
        return this.health;
    }
    // setter
    public void setHealth(Integer health) {
        this.health = health;
    }






}