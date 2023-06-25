package shop

import javax.persistence.*

@Entity
class Shop(
    shopName:String,
    rating:String,
    heart:Int,
    phoneNumber:String,
    shopInfo: ShopInfo
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var shopSeq:Long?=null;

    var shopName:String=shopName
        protected set

    var rating:String=rating
        protected set

    var heart:Int=heart
        protected set

    var phoneNumber:String=phoneNumber
        protected set

    @OneToOne
    var shopInfo: ShopInfo =shopInfo
        protected set
}