package com.ybe.ybe_toyproject2.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "<야놀자 X  패캠 토이프로젝트2>",
                description = "야놀자 X  패캠 토이프로젝트2 API 명세서",
                version = "1.0"
        )

)
@RequiredArgsConstructor
@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi api() {
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .displayName("API Doc Ver 1.0")
                .group("toyProject2_v1")
                .pathsToMatch(paths)
                .build();
    }
}
