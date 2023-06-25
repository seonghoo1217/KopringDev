package shop

import lombok.Builder
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Builder
class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var reviewSeq:Long ?=null

}