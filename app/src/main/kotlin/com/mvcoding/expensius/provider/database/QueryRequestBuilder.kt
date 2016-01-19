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

package com.mvcoding.expensius.provider.database

class JoinTable(
        private val joinType: String,
        private val table: String,
        val on: String) {
    override fun toString(): String {
        return "$joinType join $table on $on"
    }
}

class Query(
        private val columns: List<String>,
        private val table: String,
        private val joinTables: List<JoinTable>) {

    fun sql(): String {
        return "select ${columns.joinToString { it }} " +
               "from $table" +
               joinTables.joinToString(prefix = " ", separator = "", transform = { it.toString() })
    }
}