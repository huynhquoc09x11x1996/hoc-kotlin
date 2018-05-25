package Factory

class CurrencyFactory {
    fun currencyForCountry(country: Country):Curency?
    {
        when(country)
        {
            Country.Spain->return Euro()
            Country.UK,Country.UnitedStates -> return UnitedState()
            else -> return null
        }
    }
}