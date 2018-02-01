<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发货品</title>
<link rel="stylesheet" href="js/shangchengjs/kindeditor-4.1.10/themes/default/default.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/datatables/plugins/bootstrap/datatables.bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/bootstrap-toastr/toastr.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/fancybox-master/dist/jquery.fancybox.css" type="text/css"></link>
<link rel="stylesheet" href="js/bootstrap-chinese-region/bootstrap-chinese-region.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/plugins.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/swiper/swiper-3.4.2.min.css" type="text/css"></link>
<link rel="stylesheet" href="css/public.css" type="text/css"></link>
<link rel="stylesheet" href="css/supplier-fagoods.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/simple-line-icons/simple-line-icons.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/bootstrap-modal-bs3patch.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/bootstrap-modal.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/components.min.css" type="text/css"></link>
<link rel="stylesheet" href="css/openRole.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/font-awesome/css/font-awesome.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/bootstrap/css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/bootstrap-switch/css/bootstrap-switch.min.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/datatables/datatables.min.css" type="text/css"></link>
<link rel="stylesheet" href="css/css/bootstrap-fileinput.css" type="text/css"></link>
<link rel="stylesheet" href="js/js/select2/css/select2.min.css" type="text/css"></link>

<link rel="stylesheet" href="css/magic-check.css" type="text/css"></link>
<link rel="stylesheet" href="js/ueditor/themes/default/css/ueditor.css" type="text/css"></link>
<link rel="stylesheet" href="js/ueditor/themes/iframe.css" type="text/css"></link>
<link rel="stylesheet" href="js/ueditor/third-party/codemirror/codemirror.css" type="text/css"></link>
<script src="./js/shangchengjs/kindeditor-4.1.10/kindeditor-all-min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" charset="utf-8" src="./js/shangchengjs/kindeditor-4.1.10/lang/zh_CN.js"></script>
<script src="./js/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/ueditor/ueditor.all.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/ueditor/lang/zh-cn/zh-cn.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/js.cookie.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/jquery.blockui.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/datatables/datatables.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/datatable.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/select2/js/select2.full.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/select2/js/i18n/zh-CN.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-confirmation/bootstrap-confirmation.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/ui-confirmations.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-fileinput.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-modal.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-modalmanager.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/ui-extended-modals.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-toastr/toastr.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/bootstrap-chinese-region/bootstrap-chinese-region.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/app/app.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/jquery-form.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/js/fancybox-master/dist/jquery.fancybox.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/ueditor/third-party/codemirror/codemirror.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/ueditor/third-party/zeroclipboard/ZeroClipboard.js" type="text/javascript" charset="utf-8"></script>
<script src="./js/shangchengjs/common.js" type="text/javascript"></script>
</head>
<body>
<div class="fb-form-box">
    <div class="w">
        <p class="fb-header">
            <span class="fl">发布货品</span>
            <span class="fr bitian"><em class="must_write">*</em>为必填项</span>
        </p>
