<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>农农网</title>
    <link rel="stylesheet" href="js/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="js/swiper/swiper-3.4.2.min.css">
    <link rel="stylesheet" href="css/public.css">
    <link rel="stylesheet" href="css/index.css">
	<link rel="icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />


</head>
<body>
    <div class="heaer-box">
        <div class="w">
            <div class="topBar">
                <div class="pull-left">
                    <ul class="topLef">
                        <li><a>欢迎进入绿度蛙！</a></li>
                        <li>
                            <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
                            <span>服务热线：</span>
                            <span class="fw-num"> 400-676-5176</span>
                        </li>
                    </ul>
                </div>
                <div class="pull-right">
                    <ul class=topRig>
                        <li>
                            <span>你好，<em class="purchase">采购</em></span>
                        </li>
                        <li>
                            <span id="userNmae">13064562356</span>
                        </li>
                        <li>
                            <span class="glyphicon glyphicon glyphicon-bell lingdang" aria-hidden="true">
                                <em></em>
                            </span>
                            <a>消息</a>
                        </li>
                        <li class="signOut">
                            <img src="./images/tuichu.png" alt="">
                            <a class="">退出</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>
    <div class="header">
        <div class="w">
            <div class="logo">
                <h1 class="logo-img">
                    <a href="index.html" class="logo_tit_lk">绿度蛙</a>
                    <em class="caigouduan"></em>
                </h1>
            </div>
            <div class="search">
                <div class="row">
                    <div class="input-group input-box">
                        <input type="text" class="form-control inputBox" placeholder="请输入商品名称">
                        <span class="input-group-btn sousuoBtn">
                             <button class="btn " type="button">搜索</button>
                         </span>
                     </div>

                </div>
                <div class="fruits">
                    <ul>
                        <li><a href="fgoods.html">西瓜</a></li>
                        <li><a href="fgoods.html">樱桃</a></li>
                        <li><a href="fgoods.html">奇异果</a></li>
                        <li><a href="fgoods.html">苹果</a></li>
                        <li><a href="fgoods.html">葡萄</a></li>
                        <li><a href="fgoods.html">香梨</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="navitems">
        <div class="w">
            <div class="cateory">
                <span class="tab-title">全部商品分类</span>
                <ul class="instro-tab">
                    <li data-index="1">
                        <a class="shucai">蔬菜</a>
                    </li>
                    <li data-index="2">
                        <a class="shuiguo">水果</a>
                    </li>
                    <li data-index="3">
                        <a class="jiaqin">禽畜</a>
                    </li>
                    <li data-index="4">
                        <a class="haixian">海鲜</a>
                    </li>
                    <li data-index="5">
                        <a class="sushi">速食</a>
                    </li>
                    <li data-index="6">
                        <a class="danlei">蛋类</a>
                    </li>
                    <li data-index="7">
                        <a class="ruzhipin">乳制品</a>
                    </li>
                    <li data-index="8">
                        <a class="roulei">肉类</a>
                    </li>
                </ul>
                <div class="ldw_menu">
                    <div class="good-part good-part1" id="good-item1">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">茄果类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">西红柿</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">干辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">青椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">茄子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">西红柿</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">干辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">青椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">茄子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">芽苗类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">西红柿</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">干辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">青椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">茄子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">笋类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">西红柿</a>
                                    <a href="" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="" class="goods-detail-con-lk">干辣椒</a>
                                    <a href="" class="goods-detail-con-lk">青椒</a>
                                    <a href="" class="goods-detail-con-lk">茄子</a>
                                    <a href="" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="" class="goods-detail-con-lk">鲜辣椒</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">根茎类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">西红柿</a>
                                    <a href="" class="goods-detail-con-lk">鲜辣椒</a>
                                    <a href="" class="goods-detail-con-lk">干辣椒</a>
                                    <a href="" class="goods-detail-con-lk">青椒</a>
                                    <a href="" class="goods-detail-con-lk">茄子</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part2" id="good-item2">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">树果类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">梨子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">香蕉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">桃子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">苹果</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">橘子</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">水果类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">葡萄</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">香蕉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">橘子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">西瓜</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">苹果</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">水果类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">葡萄</a>
                                    <a href="" class="goods-detail-con-lk">香蕉</a>
                                    <a href="" class="goods-detail-con-lk">橘子</a>
                                    <a href="" class="goods-detail-con-lk">西瓜</a>
                                    <a href="" class="goods-detail-con-lk">苹果</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">水果类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">葡萄</a>
                                    <a href="" class="goods-detail-con-lk">香蕉</a>
                                    <a href="" class="goods-detail-con-lk">橘子</a>
                                    <a href="" class="goods-detail-con-lk">西瓜</a>
                                    <a href="" class="goods-detail-con-lk">苹果</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">葡萄</a>
                                    <a href="" class="goods-detail-con-lk">香蕉</a>
                                    <a href="" class="goods-detail-con-lk">橘子</a>
                                    <a href="" class="goods-detail-con-lk">西瓜</a>
                                    <a href="" class="goods-detail-con-lk">苹果</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part3" id="good-item3">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">猪肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">牛肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">羊肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">兔肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">狗肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅肉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">家禽类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">猪肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">牛肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">羊肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">兔肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">狗肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅肉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">猪肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">牛肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">羊肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">兔肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">狗肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅肉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">猪肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">牛肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">羊肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">兔肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">狗肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅肉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part4" id="good-item4">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">鱼类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲸鱼</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲨鱼</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鱿鱼</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲶鱼</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">黄花鱼</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">虾类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">龙虾</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">河虾</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">草虾</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">青虾</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">对虾</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">蟹类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">关公蟹</a>
                                    <a href="" class="goods-detail-con-lk">梭子蟹</a>
                                    <a href="" class="goods-detail-con-lk">蛙蟹</a>
                                    <a href="" class="goods-detail-con-lk">青蟹</a>
                                    <a href="" class="goods-detail-con-lk">花蟹</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">蟹类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">关公蟹</a>
                                    <a href="" class="goods-detail-con-lk">梭子蟹</a>
                                    <a href="" class="goods-detail-con-lk">蛙蟹</a>
                                    <a href="" class="goods-detail-con-lk">青蟹</a>
                                    <a href="" class="goods-detail-con-lk">花蟹</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part5" id="good-item5">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">零食类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">薯片</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">虾条</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">锅巴</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">饼干</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">蛋糕</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">薯片</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">辣条</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">薯片</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">蛋糕</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">虾条</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">饼干</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">茄子</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鲜辣椒</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">副食类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">香肠</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">腊肠</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">方便面</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">香肠</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">腊肠</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">方便面</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">方便面</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">主食类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">饺子</a>
                                    <a href="" class="goods-detail-con-lk">面条</a>
                                    <a href="" class="goods-detail-con-lk">火锅</a>
                                    <a href="" class="goods-detail-con-lk">包子</a>
                                    <a href="" class="goods-detail-con-lk">馒头</a>
                                    <a href="" class="goods-detail-con-lk">春卷</a>
                                    <a href="" class="goods-detail-con-lk">汤圆</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">主食类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">饺子</a>
                                    <a href="" class="goods-detail-con-lk">面条</a>
                                    <a href="" class="goods-detail-con-lk">火锅</a>
                                    <a href="" class="goods-detail-con-lk">包子</a>
                                    <a href="" class="goods-detail-con-lk">馒头</a>
                                    <a href="" class="goods-detail-con-lk">春卷</a>
                                    <a href="" class="goods-detail-con-lk">汤圆</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part6" id="good-item6">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽蛋</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹌鹑蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸽蛋</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">家禽蛋</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹌鹑蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸽蛋</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽蛋</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹌鹑蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸽蛋</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">家禽蛋</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹌鹑蛋</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸽蛋</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part7" id="good-item7">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">乳粉类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">全脂乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">脱脂乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">全脂加糖乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">调味乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">婴儿乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">补钙乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">老人乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">老人乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">婴儿乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">婴儿乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">全脂加糖乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">脱脂乳粉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">全脂乳粉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">液乳类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">酸奶</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">纯牛奶</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">奶茶</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">奶油冰琪琳</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">灭菌奶</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">乳酸菌</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">奶茶</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">固乳类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">奶酪</a>
                                    <a href="" class="goods-detail-con-lk">奶粉</a>
                                    <a href="" class="goods-detail-con-lk">奶酪</a>
                                    <a href="" class="goods-detail-con-lk">奶糖</a>
                                    <a href="" class="goods-detail-con-lk">茄子</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">根茎类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">奶酪</a>
                                    <a href="" class="goods-detail-con-lk">奶粉</a>
                                    <a href="" class="goods-detail-con-lk">奶酪</a>
                                    <a href="" class="goods-detail-con-lk">奶糖</a>
                                    <a href="" class="goods-detail-con-lk">茄子</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                    <div class="good-part good-part8" id="good-item8">
                        <div class="goods-detail">
                            <dl class="goods-detail-item goods-detail-item1">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">畜类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">猪肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">羊肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">牛肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">驴肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">狗肉</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a class="goods-detail-tit-lk">禽类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸡肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸭肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鹅肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">鸽子肉</a>
                                    <a href="fgoods.html" class="goods-detail-con-lk">茄子</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">鱼类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">鲤鱼</a>
                                    <a href="" class="goods-detail-con-lk">鲫鱼</a>
                                    <a href="" class="goods-detail-con-lk">鲶鱼</a>
                                    <a href="" class="goods-detail-con-lk">鱿鱼</a>
                                    <a href="" class="goods-detail-con-lk">草鱼</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">海鲜类</a>
                                </dt>
                                <dt class="goods-detail-con">
                                    <a href="" class="goods-detail-con-lk">龙虾</a>
                                    <a href="" class="goods-detail-con-lk">螃蟹</a>
                                    <a href="" class="goods-detail-con-lk">鱿鱼</a>
                                    <a href="" class="goods-detail-con-lk">龙虾</a>
                                    <a href="" class="goods-detail-con-lk">螃蟹</a>
                                </dt>
                            </dl>
                            <dl class="goods-detail-item">
                                <dt class="goods-detail-tit">
                                    <a href="" class="goods-detail-tit-lk">薯芋类</a>
                                </dt>
                            </dl>
                        </div>
                    </div>
                </div>
            </div>
            <ul class="tab">
                <li class="active">
                    <a href="index.html">首页</a>
                </li>
                <li>
                    <a href="fgoods.html">找货品</a>
                </li>
                <li>
                    <a href="facaigou-fabu.html">发采购</a>
                </li>
                <li>
                    <a href="caigou-manager.html">采购管理</a>
                </li>
                <li>
                    <a href="ldService.html">绿度服务</a>
                </li>
                <li>
                    <a href="person.html">个人中心</a>
                </li>
            </ul>
        </div>
        <span class="line"></span>
    </div>
    <div class="swiper-box">
        <div class="swiper-container ovflow  ">
            <div class="swiper-wrapper swpi">
                <div class="swiper-slide"><img src="./images/bgm.png" alt=""></div>
                <div class="swiper-slide"><img src="./images/bgm2.png" alt=""></div>
            </div>
            <div class="advertisement hidden">
                <div class="w">
                    <span class="recent"> 最近公告：</span>
                    <ul class="notice">
                        <li>
                            <span class="phone-number">13024556746</span>
                            <span class="times">1分钟</span>
                            <span >前发布了</span>
                            <span class="text">西瓜-8424</span>
                        </li>
                        <li>
                            <span class="phone-number">13024556746</span>
                            <span class="times">1分钟</span>
                            <span >前发布了</span>
                            <span class="text">西瓜-8424</span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="things ">
        <div class="w">
            <div class="box ">
                <div class="left-box">
                    <div class="img-boxs">
                        <ul>
                            <li>
                                <a>
                                    <img src="./images/chanpinsongyang.png" alt="">
                                </a>

                            </li>
                            <li>
                                <a>
                                    <img src="./images/chanpinjiance.png" alt="">
                                </a>
                            </li>
                            <li>
                                <a>
                                    <img src="./images/baoxianlipei.png" alt="">
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="newest">
                        <h4 class="zuixincaigou">最新采购</h4>
                        <span></span>
                        <div class="new_tipBox">尚未发布采购，<a>立即发布</a></div>
                        <div class="details">
                           <div class="hidden">
                               <div class="fl content">
                                   <div class="media">
                                       <div class="media-left  ">
                                           <a>
                                               <img class="media-object" src="./images/shopping.png" alt="...">
                                           </a>
                                       </div>
                                       <div class="media-body ">
                                           <h4 class="media-heading xiaogua-header purchaseTypeName">八月瓜-小瓜</h4>
                                           <table class="tableBody">
                                               <tbody>
                                               <tr>
                                                   <td class="gradeName">有机产品</td>
                                                   <td class="supplier">基地直供</td>
                                                   <td class="addressDetail" style="text-align: right">上海</td>
                                               </tr>
                                               <tr>
                                                   <td class="isRetroactive">有追溯信息</td>
                                                   <td class="requireAmount">500<em class="unitName">斤</em>   </td>
                                                   <td class="newest_times" style="text-align: right">2017-07-10 10:34</td>
                                               </tr>
                                               </tbody>
                                           </table>
                                       </div>
                                   </div>
                               </div>
                               <div class="fr baojia">
                                   <p><em class="offerAmount">500</em>人以报价</p>
                                   <a class="chakanbaojia" href="lookPrice.html">查看报价</a>
                               </div>
                           </div>
                        </div>
                    </div>
                </div>
                <div class="right-box">
                    <div class="attestation-header">
                        <div class="media">
                            <div class="media-left">
                                <a href="#" class="person-img-box">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body person-header">
                                <p class="infor_number">13034562325</p>
                                <p class="infor_name">陈颖 <em >采购商</em></p>
                                <p class="infor_position">采购经理</p>
                            </div>
                        </div>
                    </div>
                   <div class="attestation-main">
                       <div class="attestation-body">
                           <p>实名认证</p>
                           <ul>
                               <li>水果</li>
                               <li>进口水果</li>
                               <li>进乳制品</li>
                               <li>进乳制品蔬菜</li>
                           </ul>
                           <span></span>
                       </div>
                       <div class="attestation-footer">
                           <div class="attestation-footer-top">
                               <span>采购管理： <em>2</em></span>
                               <a href="caigou-manager.html">查看报价</a>
                           </div>
                           <div class="attestation-footer-bottom">
                               <span>服务管理： <em>2</em></span>
                               <a href="ldService.html">立即申请</a></div>
                       </div>
                   </div>
                </div>
            </div>
        </div>
    </div>
   
   <section>
    <div class="w">
        <div class="area-header">
            <div class="fl area-header-left">有机采购</div>
        </div>
    </div>
    <div class="mian-content">
        <div class="w">
            <div class="newst">
                <ul>
                  <c:forEach items="${organicGoods}" var="organicGood">
                  
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
    </div>
