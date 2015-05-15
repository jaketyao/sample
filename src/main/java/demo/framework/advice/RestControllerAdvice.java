/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.advice
 * </PRE>
 * @file   : RestControllerAdvice.java
 * @date   : 2015. 5. 15. 오후 2:08:25
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import demo.framework.response.BaseResponse;

/**
 * <PRE>
 *  ClassName : RestControllerAdvice
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:08:25
 * @author  : jkkim
 * @brief   :
 */
@ControllerAdvice(annotations = RestController.class)
public class RestControllerAdvice implements ResponseBodyAdvice<Object>{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice#supports(org.springframework.core.MethodParameter, java.lang.Class)
	 */
	@Override
	public boolean supports(MethodParameter returnType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice#beforeBodyWrite(java.lang.Object, org.springframework.core.MethodParameter, org.springframework.http.MediaType, java.lang.Class, org.springframework.http.server.ServerHttpRequest, org.springframework.http.server.ServerHttpResponse)
	 */
	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType,
			MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType,
			ServerHttpRequest request, ServerHttpResponse response) {
		// TODO Auto-generated method stub
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponseOK();
		baseResponse.setData(body);

		return body instanceof BaseResponse ? body : baseResponse;
	}

}
