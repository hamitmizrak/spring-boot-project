package com.hamit.jwt.common.base64;

public class EncoderDecoderMainTest {
	
	public static void main(String[] args) {
//		String kelime="Hamit Mizrak";
//		String sifre=EncoderDecoder.getEncoder(kelime);
//		System.out.println(sifre);
//		
//		String coz=EncoderDecoder.getDecoder(sifre);
//		System.out.println(coz);
		
		// https://jwt.io/#debugger-io?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.1U-TYi5M6uLVtF-P9G0ScTno66KSYruEIwnc2bfy2rw
		// https://jwt.io/#debugger-io?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.he0ErCNloe4J7Id0Ry2SEDg09lKkZkfsRiGsdX_vgEg
		String encoder="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		System.out.println(EncoderDecoder.getDecoder(encoder));
		
	}
	
}
