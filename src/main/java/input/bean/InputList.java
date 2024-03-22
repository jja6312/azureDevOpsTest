package input.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="InputList")
@Data
public class InputList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="value",nullable = false)
    private String value;

}
