/**
 * <PRE>
 *  Project : demo
 *  Package : DataSourceConfiguration
 * </PRE>
 * @file   : DataSourceConfig.java
 * @date   : 2015. 5. 15. 오후 1:38:04
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <PRE>
 *  ClassName : DataSourceConfig
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 1:38:04
 * @author  : jkkim
 * @brief   :
 */

@Configuration
@EnableTransactionManagement
@MapperScan("demo")
public class DataSourceConfig {


	@Bean
    public DataSource dataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://192.168.1.37:5432/ccei");
		dataSource.setUsername("postgres");
		dataSource.setPassword("1");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return bean.getObject();
    }

}


