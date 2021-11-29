package me.asiimwedismas.fuel_module.domain.model

data class TankCompartment(
    var no: Int = 0,
    var type: String? = null,
    var upper_reading_ed: Double = 0.0,
    var lower_reading_ed: Double = 0.0,
    var constant_reading_ed: Double = 0.0,
    var bar_reading_ed: Double = 0.0,
    var calculated_reading_ed: Double = 0.0,
    var upper_reading_mn: Double = 0.0,
    var lower_reading_mn: Double = 0.0,
    var constant_reading_mn: Double = 0.0,
    var bar_reading_mn: Double = 0.0,
    var calculated_reading_mn: Double = 0.0,
)
