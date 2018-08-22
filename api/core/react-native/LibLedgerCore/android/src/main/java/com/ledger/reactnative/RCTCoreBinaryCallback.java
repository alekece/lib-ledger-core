// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

package com.ledger.reactnative;

import co.ledger.core.BinaryCallback;
import co.ledger.core.Error;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 *Callback triggered by main completed task,
 *returns optional result of template type T
 */
public class RCTCoreBinaryCallback extends BinaryCallback {
    public Promise promise;
    public ReactContext reactContext;
    public static RCTCoreBinaryCallback initWithPromise(Promise promise, ReactContext reactContext)
    {
        RCTCoreBinaryCallback callback = new RCTCoreBinaryCallback();
        if(callback)
        {
            callback.promise = promise;
            callback.reactContext = reactContext;
        }
        return callback;
    }
    /**
     * Method triggered when main task complete
     * @params result optional of type T, non null if main task failed
     * @params error optional of type Error, non null if main task succeeded
     */
    public void onCallback(byte[] result, Error error) {
        try
        {
            if (error)
            {
                this.promise.reject(ERROR, error.message);
            }

            this.promise.resolve(result);
        }
        catch(Exception e)
        {
            self.promise.reject(ERROR, e);
        }
    }
}
