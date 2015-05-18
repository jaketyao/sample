/**
 *  sample-data-service
 */
angular
    .module('app.sample')
    .service('sampleDataService', sampleDataService);

	function sampleDataService($http, Constant) {

	    var service = {
	    	getSampleList : getSampleList,
	        insertSample : insertSample,
	        updateSample : updateSample,
	        deleteSample : deleteSample
	    };

	    return service;


	    /**
	     * 샘플 목록 조회
	     */
	    function getSampleList(parameter) {
	    	return $http.get('/sample/getSampleList', {
	    		params : {
					"pageNum" : parameter.pageNum || 1,
					"pageSize" : parameter.pageSize || 10,
					"delYn" : 'N'
				}
	    	}).success(getSampleListComplete)
              .error(getSampleListFailed);

	    	function getSampleListComplete(response){
	    		return response;
	    	}

	    	function getSampleListFailed(error) {
	            console.log(error);
	        }
	    }


	    /**
	     * 샘플 등록
	     */
	    function insertSample(parameter){
	    	return $http.post('/sample/insertSample', parameter)
	    		.success(insertSampleComplete)
	    		.error(insertSampleFailed);

	    	function insertSampleComplete(response){
	    		return response;
	    	}

	    	function insertSampleFailed(error) {
	            console.log(error);
	        }
	    }


	    /**
	     * 샘플 수정
	     */
	    function updateSample(parameter){
	    	return $http.put('/sample/updateSample', parameter)
	    		.success(updateSampleComplete)
	    		.error(updateSampleFailed);

	    	function updateSampleComplete(response){
	    		return response;
	    	}

	    	function updateSampleFailed(error) {
	            console.log(error);
	        }
	    }


	    /**
	     * 샘플 삭제
	     */
	    function deleteSample(parameter){
	    	return $http.delete('/sample/deleteSample', {
	    		params : {
					"roleId" : parameter.roleId
				}
	    	}).success(deleteSampleComplete)
	    	  .error(deleteSampleFailed);

	    	function deleteSampleComplete(response){
	    		return response;
	    	}

	    	function deleteSampleFailed(error) {
	            console.log(error);
	        }
	    }

	}

