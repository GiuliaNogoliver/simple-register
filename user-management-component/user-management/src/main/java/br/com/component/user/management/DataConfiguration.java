package br.com.component.user.management;

import javax.sql.DataSource;

import org.hibernate.boot.model.relational.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {

    @Bean
    DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("dbc:mysql://localhost:3306/user.management");
		dataSource.setUsername("root");
		dataSource.setPassword("giulia123");
		return dataSource;
	}
    @Bean
    JpaVendorAdapter jpaVendorAdapter() {
    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
 //   adapter.setDatabase(Database.MYSQL);
    adapter.setShowSql(true);
    adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
    adapter.setPrepareConnection(true);
    return adapter;
    }
}
