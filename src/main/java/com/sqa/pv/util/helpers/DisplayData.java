/**
 *   File Name: DisplayData.java<br>
 *
 *   Panchuk, Valentina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aug 27, 2016
 *   
 */

package com.sqa.pv.util.helpers;

/**
 * DisplayData //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class DisplayData {

	// Convert the data and return the converted array with new type
	public static Object[][] convertIntArray(int[][] data) {
		// Return Object[][] based on int [][] being

		return null;
	}

	// Display the data passed to the method to the console
	public static void objectArray(Object[][] data) {
		// Use system out calls to display each element
		// Object [][] array being passed in
		for (int i = 0; i < data.length; i++) {
			System.out.println("|");
			for (int j = 0; j < data[i].length; j++) {
				System.out.println("\t" + data[i][j]);
			}
		}

		System.out.println();
	}

}