
package Encaps;

public class AccountDetails {
	// private data members
	private long acc_no;
	private String name, email;
	private float amount;

	// public getter and setter methods
	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}


package Encaps;
//Driver class
public class Manager {

	public static void main(String[] args) {
		AccountDetails obj = new AccountDetails();

		obj.setAmount(10000);
		obj.setEmail("avc11232gmail.com");
		obj.setAcc_no(7303);
		long acc_no = obj.getAcc_no();
		float amount = obj.getAmount();
		String email = obj.getEmail();
		System.out.println(acc_no+" "+amount+" "+email);
	}
}
