

public class User {
	// ÓÃ»§Ãû
	private String name;
	// ÃÜÂë
	private String pw;

	User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isLogin(String name,String pw)
	{
		return this.name == name && this.pw == pw;
	}
}
