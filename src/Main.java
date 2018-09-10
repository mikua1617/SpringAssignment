
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        /*
        Car swift = new Car();
        Engine MJD = new Engine();
        Gearbox fiveSpeed = new Gearbox();
        Body hatchBack = new Body();

        hatchBack.setChassis("Monocoque");
        hatchBack.setSeatingCapacity(4);
        hatchBack.setComposition("High Tensile Steel");

        MJD.setDisplacement(1300);
        MJD.setFuel("Diesel");
        MJD.setHorsepower(74.5);

        fiveSpeed.setNumberOfGears(5);
        fiveSpeed.setType("Manual H-type");

        swift.setBody(hatchBack);
        swift.setEngine(MJD);
        swift.setGearbox(fiveSpeed);
        swift.setSpeed(24);
        swift.setName("Swift");
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car) context.getBean("car");

        car.accelerateCar();
        car.showStats();


    }



}
