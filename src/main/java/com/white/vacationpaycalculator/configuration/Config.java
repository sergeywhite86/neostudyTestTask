package com.white.vacationpaycalculator.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public OpenAPI calculatorOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Vacation pay calculator API")
                        .version("1.0")
                        .description("API для расчета отпускных"));
    }
}
