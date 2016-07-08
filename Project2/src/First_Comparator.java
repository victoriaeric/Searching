
import java.util.Comparator;

public class First_Comparator implements Comparator<Data>{
    public int compare(Data o1, Data o2) {
        return o1.first_name.toLowerCase().compareTo(o2.first_name.toLowerCase());
    }
    
}
