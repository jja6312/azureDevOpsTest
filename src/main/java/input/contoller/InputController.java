package input.contoller;

import input.bean.InputDTO;
import input.bean.InputList;
import input.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class InputController {
    @Autowired
    private InputService inputService;

    @PostMapping(value = "/input/save")
    public void update(@RequestBody InputDTO inputDTO) {
        String input = inputDTO.getValue();
        inputService.save(input);
    }

    @GetMapping(value = "/input/getValue")
    public List<InputList> getValue() {

        return inputService.getValue();
    }

}
