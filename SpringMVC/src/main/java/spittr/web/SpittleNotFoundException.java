package spittr.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by KL on 2016/5/14.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,
                reason = "Spittle Not Found")
public class SpittleNotFoundException extends RuntimeException {
}
