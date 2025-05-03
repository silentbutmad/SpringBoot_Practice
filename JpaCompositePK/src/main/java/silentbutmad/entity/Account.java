package silentbutmad.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    private String holderName;
    private String branch;
    @EmbeddedId
    private AccountPK accountPK;
}
