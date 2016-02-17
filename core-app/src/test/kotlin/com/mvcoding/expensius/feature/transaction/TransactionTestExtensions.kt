/*
 * Copyright (C) 2016 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.expensius.feature.transaction

import com.mvcoding.expensius.feature.tag.someTags
import com.mvcoding.expensius.feature.transaction.TransactionState.CONFIRMED
import com.mvcoding.expensius.feature.transaction.TransactionType.EXPENSE
import com.mvcoding.expensius.model.ModelState.NONE
import com.mvcoding.expensius.model.Transaction
import java.lang.System.currentTimeMillis
import java.math.BigDecimal.ONE
import java.util.UUID.randomUUID

fun aTransaction() = Transaction(
        randomUUID().toString(),
        NONE,
        EXPENSE,
        CONFIRMED,
        currentTimeMillis(),
        aCurrency(),
        ONE,
        someTags(),
        "note")

fun aNewTransaction() = Transaction(currency = aCurrency())