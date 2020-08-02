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

}
/*


    @PostMapping("/users") // CREATE operation in CRUD
    public @Valid
    Account createUser(@Valid @RequestBody User user) {
        return UserRepository.save(user);
    }


    @PutMapping("/users/userId}") // UPDATE operation for CRUD
    public @Valid
    Account updateUser(@PathVariable(value = "userId") String userId, @Valid @RequestBody User users)
            throws UserNotFoundException {
        User usr = UserRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userID));
        usr.setUserId(users.getUserName());
        User updUser = UserRepository.save(usr);
        return updUser;
    }

    @DeleteMapping("accounts/{accountId}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteAccount(@PathVariable("accountId") String accountId) throws AccountNotFoundException {
        Account acc = accountRepository.findById(accountId).orElseThrow(()->new AccountNotFoundException(accountId));
        accountRepository.deleteById(accountId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

}
*/