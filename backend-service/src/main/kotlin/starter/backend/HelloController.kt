package starter.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/world")
    fun world() : String {
        return "It's alive!"
    }
}