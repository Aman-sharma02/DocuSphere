package com.amansharma.docusphere.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI docusphereOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("DocuSphere API")
                        .description("""
                                DocuSphere is a secure document management and
                                intelligent document retrieval platform.

                                The application provides JWT-based authentication,
                                role-based access control, document upload and management,
                                metadata search, and intelligent question-based
                                document retrieval.
                                """)
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Aman Sharma")
                                .email("amansharma11701@gmail.com")
                                .url("https://github.com/Aman-sharma02"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));

    }
}
