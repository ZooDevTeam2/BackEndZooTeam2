package zoo.enclos;

public class Enclos {
	private String name;
	private String area;
	private String Description;

	public Enclos() {
	}

	public Enclos(String name, String area, String description) {
		super();
		this.name = name;
		this.area = area;
		Description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Enclos [name=" + name + ", area=" + area + ", Description=" + Description + "]";
	}
}
