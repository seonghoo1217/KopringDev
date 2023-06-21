package Member.entity

enum class MemberRole {
    GUEST,MEMBER,ADMIN;

    fun isAccessRole(): Boolean {
        return this.equals(ADMIN)
    }

    fun isAccessGuest(): Boolean{
        return this.equals(GUEST);
    }
}