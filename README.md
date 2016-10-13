# Android Caught Global Exception Library

Your app is never crash and your users never see "this app unfortunately has stopped" message. And your app never force to close.

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
And your all activities :

	public class YourActivity extends AppCompatActivity {
    		public TransferObject transferObject = new TransferObject();
    		.....
		.....
	@Override
    	protected void onCreate(Bundle savedInstanceState) {
        	.....
        	transferObject.setCrashText("D'oh! Its Crash.."); //your error message "oops its crash" or something.
        	transferObject.setDestinationActivity(YourStartupActivity.class); //MUST BE UR STARTING ACTIVITY
        	transferObject.setDetailsButonText("Details"); //showing stacktrace. change your button's text what you want
        	transferObject.setRestartAppButtonText("Contiune"); //restart your app. change your button's text what you want
        	transferObject.setImagePath(R.drawable.homer); ur error image change what you want. MUST BE "R.drawable.example"
        	transferObject.setBackgorundHex("#ffffff"); //ur crash activity's backgorund color.change what you want.
        	transferObject.setCrashTextColor("#000000"); //CrashText's color. MUST BE HEX CODE
        	Thread.setDefaultUncaughtExceptionHandler(new CosmosException(this,transferObject)); //this our girl
        
And thats it! Easy.

![alt tag](http://i.hizliresim.com/QQ3vrZ.jpg)
![alt tag](http://i.hizliresim.com/G3AP8Z.jpg)

