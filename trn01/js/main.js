// Window.addEventListener('DOMContentLoaded', funtion () {
//    document.querySelector('.header').style.display = 'none'
// })
// jquery= $(jquery가 만들어 내는 객체, 매서드)
$(function () {     //이 태그가 위 윈도우 명령문을 대신해서, 자바스크립트를 위쪽에 올려도 실행가능하게 함
    $('.main_slider').slick({
        arrows: false,              //객체쓸 때 , 사용!! 
        autoplay: true,             //슬릭에서 만들어 놓은 기능, 자동시작?
        autoplayspeed: 1000,        // 1000:1초
        vertical: true,             //슬라이드가 위로 가는 기능
        dots: true,                 //슬라이드 도트 클릭 기능
    })

    $('.mopen').on('click', function () {
        $('.gnb').toggleClass('on')
        this.classList.toggle('on')

    })


})
