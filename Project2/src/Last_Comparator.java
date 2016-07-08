import java.util.Comparator;


public class Last_Comparator  implements Comparator<Data>{
	public int compare(Data o1, Data o2) {
		return o1.last_name.toLowerCase().compareTo(o2.last_name.toLowerCase());
	}
}
