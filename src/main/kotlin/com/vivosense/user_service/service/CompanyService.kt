package com.vivosense.user_service.service

import com.vivosense.user_service.models.Company

class CompanyService {
    private val companiesById = mutableMapOf(
        "8f04d8f1-45e5-4b41-b0a9-6f7c6d31c2d1" to Company(
            id = "8f04d8f1-45e5-4b41-b0a9-6f7c6d31c2d1",
            createdAt = 1_705_306_800_000,
            updatedAt = 1_705_306_800_000,
            name = "First Company"
        ),
        "93f0c9e5-7a43-44e6-9c7e-337ad58f2e4b" to Company(
            id = "93f0c9e5-7a43-44e6-9c7e-337ad58f2e4b",
            createdAt = 1_705_306_800_000,
            updatedAt = 1_705_306_800_000,
            name = "Second Company"
        ),
        "c8e8cc2f-2b98-4bb1-bd7f-53c2e6d49771" to Company(
            id = "c8e8cc2f-2b98-4bb1-bd7f-53c2e6d49771",
            createdAt = 1_705_306_800_000,
            updatedAt = 1_705_306_800_000,
            name = "Third Company"
        ),
    )

    fun getCompanyById(id: String) = companiesById[id]
}