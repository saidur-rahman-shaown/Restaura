package com.peytosoft.APIGateway.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info= @Info( title="Api Gateway",
                                version = "version",
                                contact = @Contact(name = "PeytoSoft", email = "saidur.rahman@peytosoft.com", url = "www.peytosoft.com"),
                                description = "This is the api Gateway",
                                license = @License(name="License", url = "www.p.com")),
                    servers = {@Server(url = "http://localhost:8080/", description = "Dev Server")})
public class SwaggerConfig {

}
