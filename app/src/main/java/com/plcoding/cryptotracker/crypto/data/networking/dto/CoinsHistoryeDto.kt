package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsHistoryeDto(
    val data: List<CoinPriceDto>
)
