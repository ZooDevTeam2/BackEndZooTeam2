package zoo.enclos;

import java.util.ArrayList;
import java.util.List;

public class EnclosManager implements IEnclos{
	private static List<Enclos> EnclosList;

	public static List<Enclos> getEnclosList() {
		return EnclosList;
	}

	public static void setEnclosList(List<Enclos> enclosList) {
		EnclosList = enclosList;
	}

	public EnclosManager() {
		EnclosList = new ArrayList<Enclos>();
		EnclosList.add(new Enclos("Enclos Bla bla 1", "200.45", "Description Enclos des blablabla # 1"));
		EnclosList.add(new Enclos("Enclos Bla bla 2", "20.05", "Description Enclos des blablabla # 2"));
		EnclosList.add(new Enclos("Enclos Bla bla 3", "40.25", "Description Enclos des blablabla # 3"));
	}
	
	/* (non-Javadoc)
	 * @see zoo.enclos.IEJBDB#getByIndex(int)
	 */
	@Override
	public Enclos getByIndex(int index) {
		return EnclosList.get(index);
	}

	/* (non-Javadoc)
	 * @see zoo.enclos.IEJBDB#getAll()
	 */
	@Override
	public List<Enclos> getAll() {
		return EnclosList;
	}

	/* (non-Javadoc)
	 * @see zoo.enclos.IEJBDB#add(zoo.enclos.Enclos)
	 */
	@Override
	public void add(Enclos enclos) {
		EnclosList.add(enclos);
	}

	/* (non-Javadoc)
	 * @see zoo.enclos.IEJBDB#update(zoo.enclos.Enclos, int)
	 */
	@Override
	public void update(Enclos enclos, int position) {
		EnclosList.remove(position);
		EnclosList.add(enclos);
	}

	/* (non-Javadoc)
	 * @see zoo.enclos.IEJBDB#remove(int)
	 */
	@Override
	public void remove(int position) {
		EnclosList.remove(position);
	}
}
