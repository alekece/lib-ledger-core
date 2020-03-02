#!/usr/bin/env bash

# $1 Target platform <Linux|Macos|Windows>
# $2 Build mode <Debug|Release>

echo "=====> Install dependencies for $1 in $2 mode"

if [ "$1" == "Linux" ]; then
    apt-get update
    apt-get install -y apt-transport-https libx11-xcb-dev
    apt-get install -y libssl-dev tc

    if [ "$2" -eq "Debug" ]; then
        echo "=====> Install Qt5"
        apt-get install -y qt5-default libqt5websockets5 libqt5websockets5-dev
    fi

    echo "=====> Install SQLite"
    apt-get isntall -y sqlite3 sqlite libsqlite3-dev
fi

if [ "$1" -eq "Macos" ]; then
    if [ "$2" -eq "Release" ]; then
        echo "=====> Install SBT"
        brew install sbt
        sbt sbtVersion
    fi

    if [ "$2" -eq "Debug" ]; then
        echo "======> Install Qt5"
        brew install qt5
        export PATH="/usr/local/Cellar/qt/5.*/bin:$PATH"
    fi

    echo "=====> Install SQLite"
    brew install sqlite
fi

if [ "$1" -eq "Windows" ]; then

fi