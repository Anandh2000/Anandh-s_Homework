package exam;

public class Clerk {
	private int id;
	private String name;
	private String work;
	public Clerk(int id, String name, String work) {
		super();
		this.id = id;
		this.name = name;
		this.work = work;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Clerk [id=" + id + ", name=" + name + ", work=" + work + "]";
	}
	
}
