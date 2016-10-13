# CaughtGlobalExceptionLib

Don't worry anymore. your app is never crash and your users never seen "this app unfortunately has stopped" message. And your app never close.

### Use
Add your build.grandle (PROJECT: xxx) :
```
allprojects {
	repositories {
	        ...
		maven { url "https://jitpack.io" }
		     }
}
```
 
 
Add your build.grandle(app or where you want use it) :
```
dependencies {
         ....
	 compile 'com.github.selimtoksal:CaughtGlobalExceptionLib:v1.0.1'
	      }
```
And your all acrivities's in onCreate method :

        public TransferObject transferObject = new TransferObject();

        transferObject.setCrashText("D'oh! Its Crash..");
        transferObject.setDestinationActivity(MainActivity.class);
        transferObject.setDetailsButonText("Details");
        transferObject.setRestartAppButtonText("Contiune");
        transferObject.setImagePath(R.drawable.homer);
        transferObject.setBackgorundHex("#ffffff");
        transferObject.setCrashTextColor("#000000");
        Thread.setDefaultUncaughtExceptionHandler(new CosmosException(this,transferObject));
        
And thats it! Easy.

![alt tag](http://i.hizliresim.com/QQ3vrZ.jpg)
![alt tag](http://i.hizliresim.com/G3AP8Z.jpg)

