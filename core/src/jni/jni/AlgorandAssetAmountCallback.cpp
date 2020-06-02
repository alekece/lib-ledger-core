// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#include "AlgorandAssetAmountCallback.hpp"  // my header
#include "AlgorandAssetAmount.hpp"
#include "Error.hpp"
#include "Marshal.hpp"

namespace djinni_generated {

AlgorandAssetAmountCallback::AlgorandAssetAmountCallback() : ::djinni::JniInterface<::ledger::core::api::AlgorandAssetAmountCallback, AlgorandAssetAmountCallback>() {}

AlgorandAssetAmountCallback::~AlgorandAssetAmountCallback() = default;

AlgorandAssetAmountCallback::JavaProxy::JavaProxy(JniType j) : Handle(::djinni::jniGetThreadEnv(), j) { }

AlgorandAssetAmountCallback::JavaProxy::~JavaProxy() = default;

void AlgorandAssetAmountCallback::JavaProxy::onCallback(const std::experimental::optional<::ledger::core::api::AlgorandAssetAmount> & c_result, const std::experimental::optional<::ledger::core::api::Error> & c_error) {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::AlgorandAssetAmountCallback>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_onCallback,
                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::AlgorandAssetAmount>::fromCpp(jniEnv, c_result)),
                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::Error>::fromCpp(jniEnv, c_error)));
    ::djinni::jniExceptionCheck(jniEnv);
}

}  // namespace djinni_generated
