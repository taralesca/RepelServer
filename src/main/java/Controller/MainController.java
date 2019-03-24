package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> userRepository(@RequestBody User userEntity) {
        userRepository.save(userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

	@GetMapping(path="/all")
    public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}


}
