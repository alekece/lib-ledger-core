/*
 *
 * DerivationPath
 * ledger-core
 *
 * Created by Pierre Pollastri on 16/12/2016.
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Ledger
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
#ifndef LEDGER_CORE_DERIVATIONPATH_HPP
#define LEDGER_CORE_DERIVATIONPATH_HPP

#include <string>
#include <vector>
#include "Exception.hpp"

namespace ledger {
    namespace core {
        class DerivationPath {
        public:
            DerivationPath(const std::string& path);
            DerivationPath(const std::vector<uint32_t>& path);
            uint32_t getDepth() const;
            uint32_t getLastChildNum() const throw(ledger::core::Exception);
            uint32_t operator[](int index) const throw(Exception);
            DerivationPath operator+(const DerivationPath& derivationPath) const;
            bool operator==(const DerivationPath& path) const;
            bool operator!=(const DerivationPath& path) const;
            DerivationPath getParent() const throw(ledger::core::Exception);
            bool isRoot() const;
            std::string toString(bool addLeadingM = false) const;
            std::vector<uint32_t> toVector() const;
            bool isHardened(int index) const throw(ledger::core::Exception);
            bool isLastChildHardened() const throw(ledger::core::Exception);

        public:
            static std::vector<uint32_t> parse(const std::string& path) throw(Exception);

        private:
            inline void assertIndexIsValid(int index, const std::string& method) const throw(Exception);

        private:
            std::vector<uint32_t> _path;
        };
    }
}


#endif //LEDGER_CORE_DERIVATIONPATH_HPP
