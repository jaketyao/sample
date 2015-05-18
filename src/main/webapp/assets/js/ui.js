//-----------------------------------------------------------------
// IE console.log 보완
//-----------------------------------------------------------------
if (window['console'] === undefined || console.log === undefined ) {
 	console = { log: function() {} };
}

//-----------------------------------------------------------------
// binding event
//-----------------------------------------------------------------
$(window).bind("load",function(){
	admin.ui.gnb();
});

$(window).bind("resize",function(){

});

//-----------------------------------------------------------------
// admin.ui
//-----------------------------------------------------------------
var admin = admin || {};
admin.ui={

	/**
     * GNB
     * @param {형식} 인자값 - 설명
     */
	gnb:function(){
		var nav = $("nav.gnb");
		$(">ul",nav).bind("mouseenter",function(){
			$(".bg",nav).not(":animated").slideDown(200,"swing");
			$(">ul>li>ul",nav).not(":animated").slideDown(200,"swing");
		});
		$(">ul",nav).bind("mouseleave",function(){
			$(".bg",nav).not(":animated").slideUp(200,"swing");
			$(">ul>li>ul",nav).not(":animated").slideUp(200,"swing");
		});
	},

	/**/

};