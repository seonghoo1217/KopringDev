package study

import Member.entity.Member
import lombok.Builder
import javax.persistence.*

@Entity
@Builder
class GroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var gmSeq: Long? = null
        protected set

    @ManyToOne
    var group: Group? = null
        protected set

    @ManyToOne
    var member:Member?=null
        protected set
}