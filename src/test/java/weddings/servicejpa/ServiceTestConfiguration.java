package weddings.servicejpa;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import weddings.domain.DomainConfiguration;
import weddings.repository.jpa.RepositoryJpaConfiguration;
import weddings.service.jpa.ServiceJpaConfiguration;

/**
 * To combine all configurations from main that are required to execute test on layer of service. Additionally H2
 * database is used as datasource at testing.
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceJpaConfiguration.class})
public class ServiceTestConfiguration {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
