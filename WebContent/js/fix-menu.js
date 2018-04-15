$(function(){
   $(window).scroll(function() {

          if(($(this).scrollTop() > 0)) {
            
            $(".fixed-munu-item").css("opacity","1");
        }
        else{
             $(".fixed-munu-item").css("opacity","0");
        }
              
      });
     $(window).load(function() {

          if(($(this).scrollTop() > 0)) {
            
            $(".fixed-munu-item").css("opacity","1");
        }
        else{
             $(".fixed-munu-item").css("opacity","0");
        }
              
      });
     //滚动监听完成
     $(".fixed-munu-item").hover(
           function() {   
               $(this).find(".fixed-munu-item-icon").css("background","#0099CC");
           $(this).find(".fixed-munu-item-icon i").css("color","#eee");
           $(this).find(".fixed-munu-item-content").animate({width:"120px"},1000).css("visibility","visible");

         },function(){         
             $(this).find(".fixed-munu-item-content").css({"visibility":"hidden","width":"80px"});
         $(this).find(".fixed-munu-item-icon").css("background","#7d6d6d");
             $(this).find(".fixed-munu-item-icon i").css("color","#eee");
           }
      );
      $(".fixed-munu-item-content").hover(
           function(){  
              $(this).find(".fix-menu-item-door").css("visibility","visible");
           },function(){
              $(this).find(".fix-menu-item-door").css("visibility","hidden");
           }
      );
      //侧边回馈栏完成
});