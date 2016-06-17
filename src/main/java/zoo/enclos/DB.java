package zoo.enclos;

import java.util.ArrayList;
import java.util.List;


/*
 * collection uses index rather than a real Enclos Id,
 *  we could've used a map instead...
 *   just for the sake of a simple CRUD system...
 * 
 */



public class DB {
	private static DB instance = null;
	private static List<Enclos> EnclosList;

	protected DB() {
		//only to defeat instantiation.
	}

	public static DB getInstance() {
		if (instance == null) {
			instance = new DB();
			EnclosList = new ArrayList<Enclos>();
			EnclosList.add(new Enclos("Enclos Bla bla 1", "200.45", "Description Enclos des blablabla # 1"));
			EnclosList.add(new Enclos("Enclos Bla bla 2", "20.05", "Description Enclos des blablabla # 2"));
			EnclosList.add(new Enclos("Enclos Bla bla 3", "40.25", "Description Enclos des blablabla # 3"));
		}
		return instance;
	}

	public Enclos getByIndex(int index) {
		return EnclosList.get(index);
	}

	public List<Enclos> getAll() {
		return EnclosList;
	}

	public void add(Enclos enclos) {
		EnclosList.add(enclos);
	}

	public void update(Enclos enclos, int position) {
		EnclosList.remove(position);
		EnclosList.add(enclos);
	}

	public void remove(int position) {
		EnclosList.remove(position);
	}
	
//	private String JsonifyList(List<Enclos> myList){
//		StringBuilder sb = new StringBuilder();
//		sb.append("{");
//		sb.append("\"enclos\":");
//		sb.append("[");
//		for (Enclos enclos : myList) {
//			sb.append(Jsonify(enclos));
//			if(myList.indexOf(enclos)<myList.size()-1)
//			sb.append(",");
//		}
//		sb.append("]");
//		sb.append("}");
//		return sb.toString();
//	}
//	
//	private String Jsonify(Enclos obj){
//		StringBuilder sb = new StringBuilder();
//		sb.append("{");
//		sb.append("\"name\":");
//		sb.append("\""+obj.getName()+"\",");
//		sb.append("\"area\":");
//		sb.append("\""+obj.getArea()+"\",");
//		sb.append("\"description\":");
//		sb.append("\""+obj.getDescription()+"\"");
//		sb.append("}");
//		return sb.toString();
//	}
}
