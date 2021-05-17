
$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
        loop:true,
        margin:15,
        nav: true,
        items: 4,
        responsive:{
            0:{
                items:1
            },
             300:{
                items:2
            },
            600:{
                items:3
            },
            800:{
                items:4
            },
            1000:{
                items:5
            }
        }
    });
});