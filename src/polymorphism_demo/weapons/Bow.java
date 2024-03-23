package polymorphism_demo.weapons;

public class Bow extends Weapon {

    private int arrowAmount;

    public Bow(String name, int impact, int distance, int arrowAmount) {
        super(name, impact, distance);
        this.arrowAmount = arrowAmount;
    }

    @Override
    public void upgrade() {
        this.distance += 5;
    }

    public void earnArrows(int amount){
        this.arrowAmount += amount;
    }

    public void shoot(){
        if(this.arrowAmount > 0){
            this.arrowAmount--;
            System.out.println("🏹🏹🏹 Pfeil abgeschossen! 🏹🏹🏹");
        }else{
            System.out.println("Leider keine Pfeile mehr!");
        }
    }

}
