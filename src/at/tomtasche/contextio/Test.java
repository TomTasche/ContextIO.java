package at.tomtasche.contextio;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Thomas Taschauer | tomtasche.at
 *
 */
public class Test {

	public static void main(String[] args) {
		ContextIO dokdok = new ContextIO("YOURKEY", "YOURSECRET");
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("since", "0");
		
		System.out.println(dokdok.allMessages("tomtasche@gmail.com", params).rawResponse.getBody());
	}
}
