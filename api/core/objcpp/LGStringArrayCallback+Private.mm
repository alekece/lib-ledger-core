// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

#import "LGStringArrayCallback+Private.h"
#import "LGStringArrayCallback.h"
#import "DJIMarshal+Private.h"
#import "DJIObjcWrapperCache+Private.h"
#include <stdexcept>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

namespace djinni_generated {

class StringArrayCallback::ObjcProxy final
: public ::ledger::core::api::StringArrayCallback
, public ::djinni::ObjcProxyCache::Handle<ObjcType>
{
public:
    using Handle::Handle;
    void onCallback(const std::vector<std::string> & c_strs) override
    {
        @autoreleasepool {
            [Handle::get() onCallback:(::djinni::List<::djinni::String>::fromCpp(c_strs))];
        }
    }
};

}  // namespace djinni_generated

namespace djinni_generated {

auto StringArrayCallback::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return ::djinni::get_objc_proxy<ObjcProxy>(objc);
}

auto StringArrayCallback::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return dynamic_cast<ObjcProxy&>(*cpp).Handle::get();
}

}  // namespace djinni_generated