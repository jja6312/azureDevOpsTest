package input.repository;

import input.bean.InputDTO;
import input.bean.InputList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InputRepository extends JpaRepository<InputList, Long> {

}
