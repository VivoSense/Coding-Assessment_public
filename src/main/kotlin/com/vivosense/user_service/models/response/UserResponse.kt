package com.vivosense.user_service.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.vivosense.user_service.models.User

data class UserResponse(
    @JsonProperty("id")
    val id: String,

    @JsonProperty("created_at")
    val createdAt: Long,

    @JsonProperty("updated_at")
    val updatedAt: Long,

    @JsonProperty("company_id")
    val companyId: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("first_name")
    val firstName: String,

    @JsonProperty("last_name")
    val lastName: String,

    @JsonProperty("full_name")
    val fullName: String
) {
    constructor(user: User) : this(
        id = user.id,
        createdAt = user.createdAt,
        updatedAt = user.updatedAt,
        companyId = user.companyId,
        email = user.email,
        firstName = user.firstName,
        lastName = user.lastName,
        fullName = "${user.firstName} ${user.lastName}"
    )
}
