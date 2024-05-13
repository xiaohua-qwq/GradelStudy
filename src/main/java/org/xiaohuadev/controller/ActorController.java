package org.xiaohuadev.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system")
public class ActorController {

    @GetMapping("/hello")
    public String HelloWorld() {
        return "HelloWorld";
    }
}
