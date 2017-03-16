package by.seymouriamorpha.webservices.controllers;

import by.seymouriamorpha.webservices.beans.User;
import by.seymouriamorpha.webservices.beans.errors.ErrorMessages;
import by.seymouriamorpha.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author seymouriamorpha on 3/16/2017.
 */
@RestController
@RequestMapping("users")
public class UserController implements AbstractController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Object> getAllUsers() {
        return new ResponseEntity<>(repository.findAll(),  HttpStatus.OK);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Object> insert(@Valid @RequestBody() User user, BindingResult br) throws URISyntaxException {
        if (br.hasErrors()) {
            return error(ErrorMessages.VALIDATION_ERROR, HttpStatus.BAD_REQUEST);
        }
        if (repository.findByEmail(user.getEmail()) != null) {
            return error(ErrorMessages.USER_ALREADY_EXISTS, HttpStatus.CONFLICT);
        }
        repository.save(user);
        HttpHeaders headers = new HttpHeaders();
        URI location = new URI("/users/" + repository.findByLogin(user.getLogin()).getId());
        headers.setLocation(location);
        return new ResponseEntity<>(user, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Object> getUser(@PathVariable String id) {
        User user = repository.findOne(id);
        if (user == null) {
            return error(ErrorMessages.USER_NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public @ResponseBody ResponseEntity<Object> updateUserById(@PathVariable String id, @Valid @RequestBody() User user, BindingResult br) {
        if (br.hasErrors()) {
            return error(ErrorMessages.VALIDATION_ERROR,HttpStatus.BAD_REQUEST);
        }
        if (repository.findOne(id) == null) {
            return error(ErrorMessages.USER_NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        if (!id.equals(user.getId())) {
            return error(ErrorMessages.MISMATCH_IDS, HttpStatus.BAD_REQUEST);
        }
        User upd = repository.findOne(id);
        if (user.getForename() != null) {
            upd.setForename(user.getForename());
        }
        if (user.getSurname() != null) {
            upd.setSurname(user.getSurname());
        }
        if (user.getEmail() != null) {
            upd.setEmail(user.getEmail());
        }
        if (user.getLogin() != null) {
            upd.setLogin(user.getLogin());
        }
        if (user.getImage() != null) {
            upd.setImage(user.getImage());
        }
        repository.save(upd);
        return new ResponseEntity<>(upd, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<Object> deleteByLogin(@PathVariable String login) {
        if (repository.findOne(login) == null) {
            return error(ErrorMessages.USER_NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        repository.delete(login);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
