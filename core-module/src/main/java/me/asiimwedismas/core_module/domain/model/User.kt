package me.asiimwedismas.core_module.domain.model

import java.util.ArrayList

data class User(
    var document_id: String? = null,
    var user_fullname: String = "",
    var user_name: String = "",
    var user_fcm_token: String = "",
    var user_department: String = "",
    var user_position: String = "",
    var user_password: String = "",
    var user_phone_number: String = "",
    var user_secondary_phone_number: String = "",
    var user_next_kin: String = "",
    var user_next_kin_phone_number: String = "",
    var user_next_kin_secondary_phone_number: String = "",

    var user_salary: Int = 0,
    var user_allowance: Int = 0,

    var user_read_rights: List<String> = ArrayList(),
    var user_write_rights: List<String> = ArrayList(),
    var user_has_eps_access: Boolean = false
) {
    override fun toString() = this.user_fullname
}
