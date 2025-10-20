renderdoc may not support android 16.

So I write a demo app with a listview, for debug renderdoc on android 16.

because android 16 change skia graphic api from opengles to vulkan.

android hwui skia ganesh use QueueSubmit api to identify a frame end.  

if you don't have android 16 device, you can use command :

adb shell setprop debug.hwui.renderer skiavk

to change the app with hwui to use vulkan api,  restart the demo app,  the app is running with skia vulkan api now.
