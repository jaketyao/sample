/**
 * <PRE>
 *  Project : CCEI.portal
 *  Package : com.kt.iot.framework.security.filter
 * </PRE>
 * @file   : CustomAuthenticationProvider.java
 * @date   : 2015. 4. 28. 오후 5:29:39
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 4. 28.       :            : 신규 개발.
 */
package demo.framework.security.provider;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import demo.framework.security.userdetails.CustomUserDetails;
import demo.framework.security.userdetails.UserDetailsVO;

/**
 * <PRE>
 *  ClassName : CustomAuthenticationProvider
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 4. 28. 오후 5:29:39
 * @author  : jkkim
 * @brief   :
 */

public class CustomAuthenticationProvider implements AuthenticationProvider{


	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UserDetailsVO userDetailsVO = new UserDetailsVO();

		String userid = authentication.getName();
		String password = authentication.getCredentials().toString();
		boolean enabled = true;
		String rolePrefix = "ROLE_";
		String roleId = "";

		userDetailsVO.setUserId(userid);

		// DB
		//userDetailsVO = login(userid);

		if(userDetailsVO == null){
			throw new BadCredentialsException("권한이 없습니다.");
		}

		roleId = rolePrefix + userDetailsVO.getRoleId();

		// 다중권한
		//List<UserDetailsVO> userAuthorities = authSVC.getAuthorities(userDetailsVO);

		Collection<? extends GrantedAuthority> authorities =
				Arrays.asList(new GrantedAuthority[] {new SimpleGrantedAuthority(roleId)});

        User user = new CustomUserDetails(userid, password, enabled, true, true, true, authorities, userDetailsVO);

        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    public boolean supports(Class<?> arg0) {
        return true;
    }

}
