package com.kamifun.notification.status;

import android.support.v4.app.NotificationManagerCompat;

import android.content.Context;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class NotificationStatus extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getStatus")) {
            Context context = this.cordova.getActivity().getApplicationContext();
            callbackContext.success(NotificationManagerCompat.from(context).areNotificationsEnabled() ? 1 : 0);
            return true;
        }
        return false;
    }

}
