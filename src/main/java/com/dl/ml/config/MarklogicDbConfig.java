package com.dl.ml.config;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MarklogicDbConfig {

    @Value("${marklogic.host}")
    private String host;
    @Value("${marklogic.port}")
    private int port;
    @Value("${marklogic.username}")
    private String username;
    @Value("${marklogic.password}")
    private String password;

    @Bean(name = "markLogicDbClient")
    public DatabaseClient getDatabaseClient(){
        return DatabaseClientFactory.newClient(host,port, new DatabaseClientFactory.DigestAuthContext(username,password));
    }
}
