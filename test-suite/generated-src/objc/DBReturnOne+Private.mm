// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from multiple_inheritance.djinni

#import "DBReturnOne+Private.h"
#import "DBReturnOne.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface DBReturnOne ()

- (id)initWithCpp:(const std::shared_ptr<::testsuite::ReturnOne>&)cppRef;

@end

@implementation DBReturnOne {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::testsuite::ReturnOne>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::testsuite::ReturnOne>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

+ (nullable DBReturnOne *)getInstance {
    try {
        auto objcpp_result_ = ::testsuite::ReturnOne::get_instance();
        return ::djinni_generated::ReturnOne::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (int8_t)returnOne {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->return_one();
        return ::djinni::I8::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto ReturnOne::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto ReturnOne::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<DBReturnOne>(cpp);
}

}  // namespace djinni_generated

@end
