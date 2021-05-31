package com.hamit.jwt.common.base64;

import java.util.Base64;

public class EncoderDecoder {
	
	//encoder şifrelemek
	public static String getEncoder(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
	
	
	//decoder Şifre çözücü
	public static String getDecoder(String value) {
		return new String(Base64.getMimeDecoder().decode(value));
	}
	

}
