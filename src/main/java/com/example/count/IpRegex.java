package com.example.count;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpRegex {
	public static void main(String[] args) {
			System.out.println(isValid("5.5.5.5"));
	}

	public static boolean isValid(final String IP) {
		final String privateIp = "(^10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(^192\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(^172\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";
		final Pattern pattern = Pattern.compile(privateIp);

		Matcher matcher = pattern.matcher(IP);
		return matcher.matches();

	}

}