package enzoanthony.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Exemplo Spring Boot")
                        .version("1.0")
                        .description("Documentação da API")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                );
    }
}
