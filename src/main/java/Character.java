abstract class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        // el status inicial debe ser siempre REGULAR
        this.status = Status.REGULAR;
    }

    @Override
    public void receiveDamage(int damage){

        if (this.health - damage <=0){
            this.health = 0;
            this.status = Status.DEAD;
        } else{
            this.health = this.health - damage;
        }


    }

    @Override
    public  boolean isAlive(){
        //return health > 0;
        if (this.health>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getCurrentHealth(){
        return this.health;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getStatus(){
        return this.status.name();
    }
}