#!/usr/bin/env bash

# $1 Target platform <Linux|Macos|Windows>
# $2 Build mode <Debug|Release>

echo "=====> Install dependencies for $1 in $2 mode"

if [ "$1" == "Linux" ]; then
    sudo apt-get update
    sudo apt-get install -y libx11-xcb-dev

    echo "=====> Install PostgreSQL"
    sudo apt-get install -y postgresql-9.6 libpq-dev postgresql-server-dev-all

    echo "=====> Install SQLite"
    sudo apt-get install -y sqlite3 sqlite libsqlite3-dev

    if [ "$2" == "Debug" ]; then
        echo "=====> Install Qt5"
        sudo apt-get install -y qt5-default libqt5websockets5 libqt5websockets5-dev
    fi
fi

if [ "$1" == "Macos" ]; then
    echo "========> Install PostgreSQL"
    brew install postgresql

    echo "=====> Install SQLite"
    brew install sqlite

    if [ "$2" == "Release" ]; then
        echo "=====> Install SBT"
        brew install sbt
        sbt sbtVersion
    fi

    if [ "$2" == "Debug" ]; then
        echo "======> Install Qt5"
        brew install qt5
        export PATH="/usr/local/Cellar/qt/5.*/bin:$PATH"
    fi

fi

# if [ "$1" == "Windows" ]; then

# fi