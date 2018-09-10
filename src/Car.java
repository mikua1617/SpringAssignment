public class Car {

    private Engine engine;
    private Gearbox gearbox;
    private Body body;
    private int speed;
    private String name;


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void accelerateCar(){
        System.out.println(this.getName() + " Car with " + this.getEngine().getDisplacement() + "cc engine is running at " + this.getSpeed()+" kmph");
    }

    public void showStats(){
        System.out.println("It has a "+ this.getGearbox().getType()+" gearbox with "+this.getGearbox().getNumberOfGears()+" gears");
        System.out.println("It has a "+this.getBody().getChassis()+" body that can seat a maximum of "+this.getBody().getSeatingCapacity()+" people");
    }

}

