package com.vivosense.user_service.service

import com.vivosense.user_service.models.User

class UserService {
    private val usersById = mutableMapOf(
        "9a7e6a1f-3a69-4a5d-a0d2-89fb907a5f5c" to User(
            id = "9a7e6a1f-3a69-4a5d-a0d2-89fb907a5f5c",
            createdAt = 1_705_306_800_000,
            updatedAt = 1_705_306_800_000,
            companyId = "8f04d8f1-45e5-4b41-b0a9-6f7c6d31c2d1",
            email = "ada.lovelace@vivosense.com",
            firstName = "Ada",
            lastName = "Lovelace",
            isActive = true,
        ),
        "b2a1d0c8-cc81-41ec-8be0-2f097a14f8b4" to User(
            id = "b2a1d0c8-cc81-41ec-8be0-2f097a14f8b4",
            createdAt = 1_707_561_900_000,
            updatedAt = 1_710_945_000_000,
            companyId = "8f04d8f1-45e5-4b41-b0a9-6f7c6d31c2d1",
            email = "grace.hopper@vivosense.com",
            firstName = "Grace",
            lastName = "Hopper",
            isActive = true,
        ),
        "2f8e7f45-4fb9-466c-8ab6-e3c6f6cfab74" to User(
            id = "2f8e7f45-4fb9-466c-8ab6-e3c6f6cfab74",
            createdAt = 1_709_619_000_000,
            updatedAt = 1_709_619_000_000,
            companyId = "93f0c9e5-7a43-44e6-9c7e-337ad58f2e4b",
            email = "katherine.johnson@vivosense.com",
            firstName = "Katherine",
            lastName = "Johnson",
            isActive = true,
        ),
        "5c43dd9e-8c42-4860-954d-68b35aa53a61" to User(
            id = "5c43dd9e-8c42-4860-954d-68b35aa53a61",
            createdAt = 1_715_493_900_000,
            updatedAt = 1_717_238_400_000,
            companyId = "c8e8cc2f-2b98-4bb1-bd7f-53c2e6d49771",
            email = "margaret.hamilton@vivosense.com",
            firstName = "Margaret",
            lastName = "Hamilton",
            isActive = true,
        ),
        "f0f2ec5e-28d3-442a-87f1-40723fcf3f42" to User(
            id = "f0f2ec5e-28d3-442a-87f1-40723fcf3f42",
            createdAt = 1_736_321_100_000,
            updatedAt = 1_736_321_100_000,
            companyId = "c8e8cc2f-2b98-4bb1-bd7f-53c2e6d49771",
            email = "dorothy.vaughan@vivosense.com",
            firstName = "Dorothy",
            lastName = "Vaughan",
            isActive = false
        )
    )

    fun getUsers(): List<User> {
        return usersById.values.toList()
    }

    fun getUser(id: String): User? {
        return usersById[id]
    }
}
