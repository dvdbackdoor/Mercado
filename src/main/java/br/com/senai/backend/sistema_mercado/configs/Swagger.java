package br.com.senai.backend.sistema_mercado.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Mercado Grão-Pará",
        version = "1.0",
        description = "projeto banco de dados -Davi_Miguez"
    )
)
public class Swagger {

}
