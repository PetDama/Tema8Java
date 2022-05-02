import java.util.Objects;

public class VagonMarfa extends Vagon {
	protected int nrPasageri = 0;
	protected int nrColete = 300;
	
	public void deschideManualUsile() {
		System.out.println("Se deschid manual usile");
	}

	public void inchideManualUsile() {
		System.out.println("Se inchid manual usile");
	}

	@Override
	public String toString() {
		return "VagonMarfa [nrPasageri=" + nrPasageri + ", nrColete=" + nrColete + "]";
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagonMarfa other = (VagonMarfa) obj;
		return nrColete == other.nrColete && nrPasageri == other.nrPasageri;
	}
	
}
