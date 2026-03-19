package solid.lsp.compliant;

public interface IGroundVehicle extends IVechicle {

	public int changeGear(int n);
	public void switchPassengerAirBag(boolean on);
	public void accelerate();
}
