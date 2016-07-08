
public class Data{
	public Data(){
		first_name = null;
		last_name = null;
		phone_number = null;
		company = null;
	}
	public Data(String f, String l, String p, String c){
		first_name = f;
		last_name = l;
		phone_number = p;
		company = c;
	}
	public String get_last_name(){
		return last_name;
	}
	public String get_first_name(){
		return first_name;
	}
	public String get_phone_number(){
		return phone_number;
	}
	public String get_company(){
		return company;
	}
	public String first_name;
	public String last_name;
	public String phone_number;
	public String company;
	
	public void setAddressBook(String content, int index) {
		switch (index) {
		case 0:
			first_name = content;
			break;
		case 1:
			last_name = content;
			break;
		case 2:
			//phone_number = content;
			phone_number = content.replaceAll("\\D+", "");
			break;
		case 3:
			company = content;
			break;
		default:
			break;
		}
	}

}
