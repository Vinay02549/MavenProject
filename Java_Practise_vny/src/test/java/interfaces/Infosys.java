package interfaces;

public class Infosys implements Emply {

	@Override
	public void joiningProcess() {
		System.out.println("1. Selection \n2.Documeent Verification\n3.send Offer Letter");
	}

	@Override
	public void PF() {
		System.out.println("As per the standard norm of EPF");
	}

	@Override
	public void allocatework() {
		System.out.println("As per the vacancy Available");
	}

}
