package silentbutmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import silentbutmad.entity.Account;
import silentbutmad.entity.AccountPK;
import silentbutmad.repo.AccountRepo;

import java.util.Optional;

@SpringBootApplication
public class JpaCompositePkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(JpaCompositePkApplication.class, args);
		AccountRepo bean= context.getBean(AccountRepo.class);

		AccountPK pk=new AccountPK();
		pk.setAccNum(1244566L);
		pk.setAccType("Saving");
//
//		Account ac=new Account();
//		ac.setAccountPK(pk);
//		ac.setBranch("raver");
//		ac.setHolderName("Mohit");

//		bean.save(ac);

		Optional<Account> record = bean.findById(pk);
		if(record.isPresent()){
			System.out.println(" print " + record.get());
		}
	}

}
