/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.security.filter
 * </PRE>
 * @file   : LoginProcessHandler.java
 * @date   : 2015. 5. 15. 오후 3:02:59
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.security.filter;

import java.io.BufferedReader;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * <PRE>
 *  ClassName : LoginProcessHandler
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 3:02:59
 * @author  : jkkim
 * @brief   :
 */

public class LoginProcessFilter extends UsernamePasswordAuthenticationFilter{

	private static final Logger logger = LoggerFactory.getLogger(LoginProcessFilter.class);

	private String jsonUsername;
	private String jsonPassword;



	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter#obtainPassword(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected String obtainPassword(HttpServletRequest request) {
		String password = null;
		if ("application/json".equals(request.getHeader("Content-Type"))) {
			password = this.jsonPassword;
		}else{
			password = super.obtainPassword(request);
		}
		return password;
	}


	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter#obtainUsername(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected String obtainUsername(HttpServletRequest request) {
		String username = null;
		if ("application/json".equals(request.getHeader("Content-Type"))) {
			username = this.jsonUsername;
		}else{
			username = super.obtainUsername(request);
		}
		return username;
	}


	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

		if ("application/json".equals(request.getHeader("Content-Type"))) {
            try {

            	StringBuffer sb = new StringBuffer();
                String line = null;

                BufferedReader reader = request.getReader();
                while ((line = reader.readLine()) != null){
                    sb.append(line);
                }

                ObjectMapper mapper = new ObjectMapper();

                Map<String, String> params = mapper.readValue(sb.toString(), Map.class);

                this.jsonUsername = params.get("j_username");
                this.jsonPassword = params.get("j_password");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

		return super.attemptAuthentication(request, response);
	}

}


