package solid.ocp.compliant;

public class Sport extends DrivingMode {

    @Override
    public void applyMode(Vehicle v) {
        v.setPower(500);
        v.setSuspensionHeight(10);
    }

}
