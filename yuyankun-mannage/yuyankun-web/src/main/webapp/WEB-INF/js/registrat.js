/**
 * Created by chenqingyu on 2017/9/4.
 */
$('#yz_code').on('click',function () {
    console.log(111)

    var InterValObj; //timer变量，控制时间
    var count = 60; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    sendMessage()
    function validatemobile(mobile) {
        if (mobile.length == 0) {
            alert('请输入手机号码！');
            $('#phone').focus()
            return false;
        }
        if (mobile.length != 11) {
            alert('请输入有效的手机号码！');
            $('#phone').focus()
            return false;
        }
        var myreg = /^(((13[0-9]{1})|159|153)+\d{8})$/;
        if (myreg.test(mobile)) {
            alert('请输入有效的手机号码！');
            $('#phone').focus()
            return false;
        }
        return true
    }

    function sendMessage() {
        curCount = count;
        console.log(count)
        var mobile = $('#phone').val();
        // validatemobile(mobile);//调用上边的方法验证手机号码的正确性
        //设置button效果，开始计时
        if( validatemobile(mobile)){
            $("#yz_code").attr("disabled", "true");
            $("#yz_code").html("请在" + curCount + "秒内输入验证码");
            InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
        }else {
            return false
        }

        //向后台发送处理数据
        $.ajax({
         type: "POST", //用POST方式传输     　　
         url: yanzhengma, //目标地址.
         dataType: "json", //数据格式:JSON
         data:  { "mobile": mobile, "verifyType": "1" },
         success: function(result){
             console.log(result)
         },
         error:function () {
             console.log('shibai')
         }
         });
    }

//timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#yz_code").removeAttr("disabled");//启用按钮
            $("#yz_code").html("重新发送验证码");
        }
        else {
            curCount--;
            $("#yz_code").html("请在" + curCount + "秒内输入验证码");
        }
    }
})
//-------------提交
$('#submit_btn').click(function () {
    var phone=$('#phone').val()
    var pwd=$('#pwd').val()
    var yzm=$('#yzm').val()
    var identity=1
    console.log(pwd,phone,yzm)
    var iden=$('.choose li.active a p').html()
    console.log(iden)
    if(iden=='基地商'){
        identity=1
    }else if(iden=='采购商'){
        identity=2
    }else if(iden=='供应商'){
        identity=3
    }
    console.log(identity)
    $.ajax({
        type: "POST", //用POST方式传输     　　
        url: zhuce, //目标地址.
        dataType: "json", //数据格式:JSON
        data:  { "mobile": phone, "password": pwd,"verificationCode": yzm,"identity": 2,"customerType":identity ,"operateType":1},
        success: function(result){
            console.log(result)
            if(result.success){
                window.location.href='./login.html'
            }else{
                alert(result.msg)
                $('#phone').focus()
            }

        },
        error:function () {
            console.log('请求失败')
        }
    });

})