</section>
    <section class="lv_part">
        <div class="w">
            <div class="area-header">
                    <div class="fl area-header-left">绿色专区</div>
                    <div class="fr area-header-right">
                        <span class="active ">现货</span>
                        <span>预售</span>
                    </div>
            </div>
        </div>
        <div class="mian-content">
            <div class="w">
                <div>
                
                <div class="newst">
                <ul>
                 <c:forEach items="${greenGoods}" var="greenGood">
                 
                    <li class="goods-items lvse caigoushang">
                        <div class="media-list">
                            <div class="media">
                                <div class="media-left">
                                    <a href="#">
                                        <img class="media-object" src="${greenGood.imageUrls[0]}" alt="...">
                                    </a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">${greenGood.goodsName}</h4>
                                    <p class="baseaddr">
                                        <img src="./images/base.png" alt="">
                                        <span  class="fr">${greenGood.address}</span>
                                    </p>
                                    <div class="baseinfo">
                                        <img src="./images/zhuisuxinxitip.png" alt="">
                                        <span class="unit">${greenGood.goodsAmount} &nbsp ${greenGood.unitName}</span>
                                        <span class="fr times">${greenGood.createTime}</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="bj-box">
                            
                            <span>${greenGood.sellpoint }</span>
                            <a class="chakanbaojia fr">添加购物车</a>
                        </div>
                    </li>
                  </c:forEach>
                </ul>
            </div>
                
                
                
                </div>
            </div>
        </div>
    </section>
    
    
    
    <section class="wgh_part">
        <div class="w">
            <div class="area-header">
                    <div class="fl area-header-left">无公害专区</div>
                    <div class="fr area-header-right">
                        <span class="active ">现货</span>
                        <span>预售</span>
                    </div>
            </div>
        </div>
        <div class="mian-content">
            <div class="w">
                <div>
                
                
                  <div class="newst">
                <ul>
                <c:forEach items="${pollutionGoods}" var="pollutionGood">
                
                    <li class="goods-items wugonghai caigoushang">
                        <div class="media-list">
                            <div class="media">
                                <div class="media-left">
                                    <a href="#">
                                        <img class="media-object" src="${pollutionGood.imageUrls[0]}" alt="...">
                                    </a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">${pollutionGood.goodsName}</h4>
                                    <p class="baseaddr">
                                        <img src="./images/base.png" alt="">
                                        <span  class="fr">${pollutionGood.address}</span>
                                    </p>
                                    <div class="baseinfo">
                                        <img src="./images/zhuisuxinxitip.png" alt="">
                                        <span class="unit">${pollutionGood.goodsAmount} &nbsp ${pollutionGood.unitName}</span>
                                        <span class="fr times">${pollutionGood.createTime}</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="bj-box">
                           
                           <span>${pollutionGood.sellpoint }</span>
                            <a class="chakanbaojia fr">添加购物车</a>
                        </div>
                    </li>
                    
                   </c:forEach>
                </ul>
            </div>
               
               
               
                </div>
            </div>
        </div>
    </section>
    
    
    <div class="about">
        <div class="w">
            <div class="piece information">
                <a href="">
                    <img src="./images/lvduwa.png" alt="">
                </a>
                <p>400-676-5176</p>
                <p>021-53752017</p>
                    <span class="phone">电话客服</span>
                    <em>工作日</em>
                    <span>09:00-18:00</span>
            </div>
            <div class="piece saomiao">
                <ul>
                    <li>
                        <img src="./images/gongzonghao.png" alt="">
                        <p>绿度蛙微信公众号</p>
                    </li>
                    <li>
                        <img src="./images/ldugongzonghao.png" alt="">
                        <p>绿度官网</p>
                    </li>
                </ul>
            </div>
            <div class="piece guanyu">
                <ul>
                    <li>
                        <a href="">关于我们</a>
                    </li>
                    <li>
                        <a href="">了解绿度</a>
                    </li>
                    <li>
                        <a href="">加入绿度</a>
                    </li>
                    <li>
                        <a href="">联系我们</a>
                    </li>
                </ul>
                <ul>
                    <li>
                        <a href="">帮助中心</a>
                    </li>
                    <li>
                        <a href="">如何入驻</a>
                    </li>
                    <li>
                        <a href="">服务说明</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <footer>
        <p>版权所有©2017上海绿度信息科技股份有限公司 保留所有权利|沪ICP备16016531号-6</p>
    </footer>
    
    
    

