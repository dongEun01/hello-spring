package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        //키는 data, value는 hello
        model.addAttribute("data", "spring!!");

        /*
        intelliji에서는 return값인 hello를 읽어서 templattes에 해당 화면을 실행시키게 한다.
        viewResolver(뷰리졸버)가 templates에서 해당 화면을 찾는다.
        */
        return "hello";
    }
}
