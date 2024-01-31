package com.example.swagger.controtller;


import com.example.incrementservice.api.IncrementApi;
import com.example.swagger.service.AdditionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AdditionController implements IncrementApi {

    private final AdditionService incrementService;
    @Override
    public ResponseEntity<Integer> incrementTheNumber(Integer givenNumber, Integer incrementer) {

        int response = incrementService.add(givenNumber, incrementer);
        return new ResponseEntity<Integer>(response, HttpStatus.OK);
    }
}
