/**
 Class: CMSC203 CRN 23488
 Program: Assignment 3
 Instructor: Huseyin Aygun
 Summary of Description: Write a Java program to encrypt and decrypt a phrase using two similar approaches, each insecure by modern standards.  
 Due Date: 10/14/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student Name: Chama Jagodige
 */
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		int textSize = plainText.length(); //needed to get the size of the text so I can iterate through each character
		for(int i = 0; i < textSize; i++)
		{
			if(plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) < LOWER_RANGE)
			{
				return false; //returns false if the text is not in the range;
			}
		}
		return true; //returns true if the text is in the range.
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) 
	{
		if(!isStringInBounds(plainText))
		{
			return "The selected string is not in bounds, Try again.";
		}
		String encryptedString = ""; //initalize an encrypted string variable
		int textSize = plainText.length(); //find length for for loop
		int upperRange = (int)UPPER_RANGE;
		for(int i = 0; i < textSize; i++)
		{
			//converts each character of the string to its caesar encryption counterpart
			int charToInt = (int)plainText.charAt(i) + key;
			while(charToInt > upperRange)
			{
				charToInt -= RANGE;
			}
			encryptedString += (char)charToInt; //
		}
		return encryptedString; //return string
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) 
	{
		String encryptedString = ""; //initalize an encrypted string variable
		int textSize = plainText.length(); //find length for for loop
		int bellasoStrLength = bellasoStr.length(); //get length of bellaso string
		int upperRange = (int)UPPER_RANGE; 
		for(int i = 0; i < textSize; i++)
		{
			int stringToInt = (int)plainText.charAt(i) + (int)bellasoStr.charAt(i % bellasoStrLength); 
			
			while(stringToInt > upperRange)
			{
				stringToInt -=RANGE;
			}
			encryptedString += (char)stringToInt; //append the string
		}
		System.out.println(encryptedString);
		return encryptedString; //return the full string
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String decryptedString = ""; 

		for (int i = 0; i < encryptedText.length(); i++) { //convert each char back to its orignal char
			char strintToCar = encryptedText.charAt(i);
			int charToInt = (int)strintToCar - key;

			while (charToInt < LOWER_RANGE) 
			{ 
				charToInt += RANGE; 
			}

			decryptedString += (char) charToInt;
		}

		return decryptedString; //return string
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		String decryptedString = "";
		int textSize = encryptedText.length();
		int bellasoStrLength = bellasoStr.length();
		int lowerRange = (int)LOWER_RANGE;
		
		for(int i = 0; i < textSize; i++)//convert each char back to the oringal char
		{
			int stringToInt = (int)encryptedText.charAt(i) - (int)bellasoStr.charAt(i % bellasoStrLength);
		
			while(stringToInt < lowerRange)
			{
				stringToInt +=RANGE;
			}
			decryptedString += (char)stringToInt;//append the string
		}
		return decryptedString;//return string
		
	}
}
