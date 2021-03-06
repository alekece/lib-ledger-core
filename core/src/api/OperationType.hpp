// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_OPERATIONTYPE_HPP
#define DJINNI_GENERATED_OPERATIONTYPE_HPP

#include <functional>
#include <iostream>
#include <string>
#ifndef LIBCORE_EXPORT
    #if defined(_MSC_VER)
       #include <libcore_export.h>
    #else
       #define LIBCORE_EXPORT
    #endif
#endif

namespace ledger { namespace core { namespace api {

enum class OperationType : int {
    SEND,
    RECEIVE,
    NONE,
};
LIBCORE_EXPORT  std::string to_string(const OperationType& operationType);
LIBCORE_EXPORT  std::ostream &operator<<(std::ostream &os, const OperationType &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::OperationType> {
    size_t operator()(::ledger::core::api::OperationType type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
#endif //DJINNI_GENERATED_OPERATIONTYPE_HPP
