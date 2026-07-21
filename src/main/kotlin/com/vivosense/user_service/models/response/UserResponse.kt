package com.vivosense.user_service.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.vivosense.user_service.models.Company
import com.vivosense.user_service.models.User

data class UserResponse(
    @JsonProperty("id")
    val id: String,

    @JsonProperty("created_at")
    val createdAt: Long,

    @JsonProperty("updated_at")
    val updatedAt: Long,

    @JsonProperty("company")
    val company: CompanyResponse?,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("first_name")
    val firstName: String,

    @JsonProperty("last_name")
    val lastName: String,

    @JsonProperty("is_active")
    val isActive: Boolean,
    ) {
    constructor(user: User, company: Company?) : this(
        id = user.id,
        createdAt = user.createdAt,
        updatedAt = user.updatedAt,
        company = company?.let { CompanyResponse(company) },
        email = user.email,
        firstName = user.firstName,
        lastName = user.lastName,
        isActive = user.isActive
    )
}
