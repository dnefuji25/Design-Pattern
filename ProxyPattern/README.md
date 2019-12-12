# Proxy-Pattern

Proxy Pattern is a structural design pattern.The Proxy pattern provides a surrogate or placeholder for another object to control access to it. The proxy connects to the remote object, all the while making the local code believe it’s working with a local object.

When to use : When we need to create a wrapper to cover the main object’s complexity from the client.

Sample Scenario : HotSpot Connection - Consider a user who wants to browse the internet. But does not have access to Mobile data due to inactive internet plans. He insists to use a hotspot. The actual internet is from the mobile data of another deivce but on switching the hotspot on , the user is able to connect to internet. The hotspot here acts as a proxy for the mobile data. We have created a InternetOptions interface. HotspotInternet and MobileDataInternet both implement the InternetOptions method connect(). An object of the MobileDataInternet is created and a call to the real objects' method is done. This way the hotspot becomes proxy for the mobile data internet.
