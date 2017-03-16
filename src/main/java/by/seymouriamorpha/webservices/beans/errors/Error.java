package by.seymouriamorpha.webservices.beans.errors;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author seymouriamorpha on 3/16/2017.
 */
public class Error {

    @Field(value = "message")  private String message;

    public Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
