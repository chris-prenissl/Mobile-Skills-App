package de.christophprenissl.mobileskillsapp.data.repository

import de.christophprenissl.mobileskillsapp.data.dataSource.TechnologiesDataSource
import de.christophprenissl.mobileskillsapp.domain.model.Technology
import de.christophprenissl.mobileskillsapp.domain.repository.TechnologyRepository

class TechnologyRepositoryImpl : TechnologyRepository {
    override fun getAllTechnologies(): List<Technology> {
        return TechnologiesDataSource.technologies.map { Technology(it) }
    }
}