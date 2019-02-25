package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public BaseResponse<List<Greeting>> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        try {
            Thread.sleep(2000L);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Greeting> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Greeting(counter.incrementAndGet(), String.format(template, name)));
        }
        return new BaseResponse(200, "ok", list);
    }
}