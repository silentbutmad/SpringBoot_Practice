package silentbutmad.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import silentbutmad.entity.Account;
import silentbutmad.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {

}
