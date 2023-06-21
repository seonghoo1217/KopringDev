package Member.entity

import javax.persistence.*

@Entity
class Member(
    username: String,
    password:String,
    nickname:String,
    role:MemberRole
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

}