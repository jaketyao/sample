angular
    .module('app')
    .config(routeConfig);

	function routeConfig($stateProvider, $urlRouterProvider){

		$urlRouterProvider
			.when("", "/main")
	    	.otherwise("/main");

		$stateProvider
			.state('main', {
				url : '/main',
				template: '<h3>main dashboard</h3>'
			})
			.state('sample', {
				abstract: true,
				url : '/sample',
				template: '<ui-view/>'
			})
			.state('sample.list', {
				url : '/list',
				templateUrl: 'components/sample/sample-list.html',
				controller: 'SampleListController as vm'
			});


	}
