package epicode.exercise.exOne;

import epicode.exercise.exOne.classes.Adapter;
import epicode.exercise.exOne.classes.Info;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info user = new Info("Antonio", "Bertuccio", LocalDate.of(1989,4,19));
        Adapter userAd = new Adapter(user);

        System.out.println(userAd.getFullName());
        System.out.println(userAd.getAge());
    }
}
