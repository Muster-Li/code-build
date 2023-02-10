package codeBuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CodeBuildApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeBuildApplication.class, args);
    }
}
