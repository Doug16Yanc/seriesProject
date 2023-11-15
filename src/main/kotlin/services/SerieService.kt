package services

import org.springframework.beans.factory.annotation.Autowired
import repositories.SerieRepository
import entities.Serie

class SerieService {
    @Autowired
    private lateinit var serieRepository : SerieRepository
    fun findAll() : List<Serie>{
        val result : List<Serie> = serieRepository.findAll()
        return result
    }
}