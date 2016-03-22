package bean;

public class bcar {
	private String code;
	private String name1;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public bcar() {}
	public bcar(String lcCode) {
		super();
		this.code = lcCode;
	}
	

}