<form class="form-horizontal form-box" id="releaseGood">
            <div class="form-group">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>产品分类</label>
                <div class="col-sm-9 bs-chinese-region addGoodType flat dropdown" data-submit-type="name" data-min-level="1" data-max-level="3">
                    <input class="hidden" type="text" name="goodsTypeId"/>
                    <input type="text" id="addGoodType" class="form-control pro-leibie" placeholder="请输入产品分类" name="goodsTypeName" data-toggle="dropdown" readonly="" style="background-color: #fff">
                    <div class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                        <div>
                            <ul class="nav nav-tabs" role="tablist">
                                <li role="presentation" class="active"><a  href="#province" data-next="city" role="tab" data-toggle="tab" onclick="return false;"> 1级 </a></li>
                                <li role="presentation"><a href="#city" data-next="district" role="tab" data-toggle="tab" onclick="return false;"> 2级 </a></li>
                                <li role="presentation"><a href="#district" data-next="street" role="tab" data-toggle="tab" onclick="return false;"> 3级 </a></li>
                            </ul>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="province">--</div>
                                <div role="tabpanel" class="tab-pane" id="city">--</div>
                                <div role="tabpanel" class="tab-pane" id="district">--</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
             <div class="form-group">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>产品名称</label>
                <div class="col-sm-9 ">
                    <input type="text" class="form-control" id="addGoodName" placeholder="请输入产品名称" name="goodsName" maxlength="8">
                </div>
            </div>
            
            
             <div class="form-group">
                    <label for="pro-leibie" class="col-sm-3 control-label"><em class="must_write">*</em>产品等级</label>
                    <div class="col-sm-9">
                        <div class="input-group">
                            <select id="productLevelId" class="form-control xuanze" name="goodsGradeId">

                            <c:if test="productLevels != null">
                                
                                <c:forEach items="productLevels" var="productLevel">
                                    <option value="${productLevel.id}">${productLevel.unitName}</option>
                                </c:forEach>
                          </c:if>
                            </select>
                        </div>
                        <input name="goodsGradeName" id="addGradeName" type="hidden">
                    </div>
                </div>
            
                <div class="form-group">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>产品规格</label>
                <div class="col-sm-9">
                    <div class="input-group">
                     <!--   <input name="goodsFormat" id="addGoodFormat" type="text" class="form-control xuanze" aria-label="..." placeholder="请输入产品规格">-->
                        <select name="addGoodUnitId" id="addGoodUnitId" class="form-control xuanze">
                            <option value="">请选择</option>
                            <c:if test="units !=null">
                            <c:forEach items="units" var="unit">
                            <option value="${unit.id}">${unit.unitName}</option>
                            </c:forEach>
                            </c:if>
                        
                        </select>
                        <input name="unitName" id="addGoodUnitNm" type="text" class="hidden">
                    </div>
                </div>
            </div>
            
            
            <div class ="form-group">
               <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>商品卖点</label>
                <div class="col-sm-9">
                    <div class="input-group">
	            <input class="easyui-textbox" id="sellpointId" name="sellpoint" data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 280px;"></input>
              </div>
              </div>
              </div>
                
                <div class="form-group">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>产品单价</label>
                <div class="col-sm-9">
                    <div class="input-group">
                        <input name="price" id="addGoodPrice" type="text" class="form-control prices_input form-control-left" value="0" aria-describedby="" onkeyup="clearNoNum(this)">
                        <span class="input-group-addon prices" id="unit1">元/单位</span>
                    </div>
                    <p class="noWrite">(输入为"0",表示议价)</p>
                </div>
            </div>
            
            <div class="form-group">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>供货量</label>
                <div class="col-sm-9">
                    <div class="input-group">
                        <input name="goodsAmount" id="addGoodAmount" type="text" class="form-control prices_input form-control-left" placeholder="请输入供货量" aria-describedby="" onkeyup="validateIsNum(this)">
                        <span class="input-group-addon prices" id="unit2">单位</span>
                    </div>
                </div>
            </div>
            
            
                
                <div class="form-group">
                <label for="fh_addr"  class="col-sm-3 control-label"><em class="must_write">*</em>产品产地</label>
                <div class="col-sm-9 bs-chinese-region addGoodAddress flat dropdown" data-submit-type="name" data-min-level="1" data-max-level="2">
                    <input type="text" id="addGoodAddress" class="form-control pro-leibie" placeholder="请输入发货地址" name="address" data-toggle="dropdown" readonly="" style="background-color: #fff">
                    <div class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                        <div>
                            <ul class="nav nav-tabs" role="tablist">
                                <li role="presentation" class="active"><a href="#province1" data-next="city" role="tab" data-toggle="tab" onclick="return false;"> 省份 </a></li>
                                <li role="presentation"><a href="#city1" role="tab" data-toggle="tab" onclick="return false;"> 城市 </a></li>
                            </ul>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="province1">--</div>
                                <div role="tabpanel" class="tab-pane" id="city1">--</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="form-group">
                <label for="xx_addr"  class="col-sm-3 control-label">详细地址</label>
                <div class="col-sm-9">
                    <textarea name="addressDetail" id="addGoodAddDt" class="xx_addr" cols="66" rows="5" placeholder="请输入详细地址" style="resize:none;width:100%;"></textarea>
                </div>
            </div>
            
            <div class="form-group" id="directorNmDiv">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>联系人</label>
                <div class="col-sm-9">
                    <input type="text" id="addGoodDirectorNm" name="directorName" class="form-control" placeholder="" aria-describedby="" >
                </div>
            </div>
            <div class="form-group" id="directorPhoneDiv">
                <label for=""  class="col-sm-3 control-label"><em class="must_write">*</em>联系方式</label>
                <div class="col-sm-9">
                    <input type="text" id="addGoodDirectorPhone" name="directorPhone" class="form-control" placeholder="" aria-describedby="" maxlength="11"
                           onkeyup="this.value=this.value.replace(/\D/g,'')"
                           onblur="this.value=this.value.replace(/\D/g,'')">
                </div>
            </div>
            
            <div class="form-group">
                <label for="fw_way"  class="col-sm-3 control-label"><em class="must_write">*</em>服务方式</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control pro-leibie" id="addGoodService" placeholder="请选择服务方式" name="service">
                </div>
            </div>
            
            
             <div class="form-group">
                <label class="col-sm-3 control-label"><em class="must_write">*</em>产品图片</label>
                <div class="col-sm-9">
                    <span style="line-height: 34px;font-size: 16px;">（最多上传五张）建议图片尺寸420*420px</span><br>
                    <div>
	            	 <a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
	                 <input type="hidden" name="imageUrl"/>
	               </div>
                    </div>
            </div>
            
            
         
            
              <div class="form-group">
                <label for="product_desc" class="col-sm-2 control-label"><em class="must_write">*</em>产品描述</label>
                <div class="col-sm-10">
                    <script id="container" name="itemDesc" type="text/plain"></script>
                </div>
            </div>
            
            <div class="form-group tijiao-box " >
                <button type="button" id="goodAddSubmit" class="btn btn-default tijiao anniu" onclick="tijiao()">完成并发布</button>
            </div>
            
     </form>
     </div>
     </div>
     
     <div class="modal fade chenggong" id="chenggong" tabindex="-1" role="dialog" aria-labelledby="">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header m-header">
                <button type="button" class="close " data-dismiss="modal" aria-label="Close">
                    <span class="motai-close" aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body m-body">
                <img src="./images/scsuccess.png" alt="">
                <p>恭喜你，货品供应发布成功</p>
            </div>
            <div class="modal-footer foter">
                <button type="button" class="oneMore" data-dismiss="modal" aria-hidden="true">再发一条</button>
                <button type="button" class="zcgBtn" onclick="findPurchase()">找采购</button>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">



