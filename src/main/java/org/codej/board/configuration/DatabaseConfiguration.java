//package org.codej.board.configuration;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import lombok.RequiredArgsConstructor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
//@Configuration
//@PropertySource("classpath:/application.properties")
//@RequiredArgsConstructor
//public class DatabaseConfiguration {
//
//
//    private final ApplicationContext applicationContext;
//
//    @Bean(name = "dataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "sqlSessionFactory")
//    @Primary
//    public SqlSessionFactory sqlSessionFactory(@Autowired @Qualifier("dataSource") DataSource dataSource,ApplicationContext applicationContext)throws Exception{
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
////        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis-config.xml"));
//        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/*.xml"));
//        sqlSessionFactoryBean.setConfiguration(mybatisConfig());
//
//        return sqlSessionFactoryBean.getObject();
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//    @Bean
//    @ConfigurationProperties(prefix = "mybatis.configuration")
//    public org.apache.ibatis.session.Configuration mybatisConfig(){
//        return new org.apache.ibatis.session.Configuration();
//    }
//
//}
