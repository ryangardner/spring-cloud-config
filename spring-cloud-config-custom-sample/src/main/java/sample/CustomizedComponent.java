package sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Ryan Gardner
 * @date 10/1/14
 */
@Component
public class CustomizedComponent {

    @Value("${property.from.sample.custom.source}")
    protected String customProperty;

    @PostConstruct
    public void afterCreation() {
        System.out.println("The property was retrieved with value " + customProperty);
    }
}
