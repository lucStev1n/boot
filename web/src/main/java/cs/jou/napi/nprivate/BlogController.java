package cs.jou.napi.nprivate;

import cs.jou.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class BlogController {

    @Resource
    private BlogService service;

    @GetMapping("/list")
    public Object list() {
        return service.page();
    }
}
