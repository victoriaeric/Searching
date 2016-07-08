
import java.util.Comparator;


public class Phone_Comparator implements Comparator<Data>{
	public int compare(Data o1, Data o2) {
		return o1.phone_number.compareTo(o2.phone_number);
	}
}