package by.seymouriamorpha.webservices.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Nullable;

/**
 * @author seymouriamorpha on 3/16/2017.
 */
@Document(collection = "users")
public class User {

    @Id @Nullable               private String  id;
    @Field(value = "forename")  private String  forename;
    @Field(value = "surname")   private String  surname;
    @Field(value = "email")     private String  email;
    @Field(value = "login")     private String  login;
    @Field(value = "image")     private byte[] image;

    @Nullable
    public String getId() {
        return id;
    }
    public void setId(@Nullable String id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }

}
