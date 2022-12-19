package com.hanul.email;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class emailSendermain1 {

	public static void main(String[] args) {
		
		
		//이메일 전송 클래스
		emailSender1 sender = new emailSender1("kimej2159@naver.com", "kej20181664", "관리자");
		sender.sendAttach("kimej2159@naver.com", "김은지");
	
	}
}
