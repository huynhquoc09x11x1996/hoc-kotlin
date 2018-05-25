package Factory

object Main {
    @JvmStatic fun main(args : Array<String>)
    {
        val noCurrencyCode = "No Currency Code Available"
        var usCode = CurrencyFactory().currencyForCountry(Country.UnitedStates)
        println(usCode?.code?:noCurrencyCode)
        var ukCode = CurrencyFactory().currencyForCountry(Country.UK)
        println(usCode?.code?:noCurrencyCode)
    }
}