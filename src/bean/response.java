package bean;

public class response {
	
	private boolean isSuccess;
	private String desc ;
	
	public response(){}
	public response(String desc, boolean isSuccess) {
		this.desc = desc;
		this.isSuccess = isSuccess;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	
}
