// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

package com.ledger.reactnative;

import co.ledger.core.SynchronizerEngines;
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

/**Class of constants representing the engines to rely on for synchronization */
public class RCTCoreSynchronizerEngines extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, SynchronizerEngines> javaObjects;
    public Map<String, SynchronizerEngines> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreSynchronizerEngines(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, SynchronizerEngines>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreSynchronizerEngines";
    }

}
