package silentbutmad.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK {
    private Long accNum;
    private String accType;

}
