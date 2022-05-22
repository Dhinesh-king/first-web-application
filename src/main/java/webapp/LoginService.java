package webapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginService {
	Map<String , String> userMap;
	public LoginService() {
		super();
		Map<String , String> users=new HashMap<>();
		users.put("Dhinesh", "Daylord@1");
		users.put("Thilaga", "subbuthilak");
		users.put("Ajay", "AjayAnitha");
		users.put("Deepa", "AyyanarA");
		this.userMap=users;
	}

	protected boolean checkValid(String user,String password) {
		Set<String> keySet=userMap.keySet();
		for (String key : keySet) {
			if(key.equals(user)&&userMap.get(key).equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean register(String user,String password) {
		Set<String> keySet=userMap.keySet();
		for (String key : keySet) {
			if(key.equals(user)||password.length()<7) {
				return false;
			}
		}
		userMap.put(user, password);
		return true;
	}
}
