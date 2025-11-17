package ma.sieger.stockservice;

import ma.sieger.stockservice.entity.StockMarket;
import ma.sieger.stockservice.repository.StockMarketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class StockServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockServiceApplication.class, args);
    }

    /**
     * Bean CommandLineRunner pour initialiser la base de données H2 au démarrage.
     * Spring Boot exécute automatiquement cette méthode "run" après le chargement
     * du contexte et avant que l'application ne soit prête.
     *
     * @param stockMarketRepository Le repository pour sauvegarder les données
     * @return L'implémentation du CommandLineRunner
     */
    @Bean
    CommandLineRunner start(StockMarketRepository stockMarketRepository) {
        return args -> {
            System.out.println("--- Initialisation de la base de données H2 ---");

            // Crée des cotations de test
            StockMarket stock1 = new StockMarket(null, new Date(), 150.0, 152.5, 12000, 1L);
            StockMarket stock2 = new StockMarket(null, new Date(), 200.0, 198.5, 8000, 2L);
            StockMarket stock3 = new StockMarket(null, new Date(), 50.0, 55.0, 25000, 1L);

            // Sauvegarde les cotations dans la BDD
            stockMarketRepository.saveAll(List.of(stock1, stock2, stock3));

            System.out.println("--- Base de données initialisée avec 3 cotations ---");
        };
    }

}
