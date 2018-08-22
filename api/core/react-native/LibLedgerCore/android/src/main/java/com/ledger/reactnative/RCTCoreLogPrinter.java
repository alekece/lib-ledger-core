// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from logger.djinni

package com.ledger.reactnative;

import co.ledger.core.ExecutionContext;
import co.ledger.core.LogPrinterImpl;
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
 *Class representing a printer of errors, warnings, infos ... (at runtime)
 *Printed logs are stored in path set by PathResolver::resolveLogFilePath
 */
public class RCTCoreLogPrinter extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, LogPrinterImpl> javaObjects;
    public Map<String, LogPrinterImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreLogPrinter(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, LogPrinterImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreLogPrinter";
    }

    /**
     *Print different encountered errors
     *@param message, string
     */
    @ReactMethod
    public void printError(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printError method");
            }

            currentInstanceObj.printError(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Print useful information messages
     *@param message, string
     */
    @ReactMethod
    public void printInfo(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printInfo method");
            }

            currentInstanceObj.printInfo(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Print debug messages
     *@param message string
     */
    @ReactMethod
    public void printDebug(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printDebug method");
            }

            currentInstanceObj.printDebug(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Print warning messages
     *@param message, string
     */
    @ReactMethod
    public void printWarning(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printWarning method");
            }

            currentInstanceObj.printWarning(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Print messages from APDU comand interpretation loop
     *@param message, string
     */
    @ReactMethod
    public void printApdu(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printApdu method");
            }

            currentInstanceObj.printApdu(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Print critical errors causing a core dump or error from which recovery is impossible
     *@param message, string
     */
    @ReactMethod
    public void printCriticalError(Map<String, String> currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to printCriticalError method");
            }

            currentInstanceObj.printCriticalError(message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get context in which printer is executed (print)
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getContext(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLogPrinter instance passed to getContext method");
            }

            ExecutionContext javaResult = currentInstanceObj.getContext();

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreExecutionContext");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreLogPrinter::getContext : Failed to return ExecutionContext from getContext method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
