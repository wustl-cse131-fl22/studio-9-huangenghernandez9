package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {

		Map<String, Integer> nameToHeight = new HashMap<>();
		Scanner in = new Scanner(System.in);

		nameToHeight.put("Nick", 40);
		nameToHeight.put("Grace", 80);
		nameToHeight.put("Kayleigh", 60);

		System.out.print("\nEnter a name: ");
		String name = in.next();

		while (!(name.equals("quit"))) {
			if (nameToHeight.get(name) == null) {
				System.out.print("\nThat name does not exist. Enter another name: ");
				name = in.next();
			} else {
				System.out.print("\n" + name + ": " + nameToHeight.get(name));
				System.out.print("\nEnter another name: ");
				name = in.next();
			}
		}

	}
}
