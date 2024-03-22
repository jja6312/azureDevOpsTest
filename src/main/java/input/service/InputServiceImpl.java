package input.service;

import input.bean.InputList;
import input.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputServiceImpl implements InputService{

    @Autowired
    InputRepository inputRepository;

    @Override
    public void save(String value) {
        InputList inputList = new InputList();
        inputList.setValue(value);
        inputRepository.save(inputList);
    }

    @Override
    public List<InputList> getValue() {
        return inputRepository.findAll();
    }
}
