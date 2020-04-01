package ru.neoflex.vtb.saveloadstatic.conf;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.data.r2dbc.support.SqlErrorCodeR2dbcExceptionTranslator;

@Configuration
public class PSQLConfiguration {

    @Value("${psql.host}")
    private String host;

    @Value("${psql.port}")
    private int port;

    @Value("${psql.username}")
    private String username;

    @Value("${psql.passworld}")
    private String passworld;

    @Value("${psql.database}")
    private String database;

    @Bean
    public PostgresqlConnectionFactory connectionFactory(){
        return new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder()
                .host(host)
                .database(database)
                .username(username)
                .password(passworld)
                .port(port)
                .build());
    }

    @Bean
    public DatabaseClient databaseClient(){
        SqlErrorCodeR2dbcExceptionTranslator translator = new SqlErrorCodeR2dbcExceptionTranslator();
        return DatabaseClient.builder().exceptionTranslator(translator).connectionFactory(connectionFactory()).build();
    }

}
