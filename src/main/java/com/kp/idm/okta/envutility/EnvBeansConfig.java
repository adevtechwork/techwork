package com.kp.idm.okta.envutility;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author anshu.dev
 * This is Config class.
 */
@Configuration
public class EnvBeansConfig {

    private static final String RULES_PATH = "rules/";

    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        return restTemplate;
    }

   


}
