<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>农农服务</title>
 <link rel="stylesheet" href="js/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/public.css">
    <link rel="stylesheet" href="css/ldService-supplier.css">

</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div>
    <div class="serviceBgm">
        <img src="./images/service.jpg" alt="">
    </div>
</div>
<div class="ser-list">
    <div class="w">
        <div class="ser-list-box">
            <ul>
                <li>
                    <div class="ser-img-box">
                        <a>
                            <img src="./images/supplier-03.png" alt="">
                        </a>
                        <em>交易安全</em>
                        <span>产品保险</span>
                    </div>
                    <div>
                        <div class="bj-box">
                            <a href="#" class="person-img-box first-tou">
                                <img class="media-object" src="./images/touxiang.png" alt="...">
                            </a>
                            <a href="#" class="person-img-box second-tou">
                                <img class="media-object" src="./images/touxiang.png" alt="...">
                            </a>
                            <a href="#" class="person-img-box thrid-tou">
                                <img class="media-object" src="./images/touxiang.png" alt="...">
                            </a>
                            <span class="bj-num">5人已申请</span>
                            <a href="fgoods.html" class="chakanbaojia fr">立即申请</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="ser-img-box">
                        <a>
                            <img src="./images/supplier-02.png" alt="">
                        </a>
                        <em>产品质量</em>
                        <span>产品检测</span>
                    </div>
                    <div>
                        <div>
                            <div class="bj-box">
                                <a href="#" class="person-img-box first-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box second-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box thrid-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <span class="bj-num">5人已申请</span>
                                <a href="fgoods.html"  class="chakanbaojia fr">立即申请</a>
                            </div>
                        </div>
                </li>
                <li>
                    <div class="ser-img-box">
                        <a>
                            <img src="./images/supplier-05.png" alt="">
                        </a>
                        <em>产品质量</em>
                        <span>产品认证辅导</span>
                    </div>
                    <div>
                        <div>
                            <div class="bj-box">
                                <a href="#" class="person-img-box first-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box second-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box thrid-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <span class="bj-num">5人已申请</span>
                                <a href="fgoods.html"  class="chakanbaojia fr">立即申请</a>
                            </div>
                        </div>
                </li>
                <li>
                    <div class="ser-img-box">
                        <a>
                            <img src="./images/supplier-04.png" alt="">
                        </a>
                        <em>产品质量</em>
                        <span>产品追溯</span>
                    </div>
                    <div>
                        <div>
                            <div class="bj-box">
                                <a href="#" class="person-img-box first-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box second-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box thrid-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <span class="bj-num">5人已申请</span>
                                <a href="fgoods.html"  class="chakanbaojia fr">立即申请</a>
                            </div>
                        </div>
                </li>
                <li>
                    <div class="ser-img-box">
                        <a>
                            <img src="./images/supplier-06.png" alt="">
                        </a>
                        <em>产品质量</em>
                        <span>农业技术应用</span>
                    </div>
                    <div>
                        <div>
                            <div class="bj-box">
                                <a href="#" class="person-img-box first-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box second-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <a href="#" class="person-img-box thrid-tou">
                                    <img class="media-object" src="./images/touxiang.png" alt="...">
                                </a>
                                <span class="bj-num">5人已申请</span>
                                <a href="fgoods.html"  class="chakanbaojia fr">立即申请</a>
                            </div>
                        </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="float.jsp"></jsp:include>
</body>
<script src="./js/jquery.min.js"></script>
<script src="./js/public.js"></script>
<script>
    $('.tab-title').mouseover(function () {
        $('.instro-tab').show()
    })
    var index;
    $('.ldw_menu').css({display:'none'});
    $('.instro-tab > li').mouseover(function () {
        $('.instro-tab').show()
        index=$(this).attr('data-index');
        $('.ldw_menu').css({display:'block'});
        $(".ldw_menu .good-part").css({display:'none'});
        $(".ldw_menu #good-item"+index).css({display:'block'});
    })
    $(".instro-tab > li").mouseout(function(e) {
        $('.ldw_menu').css({display:'none'});
        $('.instro-tab').hide()

    });
    $('.ldw_menu').mouseover(function(){
        $('.instro-tab').show()
        $('.ldw_menu').css({display:'block'});
    });
    $('.ldw_menu').mouseout(function(){
        $('.instro-tab').hide()
        $('.ldw_menu').css({display:'none'});
    });

</script>
</html>