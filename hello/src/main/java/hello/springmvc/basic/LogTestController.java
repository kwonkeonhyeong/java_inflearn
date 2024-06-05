package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 이렇게 쓰면 trace는 쓰지도 않는데 String 연산 때문에 리소스를 잡아먹는다.
        log.trace(" track my log=" + name);

        // 아래처럼 사용해야 쓸모없는 연산에 의한 리소스 낭비가 없다!
        log.trace("trace log={}",name);

        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);
        return "ok";
    }
}


