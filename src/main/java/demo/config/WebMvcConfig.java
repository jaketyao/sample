/**
 * <PRE>
 *  Project : sample
 *  Package : demo.config
 * </PRE>
 * @file   : WebMvcConfig.java
 * @date   : 2015. 5. 18. 오전 11:06:18
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 18.       :            : 신규 개발.
 */
package demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <PRE>
 *  ClassName : WebMvcConfig
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 18. 오전 11:06:18
 * @author  : jkkim
 * @brief   :
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/" ).setViewName( "forward:/index.html" );
        super.addViewControllers( registry );
    }
}
