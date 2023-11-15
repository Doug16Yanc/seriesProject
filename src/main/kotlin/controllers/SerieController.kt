package controllers

import entities.Serie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import services.SerieService

@RestController
@RequestMapping(value = arrayOf("/series"))
class SerieController {
    @Autowired
    private lateinit var serieService : SerieService

    @GetMapping
    fun findAll() : List<Serie> {
        val result : List<Serie> = serieService.findAll()
        return result
    }
}