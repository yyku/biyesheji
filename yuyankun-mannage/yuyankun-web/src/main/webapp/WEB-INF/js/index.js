//账户账号
var customerAccount = sessionStorage.getItem("customerAccount");
//类型
var val = sessionStorage.getItem("customerType");
//sessionid
var sessionId = sessionStorage.getItem("sessionId");
//用户id
var customerId = sessionStorage.getItem("customerId");
var isLogin=false;
// console.log(customerAccount);
// console.log(val);
// console.log(sessionId)


//请求cookie
function isLoginAjax() {
    $.ajax({
        type: "GET", //用POST方式传输
        // url:loginUrl,
        // url:nongmenwang+'/api/androidUnit/isLogin.json',
        url:isLoginUrl,
        dataType: "json",
        data:{"customerAccount":customerAccount,"customerType":val,"id":sessionId},
        async:false,
        success:function (result) {
            // console.log(result);
            //用户cookie是否存在
            if(result.success){
                console.log('success')
                isLogin=true
            }else{
                // window.location.href='./login.html'
            }
        },
        error:function (err) {
            console.log('失败');
            console.log(err)
        }
    });
}
isLoginAjax()
//判断用户是否登录
    if(isLogin){
        //右侧实名认证模块
        $.ajax({
            type: "POST",
            url:smrzUrl,
            dataType: "json",
            data:{"customerId":customerId},
            success:function (result) {
                // console.log(result);
                //是否获取信息
                if(result.success){
                    var name =result.obj.realName
                    var position =result.obj.companyPosition
                    var name =result.obj.realName
                        $('#userNmae').html(name)
                    $('.infor_name').html(name)
                    $('.infor_number').html(customerAccount)
                    $('.infor_position').html(position)
                }else{
                    console.log(result.msg)
                    window.location.href='./login.html'
                }
            },
            error:function (err) {
                console.log('失败');
                console.log(err)
            }
        });

        //最新采购模块
        $.ajax({
            type: "GET",
            url:newestCgUrl,
            dataType: "json",
            data:{"customerId":customerId},
            success:function (result) {
                // console.log(result);
                //是否获取信息
                if(result.success){
                    // console.log('newest')
                    var supplier=result.obj.supplier
                    var addressDetail=result.obj.addressDetail
                    var purchaseTypeName=result.obj.purchaseTypeName
                    var gradeName=result.obj.gradeName
                    var requireAmount=result.obj.requireAmount
                    var unitName=result.obj.unitName
                    var offerAmount=result.obj.offerAmount
                    //是否有追溯信息
                    var isRetroactive=result.obj.isRetroactive

                    var newest_times=result.obj.newest_times
                    $('.supplier').html(supplier)
                    $('.addressDetail').html(addressDetail)
                    $('.purchaseTypeName').html(purchaseTypeName)
                    $('.gradeName').html(gradeName)
                    $('.unitName').html(unitName)
                    $('.newest_times').html(newest_times)
                    $('.offerAmount').html(offerAmount)
                    if(isRetroactive){
                        $('.isRetroactive').html('有追溯信息')
                    }else{
                        $('.isRetroactive').html('无追溯信息')
                    }
                }else{
                    console.log(result.msg)
                    window.location.href='./login.html'
                }
            },
            error:function (err) {
                console.log('失败');
                console.log(err)
            }
        });
    }else{
        console.log('未登录')
    }

    //退出按钮
    $('.signOut').click(function () {
        $.ajax({
            type: "GET",
            url:signOutUrl,
            dataType: "json",
            data:{"id":sessionId},
            success:function (result) {
                console.log(result);
                //用户cookie是否存在
                if(result.success){
                    //账户账号
                     sessionStorage.removeItem("customerAccount");
                    //类型
                    sessionStorage.removeItem("customerType");
                    //sessionid
                    sessionStorage.removeItem("sessionId");
                    //用户id
                    sessionStorage.removeItem("customerId");
                    isLogin=false
                    window.location.href='./login.html'
                }else{
                    window.location.href='./login.html'
                }
            },
            error:function (err) {
                console.log('失败');
                console.log(err)
            }
        });
    })


    //获取商品接口
// 有机请求
$.ajax({
    type: "GET",
    url:productUrl,
    dataType: "json",
    data:{"goodsGradeName":'有机',"stateName":'现货'},
    success:function (result) {
        console.log(result);
        //用户cookie是否存在
        if(result.success){

        }else{
            console.log('未登录')
            // window.location.href='./login.html'
        }
    },
    error:function (err) {
        console.log('失败');
        console.log(err)
    }
});
// 绿色请求
$.ajax({
    type: "GET",
    url:productUrl,
    dataType: "json",
    data:{"goodsGradeName":'绿色',"stateName":'现货'},
    success:function (result) {
        console.log(result);
        //用户cookie是否存在
        if(result.success){

        }else{
            console.log('未登录')
            // window.location.href='./login.html'
        }
    },
    error:function (err) {
        console.log('失败');
        console.log(err)
    }
});
// 无公害请求
$.ajax({
    type: "GET",
    url:productUrl,
    dataType: "json",
    data:{"goodsGradeName":'无公害',"stateName":'现货'},
    success:function (result) {
        console.log(result);
        //用户cookie是否存在
        if(result.success){

        }else{
            console.log('未登录')
            // window.location.href='./login.html'
        }
    },
    error:function (err) {
        console.log('失败');
        console.log(err)
    }
});