package in.ashokit.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments arguments){
        System.out.println(" In TestRunner1...!!! ");

    }
}
