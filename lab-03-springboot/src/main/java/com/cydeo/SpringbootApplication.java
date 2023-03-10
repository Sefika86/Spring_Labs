package com.cydeo;

import com.cydeo.config.AuthorConfig;
import com.cydeo.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(SpringbootApplication.class, args);
        RecipeService recipeService = container.getBean(RecipeService.class);
        recipeService.prepareRecipe();

        AuthorConfig authorConfig = container.getBean(AuthorConfig.class);

        System.out.println("authorConfig.getName() = " + authorConfig.getName());
        System.out.println("authorConfig.getSurname() = " + authorConfig.getSurname());
    }

}
