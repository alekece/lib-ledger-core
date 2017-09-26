// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import <Foundation/Foundation.h>

@interface LGExtendedKeyAccountCreationInfo : NSObject
- (nonnull instancetype)initWithIndex:(int32_t)index
                               owners:(nonnull NSArray<NSString *> *)owners
                          derivations:(nonnull NSArray<NSString *> *)derivations
                         extendedKeys:(nonnull NSArray<NSString *> *)extendedKeys;
+ (nonnull instancetype)ExtendedKeyAccountCreationInfoWithIndex:(int32_t)index
                                                         owners:(nonnull NSArray<NSString *> *)owners
                                                    derivations:(nonnull NSArray<NSString *> *)derivations
                                                   extendedKeys:(nonnull NSArray<NSString *> *)extendedKeys;

@property (nonatomic, readonly) int32_t index;

@property (nonatomic, readonly, nonnull) NSArray<NSString *> * owners;

@property (nonatomic, readonly, nonnull) NSArray<NSString *> * derivations;

@property (nonatomic, readonly, nonnull) NSArray<NSString *> * extendedKeys;

@end