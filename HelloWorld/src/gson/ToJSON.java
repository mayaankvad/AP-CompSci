package gson;

import com.google.gson.Gson;

public class ToJSON {

	public static void main(String[] args) {

		Person p = new Person("N", "E");

		Gson gson = new Gson();

		String json = gson.toJson(p);
		System.out.println(json);

	}

}
