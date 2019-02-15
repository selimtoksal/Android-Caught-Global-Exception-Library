package transferObject;
import java.io.Serializable;
/**
 * Created by Selim on 13.10.2016.
 */
public class TransferObject implements Serializable  {
    /**
     *@param DestinationActivity will opened after the crash, MUST BE UR STARTING ACTIVITY
     */
    private java.lang.Class DestinationActivity;


    /**
     *@param CrashText your error message "oops its crash" or something.
     */
    private String CrashText;


    /**
     *@param CrashTextColor CrashText's color. MUST BE HEX CODE
     */
    private String CrashTextColor;


    /**
     *@param DetailsButonText showing stacktrace with alert dialog. change your button's text what you want
     */
    private String DetailsButonText;


    /**
     *@param RestartAppButtonText restart your app(be careful starting ur DestinationActivity!). change your button's text what you want
     */
    private String RestartAppButtonText;


    /**
     *@param DetailsButonText ur error image change what you want. MUST BE "R.drawable.example" or like that
     */
    private Integer ImagePath;


    /**
     *@param RestartAppButtonText ur crash activity's backgorund color.change your activity's color what you want. MUST BE HEX COLOR
     */
    private String BackgorundHex;


    public java.lang.Class getDestinationActivity(){
        return DestinationActivity;
    }
    public TransferObject setDestinationActivity(java.lang.Class destinationActivity){
        DestinationActivity = destinationActivity;
        return this;
    }

    public String getCrashTextColor(){
        return CrashTextColor;
    }
    public TransferObject setCrashTextColor(String crashTextColor){
        CrashTextColor = crashTextColor;
        return this;
    }

    public String getCrashText(){
        return CrashText;
    }
    public TransferObject setCrashText(String crashText){
        CrashText = crashText;
        return this;
    }

    public String getDetailsButonText(){
        return DetailsButonText;
    }
    public TransferObject setDetailsButonText(String detailsButonText){
        DetailsButonText = detailsButonText;
        return this;
    }

    public String getRestartAppButtonText(){
        return RestartAppButtonText;
    }
    public TransferObject setRestartAppButtonText(String restartAppButtonText){
        RestartAppButtonText = restartAppButtonText;
        return this;
    }

    public Integer getImagePath(){
        return ImagePath;
    }
    public TransferObject setImagePath(Integer imagePath){
        ImagePath = imagePath;
        return this;
    }
    public String getBackgorundHex(){
        return BackgorundHex;
    }
    public TransferObject setBackgorundHex(String backgorundHex){
        BackgorundHex = backgorundHex;
        return this;
    }
}
