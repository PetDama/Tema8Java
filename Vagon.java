import java.util.Objects;

public abstract class Vagon {
	protected int nrPasageri;
	protected int nrColete;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		return nrColete == other.nrColete && nrPasageri == other.nrPasageri;
	}
	
	
}
