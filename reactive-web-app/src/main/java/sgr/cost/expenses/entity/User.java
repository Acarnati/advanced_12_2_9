package sgr.cost.expenses.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Table("users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateBirth;
    private String email;
    private String phoneNumber;

    public User(String firstName, String lastName, String middleName,
                LocalDate dateBirth, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
