package semina.hashcode;

public class User {

	private String name;

	public User(String name) {

		this.name = name;

	}

	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		User target = (User) o;

		return this.name.equals(target.name);

	}

}
