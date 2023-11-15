package repositories

import entities.Serie
import org.springframework.data.jpa.repository.JpaRepository

interface SerieRepository : JpaRepository<Serie, Long> {
}