import java.util.ArrayList;
import java.util.Iterator;


public class Tren {
	public static void main (String[] args)
	{
		ArrayList<Vagon> listaVagoane = new ArrayList<Vagon>();

		VagonCalatoriA V1 = new VagonCalatoriA();
		VagonCalatoriB V2 = new VagonCalatoriB();
		VagonMarfa V3 = new VagonMarfa();
		
		listaVagoane.add(V1);
		listaVagoane.add(V2);
		listaVagoane.add(V3);
		
		Iterator<Vagon> it = listaVagoane.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}	
}
