/**
 * <PRE>
 *  Project : demo
 *  Package : demo.config
 * </PRE>
 * @file   : SecurityConfig.java
 * @date   : 2015. 5. 15. 오후 2:53:33
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import demo.framework.security.filter.LoginFailureHandler;
import demo.framework.security.filter.LoginProcessFilter;
import demo.framework.security.filter.LoginSuccessHandler;
import demo.framework.security.provider.CustomAuthenticationProvider;

/**
 * <PRE>
 *  ClassName : SecurityConfig
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:53:33
 * @author  : jkkim
 * @brief   :
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Bean(name = "authenticationManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(customAuthenticationProvider());
    }


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
			.authorizeRequests()
			.antMatchers(actuatorEndpoints()).access("hasRole('ROLE_PUSER')")
			.and()
			.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint());
		http.addFilterBefore(authenticationProcessFilter(), UsernamePasswordAuthenticationFilter.class);
	}


	private String[] actuatorEndpoints() {
		return new String[]{"/admin/**"};
	}

	@Bean
    public LoginUrlAuthenticationEntryPoint authenticationEntryPoint() {
    	return new LoginUrlAuthenticationEntryPoint("/authMgt/accessDenied");
    }


	@Bean
	public LoginProcessFilter authenticationProcessFilter() throws Exception{
		LoginProcessFilter filter = new LoginProcessFilter();
		filter.setAuthenticationManager(authenticationManagerBean());
		filter.setAuthenticationSuccessHandler(authenticationSuccessHandler());
		filter.setFilterProcessesUrl("/loginProcess");
		//filter.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/loginProcess"));
		filter.setAuthenticationFailureHandler(authenticationFailureHandler());
		return filter;
	}


	@Bean
	public LoginSuccessHandler authenticationSuccessHandler(){
		return new LoginSuccessHandler();
	}


	@Bean
	public LoginFailureHandler authenticationFailureHandler(){
		return new LoginFailureHandler();
	}


	@Bean
	public CustomAuthenticationProvider customAuthenticationProvider(){
		return new CustomAuthenticationProvider();
	}


}
