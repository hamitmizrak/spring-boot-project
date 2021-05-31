package com.hamit.jwt.common.base64;

public class SignatureMainTest {
	
	public static void main(String[] args) {
		// Header
		String header = "{alg\":\"HS256\"," + "\"type\":\"JWT" + "}";
		String header2 = EncoderDecoder.getEncoder(header);
		System.out.println(header2);
		
		// payload
		String payload = "{\"userId\":12354625," + "  \"iat\":123456," + "  \"exp\":123555,"
				+ "  \"roles\":\"admin\"," + "  \"sub\":\"giris\"}";
		String payload2=EncoderDecoder.getEncoder(payload);
		
		//Verify Signature
		String alan1=header2;
		String alan2=payload2;
		String birlesim=alan1 +"."+alan2;
		System.out.println(birlesim);
		
		String secret="Nasilsin";
		String alan3=HMACSHA256(birlesim, secret);
		
		String JWT=birlesim+"."+alan3;
		
	}
	
	
	public static String HMACSHA256(String birlesim,String secret) {
		
		return EncoderDecoder.getEncoder(birlesim+secret);
	}
	
}
