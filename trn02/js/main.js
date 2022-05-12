$(function () {
    /////////////////////////////////////////////////////////
    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp(1000);
    });

    /*페이지 열고 처음부터 뜨게 해줌*/
    /*init 처음부터 실행 하게 , reInit 강제로 첨부터 다시 실행하게(오류방지?)*/
    /*slider 이동 후 바로 이벤트 시작*/
    $('.main_slider').on('init afterChange', function () {
        let current = $('.slick-current')
        current.addClass('on').siblings().removeClass('on');
        /*addClass-계속붙이고 siblings -자신을 제외한 형제함수를 찾을 때 removeClass-땜 */
    });

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnFocus: false,
        pauseOnHover: false,
    });


    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('play');
    });

    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause');
    });

    $('#myMovie').YTPlayer({
        videoURL: 'https://www.youtube.com/watch?v=G29hY9YsMOc',
        containment: '.utube',
        autoPlay: true,
        mute: false,
        startAt: 0,
        opacity: 1,
        showControls: false,
        playOnlyIfVisible: false,
    });

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPlay();
    });

    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPause();
    });



    $('.product_slider').slick({
        slidesToShow: 5,
        centerMode: true,
        arrows: false,
        /*prev,next 버튼 끄기*/
        dots: true,
        autoplay: true,
        responsive: [
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 1,
                    centerMode: true,
                }
            }
        ]
    });


    $('.product_list .s_left').on('click', function () {
        $('.product_slider').slick('slickPrev');
    });

    $('.product_list .s_right').on('click', function () {
        $('.product_slider').slick('slickNext');
    });

    $('.tab_link>li').on('click', function () {
        var idx = $(this).index();
        $(this).addClass('on').siblings().removeClass('on');
        $('.tab_content>li').eq(idx).addClass('on').siblings().removeClass('on');
        //eq:엔스오브타입(몇번쨰 인지==nth child) removeClass:붙였던걸 때냄
    });

    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        if (lik) window.open(lik)
    });

    $('.mbtn').on('click', function () {
        $('nav').toggleClass('on');//nav에다가 on을 떗다붙엿다 하기
        $(this).toggleClass('is-active');
    });





    /////////////////////////////////////////////////////////
});