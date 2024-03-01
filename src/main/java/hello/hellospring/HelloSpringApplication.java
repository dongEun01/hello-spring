package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	//main을 run 해주고 브라우저에서 에러 화면이 나오면 기본 설정 완료
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}

