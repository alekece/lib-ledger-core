// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.HttpReadBodyResult;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Structure representing Http response body */
public class RCTCoreHttpReadBodyResult extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, HttpReadBodyResult> javaObjects;
    private Map<String, Map<String, ArrayList<String>>> implementationsData;
    public Map<String, HttpReadBodyResult> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpReadBodyResult(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpReadBodyResult>();
        this.implementationsData = new HashMap<String, Map<String, ArrayList<String>>>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpReadBodyResult";
    }
    @ReactMethod
    public void release(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreHttpReadBodyResult", "First parameter of RCTCoreHttpReadBodyResult::release should be an instance of RCTCoreHttpReadBodyResult");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, HttpReadBodyResult> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    @ReactMethod
    public void init(Optional<HashMap <String, String>> error, byte[] data, Promise promise) {
        Map<String, ArrayList<String>> implementationsData = new HashMap<String, ArrayList<String>>();
        RCTCoreError rctParam_error = this.reactContext.getNativeModule(RCTCoreError.class);
        Error javaParam_0 = rctParam_error.getJavaObjects().get(error.get().get("uid"));
        ArrayList<String> javaParam_0_tmp = new ArrayList<String>();
        javaParam_0_tmp.add(error.get().get("uid"));
        implementationsData.put("error", javaParam_0_tmp);
        HttpReadBodyResult javaResult = new HttpReadBodyResult(javaParam_0, data);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreHttpReadBodyResult");
        finalResult.putString("uid",uuid);
        this.implementationsData.put(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getError(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            HttpReadBodyResult javaObj = this.javaObjects.get(uid);
            Map<String, ArrayList<String>> data = this.implementationsData.get(uid);
            ArrayList<String> fieldData = data.get("error");
            WritableNativeArray nativeFieldData = new WritableNativeArray();
            for (String elem : fieldData)
            {
                nativeFieldData.pushString(elem);
            }
            WritableNativeMap result = new WritableNativeMap();
            result.putArray(uid,nativeFieldData);
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreHttpReadBodyResult::getError", "First parameter of RCTCoreHttpReadBodyResult::getError should be an instance of RCTCoreHttpReadBodyResult");
        }
    }

    @ReactMethod
    public void getData(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            HttpReadBodyResult javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getData();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreHttpReadBodyResult::getData", "First parameter of RCTCoreHttpReadBodyResult::getData should be an instance of RCTCoreHttpReadBodyResult");
        }
    }

}