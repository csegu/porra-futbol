package com.csg.porra.db;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("postgres")
@Configuration
public class DBConfiguration {

    @Value("${postgres.datasource.username}")
    private String username;

    @Value("${postgres.datasource.password}")
    private String password;

    @Value("${postgres.datasource.url}")
    private String url;

    @Primary
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(url)
                .username(username)
                .password(password)
                .build();
    }
}
