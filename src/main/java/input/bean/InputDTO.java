package input.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class InputDTO {
    Long id;
    String value;

}
