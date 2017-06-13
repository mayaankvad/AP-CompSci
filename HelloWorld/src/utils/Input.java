// obsolete; junk

/**
 * Input
 * @author Mayaank Vadlamani
 * @version 1/1/2017
 */

package utils;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("resource")
public class Input {

	/**
	 * The following 6 methods use the Scanner to recieve input from the
	 * Console.
	 */

	/**
	 * Returns a user inputed String
	 *
	 * @param prompt
	 * @return the raw string from the user
	 */
	public static String C(String prompt) {
		return Cstring(prompt, null, null, null);
	}

	/**
	 * Returns a user inputed Double
	 *
	 * @param prompt
	 * @param error
	 * @return the input from the console
	 */
	public static Double Cdouble(String prompt, String error) {
		return Cdouble(prompt, error, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	/**
	 * Returns a user inputed Double within the range of max and min inclusive
	 *
	 * @param prompt
	 * @param error
	 * @param min
	 * @param max
	 *            Precondition: max > min
	 * @return the input from the console
	 */
	public static Double Cdouble(String prompt, String error, Double min, Double max) {
		if (max <= min) {
			return null;
		}

		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(prompt);
				Double in = Double.valueOf(scn.nextLine());
				if ((in > max) || (in < min)) {
					throw new Exception();
				}
				return in;
			} catch (Exception e) {
				System.out.println(error);
			}
		}
	}

	/**
	 * Returns a user inputed Integer
	 *
	 * @param prompt
	 * @param error
	 * @return the input from the console
	 */
	public static Integer Cinteger(String prompt, String error) {
		return Cinteger(prompt, error, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Returns a user inputed Integer within the range of max and min inclusive
	 *
	 * @param prompt
	 * @param error
	 * @param min
	 * @param max
	 *            Precondition: max > min
	 * @return the input from the console
	 */
	public static Integer Cinteger(String prompt, String error, Integer min, Integer max) {
		if (max <= min) {
			return null;
		}

		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(prompt);
				Integer in = Integer.valueOf(scn.nextLine());
				if ((in > max) || (in < min)) {
					throw new Exception();
				}
				return in;
			} catch (Exception e) {
				System.out.println(error);
			}
		}
	}

	/**
	 * Returns a user inputed String, handling for the following params of valid
	 * and invalid. Both valid and invalid cannot be used at the same time (one
	 * has to be null). Precondition: only one is not null: valid, invalid.
	 *
	 * @param prompt
	 * @param error
	 * @param valid
	 *            - string of valid characters, input must be only of these
	 * @param invalid
	 *            - string of invalid characters, input cannot contain any of
	 *            these
	 * @return the user inputed String
	 */
	public static String Cstring(String prompt, String error, String valid, String invalid) {
		if ((valid != null) && (invalid != null)) {
			return null;
		}

		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(prompt);
				String in = scn.nextLine();

				if (invalid != null) {
					for (int i = 0; i < in.length(); i++) {
						for (int j = 0; j < invalid.length(); j++) {
							if (invalid.charAt(j) == in.charAt(i)) {
								throw new Exception();
							}
						}
					}
				}

				if (valid != null) {
					for (int i = 0; i < in.length(); i++) {
						if (!valid.contains(in.substring(i, i + 1))) {
							throw new Exception();
						}
					}
				}

				return in;
			} catch (Exception e) {
				System.out.println(error);
			}
		}
	}

	/**
	 * The following 6 methods use the JOptionPane API's to receive input from
	 * the user via a GUI dialog box.
	 */

	/**
	 * Returns a user inputed String
	 *
	 * @param prompt
	 * @return the raw string from the user
	 */
	public static String G(String prompt) {
		return Gstring(prompt, null, null, null);
	}

	/**
	 * Returns a user inputed Double
	 *
	 * @param prompt
	 * @param error
	 * @return the input from the console
	 */
	public static Double Gdouble(String prompt, String error) {
		return Gdouble(prompt, error, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	/**
	 * Returns a user inputed Double within the range of max and min inclusive
	 *
	 * @param prompt
	 * @param error
	 * @param min
	 * @param max
	 *            Precondition: max > min
	 * @return the input from the console
	 */
	public static Double Gdouble(String prompt, String error, Double min, Double max) {
		if (max <= min) {
			return null;
		}

		while (true) {
			try {
				String raw = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);
				Double in = Double.valueOf(raw);
				if ((in > max) || (in < min)) {
					throw new Exception();
				}
				return in;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, error, "Input > Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	/**
	 * Returns a user inputed Integer
	 *
	 * @param prompt
	 * @param error
	 * @return the input from the console
	 */
	public static Integer Ginteger(String prompt, String error) {
		return Ginteger(prompt, error, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Returns a user inputed Integer within the range of max and min inclusive
	 *
	 * @param prompt
	 * @param error
	 * @param min
	 * @param max
	 *            Precondition: max > min
	 * @return the input from the console
	 */
	public static Integer Ginteger(String prompt, String error, Integer min, Integer max) {
		if (max <= min) {
			return null;
		}

		while (true) {
			try {
				Integer in = Integer
						.valueOf(JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE));
				if ((in > max) || (in < min)) {
					throw new Exception();
				}
				return in;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, error, "Input > Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	/**
	 * Returns a user inputed String, handling for the following params of valid
	 * and invalid. Both valid and invalid cannot be used at the same time (one
	 * has to be null). Precondition: only one is not null: valid, invalid.
	 *
	 * @param prompt
	 * @param error
	 * @param valid
	 *            - string of valid characters, input must be only of these
	 * @param invalid
	 *            - string of invalid characters, input cannot contain any of
	 *            these
	 * @return the user inputed String
	 */
	public static String Gstring(String prompt, String error, String valid, String invalid) {
		if ((valid != null) && (invalid != null)) {
			return null;
		}

		while (true) {
			try {
				String in = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);

				if (invalid != null) {
					for (int i = 0; i < in.length(); i++) {
						for (int j = 0; j < invalid.length(); j++) {
							if (invalid.charAt(j) == in.charAt(i)) {
								throw new Exception();
							}
						}
					}
				}

				if (valid != null) {
					for (int i = 0; i < in.length(); i++) {
						if (!valid.contains(in.substring(i, i + 1))) {
							throw new Exception();
						}
					}
				}

				return in;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, error, "Input > Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
