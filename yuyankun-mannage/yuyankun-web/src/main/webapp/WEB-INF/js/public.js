//分类


$(function () {
    //登录 模态框
    $('.choose .chos').click(function () {
        $('.choose .chos').removeClass('active')
        $(this).addClass('active')
        var $val = $(this).find('.businessman').html()
        $('.til em').html($val)
    })
    //选中filter下的所有a标签，为其添加hover方法，该方法有两个参数，分别是鼠标移上和移开所执行的函数。
    $("#filter dl a").hover(
        function () {
            $(this).addClass("seling");
        },
        function () {
            $(this).removeClass("seling");
        }
    );

    //商品分类事件
    $('.tab-title').mouseover(function () {
        $('.instro-tab').show()
    })
    $('.goodsAssortmentUl').on('mouseover',function () {
        $('.goodsAssortment').show()
    })
    $('.goodsAssortmentUl').on('mouseout',function () {
        $('.goodsAssortment').hide()
    })
    $('.instro-tab > li').mouseover(function () {
        $(this).find('.ldw_menu').show()
    })
    $('.instro-tab > li').mouseout(function () {
        $(this).find('.ldw_menu').hide()
    })
});
function RetSelecteds() {
    var result = "";
    $("#filter a[class='seled']").each(function () {
        result += $(this).html()+"\n";
    });
    return result;
}



