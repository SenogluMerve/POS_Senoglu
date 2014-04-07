package weddings.webapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import weddings.domain.DomainConfiguration;
import weddings.repository.RepositoryConfiguration;
import weddings.service.ServiceConfiguration;

@Import(value = {DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
@Configuration
public class WebappApplicationConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
