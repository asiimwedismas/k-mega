package me.asiimwedismas.bakery_module.domain.model

data class BakeryInvoiceItem(
    var product_id: Int = 0,
    var product_name: String? = null,
    var qty: Int = 0,
    var factory_profit: Double = 0.0,
    var outlet_profit: Double = 0.0,
    var agent_profit: Double = 0.0,
    var total_agent_sale: Double = 0.0,
    var total_factory_sale: Double = 0.0,
    var total_outlet_sale: Double = 0.0
) {
    fun calculate(product: BakeryProduct) {

        val ingredientsCostPerBag = product.ingredients_cost_per_bag
        val fixedCop = product.fixed_cop
        val kavera = product.kavera
        val wholesalePrice = product.wholesale_price
        val retailPrice = product.retail_price
        val agentPrice = product.agent_price
        val outPerBag = product.out_per_bag
        val packagePerBag = kavera * outPerBag

        val factoryBagProfitGross =
            (outPerBag * wholesalePrice - ingredientsCostPerBag - packagePerBag)

        val outletBagProfitGross =
            (outPerBag * retailPrice - ingredientsCostPerBag - packagePerBag)

        val agentBagProfitGross =
            (outPerBag * agentPrice - ingredientsCostPerBag - packagePerBag)

        val factoryNetProfit = (factoryBagProfitGross - fixedCop) / outPerBag
        val outletNetProfit = (outletBagProfitGross - fixedCop) / outPerBag
        val agentNetProfit = (agentBagProfitGross - fixedCop) / outPerBag

        total_factory_sale = wholesalePrice * qty
        factory_profit = factoryNetProfit * qty
        total_outlet_sale = retailPrice * qty
        outlet_profit = outletNetProfit * qty
        total_agent_sale = agentPrice * qty
        agent_profit = agentNetProfit * qty
    }
}