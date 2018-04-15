<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
*{
    margin: 0px;
    padding:0px;
}
.topbody{
    width:900px;
    margin: 0 auto;
}
.topbar{
    width:100%;
    background-color: #000;
    display: inline-block;
}

.topbar li{
    float:left;
}
.toplist{
    display: inline-block;
    list-style-type:none;
}
.toplist a{
    color:#FFF;
    text-decoration: none;
}
.title,.toplist a{
    display:block;
    
    display: block;
    float: left;
}
.toplist a{
    padding:15px 20px 15px 20px;
}
.title{
    color:#FFF;
    text-decoration: none;
    padding:15px 30px 15px 30px;
   
}
.topbody{
    width:900px;
    margin: 0 auto;
}
</style>
</head>
<body>
<div class="topbar">
    <div class="topbody">
    <div class="input-group col-md-3" style="margin-top:10px">  
       <input type="text" class="form-control"placeholder="请输入字段名" / >  
            <span class="input-group-btn">  
               <button class="btn btn-info btn-search">查找</button>  
            </span>  
 </div>  
    </div>
</div>
</body>
</html>