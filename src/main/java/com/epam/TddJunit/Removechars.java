package com.epam.TddJunit;

public class Removechars {

	public String removeA(String string) {
		int len = string.length();
		switch (len) {
		case 0:
			return "Input String not found!!";

		case 1:
			if(string.equalsIgnoreCase("A")) {
				return "Removed!";
			}
			else 
				return string;

		default:
			if(string.substring(0,2).equalsIgnoreCase("AA")) {
				return string.substring(2);
			}
			else if(string.substring(0,1).equalsIgnoreCase("A")) {
				return string.substring(1);
			}
			else if(string.substring(1,2).equalsIgnoreCase("A")) {
				return string.substring(0,1)+string.substring(2);
			}
			else
				return string;
		}
	}
	
}