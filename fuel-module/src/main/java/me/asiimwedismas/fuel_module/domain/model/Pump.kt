package me.asiimwedismas.fuel_module.domain.model

data class Pump (
    var mn_attendant_name: String? = null,
    var mn_attendant_id: String? = null,
    var ed_attendant_name: String? = null,
    var ed_attendant_id: String? = null,
    var number: Int = 0,
    var pms_px_mn: Double = 0.0,
    var pms_px_ed: Double = 0.0,
    var ago_px_mn: Double = 0.0,
    var ago_px_ed: Double = 0.0,
    var pms_one_mn: Double = 0.0,
    var pms_two_mn: Double = 0.0,
    var ago_one_mn: Double = 0.0,
    var ago_two_mn: Double = 0.0,
    var rtt_pms_mn: Double = 0.0,
    var rtt_ago_mn: Double = 0.0,
    var pms_one_ed: Double = 0.0,
    var pms_two_ed: Double = 0.0,
    var ago_one_ed: Double = 0.0,
    var ago_two_ed: Double = 0.0,
    var rtt_pms_ed: Double = 0.0,
    var rtt_ago_ed: Double = 0.0
)

fun Pump.calTotal_PMS_m(): Double {
    return pms_one_mn + pms_two_mn
}

fun Pump.calTotal_AGO_m(): Double {
    return ago_one_mn + ago_two_mn
}

fun Pump.calTotal_PMS_e(): Double {
    return pms_one_ed + pms_two_ed
}

fun Pump.calTotal_AGO_e(): Double {
    return ago_one_ed + ago_two_ed
}