
$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
        loop:true,
        margin:15,
        nav: true,
        items: 5,
        responsive:{
            0:{
                items:1
            },
             200:{
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