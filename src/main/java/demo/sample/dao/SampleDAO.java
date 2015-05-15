/**
 * <PRE>
 *  Project : demo
 *  Package : demo.sample.dao
 * </PRE>
 * @file   : SampleDAO.java
 * @date   : 2015. 5. 15. 오후 1:50:17
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.sample.dao;

import java.util.List;
import java.util.Map;

import demo.sample.vo.SampleVO;

/**
 * <PRE>
 *  ClassName : SampleDAO
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 1:50:17
 * @author  : jkkim
 * @brief   :
 */

public interface SampleDAO {

	/**
	 *
	 * <PRE>
	 *  MethodName : getSampleList
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:04:21
	 * @param  :
	 * @return : List<Object>
	 * @brief  : 다건 조회 샘플
	 * @param params
	 * @return
	 */
	public List<Object> getSampleList(Map<String, Object> params);


	/**
	 *
	 * <PRE>
	 *  MethodName : getSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:05:03
	 * @param  :
	 * @return : SampleVO
	 * @brief  : 단건 조회 샘플
	 * @param params
	 * @return
	 */
	public SampleVO getSample(Map<String, Object> params);


	/**
	 *
	 * <PRE>
	 *  MethodName : insertSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:05:11
	 * @param  :
	 * @return : void
	 * @brief  : 등록 샘플
	 * @param params
	 */
	public void insertSample(Map<String, Object> params);


	/**
	 *
	 * <PRE>
	 *  MethodName : updateSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:05:18
	 * @param  :
	 * @return : void
	 * @brief  : 수정 샘플
	 * @param params
	 */
	public void updateSample(Map<String, Object> params);


	/**
	 *
	 * <PRE>
	 *  MethodName : deleteSample
	 * </PRE>
	 * @author : jkkim
	 * @date   : 2015. 5. 15. 오후 2:05:23
	 * @param  :
	 * @return : void
	 * @brief  : 삭제 샘플
	 * @param params
	 */
	public void deleteSample(Map<String, Object> params);

}
