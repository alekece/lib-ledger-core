// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#pragma once

#include "../../api/BitcoinLikeOutput.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class BitcoinLikeOutput final {
public:
    using CppType = ::ledger::core::api::BitcoinLikeOutput;
    using JniType = jobject;

    using Boxed = BitcoinLikeOutput;

    ~BitcoinLikeOutput();

    static CppType toCpp(JNIEnv* jniEnv, JniType j);
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c);

private:
    BitcoinLikeOutput();
    friend ::djinni::JniClass<BitcoinLikeOutput>;

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("co/ledger/core/BitcoinLikeOutput") };
    const jmethodID jconstructor { ::djinni::jniGetMethodID(clazz.get(), "<init>", "(Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)V") };
    const jfieldID field_transactionHash { ::djinni::jniGetFieldID(clazz.get(), "transactionHash", "Ljava/lang/String;") };
    const jfieldID field_index { ::djinni::jniGetFieldID(clazz.get(), "index", "I") };
    const jfieldID field_path { ::djinni::jniGetFieldID(clazz.get(), "path", "Ljava/lang/String;") };
    const jfieldID field_script { ::djinni::jniGetFieldID(clazz.get(), "script", "[B") };
    const jfieldID field_address { ::djinni::jniGetFieldID(clazz.get(), "address", "Ljava/lang/String;") };
};

}  // namespace djinni_generated