var itemAddEditor ;
//页面初始化完毕后执行此方法
$(function(){
	//创建富文本编辑器
	itemAddEditor = E3.createEditor("#itemAddForm [name=itemDesc]");
	//初始化类目选择和图片上传器
	E3.init({fun:function(node){
		//根据商品的分类id取商品 的规格模板，生成规格信息。第四天内容。
		//E3.changeItemParam(node, "itemAddForm");
	}});
});


var ue = UE.getEditor('container',{
    // 服务器统一请求接口路径
    serverUrl: "/ueditor/config.htm",
    toolbars:[
        [
            //'anchor', //锚点
            //'undo', //撤销
            //'redo', //重做
            'bold', //加粗
            'indent', //首行缩进
            //'snapscreen', //截图
            'italic', //斜体
            'underline', //下划线
            'strikethrough', //删除线
            //'subscript', //下标
            //'fontborder', //字符边框
            //'superscript', //上标
            //'formatmatch', //格式刷
            'blockquote', //引用
            //'pasteplain', //纯文本粘贴模式
            //'selectall', //全选
            //'print', //打印
            //'preview', //预览
            'horizontal', //分隔线
            //'removeformat', //清除格式
            //'time', //时间
            //'date', //日期
            //'|',//分隔符，这里仅用于展示，可以有效的排布工具栏的图标位置
            //'unlink', //取消链接
            'insertrow', //前插入行
            'insertcol', //前插入列
            'mergeright', //右合并单元格
            'mergedown', //下合并单元格
            'deleterow', //删除行
            'deletecol', //删除列
            'splittorows', //拆分成行
            'splittocols', //拆分成列
            'splittocells', //完全拆分单元格
            'deletecaption', //删除表格标题
            'inserttitle', //插入标题
            'mergecells', //合并多个单元格
            'deletetable', //删除表格
            //'cleardoc', //清空文档
            //'insertparagraphbeforetable', //"表格前插入行"
            //'insertcode', //代码语言
            'fontfamily', //字体
            'fontsize', //字号
            'paragraph', //段落格式
            'simpleupload', //单图上传
            'insertimage', //多图上传
            //'edittable', //表格属性
            //'edittd', //单元格属性
            'link', //超链接
            'emotion', //表情
            'spechars', //特殊字符
            //'searchreplace', //查询替换
            //'map', //Baidu地图
            //'insertvideo', //视频
            //'help', //帮助
            'justifyleft', //居左对齐
            'justifyright', //居右对齐
            'justifycenter', //居中对齐
            'justifyjustify', //两端对齐
            'forecolor', //字体颜色
            //'backcolor', //背景色
            'insertorderedlist', //有序列表
            'insertunorderedlist', //无序列表
            //'fullscreen', //全屏
            //'directionalityltr', //从左向右输入
            //'directionalityrtl', //从右向左输入
            //'rowspacingtop', //段前距
            //'rowspacingbottom', //段后距
            //'pagebreak', //分页
            //'insertframe', //插入Iframe
            'imagenone', //默认
            'imageleft', //左浮动
            'imageright', //右浮动
            //'attachment', //附件
            'imagecenter', //居中
            //'wordimage', //图片转存
            'lineheight', //行间距
            'edittip ', //编辑提示
            //'customstyle', //自定义标题
            //'autotypeset', //自动排版
            //'touppercase', //字母大写
            //'tolowercase', //字母小写
            //'background', //背景
            //'template', //模板
            //'scrawl', //涂鸦
            'inserttable', //插入表格
            //'drafts', // 从草稿箱加载
            'charts' // 图表
        ]
    ],
    textarea:"itemDesc",// 提交表单时，服务器获取编辑器提交内容的所用的参数，多实例时可以给容器name属性，会将name给定的值最为每个实例的键值，不用每次实例化的时候都设置这个值
    initialContent:"请输入货品描述",//初始化内容，也可以通过上方的textarea/script给定值
    autoClearinitialContent:true,//是否自动清除编辑器初始内容，注意：如果focus属性设置为true，这个也为真，那么编辑器一上来就会触发导致初始化的内容看不到了
    focus:false,//初始化时，是否让编辑器获得焦点true或false
    initialFrameWidth:800,//初始化编辑器宽度，默认1000,如果为1000则该参数可以不写
    initialFrameHeight:300,//初始化编辑器高度，默认320
    readonly:false,//是否为只读状态，默认为false
    enableAutoSave:true, //启用自动保存，默认为true
    saveInterval:500,//自动保存间隔时间，默认值为500
    imageScaleEnabled:true,//启用图片拉伸缩放,默认值为true
    allHtmlEnabled:false, //提交到后台的数据是否包含整个html字符串,默认值为false
    maxListLevel:5, //限制可以tab的级数， 设置-1为不限制, 默认值为3
    minFrameWidth:800,//编辑器拖动时最小宽度，默认800
    minFrameHeight:220, //编辑器拖动时最小高度，默认220
    topOffset:0,//浮动时工具栏距离浏览器顶部的高度，用于某些具有固定头部的页面
    sourceEditor:"codemirror",//源码的查看方式，codemirror是代码高亮，textarea是文本框，默认是codemirror，注意默认codemirror只能在ie8+和非ie中使用
    codeMirrorJsUrl:"${request.contextPath}/js/ueditor/third-party/codemirror/codemirror.js",//如果sourceEditor是codemirror需要配置这项，codeMirror js加载的路径
    codeMirrorCssUrl:"${request.contextPath}/js/ueditor/third-party/codemirror/codemirror.css",//如果sourceEditor是codemirror需要配置这项，codeMirror css加载的路径
    webAppKey:"1SfQ6t4NYl3aGoVUb611ldkZy39eupfK",//webAppKey 百度应用的APIkey
    imageActionName:"uploadimage",//执行上传图片的action名称
    imageFieldName:"upfile", //提交的图片表单名称
    imageMaxSize:2048000//上传大小限制，单位B

});
UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
UE.Editor.prototype.getActionUrl = function(action) {
    if (action == 'uploadimage' || action == 'uploadfile' || action == 'uploadvideo' || action == 'uploadimage') {
        return '${request.contextPath}/ueditor/uploadfile.json';
    } else if (action == 'uploadscrawl') {
        return '${request.contextPath}/ueditor/uploadScrawl.json';
    } else {
        return this._bkGetActionUrl.call(this, action);
    }
};

 
$('#myTabs a').click(function (e) {
    e.preventDefault()
    $(this).tab('show')
});





