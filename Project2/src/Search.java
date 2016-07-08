

import java.io.*;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		
		TreeSet<Data> first_name = new TreeSet<Data>(new First_Comparator());
		TreeSet<Data> last_name = new TreeSet<Data>(new Last_Comparator());
		TreeSet<Data> Phone = new TreeSet<Data>(new Phone_Comparator());
		TreeSet<Data> company_name = new TreeSet<Data>(new Company_Comparator());
		
		
		try{
			File csv = new File("./files/HugeAddressBook.csv");
			BufferedReader reader = new BufferedReader(new FileReader(csv));
			String line = line = reader.readLine();;			
			int i = 0;
			while((line = reader.readLine()) != null){
				Data item = new Data(line, line, line, line);
				StringTokenizer token = new StringTokenizer(line,",");
				while (token.hasMoreTokens()){
					i %= 4;
					item.setAddressBook(token.nextToken(), i);
					i++;
				}
				first_name.add(item);
				last_name.add(item);
				Phone.add(item);
				company_name.add(item);
			}
			reader.close();
			/*InputStream is = new FileInputStream("./files/HugeAddressBook.xlsx");
			Workbook wb = Workbook.getWorkbook(is);
			Sheet s = wb.getSheet(0);
			for (int i=1;i < 100;i++){
				Cell cf = s.getCell(0, i);
				Cell cl = s.getCell(1, i);
				Cell cp = s.getCell(2, i);
				Cell cc = s.getCell(3, i);
				String f = cf.getContents();
				String l = cl.getContents();
				String p = cp.getContents();
				String c = cc.getContents();
				Data temp = new Data(f,l,p,c);
				first_name.add(temp);
				last_name.add(temp);
				Phone.add(temp);
				company_name.add(temp);*/
			
		}
		catch(Exception e){
			
		}
		/*Iterator<Data> ite = last_name.iterator();
		while(ite.hasNext()){
			Data x = ite.next();
			System.out.println(x.get_first_name()+" "+x.get_last_name()+" "+x.get_phone_number()+" "+x.get_city());
		}*/
		Scanner scan = new Scanner(System.in);
		String y;
		do{
			System.out.println("What would you like to search on?(F,L,P,C)");
			String search_type = scan.next();
			
			if (search_type.equalsIgnoreCase("F")){
				System.out.println("Enter the partial first name");
				String pf = scan.next();
				double starttime = System.currentTimeMillis();
				int n = pf.length();
				Iterator<Data> it = first_name.iterator();
				while(it.hasNext()){
				   Data x = it.next();
				   if (x.get_first_name().substring(0, n).equalsIgnoreCase(pf)){
					   System.out.println(x.get_first_name()+" "+x.get_last_name());
				   }
				   		   
				}
				double endtime = System.currentTimeMillis();
		        System.out.println(","+(endtime-starttime)+" ms");
			}
			
			else if (search_type.equalsIgnoreCase("L")){
				System.out.println("Enter the partial last name");
				String pf = scan.next();
				double starttime = System.currentTimeMillis();
				int n = pf.length();
				Iterator<Data> it = last_name.iterator();
				while(it.hasNext()){
				   Data x = it.next();
				   if (x.get_last_name().substring(0, n).equalsIgnoreCase(pf)){
					   System.out.println(x.get_first_name()+" "+x.get_last_name());
				   }
				  
				}
				double endtime = System.currentTimeMillis();
		        System.out.println(","+(endtime-starttime)+" ms");
			}
			
			else if (search_type.equalsIgnoreCase("P")){
				System.out.println("Enter the partial phone number");
				String pf = scan.next();
				double starttime = System.currentTimeMillis();
				int n = pf.length();
				Iterator<Data> it = Phone.iterator();
				while(it.hasNext()){
				   Data x = it.next();
				   if (x.get_phone_number().substring(0, n).equalsIgnoreCase(pf)){
					   System.out.println(x.get_phone_number()+", ");
				   }
				   
				}
				double endtime = System.currentTimeMillis();
		        System.out.println(","+(endtime-starttime)+" ms");
			}
			
			else if (search_type.equalsIgnoreCase("C")){
				System.out.println("Enter the partial city name");
				String pf = scan.next();
				double starttime = System.currentTimeMillis();
				int n = pf.length();
				Iterator<Data> it = company_name.iterator();
				while(it.hasNext()){
				   Data x = it.next();
				   if (x.get_company().substring(0, n).equalsIgnoreCase(pf)){
					   System.out.println(x.get_company()+", ");
				   }
				   
				}
				double endtime = System.currentTimeMillis();
		        System.out.println(","+(endtime-starttime)+" ms");
			}
			else System.out.println("Error input!");
			System.out.println("Anthor search?(Y/N)");
		    y = scan.next();
		}while(y.equalsIgnoreCase("Y"));
		System.out.println("Thanks for using!");


	}

}
