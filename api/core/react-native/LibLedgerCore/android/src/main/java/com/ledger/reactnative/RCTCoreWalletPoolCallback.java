// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.WalletPool;
import co.ledger.core.WalletPoolCallback;
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
public class RCTCoreWalletPoolCallback extends WalletPoolCallback {
    public Promise promise;
    public ReactContext reactContext;
    public static RCTCoreWalletPoolCallback initWithPromise(Promise promise, ReactContext reactContext)
    {
        RCTCoreWalletPoolCallback callback = new RCTCoreWalletPoolCallback();
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
    public void onCallback(WalletPool result, Error error) {
        try
        {
            if (error)
            {
                this.promise.reject(ERROR, error.message);
            }
            String uuid = UUID.randomUUID().toString();
            RCTCoreWalletPool rctImpl_result = this.reactContext.getNativeModule(RCTCoreWalletPool.class);
            rctImpl_result.getJavaObjects.put(uuid, result);
            Map<String, String> converted_result = new HashMap<String, String>();
            converted_result.put("type","RCTCoreWalletPool");
            converted_result.put("uid",uuid);

            this.promise.resolve(converted_result);
        }
        catch(Exception e)
        {
            self.promise.reject(ERROR, e);
        }
    }
}
