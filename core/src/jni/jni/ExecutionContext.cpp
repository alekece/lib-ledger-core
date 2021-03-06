// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

#include "ExecutionContext.hpp"  // my header
#include "Marshal.hpp"
#include "Runnable.hpp"

namespace djinni_generated {

ExecutionContext::ExecutionContext() : ::djinni::JniInterface<::ledger::core::api::ExecutionContext, ExecutionContext>() {}

ExecutionContext::~ExecutionContext() = default;

ExecutionContext::JavaProxy::JavaProxy(JniType j) : Handle(::djinni::jniGetThreadEnv(), j) { }

ExecutionContext::JavaProxy::~JavaProxy() = default;

void ExecutionContext::JavaProxy::execute(const std::shared_ptr<::ledger::core::api::Runnable> & c_runnable) {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::ExecutionContext>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_execute,
                           ::djinni::get(::djinni_generated::Runnable::fromCpp(jniEnv, c_runnable)));
    ::djinni::jniExceptionCheck(jniEnv);
}
void ExecutionContext::JavaProxy::delay(const std::shared_ptr<::ledger::core::api::Runnable> & c_runnable, int64_t c_millis) {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::ExecutionContext>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_delay,
                           ::djinni::get(::djinni_generated::Runnable::fromCpp(jniEnv, c_runnable)),
                           ::djinni::get(::djinni::I64::fromCpp(jniEnv, c_millis)));
    ::djinni::jniExceptionCheck(jniEnv);
}

}  // namespace djinni_generated
