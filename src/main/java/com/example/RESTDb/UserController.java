package com.example.RESTDb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public Optional<User> getAllEmployeeById(@PathVariable(value = "userId") String user_ID) {
        return userRepository.findById(user_ID);
    }


    @PostMapping("/users") // CREATE operation in CRUD
    public @Valid
    Account createUser(@Valid @RequestBody User USER) {
        return UserRepository.save(USER);
    }


    @PutMapping("/users/userId}") // UPDATE operation for CRUD
    public @Valid
    User updateUser(@PathVariable(value = "userId") String userId, @Valid @RequestBody User users)
            throws UserNotFoundException {
        User usr = UserRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
        usr.setUserId(users.getUserName());
        User updUser = UserRepository.save(usr);
        return updUser;
    }

    @DeleteMapping("users/{userId}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") String userId) throws UserNotFoundException {
        User usr = userRepository.findById(userId).orElseThrow(()->new UserNotFoundException(userId)));
        userRepository.deleteById(userId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}


