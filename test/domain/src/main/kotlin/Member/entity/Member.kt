package Member.entity

import study.GroupMember
import javax.persistence.*

@Entity
class Member(
    username: String,
    password:String,
    nickname:String,
    role:MemberRole,
    groupMembers: MutableList<GroupMember>
    ) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var memberSeq : Long ?= null
        protected set

    var username : String = username
        protected set

    var password : String = password
        protected set

    var nickname : String = nickname
        protected set

    @Enumerated(EnumType.STRING)
    var role: MemberRole =role
        protected set

    @OneToMany(fetch = FetchType.LAZY)
    var groupMembers : MutableList<GroupMember> ?=groupMembers
        protected set
}