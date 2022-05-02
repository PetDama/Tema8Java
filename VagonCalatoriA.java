import java.util.Objects;

public class VagonCalatoriA extends Vagon {
	
	protected int nrPasageri = 40;
	protected int nrColete = 300;
	
	public void deschideAutomatUsile() {
		System.out.println("Se deschid usile");
	}
	
	public void inchideAutomatUsile() {
		System.out.println("Se inchid usile");
	}

	@Override
	public String toString() {
		return "VagonCalatoriA [nrPasageri=" + nrPasageri + ", nrColete=" + nrColete + "]";
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
		VagonCalatoriA other = (VagonCalatoriA) obj;
		return nrColete == other.nrColete && nrPasageri == other.nrPasageri;
	}


	
	
}
