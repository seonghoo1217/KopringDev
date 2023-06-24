package delivery

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var diliverySeq:Long ?=null
        protected  set

    var
}