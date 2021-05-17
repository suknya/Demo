# Demo
This project contains Slider component that retrieves data from API and display in carousal format.
Component Name : multipurpose-slider
Features: This component provides ability to author dialog in manual or auto format.
Dialog containes select dropdown option to choose the source of images to be displayed in slider.

Manual option - Enables multifield which allows user to enter image path and image name to be displayed in carousal
Auto option - Automatically fetches displayName and attachment url and render into page.

Component uses owl plugin to achieve desired style and js.

The number of images in 1 sider can be controlled by changing js items options

$('.owl-carousel').owlCarousel({
    loop:true,
    margin:25,
    nav: true,
    items: 5,
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


Below are the list of osgiserivces created along with their purpose:

ConfigManager - Designates testconfig ocd and fetches API url.<br>
PhoneDirectoryInterface - Inteface contains  List<PhoneDirectoryModel> getPhoneDetails() method.<br>
PhoneDirectoryService - Osgi service that fetches API data and saves in jcr respository under content/usergenerated/treemobiles. If node already exists, it ignores api call.<br>
WriteAccessResourceResolverService - provides writes acess resource resolver to PhoneDirectoryService.<br>
SliderModel- It extends WCMUsePojo and invokes service and returns to sightly class.<br>

Inorder to build project run command<br>

mvn clean install -PautoInstallPackage<br>

After project is installed kindly create and set your write user as stated under in configuration user mapper in http://localhost:4502/system/console/configMgr<br>

<b>com.testsite.core:writeservice=WRITEUSER</b>
<b>testsite.core:writeservice=WRITEUSER</b>
