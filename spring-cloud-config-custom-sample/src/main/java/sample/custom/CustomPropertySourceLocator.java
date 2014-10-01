package sample.custom;

import org.springframework.cloud.config.client.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Collections;

/**
 * This is a trivial example of a sample.custom {@link PropertySourceLocator}.
 *
 * A more realistic sample.custom property source locator will likely retrieve configuration from a remote source.
 *
 * @author Ryan Gardner
 * @date 10/1/14
 */
@Configuration
public class CustomPropertySourceLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate() {
        return new MapPropertySource("customProperty",
                Collections.<String, Object>singletonMap("property.from.sample.custom.source", "worked as intended"));
    }
}
