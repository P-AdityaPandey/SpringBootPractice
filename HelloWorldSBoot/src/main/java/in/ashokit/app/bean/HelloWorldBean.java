package in.ashokit.app.bean;


import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
    public String sayHello( String name) {
       return  "Hello " + name.toUpperCase() + "  Welcome to SpringBoot !!!";
    }
}
