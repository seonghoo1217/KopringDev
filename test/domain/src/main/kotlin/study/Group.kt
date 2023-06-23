package study

import lombok.Builder
import javax.persistence.*

@Entity
@Builder
class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var groupSeq:Long ?= null
        protected set

    @OneToMany(fetch = FetchType.LAZY)
    var groupMembers:List<GroupMember>?=null
        protected set;
}