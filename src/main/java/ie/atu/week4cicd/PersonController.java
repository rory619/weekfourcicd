package ie.atu.week4cicd;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")
public class PersonController {

    @PostMapping("/CreatePerson")
    public ResponseEntity<String> CreatePerson(@Valid @RequestBody Person ) {
        return new ResponseEntity<>("Person created successfully", HttpStatus.OK);
    }
}
