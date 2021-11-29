package me.asiimwedismas.fuel_module.domain.model

import org.junit.Assert.*
import org.junit.Test

class PumpTest {
    private val testPump = Pump()

    @Test
    fun `calculate total morning PMS`() {
        testPump.pms_one_mn = 2.toDouble()
        testPump.pms_two_mn = 3.toDouble()
        assertEquals("total pms morning reading", 5.toDouble(), testPump.calTotal_PMS_m(), 0.0)
    }

    @Test
    fun `calculate total morning AGO`() {
        testPump.ago_one_mn = 2.toDouble()
        testPump.ago_two_mn = 4.toDouble()
        assertEquals("total ago morning reading", 6.toDouble(), testPump.calTotal_AGO_m(), 0.0)
    }

    @Test
    fun `calculate total evening PMS`() {
        testPump.pms_one_ed = 2.toDouble()
        testPump.pms_two_ed = 7.toDouble()
        assertEquals("total pms evening reading", 9.toDouble(), testPump.calTotal_PMS_e(), 0.0)
    }

    @Test
    fun `calculate total evening AGO`() {
        testPump.ago_one_ed = 10.toDouble()
        testPump.ago_two_ed = 3.toDouble()
        assertEquals("total ago evening reading", 13.toDouble(), testPump.calTotal_AGO_e(), 0.0)
    }
}