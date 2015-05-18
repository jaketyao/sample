/**
 * 샘플 목록 조회
 */
angular
    .module('app.sample')
    .controller('SampleListController', SampleListController);

	function SampleListController(sampleDataService, $state) {

		var vm = this;

		// 샘플 목록
		vm.sampleList = [];

		//
		vm.parameter = {};

		// 샘플 목록 조회
		vm.getSampleList = getSampleList;

		// 샘플 목록 조회
		vm.getSampleList();


	    /**
	     * 샘플 목록 조회
	     */
	    function getSampleList(){
	    	// data-service call
	    	sampleDataService.getSampleList(vm.parameter)
	    	.success(function(data){
	    		vm.sampleList = data.data;
	    	});
	    }


	}

