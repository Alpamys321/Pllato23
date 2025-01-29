import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring!";
    }

    @PostMapping("/message")
    public String postMessage(@RequestBody String message) {
        return "Received: " + message;
    }
}
