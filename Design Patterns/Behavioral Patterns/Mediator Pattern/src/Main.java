import colleague.Button;
import colleague.Heater;
import colleague.Machine;
import colleague.Valve;
import mediator.CottonMediator;
import mediator.DenimMediator;
import mediator.MachineMediator;
import util.Motor;
import util.Sensor;
import util.SoilRemoval;

public class Main {
    public static void main(String[] args) {

        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater =new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println("******************************************************************************");

        mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }
}