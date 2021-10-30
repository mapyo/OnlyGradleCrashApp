package com.example.myapplication

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalDateTime


internal class LocalDateTimeAdapter {
    @ToJson
    fun toJson(localDateTime: LocalDateTime) = localDateTime.toString()

    @FromJson
    fun fromJson(dateString: String) = LocalDateTime.parse(dateString)
}
