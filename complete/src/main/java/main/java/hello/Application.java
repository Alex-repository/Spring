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
            Libro libro1 = new Libro("Nombre Libro 1", "Nombre autor 1", 2017);
            Libro libro2 = new Libro("Nombre Libro 2", "Nombre autor 2", 2018);
            Libro libro3 = new Libro("Nombre Libro 3", "Nombre autor 3", 2019);

            libroRepository.save(libro1);
            libroRepository.save(libro2);
            libroRepository.save(libro3);
            });
            bookRepository.findAll().forEach(System.out::println);
        };
    }
}
