<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
    <title>登錄</title>  
</head>  
<body>  
  
<h1>系统登錄</h1>  
  
<div>  
  <c:if test="${param.error != null}">  
    <p>用户名密碼錯誤！</p>  
  </c:if>  
  <c:if test="${param.logout != null}">  
    <p>已登出！</p>  
  </c:if>  
</div>  
<c:url value="/login" var="loginUrl"/>  
<form action="${loginUrl}" method="post" id="loginForm">  
  <div>  
    <input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/>  
  </div>  
  <div>  
    <input type="password" name="password" class="password" placeholder="密碼" oncontextmenu="return false" onpaste="return false"/>  
  </div>  
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>  
  <button id="submit" type="submit">登錄</button>  
</form>  
  
  
</body>  
</html>  