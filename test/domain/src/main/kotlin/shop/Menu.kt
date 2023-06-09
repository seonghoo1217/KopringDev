package shop

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Menu (
    menuName:String,
    menuPrice:Int,
    description:String
        ){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var menuSeq:Long?=null
        protected set

    var menuName:String=menuName
        protected set

    var menuPrice:Int=menuPrice
        protected set

    var description:String=description
        protected set
}