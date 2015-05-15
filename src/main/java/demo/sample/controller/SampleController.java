/**
 * <PRE>
 *  Project : demo
 *  Package : demo.sample.controller
 * </PRE>
 * @file   : SampleController.java
 * @date   : 2015. 5. 15. 오후 1:52:26
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.sample.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.sample.service.SampleService;
import demo.sample.vo.SampleVO;

/**
 * <PRE>
 *  ClassName : SampleController
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 1:52:26
 * @author  : jkkim
 * @brief   :
 */

@RestController
@RequestMapping("/sample")
public class SampleController {

	@Autowired
	private SampleService sampleService;

	/**
	 *
	 * <PRE>
	 *  MethodName : getSampleList
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:41:14
	 * @param  :
	 * @return : List<Object>
	 * @brief  : 다건 조회 샘플
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/getSampleList", method = RequestMethod.GET)
	public List<Object> getSampleList(@RequestParam Map<String, Object> params){
		return sampleService.getSampleList(params);
	}


	/**
	 *
	 * <PRE>
	 *  MethodName : getSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:44:28
	 * @param  :
	 * @return : SampleVO
	 * @brief  : 단건 조회 샘플
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/getSample", method = RequestMethod.GET)
	public SampleVO getSample(@RequestParam Map<String, Object> params){
		return sampleService.getSample(params);
	}


	/**
	 *
	 * <PRE>
	 *  MethodName : insertSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:42:21
	 * @param  :
	 * @return : void
	 * @brief  : 샘플 등록
	 * @param params
	 */
	@RequestMapping(value = "/insertSample", method = RequestMethod.POST)
	public void insertSample(@RequestBody Map<String, Object> params){
		sampleService.insertSample(params);
	}


	/**
	 *
	 * <PRE>
	 *  MethodName : updateSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:43:19
	 * @param  :
	 * @return : void
	 * @brief  : 수정 샘플
	 * @param params
	 */
	@RequestMapping(value = "/updateSample", method = RequestMethod.PUT)
	public void updateSample(@RequestBody Map<String, Object> params){
		sampleService.updateSample(params);
	}


	/**
	 *
	 * <PRE>
	 *  MethodName : deleteSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:43:26
	 * @param  :
	 * @return : void
	 * @brief  : 삭제 샘플
	 * @param params
	 */
	@RequestMapping(value = "/deleteSample", method = RequestMethod.DELETE)
	public void deleteSample(@RequestParam Map<String, Object> params){
		sampleService.deleteSample(params);
	}



}
