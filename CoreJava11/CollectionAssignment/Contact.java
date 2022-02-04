public class Contact {
	long PhoneNumber;
	String Name;
	String Email;
	String Gender;
	public Contact(long phoneNumber, String name, String email, String gender) {
		PhoneNumber = phoneNumber;
		Name = name;
		Email = email;
		Gender = gender;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}
	enum Gender{
		Male,
		Female;
	}

	//public String getGender() {
		//return Gender;
	//}

	@Override
	public String toString() {
		return "Contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender
				+ "]";
	}

	


}
