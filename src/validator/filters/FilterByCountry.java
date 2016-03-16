package validator.filters;

import com.guest.Guest;
import com.person.Country;

public class FilterByCountry implements Filter {

    private final String countryName;

    public FilterByCountry(String country) {
        this.countryName = country;
    }

    @Override
    public boolean filter(Guest guest) {
        return guest.isOfSameCountry(new Country(countryName));
    }

}
