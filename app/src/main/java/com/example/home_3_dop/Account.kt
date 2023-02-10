package com.example.home_3_dop

open class Account(private val config: Builder) {

    fun info(): String {
        return config.name + "\n" + config.middle
    }

    fun info2(): String {
        return config.id + "\n" + config.numberPhone
    }

    companion object Builder {
        protected var name: String? = null
        protected var middle: String? = null
        protected var id: String? = null
        protected var numberPhone: String? = null

        fun name(value: String) = apply { name = value }
        fun middle(value: String) = apply { middle = value }
        fun getID(value: String) = apply { id = value }
        fun numberPhone(value: String) = apply { numberPhone = value }

        fun build(): Account {
            return Account(this)
        }
    }
}