package com.hanul.email;

import java.util.ArrayList;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class emailSender2 {
	// 이메일 전송 클래스
	// 프로젝트에 lib 폴더를 만든다
	// javax.mail.jar, common-email-1.5.jar, activation-1.1jar
	// 위의 3개의 파일을 다운로드 받아서 lib폴더에 넣는다
	//4. 송신할 메일의 환경설정에서 SMTP 사용을 설정해야 한다
	// 	naver -> 하단 환경설정 -> pop3/IMAP 설정 -> POP3/STMP 사용함 선택
	//	gmail -> 상단 환경설정 -> 전달 및 pop3/IMAP 설정 -> IMAP 엑세스:IMAP 사용으로 선택 
	//			 상단 내계정 -> 로그인 및 보안 -> 맨아래 연결 
	// common Email API는 매일 발송을 처리해 주는 SimpleEmail, HtmlEmail같은
	// 클래스를 제공하고 있으며 이들 클래스를 사용하여 일반 텍스트 메일, HTML 메일
	// 첨부메일 등을 매우 간단하게 발송할 수 있다 
	
	private String emailAddress, password, sendname;		//메일 보내는 관리자 정보

	public emailSender2(String emailAddress, String password, String sendname) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.sendname = sendname;
	}

	// 메일 받는 사람 정보
	void sendSimple(ArrayList<Student> studArraylist) {
		
		//기본 메일 객체 생성
		SimpleEmail mail = new SimpleEmail();
		
		// 이메일을 @ 앞, 뒤로 나눠 이메일을 보내는 사람의 메일 서버 지정
		mail.setHostName("smtp." + emailAddress.substring(emailAddress.indexOf("@")+1));	
		mail.setCharset("utf-8");
		//메일 전송 처리 확인을 위한 로그 출력 지정
		mail.setSSLOnConnect(true);		
		
		//로그인하기 위한 아이디와 비밀번호를 지정 : 보내는 사람 메일의 인증 아이디와 비밀번호 지정 
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);		// 보안을 위해
		
		//메일 보낼 사람 지정 : 송신인 메일 주소를 full로 지정해야함
		try {
			mail.setFrom(emailAddress, this.sendname);
		//	mail.setFrom("manager1111@naver.com", "관리자");
			
		//메일 받을 사람 지정 : 수신인 지정 -> 여러명에게 보낼 땐 addTo만 추가
			for(int i =0; i<studArraylist.size(); i++)
			{
				mail.addTo(studArraylist.get(i).getEmail(), studArraylist.get(i).getName());
			}
		//	mail.addTo(email,studArraylist);
		//	mail.addTo("kimej2159@naver.com","조순섭");
			
			//메일 제목, 내용
			mail.setSubject("생일 축하 메세지");
			mail.setSubject("생일을 축하합니다. \n생일 쿠폰일 발급되었습니다.");
			
			//메일 전송 버튼 클릭
			mail.send();
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
