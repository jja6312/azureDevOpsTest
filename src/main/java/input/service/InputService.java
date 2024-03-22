package input.service;

import input.bean.InputDTO;
import input.bean.InputList;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InputService {
    void save(String input);

    List<InputList> getValue();
}
