<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/magic-check.css">
    <link rel="stylesheet" href="css/public.css">
    <link rel="stylesheet" href="css/base_good_manager.css">
</head>
<body>
<div role="tabpanel" class="tab-pane in_sales" id="in_sales">
                <div class="in_sales_box ">
               
                   <ul>
                  <c:forEach items="${InGoodList}" var="organicGood">
                   <div>${InGoodList}</div>
                    <li class="goods-items youji caigoushang">
                        <div class="media-list">
                            <div class="media">
                                <div class="media-left">
                                    <a href="#">
                                        <img class="media-object" src="${organicGood.imageUrls[0]}" alt="...">
                                    </a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">${organicGood.goodsName}</h4>
                                    <p class="baseaddr">
                                        <img src="./images/base.png" alt="">
                                        <span  class="fr">${organicGood.address}</span>
                                    </p>
                                    <div class="baseinfo">
                                        <img src="./images/zhuisuxinxitip.png" alt="">
                                        <span class="unit">${organicGood.goodsAmount} &nbsp ${organicGood.unitName}</span>
                                        <span class="fr times">${organicGood.createTime}</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="bj-box">
                            
                            <a class="chakanbaojia fr">加入购物车</a>
                        </div>
                    </li>
</c:forEach>
                </ul>
                      
                       </div>
                       </div>
</body>
</html>