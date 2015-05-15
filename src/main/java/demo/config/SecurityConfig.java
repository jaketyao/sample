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
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

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

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*@Bean(name = "authenticationManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }



	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
		    .authorizeRequests();
		http.addFilterBefore(authenticationProcessFilter(), UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(customAuthenticationProvider());
    }



	*//**
	 *
	 * <PRE>
	 *  MethodName : authenticationProcessFilter
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 3:15:49
	 * @param  :
	 * @return : LoginProcessFilter
	 * @brief  : 로그인 처리 필터
	 * @return
	 * @throws Exception
	 *//*
	@Bean
	public LoginProcessFilter authenticationProcessFilter() throws Exception{
		LoginProcessFilter filter = new LoginProcessFilter();
		filter.setAuthenticationManager(authenticationManagerBean());
		filter.setAuthenticationSuccessHandler(authenticationSuccessHandler());
		filter.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/loginProcess"));
		filter.setAuthenticationFailureHandler(authenticationFailureHandler());
		return filter;
	}


	*//**
	 *
	 * <PRE>
	 *  MethodName : authenticationSuccessHandler
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 3:14:59
	 * @param  :
	 * @return : LoginSuccessHandler
	 * @brief  : 로그인 성공처리
	 * @return
	 *//*
	@Bean
	public LoginSuccessHandler authenticationSuccessHandler(){
		return new LoginSuccessHandler();
	}


	*//**
	 *
	 * <PRE>
	 *  MethodName : authenticationFailureHandler
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 3:15:15
	 * @param  :
	 * @return : LoginFailureHandler
	 * @brief  : 로그인 실패 처리
	 * @return
	 *//*
	@Bean
	public LoginFailureHandler authenticationFailureHandler(){
		return new LoginFailureHandler();
	}


	@Bean
	public CustomAuthenticationProvider customAuthenticationProvider(){
		return new CustomAuthenticationProvider();
	}*/


}
