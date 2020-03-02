#!/usr/bin/env bash

# $1 Target platform <Linux|Macos|Windows>
# $2 Build mode <Debug|Release>
# $3 Build target <bitcoin|ethereum|ripple|tezos>

echo "======> CMake configuration for $1 in $2 mode"

build_target="ledger-core"
# We get down 2 level of folders because cmake command will be executed in ledger-core-*/build folder
cmake_parameters="-DCMAKE_BUILD_TYPE=$2 -DCMAKE_INSTALL_PREFIX=../../install"

if [ -z "$3" ]; then
    build_target="$build_target-$3"
else

if [ ! -d "install" ]; then
    echo "=====> Create install directory"
    mkdir "install"
fi

if [ ! -d "$build_target/build" ]; then
    echo "=====> Create build directory"
    mkdir "$build_target/build"
fi

if [ "$1" -eq "Linux" ]; then
    cmake_parameters= "$cmake_parameters -DCMAKE_PREFIX=$HOME -DSYS_OPENSSL=ON -DOPENSSL_SSL_LIBRARIES=/usr/lib/x86_64-linux-gnu -DOPENSSL_INCLUDE_DIR=/usr/include/openssl"
fi

if [ "$1" -eq "Macos" ]; then
    version=`ls /usr/local/Cellar/qt | grep 5.`
    echo "=====> Fetch Qt $version"
    export PATH="/usr/local/Cellar/qt/$version/bin:$PATH"
    cmake_parameters="$cmake_parameters -DCMAKE_PREFIX_PATH='/usr/local/Cellar/qt/$version'"
fi

if [ "$2" -eq "Debug" ]; then
    cmake_parameters="$cmake_parameters -DBUILD_TESTS=ON -DPG_SUPPORT=ON"
fi

if [ "$2" -eq "Release" ]; then
    cmake_parameters="$cmake_parameters -DBUILD_TESTS=OFF"
fi

echo "======> CMake parameters $cmake_parameters"

echo "======> Configuring $build_target"
cd $build_target/build
cmake $cmake_parameters ..
