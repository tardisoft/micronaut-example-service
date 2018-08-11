package micronaut.example.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/site")
public class SiteController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}