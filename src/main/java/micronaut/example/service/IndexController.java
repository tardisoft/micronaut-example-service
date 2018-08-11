package micronaut.example.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class IndexController {

    @Get
    public Single<String> index() {
        return Single.just("Index");
    }

}
