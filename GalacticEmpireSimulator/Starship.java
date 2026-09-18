package GalacticEmpireSimulator;

public class Starship {

    private final String name;
    private final int armor;
    private final Weapon weapon;
    private final Engine engine;

    private Starship(Builder builder){
        this.name = builder.name;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
        this.engine = builder.engine;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    public Engine getEngine() {
        return engine;
    }
 
    public void deploy() {
        System.out.println( "Starship [name=" + name + ", armor=" + armor +  "]");
        this.engine.start();
    }

    public static class Builder{

        private final String name;
        private int armor = 100;
        private Weapon weapon;
        private Engine engine;
        
        public Builder(String name){
            this.name = name;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }
   
        public Builder setWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Starship build(){
            return new Starship(this);
        }

    }
    
}
