package shop

import lombok.Builder
import javax.persistence.*

@Builder
@Entity
class ShopInfo(
    shop: Shop
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var shopInfoSeq:Long?=null

    @OneToOne
    var shop: Shop =shop

    class DeliveryInfo(
        var minAmount: Int,
        var payMethod: String,
        var deliveryTime:String,
        var tip:Int
    )

    class packInfo(
        var minAmount: Int,
        var useWat:String,
        var pickupTime:String,
        var location:String
    )
}
