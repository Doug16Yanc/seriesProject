package entities

import jakarta.persistence.*

@Entity
@Table(name = "tb_serie")
data class Serie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,
    private var title : String,
    @Column(name = "serie_year")
    private var year : Int,
    private var genre : String,
    private var platform : String,
    private var shortDescription : String,
    private var longDescription : String
)

