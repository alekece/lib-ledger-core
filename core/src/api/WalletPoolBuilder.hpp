// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

#ifndef DJINNI_GENERATED_WALLETPOOLBUILDER_HPP
#define DJINNI_GENERATED_WALLETPOOLBUILDER_HPP

#include <memory>
#include <string>
#ifndef LIBCORE_EXPORT
    #if defined(_MSC_VER)
       #include <libcore_export.h>
    #else
       #define LIBCORE_EXPORT
    #endif
#endif

namespace ledger { namespace core { namespace api {

class DatabaseBackend;
class DynamicObject;
class HttpClient;
class LogPrinter;
class PathResolver;
class RandomNumberGenerator;
class ThreadDispatcher;
class WalletPoolCallback;
class WebSocketClient;

/** Class representing a wallet pool builder (to instanciate a wallet pool). */
class LIBCORE_EXPORT WalletPoolBuilder {
public:
    virtual ~WalletPoolBuilder() {}

    /**
     * Set http client to be used for wallet pool build.
     * @param client, HttpClient
     * @return WalletPoolBuilder object, instance with wallet pool http client set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setHttpClient(const std::shared_ptr<HttpClient> & client) = 0;

    /**
     * Set web socket client, through which wallet pool will listen and get notified (by explorers, DBs...).
     * @param client, WebSocketClient object
     * @reutnr WalletPoolBuilder object, instance with wallet pool web socket client set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setWebsocketClient(const std::shared_ptr<WebSocketClient> & client) = 0;

    /**
     * Set path resolver that will be used for wallet pool creation to resolve wallet pool's (DB's, logs, preferences ...) paths.
     * @param pathResolver, Pathresolver object
     * @param WalletPoolBuilder object, instance with wallet pool path resolver set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setPathResolver(const std::shared_ptr<PathResolver> & pathResolver) = 0;

    /**
     * Set log printer that will be used for wallet pool creation to dump wallet pool's logs (for debug purposes).
     * @param printer, LogPrinter object
     * @param WalletPoolBuilder object, instance with wallet pool logger set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setLogPrinter(const std::shared_ptr<LogPrinter> & printer) = 0;

    /**
     * Set thread dispatcher that will be used for wallet pool creation to dispatch wallet pool's tasks through different threads.
     * @param dispatcher, ThreadDispatcher object
     * @param WalletPoolBuilder object, instance with wallet pool thread dispatcher set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setThreadDispatcher(const std::shared_ptr<ThreadDispatcher> & dispatcher) = 0;

    /**
     * Set name that will be used for wallet pool creation.
     * @param name, string
     * @return WalletPoolBuilder object, instance with wallet pool name set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setName(const std::string & name) = 0;

    /**
     * Set password that will be used for wallet pool creation.
     * @param password, string
     * @return WalletPoolBuilder object, with wallet pool password set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setPassword(const std::string & password) = 0;

    /**
     * Set random number generator that will be used for wallet pool creation.
     * @param rng, RandomNumberGenerator object
     * @return WalletPoolBuilder object, with wallet pool random number generator set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setRandomNumberGenerator(const std::shared_ptr<RandomNumberGenerator> & rng) = 0;

    /**
     * Set database that will be used for wallet pool creation, it will store all wallet pool's data (created wallets, accounts, preferences ...).
     * @param backend, DatabaseBackend object
     * @return WalletPoolBuilder object, with wallet pool database set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setDatabaseBackend(const std::shared_ptr<DatabaseBackend> & backend) = 0;

    /**
     * Set configuration that will be used for wallet pool creation.
     * @param configuration, DynamicObject object
     * @return WalletPoolBuilder object, with wallet pool configuration set
     */
    virtual std::shared_ptr<WalletPoolBuilder> setConfiguration(const std::shared_ptr<DynamicObject> & configuration) = 0;

    /**
     * Create wallet pool.
     * @param callback, Callback object returning a WalletPool instance
     */
    virtual void build(const std::shared_ptr<WalletPoolCallback> & listener) = 0;

    /**
     * Create an instance of the wallet pool builder.
     * @return WalletPoolBuilder object
     */
    static std::shared_ptr<WalletPoolBuilder> createInstance();
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_WALLETPOOLBUILDER_HPP
