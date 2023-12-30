package de.lucastoulon.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantErrorController implements ErrorController {

    @RequestMapping("/restaurants?continue")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "custom404";
            }
            // ... handle other HTTP status codes if needed
        }
        return "error";
    }

//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
}
