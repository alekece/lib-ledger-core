// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BigInt;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyUnit;
import co.ledger.core.FormatRules;
import co.ledger.core.Locale;
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

/**Class representing amount of transaction, output, inputs ... */
public class RCTCoreAmount extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Amount> javaObjects;
    public Map<String, Amount> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAmount(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Amount>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreAmount";
    }

    /**
     *Get amount as a BitInt
     *@return BitInt
     */
    @ReactMethod
    public void toBigInt(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toBigInt method");
            }

            BigInt javaResult = currentInstanceObj.toBigInt();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBigInt");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::toBigInt : Failed to return BigInt from toBigInt method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get currency in which amount was computed
     *@return Currency object
     */
    @ReactMethod
    public void getCurrency(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to getCurrency method");
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
                throw new Exception("RCTCoreAmount::getCurrency : Failed to return Currency from getCurrency method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get currency unit in which amount was computed
     *@return CurrencyUnit object
     */
    @ReactMethod
    public void getUnit(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to getUnit method");
            }

            CurrencyUnit javaResult = currentInstanceObj.getUnit();

            String uuid = UUID.randomUUID().toString();
            RCTCoreCurrencyUnit rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreCurrencyUnit");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::getUnit : Failed to return CurrencyUnit from getUnit method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Convert amount in another currency unit
     *@param CurrencyUnit object, target currency unit
     *@return Amount object, amount in target currency unit
     */
    @ReactMethod
    public void toUnit(Map<String, String> currentInstance, HashMap <String, String> unit, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toUnit method");
            }

            RCTCoreCurrencyUnit rctParam_unit = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            CurrencyUnit javaParam_0 = (CurrencyUnit)rctParam_unit.getJavaObjects.get(unit.get("uid"));
            Amount javaResult = currentInstanceObj.toUnit(javaParam_0);

            String uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreAmount");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::toUnit : Failed to return Amount from toUnit method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**TODO */
    @ReactMethod
    public void toMagnitude(Map<String, String> currentInstance, int magnitude, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toMagnitude method");
            }

            Amount javaResult = currentInstanceObj.toMagnitude(magnitude);

            String uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreAmount");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::toMagnitude : Failed to return Amount from toMagnitude method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get amount as string
     *@return string
     */
    @ReactMethod
    public void toString(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toString method");
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
                throw new Exception("RCTCoreAmount::toString : Failed to return String from toString method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get amount as long
     *@reutrn 64 bits integer
     */
    @ReactMethod
    public void toLong(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toLong method");
            }

            long javaResult = currentInstanceObj.toLong();
            Map<String, long> result = new HashMap<String, long>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::toLong : Failed to return long from toLong method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     *Get amount as double
     *@return double
     */
    @ReactMethod
    public void toDouble(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to toDouble method");
            }

            double javaResult = currentInstanceObj.toDouble();
            Map<String, double> result = new HashMap<String, double>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::toDouble : Failed to return double from toDouble method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**TODO */
    @ReactMethod
    public void format(Map<String, String> currentInstance, HashMap <String, String> locale, Optional<HashMap <String, String>> rules, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            Amount currentInstanceObj = this.javaObjects.get("uid");
            if (!currentInstanceObj)
            {
                throw new Exception("Wrong RCTCoreAmount instance passed to format method");
            }

            RCTCoreLocale rctParam_locale = this.reactContext.getNativeModule(RCTCoreLocale.class);
            Locale javaParam_0 = (Locale)rctParam_locale.getJavaObjects.get(locale.get("uid"));
            RCTCoreFormatRules rctParam_rules = this.reactContext.getNativeModule(RCTCoreFormatRules.class);
            FormatRules javaParam_1 = (FormatRules)rctParam_rules.getJavaObjects.get(rules.get("uid"));
            String javaResult = currentInstanceObj.format(javaParam_0, javaParam_1);
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::format : Failed to return String from format method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void fromHex(Map<String, String> currentInstance, HashMap <String, String> currency, String hex, Promise promise) {
        try
        {
            Amount javaResult = Amount.fromHex(javaParam_0, hex);

            String uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreAmount");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::fromHex : Failed to return Amount from fromHex method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void fromLong(Map<String, String> currentInstance, HashMap <String, String> currency, long value, Promise promise) {
        try
        {
            Amount javaResult = Amount.fromLong(javaParam_0, value);

            String uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects.put(uuid, javaResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreAmount");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreAmount::fromLong : Failed to return Amount from fromLong method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
