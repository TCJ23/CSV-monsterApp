package monster;

public class Monster {
    public int id ;
    public int health;
    public int damage;
    public String name;

    public Monster(int id, int health, int damage, String name) {
        this.id = id;
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public String toString() {
        return "monster.Monster " + this.name + " ID " + this.id + "has health " + this.health +  "current damage is " + this.damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
