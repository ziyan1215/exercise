$.djs.namespace("/demo","/ui/desktop/index.js",function(){	
	this.init=function(){
		var ctxPath=this.__ctxPath;
		$("#test").click(function(){
			alert("Hello world!");
		});
	};
});