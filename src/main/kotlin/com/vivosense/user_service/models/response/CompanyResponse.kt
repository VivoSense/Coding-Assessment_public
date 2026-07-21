package com.vivosense.user_service.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.vivosense.user_service.models.Company

data class CompanyResponse(
    @JsonProperty("id")
    val id: String,

    @JsonProperty("created_at")
    val createdAt: Long,

    @JsonProperty("updated_at")
    val updatedAt: Long,

    @JsonProperty("company_name")
    val companyName: String
) {
    constructor(company: Company) : this(
        id = company.id,
        createdAt = company.createdAt,
        updatedAt = company.updatedAt,
        companyName = company.name
    )
}
