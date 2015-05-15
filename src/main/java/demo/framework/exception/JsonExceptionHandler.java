/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.exception
 * </PRE>
 * @file   : JsonExceptionHandler.java
 * @date   : 2015. 5. 15. 오후 2:15:11
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import demo.framework.response.BaseResponse;

/**
 * <PRE>
 *  ClassName : JsonExceptionHandler
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:15:11
 * @author  : jkkim
 * @brief   :
 */
@Component
public class JsonExceptionHandler implements HandlerExceptionResolver {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub

		try{
			ObjectMapper mapper = new ObjectMapper();
	    	response.setContentType("application/json; charset=UTF-8");
	    	BaseResponse baseResponse = new BaseResponse();

	    	String errorText = "default error message";
	    	//예외 메시지 정의...추가...필요
	    	if(ex instanceof DataIntegrityViolationException){
	    		errorText = "입력한 값이 큽니다.";
	    	}else if(ex instanceof BadSqlGrammarException){
	     		errorText = "SQL 문법 오류";
	    	}else if(ex instanceof CommonRuntimeException){
	    		errorText = ex.getMessage();
	    	}

	    	baseResponse.setMessage(errorText);
	    	baseResponse.setResponseNG();
	        mapper.writeValue(response.getWriter(), baseResponse);

		}catch(Exception e){
			e.printStackTrace();
		}

		return new ModelAndView();
	}

}
