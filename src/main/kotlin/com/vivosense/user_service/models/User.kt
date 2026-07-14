package com.vivosense.user_service.models

data class User(
    val id: String,
    val createdAt: Long,
    val updatedAt: Long,
    val companyId: String,
    val email: String,
    val firstName: String,
    val lastName: String
)
