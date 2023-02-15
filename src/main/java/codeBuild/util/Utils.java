package codeBuild.util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Utils {

    @GetMapping("/hello")
    private String test() {
        return "Hello World2";
    }
}