</body>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/swiper/swiper-3.4.2.jquery.min.js"></script>
    <script src="./js/jqPaginator.min.js"></script>
    <script src="./js/bootstrap/js/bootstrap.js"></script>
    <script src="./js/public.js"></script>
    <script src="./js/publicUrl.js"></script>
    <!--<script src="./js/index.js"></script>-->
   <script type="text/javascript">
        var mySwiper = new Swiper ('.swiper-container', {
            autoplay: 5000,//可选选项，自动滑动
        })
        $('.area-header-right > span ').on('click',function () {
            $(this).parent('.area-header-right').find('span').removeClass('active');
//            $('.area-header-right > span ').removeClass('active');
            $(this).addClass('active')
        })
        //------
        var index;
        $('.ldw_menu').css({display:'none'});
        $('.instro-tab > li').mouseover(function () {
            index=$(this).attr('data-index');
            $('.ldw_menu').css({display:'block'});
            $(".ldw_menu .good-part").css({display:'none'});
            $(".ldw_menu #good-item"+index).css({display:'block'});
        })
        $(".instro-tab > li").mouseout(function(e) {
            $('.ldw_menu').css({display:'none'});
        });
        $('.ldw_menu').mouseover(function(){
            $('.ldw_menu').css({display:'block'});
        });
        $('.ldw_menu').mouseout(function(){
            $('.ldw_menu').css({display:'none'});
        });



    </script>
</html>