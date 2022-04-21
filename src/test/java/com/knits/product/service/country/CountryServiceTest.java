package com.knits.product.service.country;

import com.knits.product.model.Country;
import com.knits.product.repository.CountryRepository;
import com.knits.product.service.country.dto.CountryDto;
import com.knits.product.service.country.mapper.CountryMapper;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
@DisplayName("CountryService Tests")
class CountryServiceTest {
    @Spy
    private final CountryMapper countryMapper = new CountryMapper();
    @Captor
    private ArgumentCaptor<Country> countryCaptor;
    @Mock
    private CountryRepository countryRepository;
    @InjectMocks
    private CountryService countryService;

    @Test
    @DisplayName("Save - Success")
    void save() {
        CountryDto countryToSave = new CountryDto();
        countryToSave.setCode("EE");
        countryToSave.setCodeIso3("EST");
        countryToSave.setNumber("372");
        countryToSave.setName("Estonia");

        Country country = new Country();
        country.setCode("EE");
        country.setCodeIso3("EST");
        country.setNumber("372");
        country.setName("Estonia");
        when(countryRepository.save(any(Country.class))).thenReturn(country);
        CountryDto countrySaved = countryService.save(countryToSave);

        assertThat(countrySaved.getCode()).isEqualTo("EE");
        assertThat(countrySaved.getCodeIso3()).isEqualTo("EST");
        assertThat(countrySaved.getNumber()).isEqualTo("372");
        assertThat(countrySaved.getName()).isEqualTo("Estonia");
    }

    @Test
    @DisplayName("Partial Update - Success")
    void partialUpdate() {
        CountryDto countryToSave = new CountryDto();
        Long id = 4L;
        countryToSave.setId(id);
        countryToSave.setNumber("371");
        countryToSave.setName("Latvia");

        Country country = new Country();
        country.setNumber("371");
        country.setName("Latvia");
        country.setCodeIso3("BEL");
        country.setCode("BY");

        Country mockedCountry = new Country("Belarus", "BEL", "BY", "375");
        mockedCountry.setId(id);

        when(countryRepository.findById(id)).thenReturn(Optional.of(mockedCountry));
        when(countryRepository.save(any(Country.class))).thenReturn(country);
        CountryDto countrySaved = countryService.partialUpdate(countryToSave);

        assertThat(countrySaved.getName()).isEqualTo("Latvia");
        assertThat(countrySaved.getNumber()).isEqualTo("371");
        assertThat(countrySaved.getCodeIso3()).isNotNull();
        assertThat(countrySaved.getCode()).isNotNull();
        assertThat(countrySaved.getCodeIso3()).isEqualTo("BEL");
        assertThat(countrySaved.getCode()).isEqualTo("BY");
    }
}