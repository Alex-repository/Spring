package main.java.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@ComponentScan(basePackages = ("main.java"))
@EntityScan("main.java.entyties")
@EnableJpaRepositories("main.java.repositories")


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(main.java.repositories.BookRepository bookRepository) {
        return args -> {
            Stream.of("Moby Dick","The Great Gatsby").forEach(name-> {
                main.java.entyties.Book book = new main.java.entyties.Book(name,"sin descripcion",2000);
                bookRepository.save(book);
            });
            bookRepository.findAll().forEach(System.out::println);
        };
    }
}
