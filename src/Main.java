
enum WeaponType {
    SWORD,
    BOW,
    MAGIC
}

class Weapon {
    private WeaponType type;
    private String name;

    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }


    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class GameEntity {
    private String name;
    private int health;


    public GameEntity(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}


class Boss extends GameEntity {
    private Weapon weapon;


    public Boss(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void printInfo() {
        System.out.println("Boss name: " + getName());
        System.out.println("Boss health: " + getHealth());
        System.out.println("Boss weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}


class Skeleton extends Boss {
    private int arrowCount;


    public Skeleton(String name, int health, Weapon weapon, int arrowCount) {
        super(name, health, weapon);
        this.arrowCount = arrowCount;
    }


    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Skeleton arrows: " + arrowCount);
    }
}


public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Dark Lord", 1000, bossWeapon);
        boss.printInfo();


        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 150, skeletonWeapon1, 44);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Shadow Bow");
        Skeleton skeleton2 = new Skeleton("Skeleton Sniper", 200, skeletonWeapon2, 84);


        System.out.println();
        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}