$(document).ready(function () {
//获取地区城市
$.post('/addProduct/getYzsAreaByThreeLevels', function (data) {
    if (data.success) {
        var areas = data.obj;
        for (var i in areas) {
            if(areas[i].areaLevel == 0){
                areas[i].id = 2;
                areas[i].areaLevel = 1;
                areas[i].parentId = 0;
            }
        }
        for (var i in areas) {
            var area = {id: areas[i].id,
                name: areas[i].areaName,
                level: areas[i].areaLevel,
                parentId: areas[i].parentId
            };
            areas[i] = area;
        }
        $('.addGoodAddress').chineseRegion('source', areas);
    }
});

//      获取产品分类数据
$.post('/addProduct/ProductByThreeLevel', function (data) {
    if (data.success) {
        var products = data.obj;
        for (var i in products) {
            var product = {
                id: products[i].id,
                name: products[i].productName,
                level: products[i].areaLevel,
                parentId: products[i].parentId
            };
            products[i] = product;
        }
        $('.addGoodType').chineseRegion('source', products).on('changed.bs.chinese-region', function (e, areas) {
            $(this).find('input[name=goodsTypeId]').val(areas[areas.length - 1].id)
        });
    }
});


/**
 * 获取产品的等级
 */

$.post('/addProduct/getProductLevelUnits', function (data) {
	 
    var grade = $("#productLevelId");
    if (data.success) {
        grade.append('<option value="">请选择</option>');
        var productLevels = data.obj;
        for (var i = 0; i < productLevels.length; i++) {
            grade.append('<option value="' + productLevels[i].id + '">' + productLevels[i].unitName + '</option>');
        }
    } else {
        grade.append('<option value="">未查询到产品等级</option>');
    }
}, "JSON");

/**
 * 产品单位
*/ 
$.post('/addProduct/getOutputUnits', function (data) {
	  var unit = $("#addGoodUnitId");
	  if(data.success){
		  
		  unit.append('<option value="">请选择产品单位</option>');
		  var units = data.obj;
		  for(var i=0; i<units.length;i++){
			  unit.append('<option value="' + units[i].unitTypeId + '">' + units[i].unitName + '</option>');  
		  }
	  }else{
		  unit.append('<option value="">未查询到产品单位</option>');
	  }
	  
},"JSON");


$("#addGoodService").focus(function () {
    $("#choose_ways").modal("show");
    $("#serviceSubmit").unbind("click");
    $("#serviceSubmit").click(function () {
        App.blockUI;
        $("#choose_ways").modal("hide");
        var chk_value =[];
        $('.serviceDd.active').each(function(){
            chk_value.push($(this).children().text());
        });
        $('#addGoodService').val(chk_value);
        App.unblockUI();
    });
});

$("#addGoodUnitId").change(function () {
    var unitName = $("#addGoodUnitId option:selected").text();
    $("#unit1").html("元/"+unitName);
    $("#unit2").html(unitName);
    $("#unit3").html(unitName);
});


//    服务方式
$(function () {
    $('.fw_mian dd').on('click',function () {
        if($(this).hasClass('active')){
            $(this).removeClass('active')
        }else{
            var num = $(this).siblings(".active").length;
            if(num >= 3){
                toastr["error"]("一类服务方式最多选择3个!");
            } else {
                $(this).addClass('active')
            }
        }
    })
});


});

