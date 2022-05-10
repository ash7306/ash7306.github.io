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











    /////////////////////////////////////////////////////////
});