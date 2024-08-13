package com.auth.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Api Rest Auth",
                version = "1,0",
                description = "This is a api rest for authentication user"
        )
)
public class SwaggerConfig {
}
