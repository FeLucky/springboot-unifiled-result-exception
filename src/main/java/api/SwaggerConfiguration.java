package api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangtiexiang
 * @Description swagger相关配置
 * @Datetime 2020/3/23 3:38 下午
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("springboot-api-init")
                        .description("springboot")
                        .contact(new Contact("Fe",null,null))
                        .version("版本号：1.0").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("api.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
