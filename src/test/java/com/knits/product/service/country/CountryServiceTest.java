package com.knits.product.service.country;

import com.knits.product.model.Country;
import com.knits.product.repository.CountryRepository;
import com.knits.product.service.country.dto.CountryDto;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@SpringBootTest
class CountryServiceTest {
    @Autowired
    private CountryService countryService;

    @Test
    void save() {
        CountryDto dto = new CountryDto();
        dto.setCode("EE");
        dto.setCodeIso3("EST");
        dto.setNumber("372");
        dto.setName("Estonia");
        CountryDto actualDto = countryService.save(dto);
        assertThat(actualDto.getName()).isEqualTo("Estonia");
        assertThat(actualDto.getCodeIso3()).isEqualTo("EST");
        assertThat(actualDto.getNumber()).isEqualTo("372");
        assertThat(actualDto.getCode()).isEqualTo("EE");
    }

    @Test
    void partialUpdate() {
        CountryDto updateDto = new CountryDto();
        Long id = 4L;
        updateDto.setId(id);
        updateDto.setNumber("371");
        updateDto.setNumber("Latvia");
        Country mockedCountry = new Country("Belarus", "BEL", "BY", "375");
        mockedCountry.setId(id);
        when(countryService.findByIdOrThrowException(id)).thenReturn(mockedCountry);
        CountryDto actualDto = countryService.partialUpdate(updateDto);
        assertThat(actualDto.getName()).isEqualTo("Latvia");
        assertThat(actualDto.getNumber()).isEqualTo("371");
        assertThat(actualDto.getCodeIso3()).isNotNull();
        assertThat(actualDto.getCode()).isNotNull();
        assertThat(actualDto.getCodeIso3()).isEqualTo("BEL");
        assertThat(actualDto.getCode()).isEqualTo("BY");
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }
}