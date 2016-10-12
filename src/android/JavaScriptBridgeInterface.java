package org.apache.cordova.inappbrowser;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import org.apache.cordova.LOG;


public class JavaScriptBridgeInterface {
    private Context _context;
    protected static final String LOG_TAG = "InAppBrowser.JavaScriptBridgeInterface";

    @JavascriptInterface
    public String toString() {
        //TODO: get response back to the client...
        return "Responded...";
//        Log.d(LOG_TAG, "respond called *************************************************************************");
//        Log.d(LOG_TAG, response);
//        Log.d(LOG_TAG, "respond called *************************************************************************");
    }
}