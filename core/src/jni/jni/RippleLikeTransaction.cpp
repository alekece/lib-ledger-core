// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

#include "RippleLikeTransaction.hpp"  // my header
#include "Amount.hpp"
#include "BigInt.hpp"
#include "Marshal.hpp"
#include "RippleLikeAddress.hpp"
#include "RippleLikeMemo.hpp"

namespace djinni_generated {

RippleLikeTransaction::RippleLikeTransaction() : ::djinni::JniInterface<::ledger::core::api::RippleLikeTransaction, RippleLikeTransaction>("co/ledger/core/RippleLikeTransaction$CppProxy") {}

RippleLikeTransaction::~RippleLikeTransaction() = default;


CJNIEXPORT void JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::ledger::core::api::RippleLikeTransaction>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jstring JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getHash(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getHash();
        return ::djinni::release(::djinni::String::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getFees(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getFees();
        return ::djinni::release(::djinni_generated::Amount::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getReceiver(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getReceiver();
        return ::djinni::release(::djinni_generated::RippleLikeAddress::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getSender(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getSender();
        return ::djinni::release(::djinni_generated::RippleLikeAddress::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getValue(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getValue();
        return ::djinni::release(::djinni_generated::Amount::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jbyteArray JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1serialize(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->serialize();
        return ::djinni::release(::djinni::Binary::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1setSignature(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jbyteArray j_rSignature, jbyteArray j_sSignature)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        ref->setSignature(::djinni::Binary::toCpp(jniEnv, j_rSignature),
                          ::djinni::Binary::toCpp(jniEnv, j_sSignature));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1setDERSignature(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jbyteArray j_signature)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        ref->setDERSignature(::djinni::Binary::toCpp(jniEnv, j_signature));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getDate(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getDate();
        return ::djinni::release(::djinni::Date::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getSequence(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getSequence();
        return ::djinni::release(::djinni_generated::BigInt::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getLedgerSequence(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getLedgerSequence();
        return ::djinni::release(::djinni_generated::BigInt::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jbyteArray JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getSigningPubKey(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getSigningPubKey();
        return ::djinni::release(::djinni::Binary::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1getMemos(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        auto r = ref->getMemos();
        return ::djinni::release(::djinni::List<::djinni_generated::RippleLikeMemo>::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_co_ledger_core_RippleLikeTransaction_00024CppProxy_native_1addMemo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_memo)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::RippleLikeTransaction>(nativeRef);
        ref->addMemo(::djinni_generated::RippleLikeMemo::toCpp(jniEnv, j_memo));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

}  // namespace djinni_generated
