package solid.ocp.compliant;

public class Comfort extends DrivingMode{

    @Override
    public void applyMode(Vehicle v) {
        v.setPower(400);
        v.setSuspensionHeight(20);
    }

}
