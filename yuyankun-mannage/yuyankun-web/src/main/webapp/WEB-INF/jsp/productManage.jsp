<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>货品管理</title>
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/magic-check.css">
    <link rel="stylesheet" href="css/public.css">
    <link rel="stylesheet" href="css/base_good_manager.css">
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>

<div class="huopin-main">
    <div class="w">
        <ul class="nav nav-tabs ul-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">预售</a></li>
            <li role="presentation"><a href="#in_sales" aria-controls="in_sales" role="tab" data-toggle="tab">销售中</a></li>
            <li role="presentation"><a href="#off_shelf" aria-controls="off_shelf" role="tab" data-toggle="tab">已下架</a></li>
            <li role="presentation"><a href="#be_off_shelf" aria-controls="be_off_shelf" role="tab" data-toggle="tab">被下架</a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active yushou" id="home">
                <div class="fabu-box hidden">
                    <div>
                        <div class="shangchaun-tip-box">
                            <div class="shangchuan-tip">
                                <span>尚未发布采购，<em>立即发布</em><img src="./images/shangchuan.png" alt=""></span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="yushou-box ">
                    <ul class="media-list">
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item jh_brand">峰岭菁华</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl ys_detail_lk" >查看详情</a>
                                    <a class="ys_xh fl">现货</a>
                                    <a class="ys_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item jh_brand">峰岭菁华</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl ys_detail_lk" >查看详情</a>
                                    <a class="ys_xh fl">现货</a>
                                    <a class="ys_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item jh_brand">峰岭菁华</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl ys_detail_lk" >查看详情</a>
                                    <a class="ys_xh fl">现货</a>
                                    <a class="ys_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item jh_brand">峰岭菁华</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl ys_detail_lk" >查看详情</a>
                                    <a class="ys_xh fl">现货</a>
                                    <a class="ys_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane in_sales" id="in_sales">
                <div class="in_sales_box ">
                    <ul class="media-list">
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a href="base_sales_product_detail.html" class="fl in_sales_detail_lk" >查看详情</a>
                                    <a class="in_sales_xj fl">下架</a>
                                    <a class="in_sales_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a href="base_sales_product_detail.html" class="fl in_sales_detail_lk" >查看详情</a>
                                    <a class="in_sales_xj fl">下架</a>
                                    <a class="in_sales_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a href="base_sales_product_detail.html" class="fl in_sales_detail_lk" >查看详情</a>
                                    <a class="in_sales_xj fl">下架</a>
                                    <a class="in_sales_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a href="base_sales_product_detail.html" class="fl in_sales_detail_lk" >查看详情</a>
                                    <a class="in_sales_xj fl">下架</a>
                                    <a class="in_sales_update fl">修改</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane off_shelf" id="off_shelf">
                <div class="in_sales_box ">
                    <ul class="media-list">
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl off_shelf_detail_lk" >查看详情</a>
                                    <a class="off_shelf_sj fl" data-toggle="modal" data-target="#s_jia">上架</a>
                                    <a class="off_shelf_del fl">删除</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl off_shelf_detail_lk" >查看详情</a>
                                    <a class="off_shelf_sj fl">上架</a>
                                    <a class="off_shelf_del fl">删除</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl off_shelf_detail_lk" >查看详情</a>
                                    <a class="off_shelf_sj fl">上架</a>
                                    <a class="off_shelf_del fl">删除</a>
                                </div>
                            </div>
                        </li>
                        <li class="media fl item-list lvse">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" src="./images/mgapple.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body ys_body">
                                <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                <table class="yushou-info">
                                    <tr>
                                        <td class="ys_prices">￥100.00</td>
                                        <td class="ys_weight">500斤</td>
                                        <td class="ys_addr">上海</td>
                                    </tr>
                                </table>
                                <div class="ys_brand">
                                    <span class="brand-item">有机认证报告</span>
                                    <span class="brand-item ">品牌供应</span>
                                </div>
                                <table class="ys_fw">
                                    <tr>
                                        <td colspan="2" class="ys_fw_way">
                                            <span>有机认证报告</span>
                                            <span>支持快递</span>
                                        </td>
                                        <td class="ys_times">2017-07-10 13:45</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="media-footer">
                                <div class="btn-box">
                                    <a class="fl off_shelf_detail_lk" >查看详情</a>
                                    <a class="off_shelf_sj fl">上架</a>
                                    <a class="off_shelf_del fl">删除</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane  be_off_shelf" id="be_off_shelf">
                <div class="in_sales_box ">
                    <ul class="media-list">
                        <li class="media_list lvse">
                            <div class="media">
                               <div class="media_con">
                                   <div class="media-left">
                                       <a href="#">
                                           <img class="media-object" src="./images/mgapple.png" alt="...">
                                       </a>
                                   </div>
                                   <div class="media-body">
                                       <div class="media_left">
                                           <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                           <table class="products-info">
                                               <tr>
                                                   <td class="products-price">￥<em>22.8</em></td>
                                                   <td class="products-weight"><em>22.8</em>斤</td>
                                                   <td class="products-addr">上海</td>
                                               </tr>
                                           </table>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                       </div>
                                       <div class="media_right">
                                           <p class="reason_title">被下架原因</p>
                                            <p class="reason_con">图文描述，无证明, 品类不符</p>
                                           <p class="reason_times">2017-07-10 13:45</p>
                                       </div>
                                   </div>

                               </div>
                                <div class="producst-footer">
                                    <div class="btn-box">
                                        <a class="fl be_off_shelf_detail_lk" >查看详情</a>
                                        <a class="be_off_shelf_update fl">修改</a>
                                        <a class="be_off_shelf_del fl">删除</a>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="media_list lvse">
                            <div class="media">
                               <div class="media_con">
                                   <div class="media-left">
                                       <a href="#">
                                           <img class="media-object" src="./images/mgapple.png" alt="...">
                                       </a>
                                   </div>
                                   <div class="media-body">
                                       <div class="media_left">
                                           <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                           <table class="products-info">
                                               <tr>
                                                   <td class="products-price">￥<em>22.8</em></td>
                                                   <td class="products-weight"><em>22.8</em>斤</td>
                                                   <td class="products-addr">上海</td>
                                               </tr>
                                           </table>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                       </div>
                                       <div class="media_right">
                                           <p class="reason_title">被下架原因</p>
                                            <p class="reason_con">图文描述，无证明, 品类不符</p>
                                           <p class="reason_times">2017-07-10 13:45</p>
                                       </div>
                                   </div>

                               </div>
                                <div class="producst-footer">
                                    <div class="btn-box">
                                        <a class="fl be_off_shelf_detail_lk" >查看详情</a>
                                        <a class="be_off_shelf_update fl">修改</a>
                                        <a class="be_off_shelf_del fl">删除</a>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="media_list lvse">
                            <div class="media">
                               <div class="media_con">
                                   <div class="media-left">
                                       <a href="#">
                                           <img class="media-object" src="./images/mgapple.png" alt="...">
                                       </a>
                                   </div>
                                   <div class="media-body">
                                       <div class="media_left">
                                           <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                           <table class="products-info">
                                               <tr>
                                                   <td class="products-price">￥<em>22.8</em></td>
                                                   <td class="products-weight"><em>22.8</em>斤</td>
                                                   <td class="products-addr">上海</td>
                                               </tr>
                                           </table>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                       </div>
                                       <div class="media_right">
                                           <p class="reason_title">被下架原因</p>
                                            <p class="reason_con">图文描述，无证明, 品类不符</p>
                                           <p class="reason_times">2017-07-10 13:45</p>
                                       </div>
                                   </div>

                               </div>
                                <div class="producst-footer">
                                    <div class="btn-box">
                                        <a class="fl be_off_shelf_detail_lk" >查看详情</a>
                                        <a class="be_off_shelf_update fl">修改</a>
                                        <a class="be_off_shelf_del fl">删除</a>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="media_list lvse">
                            <div class="media">
                               <div class="media_con">
                                   <div class="media-left">
                                       <a href="#">
                                           <img class="media-object" src="./images/mgapple.png" alt="...">
                                       </a>
                                   </div>
                                   <div class="media-body">
                                       <div class="media_left">
                                           <h4 class="media-heading ys_brand_header">【预售】苹果-美国红蛇果 <img src="./images/yzhuisu.png" alt=""></h4>
                                           <table class="products-info">
                                               <tr>
                                                   <td class="products-price">￥<em>22.8</em></td>
                                                   <td class="products-weight"><em>22.8</em>斤</td>
                                                   <td class="products-addr">上海</td>
                                               </tr>
                                           </table>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                           <div class="ys_brand">
                                               <span class="brand-item ">有机认证报告</span>
                                               <span class="brand-item ">品牌供应</span>
                                           </div>
                                       </div>
                                       <div class="media_right">
                                           <p class="reason_title">被下架原因</p>
                                            <p class="reason_con">图文描述，无证明, 品类不符</p>
                                           <p class="reason_times">2017-07-10 13:45</p>
                                       </div>
                                   </div>

                               </div>
                                <div class="producst-footer">
                                    <div class="btn-box">
                                        <a class="fl be_off_shelf_detail_lk" >查看详情</a>
                                        <a class="be_off_shelf_update fl">修改</a>
                                        <a class="be_off_shelf_del fl">删除</a>
                                    </div>
                                </div>
                            </div>
                        </li>

                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade s_jia" id="s_jia" tabindex="-1" role="dialog" aria-labelledby="">
    <div class="modal-dialog posi" role="document">
        <div class="modal-content">
            <div class="modal-header m-header">
                <button type="button" class="close motai-close" data-dismiss="modal" aria-label="Close"><span class="" aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body m-body">
                <img src="./images/ensure.png" alt="">
                <p>确认上架！</p>
            </div>
            <div class="modal-footer foter">
                <button type="button" class="btn zhaohuo cancele_caigou"  >取消</button>
                <button type="button" class="btn zhaohuoping ">确定</button>
            </div>
        </div>
    </div>
</div>

</body>
<jsp:include page="float.jsp"></jsp:include>
<script src="./js/jquery.min.js"></script>
<script src=".js//bootstrap/js/bootstrap.js"></script>
 <script src="./js/jquery-2.0.2.js"></script>
<script type="text/javascript">
    $('#myTabs a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    })

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