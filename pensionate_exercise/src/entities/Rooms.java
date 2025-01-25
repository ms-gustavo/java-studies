package entities;

public class Rooms {
	private boolean isRent;
	private String name;
	private String email;

	public Rooms(String name, String email, boolean isRent) {
		this.name = name;
		this.email = email;
		this.isRent = isRent;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
