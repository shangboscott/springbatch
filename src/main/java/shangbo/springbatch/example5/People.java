package shangbo.springbatch.example5;

public class People implements java.io.Serializable{
	private static final long serialVersionUID = 8904705906008476310L;
	
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
