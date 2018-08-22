// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Address;
import co.ledger.core.BitcoinLikeAddress;
import co.ledger.core.Currency;
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

public class RCTCoreAddress extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Address> javaObjects;
    public Map<String, Address> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAddress(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Address>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreAddress";
    }

    /**
     * Gets an optional derivation path (if the address is owned by an account)
     * @return The derivation path of the address
     */
    @ReactMethod
    public void getDerivationPath(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Address currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAddress instance passed to getDerivationPath method");
            }

            String javaResult = currentInstanceObj.getDerivationPath();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::getDerivationPath : Failed to return String from getDerivationPath method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Serialize the address to a string. The serialization method depends of the underlying currency and
     * format (Base58, Bech32, Ethereum...)
     */
    @ReactMethod
    public void toString(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Address currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAddress instance passed to toString method");
            }

            String javaResult = currentInstanceObj.toString();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::toString : Failed to return String from toString method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void asBitcoinLikeAddress(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Address currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAddress instance passed to asBitcoinLikeAddress method");
            }

            BitcoinLikeAddress javaResult = currentInstanceObj.asBitcoinLikeAddress();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeAddress rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeAddress.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeAddress");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::asBitcoinLikeAddress : Failed to return BitcoinLikeAddress from asBitcoinLikeAddress method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void isInstanceOfBitcoinLikeAddress(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Address currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAddress instance passed to isInstanceOfBitcoinLikeAddress method");
            }

            boolean javaResult = currentInstanceObj.isInstanceOfBitcoinLikeAddress();
            Map<String, boolean> result = new HashMap<String, boolean>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::isInstanceOfBitcoinLikeAddress : Failed to return boolean from isInstanceOfBitcoinLikeAddress method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void getCurrency(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Address currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAddress instance passed to getCurrency method");
            }

            Currency javaResult = currentInstanceObj.getCurrency();

            String uuid = UUID.randomUUID().toString();
            RCTCoreCurrency rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreCurrency");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::getCurrency : Failed to return Currency from getCurrency method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Attempt to parse a string address. If the address can be parse return it otherwise return a NONE
     * (depending on you host this may be a null, nil, None...)
     * @param address The string to parse
     * @param currency The currency used to parse the address
     * @return If successful returns the address object otherwise null.
     */
    @ReactMethod
    public void parse(Map<String, String> currentInstance, String address, HashMap <String, String> currency, Promise promise) {
        try
        {
            Address javaResult = Address.parse(address, javaParam_1);

            String uuid = UUID.randomUUID().toString();
            RCTCoreAddress rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAddress.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreAddress");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::parse : Failed to return Address from parse method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Checks if the given string formatted address is valid or not.
     * @param address The string to parse
     * @param currency The currency used to parse the address
     * @return If successful returns true, false otherwise.
     */
    @ReactMethod
    public void isValid(Map<String, String> currentInstance, String address, HashMap <String, String> currency, Promise promise) {
        try
        {
            boolean javaResult = Address.isValid(address, javaParam_1);
            Map<String, boolean> result = new HashMap<String, boolean>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAddress::isValid : Failed to return boolean from isValid method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
