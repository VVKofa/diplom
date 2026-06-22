package com.example.directionprogramm

data class RequestItemModel(
    val productName: String,
    val quantity: Int
)

data class RequestModel(
    val id: Int,
    val createdDate: String,
    val items: List<RequestItemModel>,
    var status: String,
    val carWashId: Int
)
