
import java.util.Comparator;

public class Company_Comparator implements Comparator<Data>{
	public int compare(Data o1, Data o2) {
		return o1.company.toLowerCase().compareTo(o2.company.toLowerCase());
	}
}