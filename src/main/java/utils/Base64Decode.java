package utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Decode {

	public static String decodedString(String encodedString) throws UnsupportedEncodingException {
		return new String(Base64.getDecoder().decode(encodedString),"utf-8");
	}

}