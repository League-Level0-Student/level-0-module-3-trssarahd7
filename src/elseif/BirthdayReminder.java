
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 26th";
		String dadsBirthday = "June 14th";
		String myBirthday = "May 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String ask = JOptionPane.showInputDialog(null, "Whose birthday do you want to know?");
	
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, ask);
		// 4. if user asked for "mom"
		if (ask.equals("mom")) { JOptionPane.showMessageDialog(null, momsBirthday);}
			//print mom's birthday
		// 5. if user asked for "dad"
		if (ask.equals("dad")){ JOptionPane.showMessageDialog(null, dadsBirthday);}
			// print dad's birthday
		// 6. if user asked for your name
		if (ask.equals("sarah")) { JOptionPane.showMessageDialog(null, myBirthday); }
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else { JOptionPane.showMessageDialog(null, "I'm sorry. I don't know that birthday!");

	} 
}
}