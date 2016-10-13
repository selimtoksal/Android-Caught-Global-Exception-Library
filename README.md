# CaughtGlobalExceptionLib

Don't worry anymore. your app is never crash and your users never seen "this app unfortunately has stopped" message. And your app never close.

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

