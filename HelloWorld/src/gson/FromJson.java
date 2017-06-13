package gson;

import com.google.gson.Gson;

public class FromJson {

	public static void main(String[] args) {

		String userAsJSON = "{\"name\":\"N\",\"email\":\"E\"}";

		Gson gson = new Gson();

		Person personObject = gson.fromJson(userAsJSON, Person.class);

		System.out.println(personObject);

	}

}
