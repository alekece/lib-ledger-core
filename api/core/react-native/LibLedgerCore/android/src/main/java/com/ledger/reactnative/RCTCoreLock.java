// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

package com.ledger.reactnative;

import co.ledger.core.LockImpl;
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

/**Class representing a lock, for thread safety purposes */
public class RCTCoreLock extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, LockImpl> javaObjects;
    public Map<String, LockImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreLock(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, LockImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreLock";
    }

    /**
     *Acquire lock by thread calling this method,
     *If Lock already acquired by another thread, execution of calling thread should be blocked
     *until the other thread call the unlock method
     */
    @ReactMethod
    public void lock(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LockImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLock instance passed to lock method");
            }

            currentInstanceObj.lock();
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Try to acquire lock
     *If Lock already aquired by another thread, method returns false for calling thread
     *without blocking its execution
     *@return bool, return true if Lock acquire by calling thread, false otherwise
     */
    @ReactMethod
    public void tryLock(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LockImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLock instance passed to tryLock method");
            }

            boolean javaResult = currentInstanceObj.tryLock();
            Map<String, boolean> result = new HashMap<String, boolean>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreLock::tryLock : Failed to return boolean from tryLock method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**Release Lock ownership by calling thread */
    @ReactMethod
    public void unlock(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            LockImpl currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreLock instance passed to unlock method");
            }

            currentInstanceObj.unlock();
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
