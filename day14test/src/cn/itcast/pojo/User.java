package cn.itcast.pojo;

public class User {
	private String name;
	private String mina;
	private String youxiang;
	private String dianhua;
	public User() {
		super();
		
	}
	public User(String name, String mina, String youxiang, String dianhua) {
		super();
		this.name = name;
		this.mina = mina;
		this.youxiang = youxiang;
		this.dianhua = dianhua;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMina() {
		return mina;
	}
	public void setMina(String mina) {
		this.mina = mina;
	}
	public String getYouxiang() {
		return youxiang;
	}
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	public String getDianhua() {
		return dianhua;
	}
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	

}
