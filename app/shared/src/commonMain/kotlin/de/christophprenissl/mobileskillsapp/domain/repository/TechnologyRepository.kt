package de.christophprenissl.mobileskillsapp.domain.repository

import de.christophprenissl.mobileskillsapp.domain.model.Technology

interface TechnologyRepository {
    fun getAllTechnologies(): List<Technology>
}