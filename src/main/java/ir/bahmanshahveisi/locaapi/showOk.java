package ir.bahmanshahveisi.locaapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class showOk {
    @GetMapping(value = "/")
    public String showMe() {
        return "ok";
    }
}
