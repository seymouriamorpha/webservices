package by.seymouriamorpha.webservices.controllers;

import by.seymouriamorpha.webservices.beans.errors.ErrorMessages;
import by.seymouriamorpha.webservices.beans.errors.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author seymouriamorpha on 3/16/2017.
 */
public interface AbstractController {

    default ResponseEntity<Object> error(final String errorMessage, final HttpStatus httpStatus) {
        final Error error = new Error(ErrorMessages.VALIDATION_ERROR);
        error.setMessage(errorMessage);
        return new ResponseEntity<>(error, httpStatus);
    }

}
