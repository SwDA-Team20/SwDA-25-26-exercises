package solid.lsp.compliant;

public interface IFlyingVehicle extends IVechicle {

	public int changeGear(int n);
	public void accelerate();
	public void takeoff() ;
	public void land();
}
