// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#ifndef DJINNI_GENERATED_CURRENCY_HPP
#define DJINNI_GENERATED_CURRENCY_HPP

#include "../utils/optional.hpp"
#include "BitcoinLikeNetworkParameters.hpp"
#include "CurrencyUnit.hpp"
#include "EthereumLikeNetworkParameters.hpp"
#include "RippleLikeNetworkParameters.hpp"
#include "WalletType.hpp"
#include <cstdint>
#include <iostream>
#include <string>
#include <utility>
#include <vector>

namespace ledger { namespace core { namespace api {

/** Structure of cryptocurrency. */
struct Currency final {
    /** WalletType object defining the type of wallet the currency belongs to. */
    WalletType walletType;
    /** String which represents currency name. */
    std::string name;
    /**
     * Integer cointype, part of BIP32 path.
     * One can refer to https://github.com/satoshilabs/slips/blob/master/slip-0044.md.
     */
    int32_t bip44CoinType;
    /** String representing schemes allowing to send money to a cryptocurrency address (e.g. bitcoin). */
    std::string paymentUriScheme;
    /** List of CurrencyUnit objects (e.g. BTC, mBTC ...). */
    std::vector<CurrencyUnit> units;
    /**
     *TODO: find a better solution to have only a networkParameters
     * Optional BitcoinLikeNetworkParameters, for more details refer to BitcoinLikeNetworkParameters doc
     */
    std::experimental::optional<BitcoinLikeNetworkParameters> bitcoinLikeNetworkParameters;
    /** Optional EthereumLikeNetworkParameters, for more details refer to EthereumLikeNetworkParameters doc */
    std::experimental::optional<EthereumLikeNetworkParameters> ethereumLikeNetworkParameters;
    /**Optional EthereumLikeNetworkParameters, for more details refer to EthereumLikeNetworkParameters doc */
    std::experimental::optional<RippleLikeNetworkParameters> rippleLikeNetworkParameters;

    Currency(WalletType walletType_,
             std::string name_,
             int32_t bip44CoinType_,
             std::string paymentUriScheme_,
             std::vector<CurrencyUnit> units_,
             std::experimental::optional<BitcoinLikeNetworkParameters> bitcoinLikeNetworkParameters_,
             std::experimental::optional<EthereumLikeNetworkParameters> ethereumLikeNetworkParameters_,
             std::experimental::optional<RippleLikeNetworkParameters> rippleLikeNetworkParameters_)
    : walletType(std::move(walletType_))
    , name(std::move(name_))
    , bip44CoinType(std::move(bip44CoinType_))
    , paymentUriScheme(std::move(paymentUriScheme_))
    , units(std::move(units_))
    , bitcoinLikeNetworkParameters(std::move(bitcoinLikeNetworkParameters_))
    , ethereumLikeNetworkParameters(std::move(ethereumLikeNetworkParameters_))
    , rippleLikeNetworkParameters(std::move(rippleLikeNetworkParameters_))
    {}

    Currency(const Currency& cpy) {
       this->walletType = cpy.walletType;
       this->name = cpy.name;
       this->bip44CoinType = cpy.bip44CoinType;
       this->paymentUriScheme = cpy.paymentUriScheme;
       this->units = cpy.units;
       this->bitcoinLikeNetworkParameters = cpy.bitcoinLikeNetworkParameters;
       this->ethereumLikeNetworkParameters = cpy.ethereumLikeNetworkParameters;
       this->rippleLikeNetworkParameters = cpy.rippleLikeNetworkParameters;
    }

    Currency() = default;


    Currency& operator=(const Currency& cpy) {
       this->walletType = cpy.walletType;
       this->name = cpy.name;
       this->bip44CoinType = cpy.bip44CoinType;
       this->paymentUriScheme = cpy.paymentUriScheme;
       this->units = cpy.units;
       this->bitcoinLikeNetworkParameters = cpy.bitcoinLikeNetworkParameters;
       this->ethereumLikeNetworkParameters = cpy.ethereumLikeNetworkParameters;
       this->rippleLikeNetworkParameters = cpy.rippleLikeNetworkParameters;
       return *this;
    }

    template <class Archive>
    void load(Archive& archive) {
        archive(walletType, name, bip44CoinType, paymentUriScheme, units, bitcoinLikeNetworkParameters, ethereumLikeNetworkParameters, rippleLikeNetworkParameters);
    }

    template <class Archive>
    void save(Archive& archive) const {
        archive(walletType, name, bip44CoinType, paymentUriScheme, units, bitcoinLikeNetworkParameters, ethereumLikeNetworkParameters, rippleLikeNetworkParameters);
    }
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_CURRENCY_HPP
