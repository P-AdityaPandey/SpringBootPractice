package in.ashokit.app.runner;

import in.ashokit.app.bean.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    HelloWorldBean helloWorld;

    @Override
    public void run(ApplicationArguments arguments){
        System.out.println(helloWorld.sayHello("John"));
    }


}
