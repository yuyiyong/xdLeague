package com.xdleague.dahei01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(produces())
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.xdleague.dahei01"))
                .paths(PathSelectors.any())
                .build();
    }

    private Set<String> produces() {
        Set<String> produces = new HashSet<String>();
        produces.add("application/json");
        produces.add("text/plain");
        return produces;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("小弟联盟之大黑01")
                //创建人
                .contact(new Contact("yyy", "", ""))
                //版本号
                .version("1.0")
                //描述
                .description("API 接口描述2")
                .build();
    }


}
