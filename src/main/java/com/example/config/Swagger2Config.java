package com.example.config;

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

/**
 * @author ：mac
 * @Date ：2022/8/22 15:11
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

    /**
     * 注入一个Springfox framework主要的构建器Docket进入Spring容器
     *
     * @date 2019/1/8 22:31
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // API基础信息
                .apiInfo(apiInfo())
                .groupName("物业管理系统")
                .select()
                /* 指定swagger2的“扫描”范围，假设指定的basePackage为xxx,那么凡是以xxx开头的包，都属于
                 * 其管辖范围(注:源代码中是以startsWith实现的）
                 * 注:指定此配置后，swagger2会自动扫描并发现该范围下的被@RequestMapping注解注解了的方法并生成对应的API
                 * 注:@GetMapping、@PostMapping、@PutMapping等注解也属于@RequestMapping注解的一种变形
                 */
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Api基础信息模型
     *
     * @date 2019/1/8 22:31
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("物业管理系统")
                // 创建人信息
                .contact(new Contact("张家宁", "", ""))
                // 版本号
                .version("1.0")
                // 描述
                .description("我是此次更新的描述信息！")
                .build();
    }
}