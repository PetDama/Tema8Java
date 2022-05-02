import java.util.Objects;

public class VagonCalatoriB extends Vagon {

	protected int nrPasageri = 50;
	protected int nrColete = 400;
	
	public void deschideAutomatUsile() {
		System.out.println("Se deschid usile");
	}

	public void inchideAutomatUsile() {
		System.out.println("Se inchid usile");
	}
	
	public void deblocheazaAutomatGeamurile() {
		System.out.println("Se deschid geamurile");
	}

	public void blocheazaAutomatGeamurile() {
		System.out.println("Se inchid geamurile");
	}

	public int getNrPasageri() {
		return nrPasageri;
	}

	public int getNrColete() {
		return nrColete;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagonCalatoriB other = (VagonCalatoriB) obj;
		return nrColete == other.nrColete && nrPasageri == other.nrPasageri;
	}
	
}
