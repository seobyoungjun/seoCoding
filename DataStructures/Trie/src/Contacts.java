import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Contacts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		HashMap<String, Integer> contacts = new HashMap<>();
		for(int i=0; i<N; i++){
			String type = in.next();
			switch(type){
			case "add":
				String contact = in.next();
				for(int j=1; j <= contact.length(); j++){
					String sub = contact.substring(0, j);
					if(contacts.get(sub) == null){
						contacts.put(sub, 1);
					}else{
						contacts.put(sub, contacts.get(sub) + 1);
					}
				}
				break;
			case "find":
				String find = in.next();
				if(contacts.get(find) == null)
					System.out.println(0);
				else
					System.out.println(contacts.get(find));
			}
		}
	}
}