function tijiao(){
	 
	 App.blockUI();
    var goodType = $.trim($("#addGoodType").val());
    var goodName = $.trim($("#addGoodName").val());
    var goodGrade = $.trim($("#productLevelId").val());
    var goodSellpoint = $.trim($("#sellpointId").val());
    var goodFormat = $.trim($("#addGoodUnitId").val());
    var goodUnitId = $.trim($("#addGoodUnitId").val());
    var a=$("#addGoodPrice").val();
    var b="";
    //alert(a.length);
    for (var i=0;i<a.length;i++){
        if(a[i]!=',') {
            b+=a[i];
        }
    }
    $("#addGoodPrice").val(b);
    var goodPrice = $.trim($("#addGoodPrice").val());
    var a=$("#addGoodAmount").val();
    var c="";
    //alert(a.length);
    for (var i=0;i<a.length;i++){
        if(a[i]!=',') {
            c+=a[i];
        }
    }
    $("#addGoodAmount").val(c);
    var goodAmount = $.trim($("#addGoodAmount").val());
    var goodAddress = $.trim($("#Receiveaddress").val());
    var goodAddDt = $.trim($("#addGoodAddDt").val());
    var goodService = $.trim($("#addGoodService").val());
    
    /*if("" == goodType){
   	 toastr["error"]("请选择产品分类!");
        $("#addGoodType").focus();
        App.unblockUI();
        return false; 
    }*/
    if("" == goodName){
        toastr["error"]("请输入产品名称!");
        $("#addGoodName").focus();
        App.unblockUI();
        return false;
    } else {
        $("#addGoodName").val(goodName);
    }
    
    if("" == goodSellpoint){
   	 toastr["error"]("请输入买点!");
        $("#sellpointId").focus();
        App.unblockUI();
        return false; 
    }else {
        $("#sellpointId").val(goodSellpoint);
    }
    
    if("" == goodGrade){
        toastr["error"]("请选择产品等级!");
        $("#productLevelId").focus();
        App.unblockUI();
        return false;
    } else {
        var gradeNm = $("#productLevelId option:selected").text();
        $("#addGradeName").val(gradeNm);
    }
    
    if("" == goodFormat){
        toastr["error"]("请输入产品规格!");
        $("#addGoodFormat").focus();
        App.unblockUI();
        return false;
    } else {
        $("#addGoodFormat").val(goodFormat);
    }
    if("" == goodUnitId){
        toastr["error"]("请选择规格单位!");
        $("#addGoodUnitId").focus();
        App.unblockUI();
        return false;
    }else{
        var unitNm = $("#addGoodUnitId option:selected").text();
        $("#addGoodUnitNm").val(unitNm);
    }
    if("" == goodPrice){
        toastr["error"]("请输入产品单价!");
        $("#addGoodPrice").focus();
        App.unblockUI();
        return false;
    }
    if("" == goodAmount){
        toastr["error"]("请输入供货量!");
        $("#addGoodAmount").focus();
        App.unblockUI();
        return false;
    }
    
    /*if("" == goodAddress){
        toastr["error"]("请输入发货地址!");
        $("#Receiveaddress").focus();
        App.unblockUI();
        return false;
    }*/
    $("#addGoodAddDt").val(goodAddDt);

    
	
	 $.post("/addProduct/addGoods",$("#releaseGood").serialize(), function(res){
		 if (res.success) {
            toastr["success"](res.msg);
            $("#chenggong").modal("show");
        }
        else {
            toastr["error"](res.msg);
        }
		});
}



//      删除图片css

</script>
</html>