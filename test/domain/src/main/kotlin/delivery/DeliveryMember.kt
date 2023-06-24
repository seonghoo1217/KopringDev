package delivery

import Member.entity.Member
import javax.persistence.*

@Entity
class DeliveryMember(
    delivery: Delivery,
    member: Member
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var dmSeq:Long ?= null
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    var delivery:Delivery=delivery
        protected set

}