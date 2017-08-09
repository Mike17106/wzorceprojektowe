public class User {
	private final String firstName; // pola klasy
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) { // tutaj zdefiniowane tylko wymagane pola
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) { // opcjonalne
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) { //opcjonalne
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) { //tak samo
			this.address = address;
			return this;
		}

		public User build() {				//tak samo
			return new User(this);
		}

	}
}