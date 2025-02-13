package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

// 메일을 전송하는 메서드를 만들고,
// 팀원들에게 반복문으로 모두 메일 발송 시키기


public class MailTest {
	
	static String sendingMailAddress = "rkddl94@gmail.com";
	static String sendingPassword = "mofj oaed pwnr ulcl";
	
	public void sendMail(String title, String sendMailAddress, String descript) {
		// 메일 인코딩
	    final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
	    
	    //원하는 메일 제목 작성
	    String subject = title;
	    
	    //보낸 이메일 작성
	    String fromEmail = "rkddl94@gmail.com";
	    String fromUsername = "원펀치 쓰리강냉이";
	    
	    String toEmail = sendMailAddress; // 콤마(,)로 여러개 나열
	    
	    //도메인 사용할 필요 없다
	    //앱비밀번호
	    final String username = sendingMailAddress;         
	    final String password = sendingPassword;
	    
	    // 메일에 출력할 텍스트
	    String html = null;
	    StringBuffer sb = new StringBuffer();
	    sb.append(descript);
	    html = sb.toString();
	    
	    // 메일 옵션 설정
	    Properties props = new Properties();    
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	    
	    try {
	      // 메일 서버  인증 계정 설정
	      Authenticator auth = new Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	          return new PasswordAuthentication(username, password);
	        }
	      };
	      
	      // 메일 세션 생성
	      Session session = Session.getDefaultInstance(props, auth);
	      
	      // 메일 송/수신 옵션 설정
	      Message message = new MimeMessage(session);
	      message.setFrom(new InternetAddress(fromEmail, fromUsername));
	      message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	      message.setSubject(subject);
	      message.setSentDate(new Date());
	      
//	      // 메일 콘텐츠 설정
	      Multipart mParts = new MimeMultipart();
	      MimeBodyPart mTextPart = new MimeBodyPart();
	      MimeBodyPart mFilePart = null;
	//    
//	      // 메일 콘텐츠 - 내용
	      mTextPart.setText(html, bodyEncoding, "html");
	      mParts.addBodyPart(mTextPart);
//	            
//	      // 메일 콘텐츠 설정
	      message.setContent(mParts);
	 
	      // 메일 발송
	      Transport.send( message );
	      
	    } catch ( Exception e ) {
	      e.printStackTrace();
	    }
	}
	public static void main(String[] args) {
		MailTest mailTest = new MailTest();
		
		String[] sendMailAddresses = new String[] {
				"junghoon.shin3377@gmail.com",
				"oasis1340@gmail.com",
				"dcode0971@gmail.com"
		};
		
		String titleText = "[야차룰 ㄱㄱ]";
		
		String descriptionText = "<h2>나는 장재영 야차룰 ㄱㄱ</h2>";
		
		for(String address : sendMailAddresses) {
			mailTest.sendMail(titleText, address, descriptionText);
		}
	}
}
