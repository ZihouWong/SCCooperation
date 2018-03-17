$(document).ready(function(){
	var local = window.location.href;
	var arr = local.split('pageNo=');
	
	
	
	var reg = /pageNo=[\d]*/;
	
	var str = local.match(/pageNo=[\d]*/);
	var result = str[0].split('pageNo=')[1];
	
	
	$("#replacePage a:eq(1)").text( parseInt((Number(result) / 5)) * 5 + 1);
	  $("#replacePage a:eq(2)").text(parseInt((Number(result) / 5)) * 5 + 2);
	  $("#replacePage a:eq(3)").text(parseInt((Number(result) / 5)) * 5 + 3);
	  $("#replacePage a:eq(4)").text(parseInt((Number(result) / 5)) * 5 + 4);
	  $("#replacePage a:eq(5)").text(parseInt((Number(result) / 5)) * 5 + 5);
	

	$("#replacePage #last").click(function(){
		  <!--alert(window.location);-->
		  if(Number($("#replacePage a:eq(1)").text())-5 > 0){
			  $("#replacePage a:eq(1)").text(Number($("#replacePage a:eq(1)").text())-5);
			  $("#replacePage a:eq(2)").text(Number($("#replacePage a:eq(2)").text())-5);
			  $("#replacePage a:eq(3)").text(Number($("#replacePage a:eq(3)").text())-5);
			  $("#replacePage a:eq(4)").text(Number($("#replacePage a:eq(4)").text())-5);
			  $("#replacePage a:eq(5)").text(Number($("#replacePage a:eq(5)").text())-5);
		  }
		  
		  
	  });
	
	$("#replacePage #next").click(function(){
		  <!--alert(window.location);-->
			  $("#replacePage a:eq(1)").text(Number($("#replacePage a:eq(1)").text())+5);
			  $("#replacePage a:eq(2)").text(Number($("#replacePage a:eq(2)").text())+5);
			  $("#replacePage a:eq(3)").text(Number($("#replacePage a:eq(3)").text())+5);
			  $("#replacePage a:eq(4)").text(Number($("#replacePage a:eq(4)").text())+5);
			  $("#replacePage a:eq(5)").text(Number($("#replacePage a:eq(5)").text())+5);
		  
		  
	  });
	
	

	  $("#replacePage #first").click(function(){
		  <!--alert(window.location);-->

		  var newLocal = local.replace(reg,"pageNo="+$("#replacePage a:eq(1)").text());
		  window.location.href = newLocal;
	  });
	  $("#replacePage #second").click(function(){
		  <!--alert(window.location);-->
		  var newLocal = local.replace(reg,"pageNo="+$("#replacePage a:eq(2)").text());
		  window.location.href = newLocal;
	  });
	  $("#replacePage #third").click(function(){
		  <!--alert(window.location);-->
		  var newLocal = local.replace(reg,"pageNo="+$("#replacePage a:eq(3)").text());
		  window.location.href = newLocal;
	  });
	  $("#replacePage #fourth").click(function(){
		  <!--alert(window.location);-->
		  var newLocal = local.replace(reg,"pageNo="+$("#replacePage a:eq(4)").text());
		  window.location.href = newLocal;
	  });
	  $("#replacePage #Fifth").click(function(){
		  <!--alert(window.location);-->
		  var newLocal = local.replace(reg,"pageNo="+$("#replacePage a:eq(5)").text());
		  window.location.href = newLocal;
	  });
	});